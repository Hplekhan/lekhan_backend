package com.excel.petadoption.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;



@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private int id;
	
	@Column(name = "username")
	private String name;
	
	@Column(name ="email")
	private String email;
	
	@Column(name = "password_hash")
	private int password;
	
	
	private boolean is_organization;
	
	@Column(name ="created_at")
	private Date date;
	
	 @ManyToOne(cascade = CascadeType.ALL)
	private Organization organization; 
	 
	 @ManyToMany(cascade = CascadeType.ALL, mappedBy = "users")
	 private AdoptionApplication adoptionApplication;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public boolean isIs_organization() {
		return is_organization;
	}

	public void setIs_organization(boolean is_organization) {
		this.is_organization = is_organization;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
