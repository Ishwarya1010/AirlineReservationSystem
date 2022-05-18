package com.example.demo.entity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightDetailsEntity {

	private List<Data> data;

	public List<Data> getData() {
		return data;
	}

	public void setData(List<Data> data) {
		this.data = data;
	}

	public class Data {
		private List<Itineraries> itineraries;
		private String id;
		private Price price;

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public List<Itineraries> getItineraries() {
			return itineraries;
		}

		public void setItineraries(List<Itineraries> itineraries) {
			this.itineraries = itineraries;
		}

		public Price getPrice() {
			return price;
		}

		public void setPrice(Price price) {
			this.price = price;
		}
	}

	public class Itineraries {
		private List<Segments> segments;

		public List<Segments> getSegments() {
			return segments;
		}

		public void setSegments(List<Segments> segments) {
			this.segments = segments;
		}
	}

	public class Segments {
		private String id;
		private String duration;
		private int numberOfStops;

		private Operating operating;

		public String getDuration() {
			return duration;
		}

		public void setDuration(String duration) {
			this.duration = duration;
		}

		public int getNumberOfStops() {
			return numberOfStops;
		}

		public void setNumberOfStops(int numberOfStops) {
			this.numberOfStops = numberOfStops;
		}

		public Operating getOperating() {
			return operating;
		}

		public void setOperating(Operating operating) {
			this.operating = operating;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

	}

	public class Operating {
		private String carrierCode;

		public String getCarrierCode() {
			return carrierCode;
		}

		public void setCarrierCode(String carrierCode) {
			Map<String, String> map = new HashMap<String, String>();
			map.put("PR", "PHILIPPINE AIRLINES");
			map.put("TG", "THAI AIRWAYS INTERNATIONAL");
			map.put("QF", "QANTAS AIRWAYS");
			this.carrierCode = map.get(carrierCode);
		}
	}

	public class Price {
		private String grandTotal;

		public String getGrandTotal() {
			return grandTotal;
		}

		public void setGrandTotal(String grandTotal) {
			this.grandTotal = grandTotal;
		}

	}

}
