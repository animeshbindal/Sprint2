package com.capgemini.online_movie.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MOVIE")
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column (name = "Movie_Id")
	public int movieId;
	
	@Column(name="Movie_Name")
	public String movieName;
	
	@Column(name="Movie_Genre")
	public Show[] movieGenre;
	
	@Column(name="Movie_Director")
	public LocalDate movieDirector;
	
	@Column(name="Movie_length")
	public int movieLength;
	
	@Column(name="Languages")
	public String[] languages;
	
	@Column(name="Movie_Release_Date")
	public LocalDate movieReleaseDate;

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

	public Show[] getMovieGenre() {
		return movieGenre;
	}

	public void setMovieGenre(Show[] movieGenre) {
		this.movieGenre = movieGenre;
	}

	public LocalDate getMovieDirector() {
		return movieDirector;
	}

	public void setMovieDirector(LocalDate movieDirector) {
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

	public LocalDate getMovieReleaseDate() {
		return movieReleaseDate;
	}

	public void setMovieReleaseDate(LocalDate movieReleaseDate) {
		this.movieReleaseDate = movieReleaseDate;
	}
	
	
	
	
	
	
	
	
}
