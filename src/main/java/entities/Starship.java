package entities;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class Starship {
	private String name;
	private String model;
	private String starship_class;
	private String manufacturer;
	private String cost_in_credits;
	private String length;
	private String crew;
	private String passengers;
	private String max_atmosphering_speed;
	private String hyperdrive_rating;
	private String mglt;
	private String cargo_capacity;
	private String consumables;
	private ArrayList<String> films;
	private ArrayList<String> pilots;
	private String url;
	private String created;
	private String edited;
	
	@JsonIgnoreProperties(ignoreUnknown = true)
	public Starship(String name, String model, String starship_class, String manufacturer, String cost_in_credits,
			String length, String crew, String passengers, String max_atmosphering_speed, String hyperdrive_rating,
			String mglt, String cargo_capacity, String consumables, ArrayList<String> films, ArrayList<String> pilots,
			String url, String created, String edited) {
		super();
		this.name = name;
		this.model = model;
		this.starship_class = starship_class;
		this.manufacturer = manufacturer;
		this.cost_in_credits = cost_in_credits;
		this.length = length;
		this.crew = crew;
		this.passengers = passengers;
		this.max_atmosphering_speed = max_atmosphering_speed;
		this.hyperdrive_rating = hyperdrive_rating;
		this.mglt = mglt;
		this.cargo_capacity = cargo_capacity;
		this.consumables = consumables;
		this.films = films;
		this.pilots = pilots;
		this.url = url;
		this.created = created;
		this.edited = edited;
	}

	public String getName() {
		return name;
	}

	public String getmodel() {
		return model;
	}

	public String getStarship_class() {
		return starship_class;
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

	public String getHyperdrive_rating() {
		return hyperdrive_rating;
	}

	public String getMglt() {
		return mglt;
	}

	public String getCargo_capacity() {
		return cargo_capacity;
	}

	public String getConsumables() {
		return consumables;
	}

	public ArrayList<String> getFilms() {
		return films;
	}

	public ArrayList<String> getPilots() {
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

	public void setName(String name) {
		this.name = name;
	}

	public void setmodel(String model) {
		this.model = model;
	}

	public void setStarship_class(String starship_class) {
		this.starship_class = starship_class;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public void setCost_in_credits(String cost_in_credits) {
		this.cost_in_credits = cost_in_credits;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public void setCrew(String crew) {
		this.crew = crew;
	}

	public void setPassengers(String passengers) {
		this.passengers = passengers;
	}

	public void setMax_atmosphering_speed(String max_atmosphering_speed) {
		this.max_atmosphering_speed = max_atmosphering_speed;
	}

	public void setHyperdrive_rating(String hyperdrive_rating) {
		this.hyperdrive_rating = hyperdrive_rating;
	}

	public void setMglt(String mglt) {
		this.mglt = mglt;
	}

	public void setCargo_capacity(String cargo_capacity) {
		this.cargo_capacity = cargo_capacity;
	}

	public void setConsumables(String consumables) {
		this.consumables = consumables;
	}

	public void setFilms(ArrayList<String> films) {
		this.films = films;
	}

	public void setPilots(ArrayList<String> pilots) {
		this.pilots = pilots;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public void setEdited(String edited) {
		this.edited = edited;
	}
	
	
	
	
	
}
