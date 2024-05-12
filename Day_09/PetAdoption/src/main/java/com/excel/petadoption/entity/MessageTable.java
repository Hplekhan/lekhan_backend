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
@Table(name ="message_table")
public class MessageTable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="message_id")
	private int id;
	
	/*private Users users;*/
	
	private String subject;
	
	private String content;
	
	private Date sent_at;
	
	private boolean is_read;

}
