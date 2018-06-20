package com.tongtong.hibernate.entity;

import lombok.Data;

import javax.persistence.*;

@Data 
@Entity
@Table(name="person")
public class Person {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="created")
	private Long created = System.currentTimeMillis();
	
	@Column(name="username")
	private String username;
	
	@Column(name="address")
	private String address;
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="remark")
	private String remark;
	
	public Person() {
		
	}

    public void setPhone(String phone) {
		this.phone = phone;	
	}
	
	public String getPhone(){
		return phone;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUsername(String username) {
		return username;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getAddress() {
		return address;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	public String getRemark() {
		return remark;
	}
	
	public Person(String username, String address, String phone, String remark) {
		super();
		this.username = username;
		this.address = address;
		this.phone = phone;
		this.remark = remark;
	}
}
