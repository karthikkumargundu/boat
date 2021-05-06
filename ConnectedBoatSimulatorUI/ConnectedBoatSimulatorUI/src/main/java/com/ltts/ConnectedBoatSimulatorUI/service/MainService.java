package com.ltts.ConnectedBoatSimulatorUI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltts.ConnectedBoatSimulatorUI.model.Engine;
import com.ltts.ConnectedBoatSimulatorUI.model.Main;
import com.ltts.ConnectedBoatSimulatorUI.repository.EngineRepository;
import com.ltts.ConnectedBoatSimulatorUI.repository.MainRepository;
@Service
public class MainService {
	@Autowired
	private MainRepository r;
	
	public  List<Main> getAllMain(){
		return r.findAll();
	}
	public void save(Main boat) {
		r.save(boat);
	}
	public Main get(int id) {
		return r.findById(id).get();
	}
	public void delete(int id) {
		r.deleteById(id);
}
}
