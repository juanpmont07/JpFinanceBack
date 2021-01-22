package jp.JpFinance.dbModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import lombok.Data;

@Data
@Entity
@Table(name = "budget")
public class Budget {

	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@JoinColumn(name = "iduser")
	@ManyToOne(optional = false,fetch = FetchType.EAGER)
	@OnDelete(action = OnDeleteAction.CASCADE)	
	Person person;
	
	private String name;
	private float value;
	
}
