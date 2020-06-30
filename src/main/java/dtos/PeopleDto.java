package dtos;

public class PeopleDto {

	private String name;
	private String birth_year;
	private String gender;
	private String planet_name;
	
	public PeopleDto() {
		
	}

	public PeopleDto(String name, String birth_year, String gender, String planet_name) {
		super();
		this.name = name;
		this.birth_year = birth_year;
		this.gender = gender;
		this.planet_name = planet_name;
	}

	public String getName() {
		return name;
	}
	

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth_year() {
		return birth_year;
	}

	public void setBirth_year(String birth_year) {
		this.birth_year = birth_year;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPlanet_name() {
		return planet_name;
	}

	public void setPlanet_name(String planet_name) {
		this.planet_name = planet_name;
	}

	@Override
	public String toString() {
		return "PeopleDto [name=" + name + ", birth_year=" + birth_year + ", gender=" + gender + ", planet_name="
				+ planet_name + "]";
	}

	
	


	

}
