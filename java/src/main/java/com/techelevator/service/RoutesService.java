package com.techelevator.service;
import com.techelevator.model.Landmark;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.client.RestTemplate;
import com.techelevator.model.Landmark;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class RoutesService {
	@Value("${maps.googleapis.url}")
	private String apiUrl;
	@Value("${derek.google.api.key}")
	private String key;
		
	// generates travel distance and time between starting location and ending location
	public List<Landmark> generateTravelDuration(String startPoint, String endPoint) {
		
		String origin = "origin=" + startPoint;
		String destination = "&destination=" + endPoint;
		String apiKey = "&key=" + key;
		
		String url = apiUrl + origin + destination + apiKey;
		
		HttpEntity<String> httpEntity = new HttpEntity<>("");
		RestTemplate restTemplate = new RestTemplate();
		ObjectMapper objectMapper = new ObjectMapper();
		JsonNode jsonNode;
		
		List<Landmark> travelDurationList = new ArrayList<Landmark>();
		ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, httpEntity, String.class);
		try {
			jsonNode = objectMapper.readTree(response.getBody());
			for (int i = 0, j = 0; i < jsonNode.path("routes").size(); i++, j++) {
				String totalDistance = jsonNode.path("routes").path(i).path("legs").path(j).path("distance")
						.path("text").asText();
				String totalDuration = jsonNode.path("routes").path(i).path("legs").path(j).path("duration")
						.path("text").asText();
				
				Landmark landmarkTravelDuration = new Landmark(totalDistance, totalDuration);
				travelDurationList.add(landmarkTravelDuration);
			}
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return travelDurationList;
	}
	
	// generates travel route/directions from starting location, ending location and waypoints in between
	public List<String> generateTravelRoute(String startPoint, String endPoint, String[] routeQuery) {
		ArrayList <String> waypointList = new ArrayList <String>();
		String origin = "origin=" + startPoint;
		String destination = "&destination=" + endPoint;
		String waypoints = "&waypoints=optimize:true=";
		String apiKey = "&key=" + key;
	
		for (int i=0; i < routeQuery.length-1; i++) {
			
			int lastIndex = routeQuery.length-1;
				
			if (i == lastIndex) {
				waypointList.add(routeQuery[i]);
			}
				waypointList.add(routeQuery[i] + "|" + routeQuery[i+1] + "|");		
				i++;
		}
		
		String waypointStr = "";
		
		for (int i = 0; i < waypointList.size(); i++) {
			waypointStr = waypointList.get(i);
		}
		
		String url = apiUrl + origin + destination + waypoints + waypointStr + apiKey;
		System.out.println(url);

		HttpEntity<String> httpEntity = new HttpEntity<>("");
		RestTemplate restTemplate = new RestTemplate();
		ObjectMapper objectMapper = new ObjectMapper();
		JsonNode jsonNode;
		List<String> travelRouteList = new ArrayList<>();
		
		ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, httpEntity, String.class);
		
		try {
			jsonNode = objectMapper.readTree(response.getBody());
			
			for (int i =0; i < jsonNode.path("routes").path(0).path("legs").path(0).path("steps").size(); i++) {
				String instruction =  jsonNode.path("routes").path(0).path("legs").path(0).path("steps").path(i).path("html_instructions").asText();
				travelRouteList.add(instruction);
			}
			
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
		return travelRouteList;
				
	}
}