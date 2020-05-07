package com.capgemini.online_movie.entity;

import java.util.Arrays;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;



@Entity
@Table(name= "Show")
public class Show {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name = "Show_Id")
	private int showId;
	
//	@Column(name = "Seats")
//	private Seat[] seats;
	
	@NotEmpty(message="Show name can't be empty")
	@Column(name="Show_Name")
	private String showName;
	
	@Column(name="Movie_Name")
	public Movie moviename;
	
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@ManyToOne(targetEntity = Screen.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "Screen_Id",referencedColumnName = "Screen_Id")
	private Screen screenId;
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@ManyToOne(targetEntity = Screen.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "Theater_Id",referencedColumnName = "Theater_Id")
	private Screen theaterId;

	@OneToOne(mappedBy = "showId")
	public Booking booking;
	
	@OneToMany(mappedBy = "seats")
	public Seat[] seats;

	@OneToOne(mappedBy = "show")
	private Movie movie;
	public int getShowId() {
		return showId;
	}

	public void setShowId(int showId) {
		this.showId = showId;
	}

//	public Seat[] getSeats() {
//		return seats;
//	}
//
//	public void setSeats(Seat[] seats) {
//		this.seats = seats;
//	}

	public String getShowName() {
		return showName;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	public Seat[] getSeats() {
		return seats;
	}

	public void setSeats(Seat[] seats) {
		this.seats = seats;
	}

	public void setShowName(String showName) {
		this.showName = showName;
	}

	public Movie getMoviename() {
		return moviename;
	}

	public void setMoviename(Movie moviename) {
		this.moviename = moviename;
	}

	public Screen getScreenId() {
		return screenId;
	}

	public void setScreenId(Screen screenId) {
		this.screenId = screenId;
	}

	public Screen getTheaterId() {
		return theaterId;
	}

	public void setTheaterId(Screen theaterId) {
		this.theaterId = theaterId;
	}

	public Show(int showId, Seat[] seats, @NotEmpty(message = "Show name can't be empty") String showName,
			Movie moviename, Screen screenId, Screen theaterId) {
		super();
		this.showId = showId;
		this.seats = seats;
		this.showName = showName;
		this.moviename = moviename;
		this.screenId = screenId;
		this.theaterId = theaterId;
	}

	@Override
	public String toString() {
		return "Show [showId=" + showId + ", seats=" + Arrays.toString(seats) + ", showName=" + showName
				+ ", moviename=" + moviename + ", screenId=" + screenId + ", theaterId=" + theaterId + "]";
	}
	
	
	
	

}
