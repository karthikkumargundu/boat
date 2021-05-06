package com.ltts.ConnectedBoatSimulatorUI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltts.ConnectedBoatSimulatorUI.model.Location;
import com.ltts.ConnectedBoatSimulatorUI.model.Main;
import com.ltts.ConnectedBoatSimulatorUI.repository.LocationRepository;

@Service
public class LocationService {
	@Autowired
	private LocationRepository r2;
	
	public  List<Location> getAllLocation(){
		return r2.findAll();
	}
	public void save(Location boat2) {
		r2.save(boat2);
	}
	public Location get(int id) {
		return r2.findById(id).get();
	}
	public void delete(int id) {
		r2.deleteById(id);
}
}
