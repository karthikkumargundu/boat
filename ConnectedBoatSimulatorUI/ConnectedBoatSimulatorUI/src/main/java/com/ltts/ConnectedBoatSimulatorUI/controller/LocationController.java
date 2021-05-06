package com.ltts.ConnectedBoatSimulatorUI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ltts.ConnectedBoatSimulatorUI.model.Engine;
import com.ltts.ConnectedBoatSimulatorUI.model.Location;
import com.ltts.ConnectedBoatSimulatorUI.service.LocationService;
@Controller
public class LocationController {
	@Autowired
	private LocationService service2;
	
	@GetMapping("/locationlist")
	public String viewLocation(Model model) {
		List<Location> li2 = service2.getAllLocation();
		model.addAttribute("locationlist", li2);
		return "locationlist";
	}
}
