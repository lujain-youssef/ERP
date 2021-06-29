package com.example.ERP.projects.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Timesheet_Detail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long timesheet_detail_id;
	
	private Activity_Type activity_type;
	
	private Instant from_time;//Datetime
	
	private float expected_hours;
	
	private float hours;
	
	private Instant to_time;//Datetime
	
	private /*check*/boolean completed;//def = 0
	
	private float completed_qty;//Display Depends On : eval:parent.work_order
	
	private Workstation workstation;//Display Depends On: eval:parent.work_order //read_only
	
	private Operation operation;//Display Depends On: eval:parent.work_order //read_only
	
	private /*data*/ String operation_id;//Display Depends On: eval:parent.work_order //hidden
	
	private Project project;
	
	private Task task;
	
	private /*check*/boolean billable;//def =0
	
	private float billing_hours;//Display Depends On: billable
	
	private /*currency*/ float billing_rate;
	
	private /*currency*/ float billing_amount;//def =0 //read_only
	
	private /*currency*/ float costing_rate;
	
	private /*currency*/ float costing_amount;//def=0 //read_only
	
	private Sales_Invoice sales_invoice;//read_only
	
	@Version
	private Long version;
}
