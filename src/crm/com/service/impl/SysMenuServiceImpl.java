package crm.com.service.impl;

import java.util.List;

import crm.com.dao.SysMenuMapper;
import crm.com.model.SysMenu;
import crm.com.model.SysMenuExample;
import crm.com.service.SysMenuService;

public class SysMenuServiceImpl implements SysMenuService {
   
	SysMenuMapper sysMenuMapper;
	
	public void setSysMenuMapper(SysMenuMapper sysMenuMapper) {
		this.sysMenuMapper = sysMenuMapper;
	}

	@Override
	public int add(SysMenu model) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(SysMenu model) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public SysMenu selectById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SysMenu> getList(SysMenuExample example) {
		// TODO Auto-generated method stub
		return null;
	}

}
