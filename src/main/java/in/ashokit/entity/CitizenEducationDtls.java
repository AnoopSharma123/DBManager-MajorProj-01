package in.ashokit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "CITIZEN_GRADUATION_DTLS")
@Data
public class CitizenEducationDtls {

	@Id
	@GeneratedValue
	@Column(name = "GRADUATION_ID")
	private Integer gradutionId;
	
	@Column(name = "CASE_NUM")
	private Integer caseNumber;
	
	@Column(name = "HIGHIST_DEGREE")
	private String highestDregee;
	
	@Column(name = "GRADUATION_YEAR_ID")
	private Integer graduationIdYear;
	
	@Column(name = "UNIVERSITY")
	private String universityName;

}
