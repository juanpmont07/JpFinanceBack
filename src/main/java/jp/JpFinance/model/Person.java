package jp.JpFinance.model;


import javax.persistence.*;

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

//	@Column(name=  "nose")//cada que tenga una mayuscula de pone_
//	private String noseHola;
}