package com.excel.hibernate.onetomany;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "laptop")
public class Laptop {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "lap_id")
	private int id;
	
	@Column(name = "lap_brand")
	private String brand;
	
	@Column(name = "lap_serialNo")
	private String serialNum;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Student student;

}
