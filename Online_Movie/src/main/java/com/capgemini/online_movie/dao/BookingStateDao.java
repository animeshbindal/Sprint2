package com.capgemini.online_movie.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.online_movie.dto.BookingState;

public interface BookingStateDao extends JpaRepository<BookingState, Integer> {

}
