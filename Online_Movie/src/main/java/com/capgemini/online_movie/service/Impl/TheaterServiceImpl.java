package com.capgemini.online_movie.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.online_movie.dao.TheaterDao;
import com.capgemini.online_movie.entity.Movie;
import com.capgemini.online_movie.entity.Screen;
import com.capgemini.online_movie.service.TheaterService;

public class TheaterServiceImpl implements TheaterService {

	@Autowired
	TheaterDao theaterdao;
	
	@Override
	public Movie searchMovie(String theaterName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Screen searchScreen(Integer theaterId) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
