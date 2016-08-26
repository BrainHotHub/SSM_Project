package crm.com.service;

import java.util.List;

import crm.com.model.SysMenu;
import crm.com.model.SysMenuExample;


public interface SysMenuService {
	
    int add(SysMenu model);
    
    int update(SysMenu model);
    
    int delete(int id);
    
    SysMenu selectById(int id);
    
    List<SysMenu> getList(SysMenuExample example); 
}
