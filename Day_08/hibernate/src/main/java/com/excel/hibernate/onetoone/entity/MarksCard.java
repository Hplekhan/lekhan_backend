//package com.excel.hibernate.onetoone.entity;
//
//import jakarta.persistence.CascadeType;
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.OneToOne;
//import jakarta.persistence.Table;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//@Entity
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//@Table(name = "marks")
//public class MarksCard {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	@Column(name="marks_id")
//	private int id;
//
//	@Column(name = "grade")
//	private String grade;
//
//
//	@Column(name = "mark")
//	private double marks;
//	
//	@OneToOne(cascade = CascadeType.ALL)
//	private Student student;
//	
//
//
//
//}
