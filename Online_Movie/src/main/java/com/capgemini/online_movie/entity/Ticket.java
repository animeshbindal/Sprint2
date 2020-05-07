package com.capgemini.online_movie.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Ticket")
public class Ticket {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name = "Ticket_Id")
	private int ticketId;
	
	@Column(name="No_Of_Seats")
	public int noOfSeats;
	
	@Column(name="Seat_Name")
	public String[] seatName;
	
	@Column(name = "Booking_Ref")
	public Booking bookingRef;
	
	@Column(name="Ticket_Status")
	public boolean ticketStatus;
	
	@Column(name="Screen_Name")
	public String screenName;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Booking booking;

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public String[] getSeatName() {
		return seatName;
	}

	public void setSeatName(String[] seatName) {
		this.seatName = seatName;
	}

	public Booking getBookingRef() {
		return bookingRef;
	}

	public void setBookingRef(Booking bookingRef) {
		this.bookingRef = bookingRef;
	}

	public boolean isTicketStatus() {
		return ticketStatus;
	}

	public void setTicketStatus(boolean ticketStatus) {
		this.ticketStatus = ticketStatus;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	
	
}
