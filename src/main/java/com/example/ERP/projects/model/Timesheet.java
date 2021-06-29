package com.example.ERP.projects.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Timesheet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long timesheet_id;
	
	private /*data*/ String title;//def = {employee_name} //hidden
	
	private Company company;
	
	private Sales_Invoice sales_invoice;//read_only
	
	private Salary_Slip salary_slip;//read_only
	
	private select status;//DRAFT,Submitted,Billed,Payslip,Completed,Cancelled //read_only
	
	private Employee employee;
	
	private Date start_date;//read_only
	
	private Date end_date;//read_only
	

	private table timesheets;//Timesheet_Detail
	
	private float total_working_hours;//def= 0 //read_only
	
	private float total_billable_hours;//read_only
	
	private float total_billed_hours;//read_only
	
	private /*currency*/ float total_costing_amount;//read_only
	
	private /*currency*/ float total_billable_amount;//def=0 //read_only
	
	private /*currency*/ float total_billed_amount;//read_only
	
	private percent per_billed;//read_only
	//Label : % Amount Billed
	
	private text_editor note;
	
	private Timesheet amended_from;//read_only
	
	@Version
	private Long version;
	
	/*
	private String employee_name;//read_only //fm : employee.employee_name
	//Display Depends On: employee
	
	private Department department;//read_only //fm: employee.department
	
	private User user;//read_only //fm : employee.user
	*/
}
