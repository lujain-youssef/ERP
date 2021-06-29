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
public class Project_Type {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long project_type_id;
	
	@NotBlank(message = "project_type cannot be empty or Null")
	private /*data*/ String project_type;
	
	private /*text*/ String description;
	
	@Version
	private Long version;
}
