package jp.JpFinance.dbModel;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import lombok.Data;

@Data
@Entity
@Table(name = "incomexpenses")
public class IncomExpenses {

	
	@Id
	@Column
	private long id;
	
	
	@JoinColumn(name = "iduser")
	@ManyToOne(optional = false,fetch = FetchType.EAGER)
	@OnDelete(action = OnDeleteAction.CASCADE)	
	Person person;
	
	private String description;
	private String type;
	private String category;
	private Date datein;
	private int isexpense;
	
}
