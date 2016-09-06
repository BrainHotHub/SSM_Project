package crm.com.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;


import crm.com.model.SysMenu;
import crm.com.model.SysUser;
import crm.com.model.SysUserExample;
import crm.com.model.easyui.PageHelper;

public interface UserService {
    int add(SysUser model);
    
    int update(SysUser model);
    
    int delete(int id);
    
    SysUser selectById(int id);
    
    List<SysUser> getList(SysUserExample example); 

	SysUser findUserByName(String username);
	
	List<SysMenu> getMenu(int userId);
	
	Long getDatagridTotal(SysUser user,Integer sysid);

    List<SysUser> datagridUser(PageHelper page,Integer sysid);

}
