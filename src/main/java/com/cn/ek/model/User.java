package com.cn.ek.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Table(name="user")
public class User {
	
	@Column(name="id")
	@Id
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="name")
	private int age;
	
}
