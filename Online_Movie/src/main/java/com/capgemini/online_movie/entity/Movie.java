package com.capgemini.online_movie.entity;

import java.time.LocalDate;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	private Show[] movieGenre;
	
	@Column(name="Movie_Director")
	private LocalDate movieDirector;
	
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

	public Movie(int movieId, String movieName, Show[] movieGenre, LocalDate movieDirector, int movieLength,
			String[] languages, LocalDate movieReleaseDate) {
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
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", movieGenre=" + Arrays.toString(movieGenre)
				+ ", movieDirector=" + movieDirector + ", movieLength=" + movieLength + ", languages="
				+ Arrays.toString(languages) + ", movieReleaseDate=" + movieReleaseDate + "]";
	}
	
	
	
	
	
	
	
	
}
