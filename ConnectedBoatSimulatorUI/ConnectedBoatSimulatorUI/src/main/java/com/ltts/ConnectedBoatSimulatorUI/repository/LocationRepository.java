package com.ltts.ConnectedBoatSimulatorUI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ltts.ConnectedBoatSimulatorUI.model.Location;
import com.ltts.ConnectedBoatSimulatorUI.model.Main;

@Repository
public interface LocationRepository extends JpaRepository<Location,Integer>{

}

