package com.capgemini.online_movie.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.online_movie.entity.Booking;

public interface BookingDao extends JpaRepository<Booking, Integer>{

}
