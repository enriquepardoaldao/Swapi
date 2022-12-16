package entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class Planet {
	
	private String name;
	private String diameter;
	private String rotation_period;
	private String orbital_period;
	private String gravity;
	private String propulation;
	private String climate;
	private String terrain;
	private String surface_water;
	private List<String> residents;
	private List<String> films;
	private String url;
	private String created;
	private String edited;

	@JsonIgnoreProperties(ignoreUnknown = true)
	public Planet(){

	}
	
	@JsonIgnoreProperties(ignoreUnknown = true)
	private Planet(Builder builder) {
		super();
		this.name = builder.name;
		this.diameter = builder.diameter;
		this.rotation_period = builder.rotation_period;
		this.orbital_period = builder.orbital_period;
		this.gravity = builder.gravity;
		this.propulation = builder.propulation;
		this.climate = builder.climate;
		this.terrain = builder.terrain;
		this.surface_water = builder.surface_water;
		this.residents = builder.residents;
		this.films = builder.films;
		this.url = builder.url;
		this.created = builder.created;
		this.edited = builder.edited;
	}


	public String getName() {
		return name;
	}


	public String getDiameter() {
		return diameter;
	}


	public String getRotation_period() {
		return rotation_period;
	}


	public String getOrbital_period() {
		return orbital_period;
	}


	public String getGravity() {
		return gravity;
	}


	public String getPropulation() {
		return propulation;
	}


	public String getClimate() {
		return climate;
	}


	public String getTerrain() {
		return terrain;
	}


	public String getSurface_water() {
		return surface_water;
	}


	public List<String> getResidents() {
		return residents;
	}


	public List<String> getFilms() {
		return films;
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
		private String diameter;
		private String rotation_period;
		private String orbital_period;
		private String gravity;
		private String propulation;
		private String climate;
		private String terrain;
		private String surface_water;
		private List<String> residents;
		private List<String> films;
		private String url;
		private String created;
		private String edited;

		public Builder setName(String name) {
			this.name = name;
			return this;
		}


		public Builder setDiameter(String diameter) {
			this.diameter = diameter;
			return this;
		}


		public Builder setRotation_period(String rotation_period) {
			this.rotation_period = rotation_period;
			return this;
		}


		public Builder setOrbital_period(String orbital_period) {
			this.orbital_period = orbital_period;
			return this;
		}


		public Builder setGravity(String gravity) {
			this.gravity = gravity;
			return this;
		}


		public Builder setPropulation(String propulation) {
			this.propulation = propulation;
			return this;
		}


		public Builder setClimate(String climate) {
			this.climate = climate;
			return this;
		}


		public Builder setTerrain(String terrain) {
			this.terrain = terrain;
			return this;
		}


		public Builder setSurface_water(String surface_water) {
			this.surface_water = surface_water;
			return this;
		}


		public Builder setResidents(List<String> residents) {
			this.residents = residents;
			return this;
		}


		public Builder setFilms(List<String> films) {
			this.films = films;
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

		public Planet build(){
			return new Planet(this);
		}
		
		
	}
	
	

	
	
	
	
}
