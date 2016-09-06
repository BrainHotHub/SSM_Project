package crm.com.controller;

import java.util.List;

import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import crm.com.model.SysUser;
import crm.com.model.easyui.DataGrid;
import crm.com.model.easyui.Json;
import crm.com.model.easyui.PageHelper;
import crm.com.service.UserService;

@Controller
public class UserController {
    
	private final static Logger log=LoggerFactory.getLogger(UserController.class);
	
	@Resource
    private UserService userService;
	
	/**
	 * 跳转到用户表格页面
	 * @return
	 */
	@RequestMapping(value="/user/list",method=RequestMethod.GET)
	public String UserList(Model model){
		return "user/list";
	}

	/**
	 * 跳转到用户表格页面(tree)
	 * @return
	 */
	@RequestMapping(value = "/user/listtree",method = RequestMethod.GET)
    public String userListTree(Model model) {
        return "user/list_tree";
    }
	
	/**
	 * 用户表格
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/user/datagrid", method = RequestMethod.POST)
	public DataGrid dataGrid(PageHelper page,SysUser user,Integer sysid){
		DataGrid dg = new DataGrid();
		dg.setTotal(userService.getDatagridTotal(user,sysid));
		List<SysUser> userList = userService.datagridUser(page,sysid);
		dg.setRows(userList);
		return dg;
	}
	/**
	 * 添加用户
	 * @param user
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/user/addUser",method=RequestMethod.POST)
	public Json addUser(SysUser user){
		/*System.out.println(regtime);
		 * SysUser user=new SysUser();
		 * user.setRegtime(new Date());
		 * */
		
		user.setSysid(101);
		System.out.println("进入用户新增");
		System.out.println(user.getUsername());
		Json json=new Json();
		try
		{
			userService.add(user);
			json.setSuccess(true);
			json.setObj(user);
			json.setMsg("用户新增成功");
		}catch(Exception e){
			 json.setMsg(e.getMessage());
		}
		return json;
	}
}
