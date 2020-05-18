package com.capgemini.onlinemoviebooking;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.capgemini.onlinemoviebooking.dao.MovieDao;
import com.capgemini.onlinemoviebooking.dao.SeatDao;
import com.capgemini.onlinemoviebooking.dao.TheaterDao;
import com.capgemini.onlinemoviebooking.dao.UserDao;
import com.capgemini.onlinemoviebooking.entity.BookingState;
import com.capgemini.onlinemoviebooking.entity.GenreList;
import com.capgemini.onlinemoviebooking.entity.LanguageList;
import com.capgemini.onlinemoviebooking.entity.Movie;
import com.capgemini.onlinemoviebooking.entity.Screen;
import com.capgemini.onlinemoviebooking.entity.Seat;
import com.capgemini.onlinemoviebooking.entity.Show;
import com.capgemini.onlinemoviebooking.entity.Theater;
import com.capgemini.onlinemoviebooking.entity.User;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;

@SpringBootApplication
public class OnlineMovieBookingApplication implements CommandLineRunner{

	@Autowired
	UserDao userDao;
	@Autowired
	MovieDao movieDao;
	@Autowired
	TheaterDao theaterDao;
	@Autowired
	SeatDao seatDao;
		
	public static void main(String[] args) {
		SpringApplication.run(OnlineMovieBookingApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
	
//		userDao.save(new User(101, "admin",true, "admin123"));
//		userDao.save(new User(102, "cust",false, "cust123"));
//		
//		movieDao.save(new Movie(1004, "I, Robot1", GenreList.Action.toString(), LanguageList.English.toString(), "Alex1"));
//		movieDao.save(new Movie(1003, "WAR",GenreList.Action.toString(), LanguageList.Hindi.toString(), "Siddarth"));
//		movieDao.save(new Movie(1002, "3-Idiots",GenreList.Drama.toString(), LanguageList.Hindi.toString(), "Rajkumar Irani"));
//		movieDao.save(new Movie(1001, "KGF",GenreList.Adventure.toString(),LanguageList.Kannada.toString(),"Neel"));
//		
//		theaterDao.save(new Theater(101, "Inox","Mathura","Ram","9986868686"));
//		theaterDao.save(new Theater(102, "Garuda","Mathura","Verma","9987878787"));
//		theaterDao.save(new Theater(103, "PVR","Mathura","Bharath","9988889988"));
//		theaterDao.save(new Theater(104, "Leo","Mathura","Vishnu","9945861373"));
//		
//		//seatDao.save(new Seat(1,BookingState.Available,100));
//		seatDao.save(new Seat(2,BookingState.Available,100));
//		seatDao.save(new Seat(3,BookingState.Available,100));
//		seatDao.save(new Seat(4,BookingState.Available,100));
//		seatDao.save(new Seat(5,BookingState.Available,100));
//		seatDao.save(new Seat(6,BookingState.Available,100));
//		seatDao.save(new Seat(7,BookingState.Available,100));
//		seatDao.save(new Seat(8,BookingState.Available,100));
//		seatDao.save(new Seat(9,BookingState.Available,100));
//		seatDao.save(new Seat(10,BookingState.Available,100));
//		seatDao.save(new Seat(11,BookingState.Available,100));
//		seatDao.save(new Seat(12,BookingState.Available,100));
//		seatDao.save(new Seat(13,BookingState.Available,100));
//		seatDao.save(new Seat(14,BookingState.Available,100));
//		seatDao.save(new Seat(15,BookingState.Available,100));
//		seatDao.save(new Seat(16,BookingState.Available,100));
//		seatDao.save(new Seat(17,BookingState.Available,100));
//		seatDao.save(new Seat(18,BookingState.Available,100));
//		seatDao.save(new Seat(19,BookingState.Available,100));
//		seatDao.save(new Seat(20,BookingState.Available,100));
		
		
	}

}
