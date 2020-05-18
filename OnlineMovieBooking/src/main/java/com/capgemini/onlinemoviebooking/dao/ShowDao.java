package com.capgemini.onlinemoviebooking.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.capgemini.onlinemoviebooking.entity.Show;

public interface ShowDao extends JpaRepository<Show, Integer>{
	@Modifying(clearAutomatically = true)
	@Query("UPDATE Show s SET s.noOfAvailableSeats= :count WHERE s.showId= :showId")
	int updateNoOfAvailableSeats(@Param("count") int count, @Param("showId") int showId);
}
