package com.lab.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="Student_Table")
@Data
public class Student {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Std_id")
	private long id;
	
	@Column(name="Student_name")
	private String name;
	
	private String Subject;
	
	
	@Column(name="Coaching_Fees")
	private float fees;
	
	
	
	
	

}
