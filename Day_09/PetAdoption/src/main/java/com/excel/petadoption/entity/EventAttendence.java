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
@Table(name ="event_attendence")
public class EventAttendence {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="attendence_id")
	private int id;
	
	/*private EventTable eventTable;
	
	private Users users;*/
	
	@Column(name ="attendence_status")
	private String status;
}
