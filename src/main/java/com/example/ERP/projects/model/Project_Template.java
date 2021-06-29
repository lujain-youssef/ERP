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
public class Project_Template {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long project_template_id;
	
	private Project_Type project_type;
	
	@NotBlank(message = "tasks cannot be empty or Null")
	private /*table*/ List<> tasks;//Project_Template_Task
	
	@Version
	private Long version;
}
