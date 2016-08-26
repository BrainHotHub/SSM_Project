package crm.com.model;

import java.util.List;

public class SysMenu {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sysmenu.id
	 * @mbggenerated  Wed Aug 24 15:47:00 CST 2016
	 */
	private Integer id;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sysmenu.name
	 * @mbggenerated  Wed Aug 24 15:47:00 CST 2016
	 */
	private String name;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sysmenu.parentid
	 * @mbggenerated  Wed Aug 24 15:47:00 CST 2016
	 */
	private Integer parentid;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sysmenu.sequence
	 * @mbggenerated  Wed Aug 24 15:47:00 CST 2016
	 */
	private Integer sequence;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sysmenu.iconCls
	 * @mbggenerated  Wed Aug 24 15:47:00 CST 2016
	 */
	private String iconCls;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sysmenu.url
	 * @mbggenerated  Wed Aug 24 15:47:00 CST 2016
	 */
	private String url;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sysmenu.enable
	 * @mbggenerated  Wed Aug 24 15:47:00 CST 2016
	 */
	private Integer enable;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sysmenu.id
	 * @return  the value of sysmenu.id
	 * @mbggenerated  Wed Aug 24 15:47:00 CST 2016
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sysmenu.id
	 * @param id  the value for sysmenu.id
	 * @mbggenerated  Wed Aug 24 15:47:00 CST 2016
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sysmenu.name
	 * @return  the value of sysmenu.name
	 * @mbggenerated  Wed Aug 24 15:47:00 CST 2016
	 */
	public String getName() {
		return name;
	}
	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sysmenu.name
	 * @param name  the value for sysmenu.name
	 * @mbggenerated  Wed Aug 24 15:47:00 CST 2016
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sysmenu.parentid
	 * @return  the value of sysmenu.parentid
	 * @mbggenerated  Wed Aug 24 15:47:00 CST 2016
	 */
	public Integer getParentid() {
		return parentid;
	}
	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sysmenu.parentid
	 * @param parentid  the value for sysmenu.parentid
	 * @mbggenerated  Wed Aug 24 15:47:00 CST 2016
	 */
	public void setParentid(Integer parentid) {
		this.parentid = parentid;
	}
	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sysmenu.sequence
	 * @return  the value of sysmenu.sequence
	 * @mbggenerated  Wed Aug 24 15:47:00 CST 2016
	 */
	public Integer getSequence() {
		return sequence;
	}
	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sysmenu.sequence
	 * @param sequence  the value for sysmenu.sequence
	 * @mbggenerated  Wed Aug 24 15:47:00 CST 2016
	 */
	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}
	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sysmenu.iconCls
	 * @return  the value of sysmenu.iconCls
	 * @mbggenerated  Wed Aug 24 15:47:00 CST 2016
	 */
	public String getIconCls() {
		return iconCls;
	}
	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sysmenu.iconCls
	 * @param iconCls  the value for sysmenu.iconCls
	 * @mbggenerated  Wed Aug 24 15:47:00 CST 2016
	 */
	public void setIconCls(String iconCls) {
		this.iconCls = iconCls;
	}
	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sysmenu.url
	 * @return  the value of sysmenu.url
	 * @mbggenerated  Wed Aug 24 15:47:00 CST 2016
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sysmenu.url
	 * @param url  the value for sysmenu.url
	 * @mbggenerated  Wed Aug 24 15:47:00 CST 2016
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sysmenu.enable
	 * @return  the value of sysmenu.enable
	 * @mbggenerated  Wed Aug 24 15:47:00 CST 2016
	 */
	public Integer getEnable() {
		return enable;
	}
	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sysmenu.enable
	 * @param enable  the value for sysmenu.enable
	 * @mbggenerated  Wed Aug 24 15:47:00 CST 2016
	 */
	public void setEnable(Integer enable) {
		this.enable = enable;
	}
	/**
	 * 子节点个�?
	 */
	private Integer countChildrens;
	
	private SysMenu parentMenu;
	private List<SysMenu> subMenu;
	private boolean hasMenu = false;
	
	public Integer getCountChildrens() {
		return countChildrens;
	}
	public void setCountChildrens(Integer countChildrens) {
		this.countChildrens = countChildrens;
	}
	public SysMenu getParentMenu() {
		return parentMenu;
	}
	public void setParentMenu(SysMenu parentMenu) {
		this.parentMenu = parentMenu;
	}
	public List<SysMenu> getSubMenu() {
		return subMenu;
	}
	public void setSubMenu(List<SysMenu> subMenu) {
		this.subMenu = subMenu;
	}
	public boolean isHasMenu() {
		return hasMenu;
	}
	public void setHasMenu(boolean hasMenu) {
		this.hasMenu = hasMenu;
	}
}