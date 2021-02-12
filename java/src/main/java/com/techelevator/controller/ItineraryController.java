package com.techelevator.controller;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.access.prepost.PreAuthorize;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

import com.techelevator.dao.ItineraryDAO;

import com.techelevator.dao.UserDAO;
import com.techelevator.model.Landmark;

import java.security.Principal;


//@CrossOrigin
@RestController
@PreAuthorize("isAuthenticated()")
public class ItineraryController {
	
	@Autowired
	UserDAO userDAO;
	
	@Autowired
	ItineraryDAO dao;
	
	
	@RequestMapping(path="/add-itinerary/{id}", method= RequestMethod.POST)
	
	public void createItinerary (@PathVariable int id, Principal principal) {  
		
		long userId = userDAO.findIdByUsername(principal.getName());
		
		
		dao.createItinerary(userId, id);
	
		
	}
	
	@RequestMapping(path="/delete-itinerary/{userId}", method= RequestMethod.DELETE)
	public void deleteItinerary (@PathVariable long userId, Principal principal) {
		
		dao.deleteItinerary(userId);
	}
	
	@RequestMapping(path="/delete-single-itinerary/{landmarkId}", method= RequestMethod.DELETE)
	public void deleteItinerary (@PathVariable int landmarkId, Principal principal) {
		
		long userId = userDAO.findIdByUsername(principal.getName());
		
		dao.deleteLandmarkFromItinerary(userId, landmarkId);
	}
	
	


}
