package crm.com.dao;

import crm.com.model.Customer;
import crm.com.model.CustomerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer
	 * @mbggenerated  Wed Aug 24 15:47:00 CST 2016
	 */
	int countByExample(CustomerExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer
	 * @mbggenerated  Wed Aug 24 15:47:00 CST 2016
	 */
	int deleteByExample(CustomerExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer
	 * @mbggenerated  Wed Aug 24 15:47:00 CST 2016
	 */
	int deleteByPrimaryKey(Integer ID);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer
	 * @mbggenerated  Wed Aug 24 15:47:00 CST 2016
	 */
	int insert(Customer record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer
	 * @mbggenerated  Wed Aug 24 15:47:00 CST 2016
	 */
	int insertSelective(Customer record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer
	 * @mbggenerated  Wed Aug 24 15:47:00 CST 2016
	 */
	List<Customer> selectByExample(CustomerExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer
	 * @mbggenerated  Wed Aug 24 15:47:00 CST 2016
	 */
	Customer selectByPrimaryKey(Integer ID);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer
	 * @mbggenerated  Wed Aug 24 15:47:00 CST 2016
	 */
	int updateByExampleSelective(@Param("record") Customer record, @Param("example") CustomerExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer
	 * @mbggenerated  Wed Aug 24 15:47:00 CST 2016
	 */
	int updateByExample(@Param("record") Customer record, @Param("example") CustomerExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer
	 * @mbggenerated  Wed Aug 24 15:47:00 CST 2016
	 */
	int updateByPrimaryKeySelective(Customer record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer
	 * @mbggenerated  Wed Aug 24 15:47:00 CST 2016
	 */
	int updateByPrimaryKey(Customer record);
}