package com.ltts.ConnectedBoatSimulatorUI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ltts.ConnectedBoatSimulatorUI.model.Engine;
import com.ltts.ConnectedBoatSimulatorUI.service.EngineService;

@Controller
public class EngineController {
	@Autowired
	private EngineService service1;
	
	@GetMapping("/enginelist")
	public String viewEngine(Model model) {
		List<Engine> li1 = service1.getAllEngine();
		model.addAttribute("enginelist", li1);
		return "enginelist";
	}
	
}
