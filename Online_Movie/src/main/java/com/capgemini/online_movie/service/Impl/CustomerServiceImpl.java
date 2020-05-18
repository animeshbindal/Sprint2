package com.capgemini.online_movie.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.online_movie.dao.CustomerDao;
import com.capgemini.online_movie.entity.Theater;
import com.capgemini.online_movie.entity.Ticket;
import com.capgemini.online_movie.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDao customerdao; 

	@Override
	public Boolean chooseCity(String theaterCity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean bookMovieTicket(Theater theater) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean cancelMovieTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
