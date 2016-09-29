package com.synaric.web.mata.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 所有存放在数据库的实体的基类。
 * Created by Synaric on 2016年8月17日.
 */
public class BaseEntity implements Serializable{

	private static final long serialVersionUID = 1L;

	/**
	 * 唯一标识。
	 */
	private String id;
	
	/**
	 * 创建时间。
	 */
	private Date birthday;
	
	/**
	 * 创建人。
	 */
	private String creator;
	
	/**
	 * 修改时间。
	 */
	private Date renewalDay;
	
	/**
	 * 最近修改人。
	 */
	private String modifiedBy;
	
	/**
	 * 是否有效。
	 */
	private String active;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Date getRenewalDay() {
		return renewalDay;
	}

	public void setRenewalDay(Date renewalDay) {
		this.renewalDay = renewalDay;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
