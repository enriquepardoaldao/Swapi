package dtos;

import java.util.Date;

public class FilmDto {
	
	private String name;
	private String release_date;
	
	
	public FilmDto(String name, String release_date) {
		super();
		this.name = name;
		this.release_date = release_date;
	}


	public String getName() {
		return name;
	}


	public String getRelease_date() {
		return release_date;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setRelease_date(String release_date) {
		this.release_date = release_date;
	}
	
	
}
