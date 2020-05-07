package com.capgemini.online_movie;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.capgemini.online_movie.dao.AdminDao;
import com.capgemini.online_movie.dao.AdminDaoImpl;
import com.capgemini.online_movie.dao.MovieDao;
import com.capgemini.online_movie.dao.ShowDaoImpl;
import com.capgemini.online_movie.entity.Admin;
import com.capgemini.online_movie.entity.Movie;
import com.capgemini.online_movie.entity.Show;
import com.capgemini.online_movie.service.AdminServiceImpl;

@SpringBootApplication
public class OnlineMovieApplication implements CommandLineRunner{

	@Autowired
	ShowDaoImpl showdao;
	@Autowired
	AdminDao admindao;
	@Autowired
	MovieDao moviedao;
	
	@Autowired
	AdminServiceImpl adminservice;
	public static void main(String[] args) {
		SpringApplication.run(OnlineMovieApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		Admin admin1 = new Admin(1234, "Animesh", "Bin12345", "1234567890");
		Admin admin2 = new Admin(1235, "Aman", "Gupta123", "9876543210");
		Admin admin3 = new Admin(1236, "Akash", "Namdev1234", "1234567890");
		Admin admin4 = new Admin(1237, "Hemant", "Sharma1234", "5566447788");
		Admin admin5 = new Admin(1234, "Navpreet", "Singh123", "9988776655");
		
		admindao.save(admin1);
		admindao.save(admin2);
		admindao.save(admin3);
		admindao.save(admin4);
		admindao.save(admin5);
//	System.out.println("Records Inserted");
	}
}
