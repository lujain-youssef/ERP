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
public class Activity_Type {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long activity_type_id;
	
	@NotBlank(message = "activity_type cannot be empty or Null")
	private /*data*/ String activity_type;
	
	private /*currency*/ float default_costing_rate;
	
	private /*currency*/ float default_billing_rate;
	
	private /*check*/ boolean disabled;//def =0
	
	@Version
	private Long version;
}
