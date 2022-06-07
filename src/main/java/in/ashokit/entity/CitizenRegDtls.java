package in.ashokit.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="CITIZEN_REG_DETAILS")

public class CitizenRegDtls {

	@Id
	@Column(name="CASE_NUM")
	private Integer caseNumber;
	
	@Column(name="FULL_NAME")
	private String fullName;
	
	@Column(name="EMAIL",unique=true)
	private String email;
	
	@Column(name="MOBILE_NO")
	private Long mobileNo;
	
	@Column(name="GENDER")
	private String gender;
	
	@CreationTimestamp
	@Column(name="DOB",updatable=false)
	private LocalDate dob;
	
	@Column(name="SSN")
	private Long SSN;
	
	@Column(name="ACTIVE_SW")
	private String activeSw;
	
	@Column(name="STATE_NAME")
	private String stateName;
	
	@CreationTimestamp
	@Column(name = "CREATE_DATE",updatable=false)
	private LocalDate createDate;

	@UpdateTimestamp
	@Column(name = "UPDATE_DATE",insertable=false)
	private LocalDate updateDate;

	@Column(name = "CREATE_BY")
	private String createBy;

	@Column(name = "UPDATE_BY")
	private String UpdatedBy;
	
}
