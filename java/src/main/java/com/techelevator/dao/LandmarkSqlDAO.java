package com.techelevator.dao;

import java.util.ArrayList;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Component;

import com.techelevator.model.Landmark;

@Component
@PreAuthorize("isAuthenticated()")
public class LandmarkSqlDAO implements LandmarkDAO {

	private JdbcTemplate jdbcTemplate;

	public LandmarkSqlDAO(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<String> allCities() {
		String sql = "select location from landmark";
		List<String> citiesRaw = new ArrayList<String>();
		List<String> cities = new ArrayList<String>();

		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);

		while (results.next()) {

			String city = results.getString("location");

			citiesRaw.add(city);
		}

		for (String c : citiesRaw) {

			if (!cities.contains(c)) {
				cities.add(c);
			}
		}

		return cities;
	}

	@Override
	public List<Landmark> allLandmarks() {
		String sql = "select * from landmark";
		List<Landmark> landmarks = new ArrayList<Landmark>();

		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);

		while (results.next()) {

			long id = results.getLong("id");
			String name = results.getString("name");
			String description = results.getString("description");
			String img = results.getString("img");
			String operatingDays = results.getString("operatingdays");
			String openingTime = results.getString("openingtime");
			String closingTime = results.getString("closingtime");
			String venueType = results.getString("venuetype");
			String location = results.getString("location");
			String address = results.getString("address");
			int thumbsUp = results.getInt("thumbsup");
			int thumbsDown = results.getInt("thumbsdown");
			double latitude = results.getDouble("latitude");
			double longitude = results.getDouble("longitude");

			Landmark afterLandmark = new Landmark(id, name, description, img, operatingDays, openingTime, closingTime,
					venueType, location, address, thumbsUp, thumbsDown, latitude, longitude);
			landmarks.add(afterLandmark);
		}

		return landmarks;
	}
	
	@Override
	public List<Landmark> getLandmarkByCity(String location) {
		
		String sql = "SELECT name, description, img, operatingdays, openingtime, closingtime, venuetype FROM landmark WHERE location=?";
		List<Landmark> landmarks = new ArrayList<Landmark>();
		
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql, location);
		
		while (results.next()) {
			String name = results.getString("name");
			String description = results.getString("description");
			String img = results.getString("img");
			String operatingDays = results.getString("operatingdays");
			String openingTime = results.getString("openingtime");
			String closingTime = results.getString("closingtime");
			String venueType = results.getString("venuetype");
			
			Landmark afterLandmark = new Landmark(name, description, img, operatingDays, openingTime, closingTime, venueType);
			landmarks.add(afterLandmark);
		}
		
		return landmarks;
	}

	@Override
	public List<Landmark> searchLandmarks(String day, String location, String venueType) {
	
		String sql = "select landmark.name, landmark.openingtime, landmark.closingtime, landmark.operatingdays, landmark.venuetype from landmark inner join daysopen on landmark.id = daysopen.landmarkid where daysopen." + day + " ='open' and location=? and venuetype=? and openingtime < localtime and closingtime > localtime";
		
		List<Landmark> landmarks = new ArrayList<Landmark>();

		SqlRowSet results = jdbcTemplate.queryForRowSet(sql, location, venueType);

		while (results.next()) {

			String name = results.getString("name");
			String openingTimeActual = results.getString("openingtime");
			String closingTimeActual = results.getString("closingtime");
			String operatingDays = results.getString("operatingdays");
			String venuetype = results.getString("venuetype");

			Landmark afterLandmark = new Landmark(name, openingTimeActual, closingTimeActual, operatingDays, venuetype);
			landmarks.add(afterLandmark);
		}

		return landmarks;
	}

	@Override
	public Landmark findLandmarkByName(String name) throws RuntimeException {
		for (Landmark landmark : this.allLandmarks()) {
			if (landmark.getName().toLowerCase().equals(name.toLowerCase())) {
				return landmark;
			}
		}
		throw new RuntimeException("Landmark " + name + " was not found.");
	}

	@Override
	public int findIdByLandmarkName(String name) {
		return jdbcTemplate.queryForObject("select id from landmark where name = ?", int.class, name);
	}

	






	

}
