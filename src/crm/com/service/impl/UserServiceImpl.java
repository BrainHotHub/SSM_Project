package crm.com.service.impl;

import java.util.List;


import crm.com.dao.SysUserMapper;
import crm.com.model.SysMenu;
import crm.com.model.SysUser;
import crm.com.model.SysUserExample;
import crm.com.model.SysUserKey;
import crm.com.model.easyui.PageHelper;
import crm.com.model.SysUserExample.Criteria;
import crm.com.service.UserService;

public class UserServiceImpl implements UserService {

	private SysUserMapper sysUserMapper;
	
	public void setSysUserMapper(SysUserMapper sysUserMapper) {
		this.sysUserMapper = sysUserMapper;
	}

	@Override
	public int add(SysUser model) {
		// TODO Auto-generated method stub
		return sysUserMapper.insertSelective(model);
	}

	@Override
	public int update(SysUser model) {
		// TODO Auto-generated method stub
		return sysUserMapper.updateByPrimaryKeySelective(model);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		SysUserKey key=new SysUserKey();
		key.setId(id);
		return sysUserMapper.deleteByPrimaryKey(key);
	}

	@Override
	public SysUser selectById(int id) {
		// TODO Auto-generated method stub
		SysUserKey key=new SysUserKey();
		key.setId(id);
		return sysUserMapper.selectByPrimaryKey(key);
	}

	@Override
	public List<SysUser> getList(SysUserExample example) {
		// TODO Auto-generated method stub
		return sysUserMapper.selectByExample(example);
	}
     
	/*
	 * 通过用户名查找用户
	 * */
	public SysUser findUserByName(String username) {
		SysUserExample example=new SysUserExample();
		Criteria criteria=example.createCriteria();
		criteria.andUsernameEqualTo(username);
		return sysUserMapper.selectByExample(example).get(0);
	}
	/**
	 * 获取该用户权限的菜单
	 */
	@Override
	public List<SysMenu> getMenu(int userId) {
		return sysUserMapper.getMenuByUserId(userId);
	}
	
	/**
	 * 获取用户总数
	 * @param user
	 * @return
	 */
	public Long getDatagridTotal(SysUser user,Integer sysid) {
		return sysUserMapper.getDatagridTotal(user,sysid);  
	}

	/**
	 * 获取用户列表
	 * @param page
	 * @return
	 */
	public List<SysUser> datagridUser(PageHelper page,Integer sysid) {
		page.setStart((page.getPage()-1)*page.getRows());
		page.setEnd(page.getPage()*page.getRows());
		return sysUserMapper.datagridUser(page,sysid);  
	}
    
	

}
