package com.example.ERP.projects.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.Instant;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long project_id;
	
	@NotBlank(message = "project_name cannot be empty or Null")
	private /*data*/ String project_name;//Unique
	
//	@NotBlank(message = "status cannot be empty or Null")
//	private select status;//OPEN,Completed,Cancelled
	
	private Project_Type project_type;
	
	private /*check*/ boolean is_active;//def = 1
	
//	private select percent_complete_method;//Manual,TASK_COMPLETION,Task_Progress,Task_Weight
//	  Label : % Complete Method
	
//	private /*percent*/ float percent_complete;//read_only
//	//Label : % Completed
	
	private Project_Template project_template;// Set Only Once
	
	private Date expected_start_date;
	
	private Date expected_end_date;
//
//	private select priority;//Medium,Low,High
	
	private Department department;
	
	private Customer customer;
	
	private Sales_Order sales_order;
	
	private /*table*/ List<> users;//Project_User
	//Description : Project will be accessible on the website to these users
	
	private /*data*/ String copied_from;//read_only //hidden
	
	private /*text_editor*/ String notes;
	
	private Date actual_start_date;//read_only
	
	private float actual_time;//read_only
	//Label : Actual Time (in Hours)
	
	private Date actual_end_date;//read_only
	
	private /*currency*/ float estimated_costing;//company:default_/*currency*/ float
	
	private /*currency*/ float total_costing_amount;//read_only
	//Label : Total Costing Amount (via Timesheets)
	
	private /*currency*/ float total_expense_claim;//read_only
	//Label : Total Expense Claim (via Expense Claims)
	
	private /*currency*/ float total_purchase_cost;//read_only
	//Label : Total Purchase Cost (via Purchase Invoice)
	
//	private Company company;
	
	private /*currency*/ float total_sales_amount;//read_only
	//Label: Total Sales Amount (via Sales Order)
	
	private /*currency*/ float total_billable_amount;//read_only
	//Label: Total Billable Amount (via Timesheets)
	
	private /*currency*/ float total_billed_amount;//read_only
	//Label: Total Billed Amount (via Sales Invoices)
	
	private /*currency*/ float total_consumed_material_cost;//read_only
	//Label: Total Consumed Material Cost (via Stock Entry)
	
	private Cost_Center default_cost_center;
	
	private /*currency*/ float gross_margin;//read_only //company:default_/*currency*/ float
	
	private /*percent*/ float per_gross_margin;//read_only
	//Label: Gross Margin %
	
	private /*check*/ boolean collect_progress;//def=0
	
	private Holiday_List holiday_list;//Display Depends On: collect_progress
	
//	private select frequency_to_collect_progress;//Hourly,Twice_Daily,Daily,Weekly
//	//Display Depends On : eval:doc.collect_progress == true
	
	private Instant from_time;//Display Depends On: eval:(doc.frequency == "Hourly" && doc.collect_progress)
	
	private Instant to_time;//Display Depends On: eval:(doc.frequency == "Hourly" && doc.collect_progress)
	
	private Instant first_email;//Display Depends On: eval:(doc.frequency == "Twice Daily" && doc.collect_progress == true)
	
	private Instant second_email;//Display Depends On: eval:(doc.frequency == "Twice Daily" && doc.collect_progress == true)
	
	private Instant daily_time_to_send;//Display Depends On: eval:(doc.frequency == "Daily" && doc.collect_progress == true)
	
//	private select day_to_send;//Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday
//	//Display Depends On: eval:(doc.frequency == "Weekly" && doc.collect_progress == true)
	
	private Instant weekly_time_to_send;//Display Depends On: eval:(doc.frequency == "Weekly" && doc.collect_progress == true)
	
	private /*text*/ String message;//Display Depends On: collect_progress
	//Description: Message will be sent to the users to get their status on the Project
	
	@Version
	private Long version;
}
