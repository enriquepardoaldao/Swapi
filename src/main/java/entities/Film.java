package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class Film {

	private String title;
	private int episode_id;
	private String opening_crawl;
	private String director;
	private String producer;
	private Date release_date;
	private List<String> species;
	private List<String> starships;
	private List<String> vehicles;
	private List<String> characters;
	private List<String> planets;
	private String url;
	private String created;
	private String edited;

	@JsonIgnoreProperties(ignoreUnknown = true)
	public Film(){

	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	private Film(Builder builder) {
		super();
		this.title = builder.title;
		this.episode_id = builder.episode_id;
		this.opening_crawl = builder.opening_crawl;
		this.director = builder.director;
		this.producer = builder.producer;
		this.release_date = builder.release_date;
		this.species = builder.species;
		this.starships = builder.starships;
		this.vehicles = builder.vehicles;
		this.characters = builder.characters;
		this.planets = builder.planets;
		this.url = builder.url;
		this.created = builder.created;
		this.edited = builder.edited;
	}

	public String getTitle() {
		return title;
	}

	public int getEpisode_id() {
		return episode_id;
	}

	public String getOpening_crawl() {
		return opening_crawl;
	}

	public String getDirector() {
		return director;
	}

	public String getProducer() {
		return producer;
	}

	public Date getRelease_date() {
		return release_date;
	}

	public List<String> getSpecies() {
		return species;
	}

	public List<String> getStarships() {
		return starships;
	}

	public List<String> getVehicles() {
		return vehicles;
	}

	public List<String> getCharacters() {
		return characters;
	}

	public List<String> getPlanets() {
		return planets;
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
		private String title;
		private int episode_id;
		private String opening_crawl;
		private String director;
		private String producer;
		private Date release_date;
		private List<String> species;
		private List<String> starships;
		private List<String> vehicles;
		private List<String> characters;
		private List<String> planets;
		private String url;
		private String created;
		private String edited;

		public Builder setTitle(String title) {
			this.title = title;
			return this;
		}
		
		public Builder setEpisode_id(int episode_id) {
			this.episode_id = episode_id;
			return this;
		}
		
		public Builder setOpening_crawl(String opening_crawl) {
			this.opening_crawl = opening_crawl;
			return this;
		}
		
		public Builder setDirector(String director) {
			this.director = director;
			return this;
		}
		
		public Builder setProducer(String producer) {
			this.producer = producer;
			return this;
		}
		
		public Builder setRelease_date(Date release_date) {
			this.release_date = release_date;
			return this;
		}
		
		public Builder setSpecies(List<String> species) {
			this.species = species;
			return this;
		}
		
		public Builder setStarships(List<String> starships) {
			this.starships = starships;
			return this;
		}
		
		public Builder setVehicles(List<String> vehicles) {
			this.vehicles = vehicles;
			return this;
		}
		
		public Builder setCharacters(List<String> characters) {
			this.characters = characters;
			return this;
		}
		
		public Builder setPlanets(List<String> planets) {
			this.planets = planets;
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

		public Film build(){
			return new Film(this);
		}
		
	}
	
	
	
	
	
}
