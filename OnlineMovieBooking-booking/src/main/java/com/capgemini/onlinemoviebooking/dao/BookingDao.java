package com.capgemini.onlinemoviebooking.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.capgemini.onlinemoviebooking.entity.Booking;

public interface BookingDao extends JpaRepository<Booking, Integer> {
	@Modifying(clearAutomatically = true)
	@Query("UPDATE Booking b SET b.bookingStatus= :status WHERE b.bookingId= :bookingId")
	int updateBookingStatus(@Param("status") String status, @Param("bookingId") int bookingId);

}
