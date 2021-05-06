package com.ltts.ConnectedBoatSimulatorUI.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Main {

	 @Id
	    @GeneratedValue(strategy= GenerationType.IDENTITY)
		private int hullid;
		private String noofengine;
		
		public Main() {
			super();
		}
		
		public Main(int hullid, String noofengine) {
			super();
			this.hullid = hullid;
			this.noofengine = noofengine;
		}

		public int getHullid() {
			return hullid;
		}

		public void setHullid(int hullid) {
			this.hullid = hullid;
		}

		public String getNoofengine() {
			return noofengine;
		}

		public void setNoofengine(String noofengine) {
			this.noofengine = noofengine;
		}

		@Override
		public String toString() {
			return "Main [hullid=" + hullid + ", noofengine=" + noofengine + "]";
		}
		
}
