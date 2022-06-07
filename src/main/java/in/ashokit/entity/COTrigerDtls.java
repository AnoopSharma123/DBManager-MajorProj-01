package in.ashokit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "CO_TRIGGERS")
@Data

public class COTrigerDtls {

	@Id
	@GeneratedValue
	@Column(name = "TRIGGER_ID")
	private Integer triggerId;

	@Column(name = "CASE_NUM")
	private Integer caseNum;

	@Column(name = "TRIGGER_STATUS")
	private String triggerStatus;

	@Column(name = "NOTICE")
	@Lob
	private byte[] notice;
}
