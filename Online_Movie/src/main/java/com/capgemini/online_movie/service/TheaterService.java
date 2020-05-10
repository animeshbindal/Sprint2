package com.capgemini.online_movie.service;

import com.capgemini.online_movie.entity.Movie;
import com.capgemini.online_movie.entity.Screen;

public interface TheaterService {
	
	Movie searchMovie(String theaterName);
	
	Screen searchScreen(Integer theaterId);

}
