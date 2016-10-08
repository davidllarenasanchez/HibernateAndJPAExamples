package com.hibernate.example;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="CONTACTS", 
	   uniqueConstraints={@UniqueConstraint(columnNames={"ID"})})

public class Contacts {

	public Contacts() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID", nullable=false, unique=true, length=11)
	private int id;
	
	@Column(name="FIRSTNAME", length=30, nullable=true)
	private String firstname;
	
	@Column(name="LASTNAME", length=30, nullable=true)
	private String lastname;
	
	@Column(name="TELEPHONE", length=15,nullable=true)
	private String telephone;
	
	@Column(name="EMAIL", length=30, nullable=true)
	private String email;
	
	@Column(name="CREATED", nullable=true)
	private Date created;
	
	 
    public String getEmail() {
        return email;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public String getFirstname() {
        return firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
}
