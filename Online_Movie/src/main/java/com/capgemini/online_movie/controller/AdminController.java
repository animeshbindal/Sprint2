package com.capgemini.online_movie.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.capgemini.online_movie.entity.Admin;
import com.capgemini.online_movie.entity.Movie;
import com.capgemini.online_movie.entity.Screen;
import com.capgemini.online_movie.entity.Show;
import com.capgemini.online_movie.entity.Theater;
import com.capgemini.online_movie.exception.AdminException;
import com.capgemini.online_movie.service.AdminService;
import com.capgemini.online_movie.service.TheaterService;

@Controller
public class AdminController {

	
	private AdminService adminService;
	private TheaterService theaterService;
	
//	@Autowired
//	AdminController(AdminService adminService){
//		this.adminService = adminService;
//	}
//	
//	@RequestMapping(value = " " , method = RequestMethod.GET)
//	public String addTheater (Model model) {
//	model.addAttribute("theater",new Theater());
//	return " " ;
//	
//	
//}
	
	@CrossOrigin
	@RequestMapping("addTheater")
	public ResponseEntity<String> addTheater (@Valid @RequestBody Theater theater, BindingResult bindingResult) throws AdminException{
		String err=" ";
		
		if(bindingResult.hasErrors()) {
			List<FieldError> errors = bindingResult.getFieldErrors();
			for(FieldError error : errors)
				 err += error.getDefaultMessage() + "</br>";
			
			throw new AdminException(err);
			}
		try
		{
			adminService.addTheater(theater);
			return new ResponseEntity<String>("Theater added successfully",HttpStatus.OK);
		}
		catch(DataIntegrityViolationException ex)
		{
			throw new AdminException("Theater already present with this ID");
		}
		
	}
	
	@DeleteMapping(value="/deleteTheater/{id}")
	public ResponseEntity<String> deleteTheater (@Valid @RequestParam int theaterId) throws AdminException
	{
		try {
			adminService.deleteTheater(theaterId);
			return new ResponseEntity<String>("Theater deleted successfully", HttpStatus.OK);
		}
		
		catch(DataIntegrityViolationException ex)
		{
			throw new AdminException("Theater Id does not exist");
		}
	}
	
	@RequestMapping("addMovie")
	public ResponseEntity<String> addMovie (@Valid @RequestBody Movie movie, BindingResult bindingResult) throws AdminException{
		String err=" ";
		
		if(bindingResult.hasErrors()) {
			List<FieldError> errors = bindingResult.getFieldErrors();
			for(FieldError error : errors)
				 err += error.getDefaultMessage() + "</br>";
			
			throw new AdminException(err);
			}
		try
		{
			adminService.addMovie(movie);
			return new ResponseEntity<String>("Movie added successfully",HttpStatus.OK);
		}
		catch(DataIntegrityViolationException ex)
		{
			throw new AdminException("Movie already present with this Name");
		}
		
	}
	@DeleteMapping(value="/deleteMovie/{id}")
	public ResponseEntity<String> deleteMovie (@Valid @RequestParam int movieId) throws AdminException
	{
		try {
			adminService.deleteMovie(movieId);
			return new ResponseEntity<String>("Movie deleted successfully", HttpStatus.OK);
		}
		
		catch(DataIntegrityViolationException ex)
		{
			throw new AdminException("Movie Id does not exist");
		}
	}
	@RequestMapping("addScreen")
	public ResponseEntity<String> addScreen (@Valid @RequestBody Screen screen, BindingResult bindingResult) throws AdminException{
		String err=" ";
		
		if(bindingResult.hasErrors()) {
			List<FieldError> errors = bindingResult.getFieldErrors();
			for(FieldError error : errors)
				 err += error.getDefaultMessage() + "</br>";
			
			throw new AdminException(err);
			}
		try
		{
			adminService.addScreen(screen);
			return new ResponseEntity<String>("Screen added successfully",HttpStatus.OK);
		}
		catch(DataIntegrityViolationException ex)
		{
			throw new AdminException("Screen already present with this Name");
		}
		
	}
	
	@DeleteMapping(value="/deleteScreen/{id}")
	public ResponseEntity<String> deleteScreen (@Valid @RequestParam int screenId) throws AdminException
	{
		try {
			adminService.deleteScreen(screenId);
			return new ResponseEntity<String>("Screen deleted successfully", HttpStatus.OK);
		}
		
		catch(DataIntegrityViolationException ex)
		{
			throw new AdminException("Screen Id does not exist");
		}
	}

	@RequestMapping("addShow")
	public ResponseEntity<String> addShow (@Valid @RequestBody Show show, BindingResult bindingResult) throws AdminException{
		String err=" ";
		
		if(bindingResult.hasErrors()) {
			List<FieldError> errors = bindingResult.getFieldErrors();
			for(FieldError error : errors)
				 err += error.getDefaultMessage() + "</br>";
			
			throw new AdminException(err);
			}
		try
		{
			adminService.addShow(show);
			return new ResponseEntity<String>("Show added successfully",HttpStatus.OK);
		}
		catch(DataIntegrityViolationException ex)
		{
			throw new AdminException("Show already present with this Name");
		}
		
	}

	@DeleteMapping(value="/deleteShow/{id}")
	public ResponseEntity<String> deleteShow (@Valid @RequestParam int showId) throws AdminException
	{
		try {
			adminService.deleteShow(showId);
			return new ResponseEntity<String>("Show deleted successfully", HttpStatus.OK);
		}
		
		catch(DataIntegrityViolationException ex)
		{
			throw new AdminException("Show Id does not exist");
		}
	}
}