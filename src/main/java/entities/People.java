package entities;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class People {
	
	private String name;
	private String height;
	private String mass;
	private String hair_color;
	private String skin_color;
	private String eye_color;
	private String birth_year;
	private String gender;
	private String homeworld;
	private ArrayList<String> films;
	private ArrayList<String> species;
	private ArrayList<String> vehicles;
	private ArrayList<String> starships;
	private String created;
	private String edited;
	private String url;
	
	

	
	
	@JsonIgnoreProperties(ignoreUnknown = true)
	public People() {
		
	}




	@JsonIgnoreProperties(ignoreUnknown = true)
	public People(String name, String height, String mass, String hair_color, String skin_color, String eye_color, String birth_year,
			String gender, String homeworld, ArrayList<String> films, ArrayList<String> species,
			ArrayList<String> vehicles, ArrayList<String> starships, String created, String edited, String url) {
		super();
		this.name = name;
		this.height = height;
		this.mass = mass;
		this.hair_color = hair_color;
		this.skin_color = skin_color;
		this.eye_color = eye_color;
		this.birth_year = birth_year;
		this.gender = gender;
		this.homeworld = homeworld;
		this.films = films;
		this.species = species;
		this.vehicles = vehicles;
		this.starships = starships;
		this.created = created;
		this.edited = edited;
		this.url = url;
	}




	public String getName() {
		return name;
	}




	public String getHeight() {
		return height;
	}
	
	
	
	public String getMass() {
		return mass;
	}




	public String getHair_color() {
		return hair_color;
	}




	public String getSkin_color() {
		return skin_color;
	}




	public String getEye_color() {
		return eye_color;
	}




	public String getBirth_year() {
		return birth_year;
	}




	public String getGender() {
		return gender;
	}




	public String getHomeworld() {
		return homeworld;
	}




	public ArrayList<String> getFilms() {
		return films;
	}




	public ArrayList<String> getSpecies() {
		return species;
	}




	public ArrayList<String> getVehicles() {
		return vehicles;
	}




	public ArrayList<String> getStarships() {
		return starships;
	}




	public String getCreated() {
		return created;
	}




	public String getEdited() {
		return edited;
	}




	public String getUrl() {
		return url;
	}




	public void setName(String name) {
		this.name = name;
	}




	public void setHeight(String height) {
		this.height = height;
	}
	
	
	
	
	public void setMass(String mass) {
		this.mass = mass;
	}




	public void setHair_color(String hair_color) {
		this.hair_color = hair_color;
	}




	public void setSkin_color(String skin_color) {
		this.skin_color = skin_color;
	}




	public void setEye_color(String eye_color) {
		this.eye_color = eye_color;
	}




	public void setBirth_year(String birth_year) {
		this.birth_year = birth_year;
	}




	public void setGender(String gender) {
		this.gender = gender;
	}




	public void setHomeworld(String homeworld) {
		this.homeworld = homeworld;
	}




	public void setFilms(ArrayList<String> films) {
		this.films = films;
	}




	public void setSpecies(ArrayList<String> species) {
		this.species = species;
	}




	public void setVehicles(ArrayList<String> vehicles) {
		this.vehicles = vehicles;
	}




	public void setStarships(ArrayList<String> starships) {
		this.starships = starships;
	}




	public void setCreated(String created) {
		this.created = created;
	}




	public void setEdited(String edited) {
		this.edited = edited;
	}




	public void setUrl(String url) {
		this.url = url;
	}

	
	
	
	
}
