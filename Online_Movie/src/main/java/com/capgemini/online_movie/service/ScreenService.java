package com.capgemini.online_movie.service;

import com.capgemini.online_movie.entity.Show;

public interface ScreenService {

    Show[] showShows();
	
	Show searchShow(String showName);
}
