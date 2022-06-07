package in.ashokit.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Table(name="CITIZEN_CHILD_DTLS")
@Data
public class CitizenChildDetails {
    @Id
    @GeneratedValue
    @Column(name="CHILD_ID")
	private Integer childId;
    
    @Column(name="CASE_NUM")
	private Integer caseNum;
    
    @Column(name="CHILD_NAME")
	private String childName;
    
    @CreationTimestamp
    @Column(name="CHILD_DOB",insertable=false)
	private LocalDate childDOB;
    
    @Column(name="CHILD_SSN")
	private Integer childSSN;
	
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

