package com.gopi.HibernateProject1.entity;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
// example of One to Many bi-directional
public class Dept implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String hod;
	@ManyToOne
	@JoinColumn
	private College college;
	public Dept() {
		// TODO Auto-generated constructor stub
	}
	public Dept(String name, String hod, College college) {
		super();
		this.name = name;
		this.hod = hod;
		this.college = college;
	}
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
	public String getHod() {
		return hod;
	}
	public void setHod(String hod) {
		this.hod = hod;
	}
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	@Override
	public String toString() {
		return "Dept [id=" + id + ", name=" + name + ", hod=" + hod + "]";
	}
	
	
}
