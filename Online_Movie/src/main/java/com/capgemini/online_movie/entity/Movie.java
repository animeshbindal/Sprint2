package com.capgemini.online_movie.entity;


import java.util.Arrays;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;


@Entity
@Table(name="MOVIE")
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column (name = "Movie_Id")
	private int movieId;
	
	@NotEmpty(message="Movie Name can't be empty")
	@Column(name="Movie_Name")
	private String movieName;
	
	@Column(name="Movie_Genre")
	private String movieGenre;
	
	@Column(name="Movie_Director")
	private String movieDirector;
	
	@Column(name="Movie_length")
	private int movieLength;
	
	@Column(name="Languages")
	private String[] languages;
	
	@Column(name="Movie_Release_Date")
	private Date movieReleaseDate;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="movieName")
	private Show show;

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieGenre() {
		return movieGenre;
	}

	public void setMovieGenre(String movieGenre) {
		this.movieGenre = movieGenre;
	}

	public String getMovieDirector() {
		return movieDirector;
	}

	public void setMovieDirector(String movieDirector) {
		this.movieDirector = movieDirector;
	}

	public int getMovieLength() {
		return movieLength;
	}

	public void setMovieLength(int movieLength) {
		this.movieLength = movieLength;
	}

	public String[] getLanguages() {
		return languages;
	}

	public void setLanguages(String[] languages) {
		this.languages = languages;
	}

	public Date getMovieReleaseDate() {
		return movieReleaseDate;
	}

	public void setMovieReleaseDate(Date movieReleaseDate) {
		this.movieReleaseDate = movieReleaseDate;
	}

	public Movie(int movieId, String movieName, String movieGenre, String movieDirector, int movieLength,
			String[] languages, Date movieReleaseDate) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieGenre = movieGenre;
		this.movieDirector = movieDirector;
		this.movieLength = movieLength;
		this.languages = languages;
		this.movieReleaseDate = movieReleaseDate;
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", movieGenre=" + movieGenre
				+ ", movieDirector=" + movieDirector + ", movieLength=" + movieLength + ", languages="
				+ Arrays.toString(languages) + ", movieReleaseDate=" + movieReleaseDate + "]";
	}
	
	
	
	
	
	
	
	
}
