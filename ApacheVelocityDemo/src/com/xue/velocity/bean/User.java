/**
 * 
 */
package com.xue.velocity.bean;


/**
 * �û�ʵ����
 * 
 * @author hongten<br>
 * @date 2013-3-9
 */
public class User {
 
	private Integer id; 
	private String name; 
	private String password; 
	private String birthday;
	private String email;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
