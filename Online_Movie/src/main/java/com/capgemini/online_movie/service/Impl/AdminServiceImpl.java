package com.capgemini.online_movie.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.online_movie.dao.AdminDao;
import com.capgemini.online_movie.dao.MovieDao;
import com.capgemini.online_movie.dao.ScreenDao;
import com.capgemini.online_movie.dao.ShowDao;
import com.capgemini.online_movie.dao.TheaterDao;
import com.capgemini.online_movie.entity.Movie;
import com.capgemini.online_movie.entity.Screen;
import com.capgemini.online_movie.entity.Show;
import com.capgemini.online_movie.entity.Theater;
import com.capgemini.online_movie.service.AdminService;

public class AdminServiceImpl implements AdminService {

	private  AdminDao adminDao;
	
	private TheaterDao theaterDao;
	
	private MovieDao movieDao;
	
	private ScreenDao screenDao;
	
	private ShowDao showDao;
	@Autowired
	public  AdminServiceImpl(AdminDao adminDao) {
		this.adminDao = adminDao;
	}
	
	
	@Override
	public Theater addTheater(Theater theater) {
	return theaterDao.saveAndFlush(theater);
	}

	@Override
	public Boolean deleteTheater(Integer theaterId) {
		theaterDao.delete(theaterId);
		
		return true;
	}

	@Override
	public Movie addMovie(Movie movie) {
		return movieDao.saveAndFlush(movie);
	}

	@Override
	public Boolean deleteMovie(Integer movieId) {
		movieDao.delete(movieId);
		return true;
	}

	@Override
	public Screen addScreen(Screen screen) {
		return screenDao.saveAndFlush(screen);
	}

	@Override
	public Boolean deleteScreen(Integer screenId) {
		screenDao.delete(screenId);
		return true;
	}

	@Override
	public Show addShow(Show show) {
		return showDao.saveAndFlush(show);
		
	}

	@Override
	public Boolean deleteShow(Integer showId) {
		// TODO Auto-generated method stub
		showDao.delete(showId);
		return true;
	}

}
