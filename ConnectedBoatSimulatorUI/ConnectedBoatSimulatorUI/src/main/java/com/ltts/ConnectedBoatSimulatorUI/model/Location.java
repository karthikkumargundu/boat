package com.ltts.ConnectedBoatSimulatorUI.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Location {
	 @Id
	    @GeneratedValue(strategy= GenerationType.IDENTITY)
		private int hullid;
	 	private String latitude;
	 	private String longitude;
	 	private String altitude;
	 	private String timestamp;

	 	public Location() {
			super();
		}

		public Location(int hullid, String latitude, String longitude, String altitude, String timestamp) {
			super();
			this.hullid = hullid;
			this.latitude = latitude;
			this.longitude = longitude;
			this.altitude = altitude;
			this.timestamp = timestamp;
		}

		public int getHullid() {
			return hullid;
		}

		public void setHullid(int hullid) {
			this.hullid = hullid;
		}

		public String getLatitude() {
			return latitude;
		}

		public void setLatitude(String latitude) {
			this.latitude = latitude;
		}

		public String getLongitude() {
			return longitude;
		}

		public void setLongitude(String longitude) {
			this.longitude = longitude;
		}

		public String getAltitude() {
			return altitude;
		}

		public void setAltitude(String altitude) {
			this.altitude = altitude;
		}

		public String getTimestamp() {
			return timestamp;
		}

		public void setTimestamp(String timestamp) {
			this.timestamp = timestamp;
		}

		@Override
		public String toString() {
			return "Location [hullid=" + hullid + ", latitude=" + latitude + ", longitude=" + longitude + ", altitude="
					+ altitude + ", timestamp=" + timestamp + "]";
		}
	 	
	 	
}
