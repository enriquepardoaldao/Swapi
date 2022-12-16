package entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class Vehicle {

	private String name;
	private String model;
	private String vehicle_class;
	private String manufacturer;
	private String cost_in_credits;
	private String length;
	private String crew;
	private String passengers;
	private String max_atmosphering_speed;
	private String cargo_capacity;
	private String consumables;
	private List<String> films;
	private List<String> pilots;
	private String url;
	private String created;
	private String edited;

	@JsonIgnoreProperties(ignoreUnknown = true)
	public Vehicle (){

	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	private Vehicle (Builder builder){
		this.name = builder.name;
		this.model = builder.model;
		this.vehicle_class = builder.vehicle_class;
		this.manufacturer = builder.manufacturer;
		this.cost_in_credits = builder.cost_in_credits;
		this.length = builder.length;
		this.crew = builder.crew;
		this.passengers = builder.passengers;
		this.max_atmosphering_speed = builder.max_atmosphering_speed;
		this.cargo_capacity = builder.cargo_capacity;
		this.consumables = builder.consumables;
		this.films = builder.films;
		this.pilots = builder.pilots;
		this.url = builder.url;
		this.created = builder.created;
		this.edited = builder.edited;
	}

	public String getName() {
		return name;
	}


	public String getModel() {
		return model;
	}


	public String getVehicle_class() {
		return vehicle_class;
	}


	public String getManufacturer() {
		return manufacturer;
	}


	public String getCost_in_credits() {
		return cost_in_credits;
	}


	public String getLength() {
		return length;
	}


	public String getCrew() {
		return crew;
	}


	public String getPassengers() {
		return passengers;
	}


	public String getMax_atmosphering_speed() {
		return max_atmosphering_speed;
	}


	public String getCargo_capacity() {
		return cargo_capacity;
	}


	public String getConsumables() {
		return consumables;
	}


	public List<String> getFilms() {
		return films;
	}


	public List<String> getPilots() {
		return pilots;
	}


	public String getUrl() {
		return url;
	}


	public String getCreated() {
		return created;
	}


	public String getEdited() {
		return edited;
	}

	public static class Builder{
		private String name;
		private String model;
		private String vehicle_class;
		private String manufacturer;
		private String cost_in_credits;
		private String length;
		private String crew;
		private String passengers;
		private String max_atmosphering_speed;
		private String cargo_capacity;
		private String consumables;
		private List<String> films;
		private List<String> pilots;
		private String url;
		private String created;
		private String edited;

		public Builder setName(String name) {
			this.name = name;
			return this;
		}
		
		public Builder setModel(String model) {
			this.model = model;
			return this;
		}
		
		public Builder setVehicle_class(String vehicle_class) {
			this.vehicle_class = vehicle_class;
			return this;
		}
		
		public Builder setManufacturer(String manufacturer) {
			this.manufacturer = manufacturer;
			return this;
		}
		
		public Builder setCost_in_credits(String cost_in_credits) {
			this.cost_in_credits = cost_in_credits;
			return this;
		}
		
		public Builder setLength(String length) {
			this.length = length;
			return this;
		}
		
		public Builder setCrew(String crew) {
			this.crew = crew;
			return this;
		}
		
		public Builder setPassengers(String passengers) {
			this.passengers = passengers;
			return this;
		}
		
		public Builder setMax_atmosphering_speed(String max_atmosphering_speed) {
			this.max_atmosphering_speed = max_atmosphering_speed;
			return this;
		}
		
		public Builder setCargo_capacity(String cargo_capacity) {
			this.cargo_capacity = cargo_capacity;
			return this;
		}
		
		public Builder setConsumables(String consumables) {
			this.consumables = consumables;
			return this;
		}
		
		public Builder setFilms(List<String> films) {
			this.films = films;
			return this;
		}
		
		public Builder setPilots(List<String> pilots) {
			this.pilots = pilots;
			return this;
		}
		
		public Builder setUrl(String url) {
			this.url = url;
			return this;
		}
		
		public Builder setCreated(String created) {
			this.created = created;
			return this;
		}
		
		public Builder setEdited(String edited) {
			this.edited = edited;
			return this;
		}

		public Vehicle build(){
			return new Vehicle(this);
		}
		
	}

}
