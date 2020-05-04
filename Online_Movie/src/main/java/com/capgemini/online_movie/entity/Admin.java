package com.capgemini.online_movie.entity;
import java.time.LocalDate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ADMIN")

public class Admin {
	@Id
	@Column(name="ADMIN_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int adminid;
	
	@Column(name="ADMIN_NAME")
	private String adminName;
	
	@Column(name="ADMIN_PASSWORD")
	private String adminpassword;
	
	@Column(name="DATE_OF_BIRTH")
	private LocalDate dateOfBirth;
	
	@Column(name="ADMIN_CONTACT")
	private String adminContact;

	public int getAdminid() {
		return adminid;
	}

	public void setAdminid(int adminid) {
		this.adminid = adminid;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminpassword() {
		return adminpassword;
	}

	public void setAdminpassword(String adminpassword) {
		this.adminpassword = adminpassword;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAdminContact() {
		return adminContact;
	}

	public void setAdminContact(String adminContact) {
		this.adminContact = adminContact;
	}

}