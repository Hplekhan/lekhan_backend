package com.excel.petadoption.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name ="pets_table")
public class Pets {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="pets_id")
	private int id;
	
	private int org_id;
	
	private String name;
	
	private String species;
	
	private String breed;
	
	private int age;
	
	private String gender;
	
	private String size;
	
	private String description;
	
	private String photo_url;
	
	private double adoption_fee;
	
	private boolean is_adopted;
	

}
