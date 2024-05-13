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
@Table(name = "adoption_application")
public class AdoptionApplication {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="application_id")
	private int id;
	
	@Column(name ="pet_id")
	private int pet_id;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private Users users;
	
	@Column(name ="application_date")
	private Date date;
	
	@Column(name ="approval_date")
	private Date approval_date;
	
	@Column(name ="notes")
	private String notes;
}
