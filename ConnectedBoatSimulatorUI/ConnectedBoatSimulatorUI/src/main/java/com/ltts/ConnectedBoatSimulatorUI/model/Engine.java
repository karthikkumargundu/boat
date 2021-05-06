package com.ltts.ConnectedBoatSimulatorUI.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Engine {
	 @Id
	    @GeneratedValue(strategy= GenerationType.IDENTITY)
		private int engineid;
		private String oilpressure;
		private String oiltemperature;
		private String enginetemperature;
		private String engineruntime;
		
		public Engine() {
			super();
		}

		
		
		public Engine(int engineid, String oilpressure, String oiltemperature, String enginetemperature,
				String engineruntime) {
			super();
			this.engineid = engineid;
			this.oilpressure = oilpressure;
			this.oiltemperature = oiltemperature;
			this.enginetemperature = enginetemperature;
			this.engineruntime = engineruntime;
		}



		public int getEngineid() {
			return engineid;
		}



		public void setEngineid(int engineid) {
			this.engineid = engineid;
		}



		public String getOilpressure() {
			return oilpressure;
		}



		public void setOilpressure(String oilpressure) {
			this.oilpressure = oilpressure;
		}



		public String getOiltemperature() {
			return oiltemperature;
		}



		public void setOiltemperature(String oiltemperature) {
			this.oiltemperature = oiltemperature;
		}



		public String getEnginetemperature() {
			return enginetemperature;
		}



		public void setEnginetemperature(String enginetemperature) {
			this.enginetemperature = enginetemperature;
		}



		public String getEngineruntime() {
			return engineruntime;
		}



		public void setEngineruntime(String engineruntime) {
			this.engineruntime = engineruntime;
		}



		@Override
		public String toString() {
			return "Engine [engineid=" + engineid + ", oilpressure=" + oilpressure + ", oiltemperature=" + oiltemperature
					+ ", enginetemperature=" + enginetemperature + ", engineruntime=" + engineruntime + "]";
		}
		
}
