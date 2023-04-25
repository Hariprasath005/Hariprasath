package com.example.demo.pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class pojoclass {
	@Id
	private int id;
	private String name;
	private int pho;
	private String email;
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
	public int getPho() {
		return pho;
	}
	public void setPho(int pho) {
		this.pho = pho;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "pojoclass [id=" + id + ", name=" + name + ", pho=" + pho + ", email=" + email + "]";
	}
	
	
	
}	
