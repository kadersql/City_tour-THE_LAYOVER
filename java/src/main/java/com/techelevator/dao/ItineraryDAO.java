package com.techelevator.dao;

import com.techelevator.model.Itinerary;
import com.techelevator.model.Landmark;
import com.techelevator.model.User;

public interface ItineraryDAO {
	
	

	public void createItinerary (Long userId, int landmarkid);
	
	Itinerary addLandmarkToItinerary (Landmark id);

	public void deleteItinerary (long id);
	
	public void deleteLandmarkFromItinerary (long id, int landmarkId);
	
	//may need to take in a different param
	Itinerary changeItineraryStartLocation (Landmark id);
	
}
