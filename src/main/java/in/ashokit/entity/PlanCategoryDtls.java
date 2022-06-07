package in.ashokit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "PLAN_CATEGORY_MASTER")
@Data
public class PlanCategoryDtls {
	@Id
	@Column(name = "CATEGORY_ID")
	private Integer planCatgId;

	@Column(name = "CATEGORY_NAME")
	private String planCatgName;
}
