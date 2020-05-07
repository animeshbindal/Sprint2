package com.capgemini.online_movie.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;


@Entity
@Table(name="CUSTOMER")
public class Customer extends User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Customer_Id")
	private String customerId;
	
	@NotEmpty(message="Customer name can't be empty")
	@Column(name = "Customer_Name")
	private String customerName;
	
	@NotEmpty(message="Password can't be null")
	@Column(name = "Customer_Password")
	private String customerPassword;
	
	@Column(name = "Date_Of_Birth")
	private LocalDate dateOfBirth;
	
	@Column(name="My_Tickets")
	private List<Ticket> myTickets;
	
	@Column(name="Customer_Contact")
	private String customerContact;

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerPassword() {
		return customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public List<Ticket> getMyTickets() {
		return myTickets;
	}

	public void setMyTickets(List<Ticket> myTickets) {
		this.myTickets = myTickets;
	}

	public String getCustomerContact() {
		return customerContact;
	}

	public void setCustomerContact(String customerContact) {
		this.customerContact = customerContact;
	}

	public Customer(String customerId, String customerName, String customerPassword, LocalDate dateOfBirth,
			List<Ticket> myTickets, String customerContact) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerPassword = customerPassword;
		this.dateOfBirth = dateOfBirth;
		this.myTickets = myTickets;
		this.customerContact = customerContact;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerPassword="
				+ customerPassword + ", dateOfBirth=" + dateOfBirth + ", myTickets=" + myTickets + ", customerContact="
				+ customerContact + "]";
	}
	
	
	

}
