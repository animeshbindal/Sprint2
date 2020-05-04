package com.capgemini.online_movie.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="THEATER")
public class Theater {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name = "Theater_Id")
	public int theater_Id;
	
	@Column(name="Theater_Name")
	public String theaterName;
	
	@Column(name="Theater_City")
	public String theatercity;
	
	@Column(name="Movies")
	public Movie[] movies;
	
	@Column(name="List_Of_Screens")
	public Screen[] listOfScreens;
	
	@Column(name="Manager_Name")
	public String managerName;
	
	@Column(name="Manager_Contact")
	public String managerContact;

	public int getTheater_Id() {
		return theater_Id;
	}

	public void setTheater_Id(int theater_Id) {
		this.theater_Id = theater_Id;
	}

	public String getTheaterName() {
		return theaterName;
	}

	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}

	public String getTheatercity() {
		return theatercity;
	}

	public void setTheatercity(String theatercity) {
		this.theatercity = theatercity;
	}

	public Movie[] getMovies() {
		return movies;
	}

	public void setMovies(Movie[] movies) {
		this.movies = movies;
	}

	public Screen[] getListOfScreens() {
		return listOfScreens;
	}

	public void setListOfScreens(Screen[] listOfScreens) {
		this.listOfScreens = listOfScreens;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getManagerContact() {
		return managerContact;
	}

	public void setManagerContact(String managerContact) {
		this.managerContact = managerContact;
	}
	
	

}
