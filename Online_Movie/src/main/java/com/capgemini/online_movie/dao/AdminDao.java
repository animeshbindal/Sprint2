package com.capgemini.online_movie.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.online_movie.entity.Admin;

public interface AdminDao extends JpaRepository<Admin, Integer> {

}
