package jp.JpFinance.dbModel;

import java.util.List;


import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "person")
public class Person {

	@Id
	@Column
	private String id;

	@JoinTable(name = "personbudget", joinColumns = @JoinColumn(name = "iduser", nullable = false), inverseJoinColumns = @JoinColumn(name = "idbudget", nullable = false))
	@ManyToMany(cascade = CascadeType.ALL)
	List<Budget> listBudget;

	private String username;
	private String name;
	private String lastname;
	private String email;
	private String password;

}