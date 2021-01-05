package jp.JpFinance.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "person")
public class Person {
 
	@Id
	@Column
	private String id;
	private String username;
	private String name;
	private String lastname;
	private String email;
	private String password;
}