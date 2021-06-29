package com.example.ERP.projects.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Activity_Cost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long activity_cost_id;
	
	@NotBlank(message = "activity_type cannot be empty or Null")
	private  Activity_Type activity_type;
	
	private Employee employee;
	
	private /*currency*/ float billing_rate;//def =0 //Description: per hour
	
	private /*currency*/ float costing_rate;//def=0 //Description: per hour
	
	private /*data*/ String title;//hidden // read_only
	
	@Version
	private Long version;
	
	/*
	private data String employee_name;//read_only
	//fm employee.employee_name
	
	private Department dapartment;//read_only
	//fm employee.dapartment

	*/
}
