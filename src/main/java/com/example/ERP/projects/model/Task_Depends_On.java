package com.example.ERP.projects.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Task_Depends_On {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long task_depends_on_id;
	
	private Task task;
		
	@Version
	private Long version;
	
	/*
	private String subject;//read_only //fm : task.subject
	
	private String project;//read_only //fm : task.project
	*/
}
