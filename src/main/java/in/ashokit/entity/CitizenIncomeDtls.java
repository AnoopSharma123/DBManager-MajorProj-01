package in.ashokit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="CITIZEN_INCOME_DTLS")
@Data
public class CitizenIncomeDtls {
	
	@Id
	@GeneratedValue
	@Column(name="INCOME_ID")
	private Integer incomeId;
	
	@Column(name="CASE_NUM")
	private Integer caseNum;
	
	@Column(name="SAL_INCOME")
	private Integer salaryIncome;
	
	@Column(name="RENT_INCOME")
	private Integer rentIncome;
	
	@Column(name="PROPERTY_INCOME")
	private Integer propertyIncome;
	

}
