package com.capgemini.online_movie.service;

import com.capgemini.online_movie.entity.Theater;
import com.capgemini.online_movie.entity.Ticket;

public interface CustomerService {
	
	Boolean chooseCity (String theaterCity);
	
	Boolean bookMovieTicket(Theater theater);
	
	Boolean cancelMovieTicket(Ticket ticket);

}
