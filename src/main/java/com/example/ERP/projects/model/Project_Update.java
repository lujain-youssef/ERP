package com.example.ERP.projects.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.Instant;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Project_Update {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long project_update_id;
	
	@NotBlank(message = "Project cannot be empty or Null")
	private Project project;
	
	private /*check*/ boolean sent;//def =0 //read_only
	
	private Date date;//read_only
	
	private Instant time;//read_only
	
	private /*table*/ List users;//Project_User
	
	private Project_Update amended_from;//read_only
	
	@Version
	private Long version;
}
