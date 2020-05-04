package com.capgemini.online_movie.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "Show")
public class Show {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name = "Show_Id")
	public int showId;
	
	@Column(name = "Seats")
	public Seat[] seats;
	
	@Column(name="Show_Name")
	public String showName;
	
	@Column(name="Movie_Name")
	public Movie moviename;
	
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name = "Screen_Id")
	public int screenId;
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name = "Theater_Id")
	public int theaterId;

	public int getShowId() {
		return showId;
	}

	public void setShowId(int showId) {
		this.showId = showId;
	}

	public Seat[] getSeats() {
		return seats;
	}

	public void setSeats(Seat[] seats) {
		this.seats = seats;
	}

	public String getShowName() {
		return showName;
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

	public int getScreenId() {
		return screenId;
	}

	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}

	public int getTheaterId() {
		return theaterId;
	}

	public void setTheaterId(int theaterId) {
		this.theaterId = theaterId;
	}
	
	
	
	

}
