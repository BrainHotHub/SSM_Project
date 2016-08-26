package crm.com.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class SysUser extends SysUserKey {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sysuser.username
	 * @mbggenerated  Wed Aug 24 15:47:00 CST 2016
	 */
	private String username;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sysuser.password
	 * @mbggenerated  Wed Aug 24 15:47:00 CST 2016
	 */
	private String password;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sysuser.sysid
	 * @mbggenerated  Wed Aug 24 15:47:00 CST 2016
	 */
	private Integer sysid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sysuser.email
	 * @mbggenerated  Wed Aug 24 15:47:00 CST 2016
	 */
	private String email;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sysuser.name
	 * @mbggenerated  Wed Aug 24 15:47:00 CST 2016
	 */
	private String name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sysuser.gender
	 * @mbggenerated  Wed Aug 24 15:47:00 CST 2016
	 */
	private String gender;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sysuser.qq
	 * @mbggenerated  Wed Aug 24 15:47:00 CST 2016
	 */
	private String qq;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sysuser.weixin
	 * @mbggenerated  Wed Aug 24 15:47:00 CST 2016
	 */
	private String weixin;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sysuser.regtime
	 * @mbggenerated  Wed Aug 24 15:47:00 CST 2016
	 */
	private Date regtime;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sysuser.username
	 * @return  the value of sysuser.username
	 * @mbggenerated  Wed Aug 24 15:47:00 CST 2016
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sysuser.username
	 * @param username  the value for sysuser.username
	 * @mbggenerated  Wed Aug 24 15:47:00 CST 2016
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sysuser.password
	 * @return  the value of sysuser.password
	 * @mbggenerated  Wed Aug 24 15:47:00 CST 2016
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sysuser.password
	 * @param password  the value for sysuser.password
	 * @mbggenerated  Wed Aug 24 15:47:00 CST 2016
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sysuser.sysid
	 * @return  the value of sysuser.sysid
	 * @mbggenerated  Wed Aug 24 15:47:00 CST 2016
	 */
	public Integer getSysid() {
		return sysid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sysuser.sysid
	 * @param sysid  the value for sysuser.sysid
	 * @mbggenerated  Wed Aug 24 15:47:00 CST 2016
	 */
	public void setSysid(Integer sysid) {
		this.sysid = sysid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sysuser.email
	 * @return  the value of sysuser.email
	 * @mbggenerated  Wed Aug 24 15:47:00 CST 2016
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sysuser.email
	 * @param email  the value for sysuser.email
	 * @mbggenerated  Wed Aug 24 15:47:00 CST 2016
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sysuser.name
	 * @return  the value of sysuser.name
	 * @mbggenerated  Wed Aug 24 15:47:00 CST 2016
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sysuser.name
	 * @param name  the value for sysuser.name
	 * @mbggenerated  Wed Aug 24 15:47:00 CST 2016
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sysuser.gender
	 * @return  the value of sysuser.gender
	 * @mbggenerated  Wed Aug 24 15:47:00 CST 2016
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sysuser.gender
	 * @param gender  the value for sysuser.gender
	 * @mbggenerated  Wed Aug 24 15:47:00 CST 2016
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sysuser.qq
	 * @return  the value of sysuser.qq
	 * @mbggenerated  Wed Aug 24 15:47:00 CST 2016
	 */
	public String getQq() {
		return qq;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sysuser.qq
	 * @param qq  the value for sysuser.qq
	 * @mbggenerated  Wed Aug 24 15:47:00 CST 2016
	 */
	public void setQq(String qq) {
		this.qq = qq;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sysuser.weixin
	 * @return  the value of sysuser.weixin
	 * @mbggenerated  Wed Aug 24 15:47:00 CST 2016
	 */
	public String getWeixin() {
		return weixin;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sysuser.weixin
	 * @param weixin  the value for sysuser.weixin
	 * @mbggenerated  Wed Aug 24 15:47:00 CST 2016
	 */
	public void setWeixin(String weixin) {
		this.weixin = weixin;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sysuser.regtime
	 * @return  the value of sysuser.regtime
	 * @mbggenerated  Wed Aug 24 15:47:00 CST 2016
	 */
	public Date getRegtime() {
		return regtime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sysuser.regtime
	 * @param regtime  the value for sysuser.regtime
	 * @mbggenerated  Wed Aug 24 15:47:00 CST 2016
	 */
	public void setRegtime(Date regtime) {
		this.regtime = regtime;
	}
}