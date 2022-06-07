package in.ashokit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="GRADUATION_YEARS")
@Data
public class GraduationYearDtls {
	
	@Id
	@Column(name="GRADUATION_ID")
	private Integer graduationId;
	
	@Column(name="GRADUATION_YEAR")
	private Integer gradutionYear;

}
