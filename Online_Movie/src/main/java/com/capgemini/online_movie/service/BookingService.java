package com.capgemini.online_movie.service;



import com.capgemini.online_movie.entity.Show;

public interface BookingService {
	
	Show[] showShows();
	
	Show searchShow(String showName); 

}
