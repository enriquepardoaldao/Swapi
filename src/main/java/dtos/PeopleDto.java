package dtos;

import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

public class PeopleDto {

	private String name;
	private String birth_year;
	private String gender;
	private String planet_name;
	private String fastest_vehicle_driven;
	private ArrayList<FilmDto> films;
	
	public PeopleDto() {
		
	}

	public PeopleDto(String name, String birth_year, String gender, String planet_name, String fastest_vehicle_driven,
			ArrayList<FilmDto> films) {
		super();
		this.name = name;
		this.birth_year = birth_year;
		this.gender = gender;
		this.planet_name = planet_name;
		this.fastest_vehicle_driven = fastest_vehicle_driven;
		this.films = films;
	}

	public String getName() {
		return name;
	}

	public String getBirth_year() {
		return birth_year;
	}

	public String getGender() {
		return gender;
	}

	public String getPlanet_name() {
		return planet_name;
	}

	public String getFastest_vehicle_driven() {
		return fastest_vehicle_driven;
	}

	public ArrayList<FilmDto> getFilms() {
		return films;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBirth_year(String birth_year) {
		this.birth_year = birth_year;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setPlanet_name(String planet_name) {
		this.planet_name = planet_name;
	}

	public void setFastest_vehicle_driven(String fastest_vehicle_driven) {
		this.fastest_vehicle_driven = fastest_vehicle_driven;
	}

	public void setFilms(ArrayList<FilmDto> films) {
		this.films = films;
	}

	
	
	
}
