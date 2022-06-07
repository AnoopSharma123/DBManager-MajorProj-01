package in.ashokit.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Table(name ="ADMIN_DTLS")
@Data
public class AdminEntity {
	@Id
	@Column(name ="ADMIN_ID")
	private Integer adminId;
	
	@Column(name ="ADMIN_NAME")
	private String adminName;
	
	@Column(name ="ADMIN_MOB")
	private Long mobileNo;
	
	@Column(name ="GENDER")
	private String gender;
	
	@Column(name ="ADMIN_EMAIL")
	private String adminEmail;
	
	@Column(name ="STATUS")
	private String activeStatus;
	
	@Column(name ="SSN")
	private Integer ssn;
	
	@CreationTimestamp
	@Column(name ="START_DATE",updatable = false)
	private LocalDate adminStartDate;
	
	@CreationTimestamp
	@Column(name ="END_DATE",updatable = false)
	private LocalDate adminEndDate;
	
	@UpdateTimestamp
	@Column(name ="ADMIN_UPDATE",insertable =false)
	private LocalDate adminUpdateDate;

}
