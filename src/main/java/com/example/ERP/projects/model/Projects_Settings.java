package com.example.ERP.projects.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Projects_Settings {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long projects_settings_id;
	
	private /*check*/ boolean ignore_workstation_time_overlap;//def = 0
	
	private /*check*/ boolean ignore_user_time_overlap;//def= 0
	
	private /*check*/ boolean ignore_employee_time_overlap;//def = 0
	
	@Version
	private Long version;
}
