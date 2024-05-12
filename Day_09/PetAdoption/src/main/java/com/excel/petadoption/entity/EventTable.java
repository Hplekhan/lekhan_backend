package com.excel.petadoption.entity;

import java.util.Date;

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
@Table(name ="event_table")
public class EventTable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="event_id")
	private int id;
	
	private int org_id;
	
	@Column(name ="event_name")
	private String name;
	
	@Column(name ="event_type")
	private String type;
	
	private String location;
	
	private Date start_date;
	
	private Date end_date;
	
	@Column(name ="description")
	private String description;
	

}
