package com.ltts.ConnectedBoatSimulatorUI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ltts.ConnectedBoatSimulatorUI.model.Engine;

@Repository
public interface EngineRepository extends JpaRepository<Engine,Integer>{

}
