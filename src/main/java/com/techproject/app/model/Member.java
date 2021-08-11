package com.techproject.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

//this is model
@Entity 
public class Member {
	
	@Id //annotation for primary key
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + "]";
	}
}
