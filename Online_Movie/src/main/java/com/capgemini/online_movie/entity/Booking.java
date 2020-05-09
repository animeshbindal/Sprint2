package com.capgemini.online_movie.entity;

import java.time.LocalDate;
import java.util.Arrays;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="BOOKING")
public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Booking_Id")
	
	private int bookingId;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Movie_Id")
	
	private int movieId;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="Show_Show_Id")
	private Show showId;
	
	@Column
	(name="Show_Ref")
	private Show showRef;
	
	@Column
	(name="Booking_Date")
	public LocalDate bookingDate;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	(name="Transaction_Id")
	private int transactionId;
	
	@Column
	(name="Total_Cost")
	private double totalCost;
	
	@Column
	(name="Seat_List")
	private Seat[] seatList;
	
	@OneToOne(mappedBy = "booking")
	@JoinColumn(name="Ticket")
	private Ticket ticket;

	
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


	public Show getShowId() {
		return showId;
	}


	public void setShowId(Show showId) {
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


	public Booking(@NotNull int bookingId, @NotNull int movieId, @NotNull Show showId, Show showRef,
			LocalDate bookingDate, int transactionId, double totalCost, Seat[] seatList, Ticket ticket) {
		super();
		this.bookingId = bookingId;
		this.movieId = movieId;
		this.showId = showId;
		this.showRef = showRef;
		this.bookingDate = bookingDate;
		this.transactionId = transactionId;
		this.totalCost = totalCost;
		this.seatList = seatList;
		this.ticket = ticket;
	}


	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", movieId=" + movieId + ", showId=" + showId + ", showRef="
				+ showRef + ", bookingDate=" + bookingDate + ", transactionId=" + transactionId + ", totalCost="
				+ totalCost + ", seatList=" + Arrays.toString(seatList) + ", ticket=" + ticket + "]";
	}
	
	
}
