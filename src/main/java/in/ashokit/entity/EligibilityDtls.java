package in.ashokit.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

@Entity
@Table(name="ELIGIBILITY_DTLS")
@Data
public class EligibilityDtls {

	@Id
	@GeneratedValue
	@Column(name="ELIG_ID")
	private Integer eligId;
	
	@Column(name="CASE_NUM")
	private Integer caseNum;
	
	@Column(name="PLAN_NAME")
	private String planName;
	
	@Column(name="PLAN_STATUS")
	private String planStatus;
	
	@Column(name="BENEFIT_AMT")
	private Long benefitAmount;
	
	@Column(name="DENIEL_REASON")
	private String denielReason;
	
	@CreationTimestamp
	@Column(name="START_DATE",insertable=false)
	private LocalDate startDate;
	
	@CreationTimestamp
	@Column(name="END_DATE",insertable=false)
	private LocalDate endDate;
}
