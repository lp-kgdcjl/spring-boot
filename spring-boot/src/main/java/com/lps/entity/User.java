package com.lps.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User extends BaseEntity {

	/** 用户名 */
	@Column(name = "userName")
	private String userName;
	/** 密码 */
	@Column(name = "password")
	private String password;
	/** 昵称 */
	@Column(name = "nickname")
	private String nickname;
	/** 用户类别 */
	@Column(name = "userType")
	private Integer userType;
	
	/* get,set方法*/
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getNickname() {
		return nickname;
	}
	
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Integer getUserType() {
		return userType;
	}
	

	public void setUserType(Integer userType) {
		this.userType = userType;
	}
	
	
	
}
