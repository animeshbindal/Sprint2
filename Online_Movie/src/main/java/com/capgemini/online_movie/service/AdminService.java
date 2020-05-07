package com.capgemini.online_movie.service;

import com.capgemini.online_movie.entity.Movie;
import com.capgemini.online_movie.entity.Screen;
import com.capgemini.online_movie.entity.Show;
import com.capgemini.online_movie.entity.Theater;

public interface AdminService {
	
	Theater addTheater (Theater theater);
	
	Boolean deleteTheater (Integer theaterId);
	
	Movie addMovie (Movie movie);
	
	Boolean deleteMovie(Integer movieId);
	
	Screen addScreen (Screen screen);
	
	Boolean deleteScreen (Integer screenId);
	
	Show addShow (Show show);
	
	Boolean deleteShow (Integer showId);
	

}
