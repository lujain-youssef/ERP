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
public class Project_Template_Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long project_template_task_id;
	
	@NotBlank(message = "subject cannot be empty or Null")
	private /*data*/ String subject;
	
	@NotBlank(message = "start cannot be empty or Null")
	private int start;//Label: Begin On (Days)
	
	@NotBlank(message = "duration cannot be empty or Null")
	private int duration;//Label : Duration (Days)
	
	private float task_weight;
	
	private /*text_editor*/ String description;
	
	@Version
	private Long version;
}
