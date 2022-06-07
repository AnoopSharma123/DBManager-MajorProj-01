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
@Table(name = "APP_PLAN")
@Data
public class StatePlanDtls {

	@Id
	@GeneratedValue
	@Column(name = "PLAN_ID")
	private Integer planId;

	@Column(name = "PLAN_NAME")
	private String planName;

	@CreationTimestamp
	@Column(name = "PLAN_START_DATE",updatable=false)
	private LocalDate planStartDate;

	@CreationTimestamp
	@Column(name = "PLAN_END_DATE",updatable=false)
	private LocalDate planEndDate;

	@Column(name = "CATEGORY_ID")
	private Integer planCategoryId;

	@Column(name = "ACTIVE_SW")
	private String activeSw;

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
