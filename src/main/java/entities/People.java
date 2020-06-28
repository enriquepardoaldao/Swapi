package entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class People {
	
	private String name;
	private String birth_year;
	private String gender;
	
	
	@JsonIgnoreProperties(ignoreUnknown = true)
	public People() {
		
	}


	@JsonIgnoreProperties(ignoreUnknown = true)
	public People(String name, String birth_year, String gender) {
		this.name = name;
		this.birth_year = birth_year;
		this.gender = gender;
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


	public void setName(String name) {
		this.name = name;
	}


	public void setBirth_year(String birth_year) {
		this.birth_year = birth_year;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}
