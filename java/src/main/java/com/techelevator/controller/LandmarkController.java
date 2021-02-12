package com.techelevator.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.techelevator.dao.LandmarkDAO;
import com.techelevator.model.Landmark;

@CrossOrigin
@RestController
@PreAuthorize("isAuthenticated()")
public class LandmarkController {

	@Autowired
	LandmarkDAO dao;
	
	@RequestMapping(path="/cities", method= RequestMethod.GET)
	public List<String> allcities(){
		List<String> listOfCities = dao.allCities();
		return listOfCities;
	}
	
	@RequestMapping(path="/get-all-landmarks", method= RequestMethod.GET)
	public List<Landmark> allLandmarks(){
		List<Landmark> listOfLandmarks = dao.allLandmarks();
		return listOfLandmarks;
	}
	
	@RequestMapping(path="/search-landmarks", method=RequestMethod.GET)
	public List<Landmark> searchLandmarks(@RequestParam String day, @RequestParam String location,
			@RequestParam String venueType) {
		List<Landmark> landmarkByName = dao.searchLandmarks(day, location, venueType);
		return landmarkByName;
	} 
	
	@RequestMapping(path="/landmarks-city/{location}", method=RequestMethod.GET)
	public List<Landmark> getLandmarkByCity(@PathVariable String location) {
		List<Landmark> landmarkByCity = dao.getLandmarkByCity(location);
		return landmarkByCity;
	} 
	
}

