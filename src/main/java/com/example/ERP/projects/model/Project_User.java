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
public class Project_User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long project_user_id;
	
	@NotBlank(message = "User cannot be empty or Null")
	private User user;
	
	private /*check*/ boolean welcome_email_sent;//def = 0
	
	private /*check*/ boolean view_attachments;//def=0
	
	private /*text*/ String project_status;//Display Depends On: eval:parent.doctype == 'Project Update'
	
	@Version
	private Long version;
	
	/*
	private String email;//read_only //fm : user.email
	
	private  byte[] image;//read_only //fm : user.user_image //hidden
	
	private String full_name;//read_only //fm : user.full_name
	*/
}
