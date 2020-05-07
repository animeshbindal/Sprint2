package com.capgemini.online_movie.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.online_movie.entity.Customer;

public interface CustomerDao extends JpaRepository<Customer, Integer> {

}
