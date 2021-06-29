package com.example.ERP.projects.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long task_id;
	
	@NotBlank(message = "subject cannot be empty or Null")
	private /*data*/ String subject;
	
	private Project project;
	
	private Issue issue;
	
	private Task_Type type;
	
	private /*check*/ boolean is_group;//def = 0
	
	private select status;//Open,Working,Pending_Review,Overdue,Completed,Cancelled
	
	private select priority;//Low,Medium,High,Urgent
	
	private float task_weight; // fm : type.weight
	
	private User completed_by;
	
	private /*color*/ String color;
	
	private Task parent_task;
	
	private Date expected_start_date;
	
	private float expected_time;//def =0
	//Label : Expected Time (in hours)
	
	private Date expected_end_date;
	
	private /*percent*/ float progress;//Label : % Progress
	
	private /*check*/ boolean is_milestone;//def =0 
	
	private /*text_editor*/ String description;
	
	private /*table*/ List<> dependent_tasks;//Task_Depends_On
	
	private /*code*/ String depends_on_tasks; //hidden //read_only
	
	private Date act_start_date;//read_only
	//Label: Actual Start Date (via Time Sheet)
	
	private float actual_time;//read_only
	//Label : Actual Time (in hours)
	
	private Date act_end_date;//read_only
	//Label : Actual End Date (via Time Sheet)
	
	private /*currency*/ float total_costing_amount;//read_only //company:default_/*currency*/ float
	//Label : Total Costing Amount (via Time Sheet)
	
	private /*currency*/ float total_expense_claim;//read_only
	//company:default_/*currency*/ float
	//Label : Total Expense Claim (via Expense Claim)
	
	private /*currency*/ float total_billing_amount;//read_only
	//Label : Total Billing Amount (via Time Sheet)
	
	private Date review_date;//Display Depends On : eval:doc.status == "Closed" || doc.status == "Pending Review"
	
	private Date closing_date;//Display Depends On : eval:doc.status == "Closed"
	
	private Department department;
	
	private Company company;
	
	@Version
	private Long version;
}
