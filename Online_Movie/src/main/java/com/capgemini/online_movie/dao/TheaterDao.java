package com.capgemini.online_movie.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.online_movie.entity.Theater;

public interface TheaterDao extends JpaRepository<Theater, Integer> {

}
