package com.capgemini.online_movie.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Screen")
public class Screen {

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name = "Screen_Id")
	public int screenId;
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name = "Theater_Id")
	public int theater;
	
	@Column(name = "Screen_Name")
	public String screenName;
	
	@Column(name = "Show_List")
	public Show[] showList;
	
	@Column(name = "Movie_End_Date")
	public LocalDate movieEndDate;
	
	@Column(name = "Rows")
	public int rows;
	
	@Column(name = "Columns")
	public int columns;

	public int getScreenId() {
		return screenId;
	}

	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}

	public int getTheater() {
		return theater;
	}

	public void setTheater(int theater) {
		this.theater = theater;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public Show[] getShowList() {
		return showList;
	}

	public void setShowList(Show[] showList) {
		this.showList = showList;
	}

	public LocalDate getMovieEndDate() {
		return movieEndDate;
	}

	public void setMovieEndDate(LocalDate movieEndDate) {
		this.movieEndDate = movieEndDate;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	
	
	
	
	

}
