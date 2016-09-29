package com.synaric.web.mata.entity.user;

import com.synaric.web.mata.entity.BaseEntity;

public class UserInfoEntity extends BaseEntity{

	private static final long serialVersionUID = 1L;
	
	private String account;

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}
}
