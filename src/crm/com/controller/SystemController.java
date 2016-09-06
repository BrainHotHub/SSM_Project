package crm.com.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import crm.com.model.SysMenu;
import crm.com.model.SysUser;
import crm.com.model.easyui.Tree;
import crm.com.service.UserService;
import crm.com.util.RequestUtil;
import crm.com.util.UserCookieUtil;
import crm.com.util.common.Const;

@Controller
public class SystemController {
	private final Logger log = LoggerFactory.getLogger(SystemController.class);
	@Resource
	private UserService userService;
	
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String home() {
		log.info("返回首页！");
		return "index";
	}

	/**
	 * 跳转到登录页面
	 * 
	 * @return
	 */
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String userList(Model model) {
		log.info("进入登录页面");
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(ModelMap modelMap, HttpServletRequest request, HttpServletResponse response,
			@RequestParam String loginname, @RequestParam String password, @RequestParam String code,
			@RequestParam String autologinch) throws Exception {
		log.info("进入login----");
		if (code.toLowerCase().equals(request.getSession().getAttribute("RANDOMCODE").toString().toLowerCase())) {
			SysUser user = userService.findUserByName(loginname);
			if (user == null) {
				log.info("登录用户名不存在");
				request.getSession().setAttribute("message", "用户名不存在，请重新登录");
				return "login";
			} else {
				if (user.getPassword().equals(password)) {
					if (autologinch != null && autologinch.equals("Y")) { // 判断是否要添加到cookie中
						// 保存用户信息到cookie
						UserCookieUtil.saveCookie(user, response);
					}
					log.info("恭喜,登录成功");
					request.getSession().setAttribute(Const.SESSION_USER, user);

					return "redirect:" + RequestUtil.retrieveSavedRequest();// 跳转至访问页面
				} else {
					log.info("密码输入错误");
					request.getSession().setAttribute("message", "用户名密码错误，请重新登录");
					return "login";
				}
			}
		} else {
			log.info("验证码错误");
			request.getSession().setAttribute("message", "验证码错误，请重新输入");
			return "login";
		}

	}

	/**
	 * 用户注销
	 * 
	 * @param session
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/logout")
	public String logout(HttpSession session, HttpServletResponse response) {
		session.removeAttribute(Const.SESSION_USER);
		UserCookieUtil.clearCookie(response);
		return "redirect:/";
	}
	
	/**
	 * 
	 * @param session
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/getMenu", method = RequestMethod.POST)
	public List<Tree> getMenu(HttpSession session) {
		log.info("查询菜单");
		SysUser user = (SysUser) session.getAttribute(Const.SESSION_USER);
		List<SysMenu> menuList = userService.getMenu(1);//user.getId()
		log.info(menuList.toString());
		List<Tree> treeList = new ArrayList<>();

		for (SysMenu menu : menuList) {
			Tree node = new Tree();
			node.setId(menu.getId());
			node.setPid(menu.getParentid());
			node.setText(menu.getName());
			node.setIconCls(menu.getIconCls());
			
			if(menu.getParentid()!=0){	// 有父节点
				node.setPid(menu.getParentid());
			}
			if(menu.getCountChildrens() > 0){	//有子节点
				node.setState("closed");
			}
			Map<String, Object> attr = new HashMap<String, Object>();
			attr.put("url", menu.getUrl());
			node.setAttributes(attr);
			treeList.add(node);
		}
		return treeList;
	}

}
