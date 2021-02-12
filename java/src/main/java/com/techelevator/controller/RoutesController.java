package com.techelevator.controller;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.techelevator.model.Landmark;
import com.techelevator.service.RoutesService;

@CrossOrigin
@RestController
public class RoutesController {
	@Autowired
	RoutesService routesService = new RoutesService();

	@RequestMapping(path="/travel-time", method=RequestMethod.GET)
	public List<Landmark> generateTravelDuration(@RequestParam String originQuery,@RequestParam String destinationQuery) {
		
		return routesService.generateTravelDuration(originQuery, destinationQuery);
		
	}
	
	@RequestMapping(path="/itinerary-directions", method=RequestMethod.GET)
	public List<String> generateTravelRoute(@RequestParam String waypointStartQuery, @RequestParam String waypointEndQuery, @RequestParam String[] routeQuery) {
				
		return routesService.generateTravelRoute(waypointEndQuery, waypointEndQuery, routeQuery);
		
	}
	
}

