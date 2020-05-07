package com.capgemini.online_movie.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.online_movie.entity.Screen;

public interface ScreenDao extends JpaRepository<Screen, Integer> {

}
