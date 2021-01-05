package jp.JpFinance.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "incomexpenses")
public class IncomExpenses {

	
	@Id
	@Column
	private int id;
	
	private String description;
	private String type;
	private String category;
	private Date datein;
	private int isexpense;
	
	private String iduser;
}
/*
id int primary key identity(1,1),
description varchar(100),
type varchar(20),
category varchar(20),
datein date,
isexpense bit,
idUser
*/