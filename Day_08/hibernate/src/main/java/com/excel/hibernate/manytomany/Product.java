package com.excel.hibernate.manytomany;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
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
@Table(name ="product")
public class Product {
	
	@Column(name ="product_id ")
	private int id;
	
	@Column(name ="product_name")
	private String name;
	
	@Column(name=" product_price")
	private int price;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Customer> customers = new ArrayList<>();

}
