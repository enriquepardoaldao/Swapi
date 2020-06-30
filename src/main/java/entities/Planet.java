package entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class Planet {
	
	private String name;

	@JsonIgnoreProperties(ignoreUnknown = true)
	public Planet(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
