package com.ukefu.webim.web.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


/**
 * 状态表
 * 
 */
@Entity
@Table(name = "uk_sales_status")
@org.hibernate.annotations.Proxy(lazy = false)
public class SaleStatus implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	
	private String id  ;
	
	private String name ;		//状态名
	private String code ;	//状态代码
	private String cate ;	//状态分类ID
	private String orgi ;
	private String creater;
	private Date createtime ;
	private Date updatetime ;
	private String memo;	//备注
	
	private String activityid;	//所属的活动ID
	
	/**
	 * @return the id
	 */
	@Id
	@Column(length = 32)
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")	
	public String getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getCate() {
		return cate;
	}


	public void setCate(String cate) {
		this.cate = cate;
	}


	public String getOrgi() {
		return orgi;
	}


	public void setOrgi(String orgi) {
		this.orgi = orgi;
	}


	public String getCreater() {
		return creater;
	}


	public void setCreater(String creater) {
		this.creater = creater;
	}


	public Date getCreatetime() {
		return createtime;
	}


	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}


	public Date getUpdatetime() {
		return updatetime;
	}


	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}


	public String getMemo() {
		return memo;
	}


	public void setMemo(String memo) {
		this.memo = memo;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getActivityid() {
		return activityid;
	}


	public void setActivityid(String activityid) {
		this.activityid = activityid;
	}

	
}
