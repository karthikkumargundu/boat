package com.ltts.ConnectedBoatSimulatorUI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ltts.ConnectedBoatSimulatorUI.model.Engine;
import com.ltts.ConnectedBoatSimulatorUI.model.Main;
import com.ltts.ConnectedBoatSimulatorUI.service.EngineService;
import com.ltts.ConnectedBoatSimulatorUI.service.MainService;

@Controller
public class MainController {
	@Autowired
	private MainService service;
	
	@GetMapping("/")
	public String viewMain(Model model) {
		List<Main> li = service.getAllMain();
		model.addAttribute("boatlist", li);
		System.out.println("Get / ");
		return "boatlist";
	}
	
	@RequestMapping("/boatlist")
	public ModelAndView FirstMethod() {
		return new ModelAndView("boatlist");
	}
	@RequestMapping("/enginelist")
		public ModelAndView secondMethod() {
			return new ModelAndView("enginelist");
		}
	@RequestMapping("/locationlist")
	public ModelAndView thirdMethod() {
		return new ModelAndView("locationlist");
	}
}
