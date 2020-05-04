package com.capgemini.online_movie.entity;

import java.time.LocalDate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="BOOKING")
public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Booking_Id")
	@NotNull
	public int bookingId;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	(name="Movie_Id")
	@NotNull
	public int movieId;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	(name="Show_Id")
	@NotNull
	public int showId;
	
	@Column
	(name="Show_Ref")
	public Show showRef;
	
	@Column
	(name="Booking_Date")
	public LocalDate bookingDate;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	(name="Transaction_Id")
	public int transactionId;
	
	@Column
	(name="Total_Cost")
	public double totalCost;
	
	@Column
	(name="Seat_List")
	public Seat[] seatList;
	
	
	@OneToMany
	@Column
	(name="Ticket")
	public Ticket ticket;


	public int getBookingId() {
		return bookingId;
	}


	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}


	public int getMovieId() {
		return movieId;
	}


	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}


	public int getShowId() {
		return showId;
	}


	public void setShowId(int showId) {
		this.showId = showId;
	}


	public Show getShowRef() {
		return showRef;
	}


	public void setShowRef(Show showRef) {
		this.showRef = showRef;
	}


	public LocalDate getBookingDate() {
		return bookingDate;
	}


	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}


	public int getTransactionId() {
		return transactionId;
	}


	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}


	public double getTotalCost() {
		return totalCost;
	}


	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}


	public Seat[] getSeatList() {
		return seatList;
	}


	public void setSeatList(Seat[] seatList) {
		this.seatList = seatList;
	}


	public Ticket getTicket() {
		return ticket;
	}


	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	
}
