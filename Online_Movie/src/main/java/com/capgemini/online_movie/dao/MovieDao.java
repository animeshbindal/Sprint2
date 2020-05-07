package com.capgemini.online_movie.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.online_movie.entity.Movie;

public interface MovieDao extends JpaRepository<Movie, Integer> {

}
