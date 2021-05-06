package com.ltts.ConnectedBoatSimulatorUI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltts.ConnectedBoatSimulatorUI.model.Engine;
import com.ltts.ConnectedBoatSimulatorUI.repository.EngineRepository;

@Service
public class EngineService {

	@Autowired
	private EngineRepository r1;
	
	public List<Engine> getAllEngine(){
		return r1.findAll();
	}
	public void save(Engine boat1) {
		r1.save(boat1);
	}
	public Engine get(int id) {
		return r1.findById(id).get();
	}
	public void delete(int id) {
		r1.deleteById(id);
}
}