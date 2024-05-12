package com.excel.petadoption.entity;

import java.math.BigInteger;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "organisation")
public class Organization {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="org_id")
	private int id;
	
	@Column(name ="org_name")
	private String name;
	
	@Column(name ="org_type")
	private String type;
	
	@Column(name ="contact_email")
	private String email;
	
	@Column(name ="contact_phone")
	private BigInteger phoneNum;
	
	private String website;
	
	/*@ManyToOne(cascade = CascadeType.ALL)
	private Users users;*/
}
