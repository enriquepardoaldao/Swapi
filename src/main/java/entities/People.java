package entities;

import java.util.List;
import java.util.List;

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
	private List<String> films;
	private List<String> species;
	private List<String> vehicles;
	private List<String> starships;
	private String created;
	private String edited;
	private String url;

	@JsonIgnoreProperties(ignoreUnknown = true)
	public People() {

	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	private People(Builder builder) {
		super();
		this.name = builder.name;
		this.height = builder.height;
		this.mass = builder.mass;
		this.hair_color = builder.hair_color;
		this.skin_color = builder.skin_color;
		this.eye_color = builder.eye_color;
		this.birth_year = builder.birth_year;
		this.gender = builder.gender;
		this.homeworld = builder.homeworld;
		this.films = builder.films;
		this.species = builder.species;
		this.vehicles = builder.vehicles;
		this.starships = builder.starships;
		this.created = builder.created;
		this.edited = builder.edited;
		this.url = builder.url;
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

	public List<String> getFilms() {
		return films;
	}

	public List<String> getSpecies() {
		return species;
	}

	public List<String> getVehicles() {
		return vehicles;
	}

	public List<String> getStarships() {
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

	public static class Builder{
		private String name;
		private String height;
		private String mass;
		private String hair_color;
		private String skin_color;
		private String eye_color;
		private String birth_year;
		private String gender;
		private String homeworld;
		private List<String> films;
		private List<String> species;
		private List<String> vehicles;
		private List<String> starships;
		private String created;
		private String edited;
		private String url;

		public Builder setName(String name) {
			this.name = name;
			return this;
		}

		public Builder setHeight(String height) {
			this.height = height;
			return this;
		}

		public Builder setMass(String mass) {
			this.mass = mass;
			return this;
		}

		public Builder setHair_color(String hair_color) {
			this.hair_color = hair_color;
			return this;
		}

		public Builder setSkin_color(String skin_color) {
			this.skin_color = skin_color;
			return this;
		}

		public Builder setEye_color(String eye_color) {
			this.eye_color = eye_color;
			return this;
		}

		public Builder setBirth_year(String birth_year) {
			this.birth_year = birth_year;
			return this;
		}

		public Builder setGender(String gender) {
			this.gender = gender;
			return this;
		}

		public Builder setHomeworld(String homeworld) {
			this.homeworld = homeworld;
			return this;
		}

		public Builder setFilms(List<String> films) {
			this.films = films;
			return this;
		}

		public Builder setSpecies(List<String> species) {
			this.species = species;
			return this;
		}

		public Builder setVehicles(List<String> vehicles) {
			this.vehicles = vehicles;
			return this;
		}

		public Builder setStarships(List<String> starships) {
			this.starships = starships;
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

		public Builder setUrl(String url) {
			this.url = url;
			return this;
		}

		public People build(){
			return new People(this);
		}
		
	}
	
	
	
}
