package entities;

import java.util.ArrayList;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class Film {

	private String title;
	private int episode_id;
	private String opening_crawl;
	private String director;
	private String producer;
	private Date release_date;
	private ArrayList<String> species;
	private ArrayList<String> starships;
	private ArrayList<String> vehicles;
	private ArrayList<String> characters;
	private ArrayList<String> planets;
	private String url;
	private String created;
	private String edited;
	
	
	@JsonIgnoreProperties(ignoreUnknown = true)
	public Film(String title, int episode_id, String opening_crawl, String director, String producer, Date release_date,
			ArrayList<String> species, ArrayList<String> starships, ArrayList<String> vehicles,
			ArrayList<String> characters, ArrayList<String> planets, String url, String created, String edited) {
		super();
		this.title = title;
		this.episode_id = episode_id;
		this.opening_crawl = opening_crawl;
		this.director = director;
		this.producer = producer;
		this.release_date = release_date;
		this.species = species;
		this.starships = starships;
		this.vehicles = vehicles;
		this.characters = characters;
		this.planets = planets;
		this.url = url;
		this.created = created;
		this.edited = edited;
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



	public ArrayList<String> getSpecies() {
		return species;
	}



	public ArrayList<String> getStarships() {
		return starships;
	}



	public ArrayList<String> getVehicles() {
		return vehicles;
	}



	public ArrayList<String> getCharacters() {
		return characters;
	}



	public ArrayList<String> getPlanets() {
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



	public void setTitle(String title) {
		this.title = title;
	}



	public void setEpisode_id(int episode_id) {
		this.episode_id = episode_id;
	}



	public void setOpening_crawl(String opening_crawl) {
		this.opening_crawl = opening_crawl;
	}



	public void setDirector(String director) {
		this.director = director;
	}



	public void setProducer(String producer) {
		this.producer = producer;
	}



	public void setRelease_date(Date release_date) {
		this.release_date = release_date;
	}



	public void setSpecies(ArrayList<String> species) {
		this.species = species;
	}



	public void setStarships(ArrayList<String> starships) {
		this.starships = starships;
	}



	public void setVehicles(ArrayList<String> vehicles) {
		this.vehicles = vehicles;
	}



	public void setCharacters(ArrayList<String> characters) {
		this.characters = characters;
	}



	public void setPlanets(ArrayList<String> planets) {
		this.planets = planets;
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
