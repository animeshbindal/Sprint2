package com.capgemini.online_movie.dao;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer>{

}
