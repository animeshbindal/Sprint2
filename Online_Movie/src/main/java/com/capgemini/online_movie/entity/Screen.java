package com.capgemini.online_movie.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "Screen")
public class Screen {

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@OneToMany(mappedBy = "screenId",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	
	public Show screenId;
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@OneToMany(mappedBy = "theaterId",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@Column(name = "Theater_Id")
	public Show theaterId;
	
	@NotEmpty(message = "Screen name can't be empty")
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

	public Show getScreenId() {
		return screenId;
	}

	public void setScreenId(Show screenId) {
		this.screenId = screenId;
	}

	public Show getTheaterId() {
		return theaterId;
	}

	public void setTheaterId(Show theaterId) {
		this.theaterId = theaterId;
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

	public Screen(Show screenId, Show theaterId, String screenName, Show[] showList, LocalDate movieEndDate, int rows,
			int columns) {
		super();
		this.screenId = screenId;
		this.theaterId = theaterId;
		this.screenName = screenName;
		this.showList = showList;
		this.movieEndDate = movieEndDate;
		this.rows = rows;
		this.columns = columns;
	}
	
	
	
	
	
	

}
