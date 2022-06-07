package in.ashokit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="CITIZEN_PLANS")
@Data
public class CitizenPlansDtls {

	@Id
	@GeneratedValue
	@Column(name="CITIZEN_ID")
	private Integer citizenId;
	
	@Column(name="CASE_NUM")
	private Integer caseNum;
	
	@Column(name="PLAN_ID")
	private Integer planId;
}
