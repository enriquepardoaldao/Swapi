package service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import entities.Film;
import entities.People;
import entities.Planet;
import entities.Result;
import entities.Starship;
import entities.Vehicle;

@Service
public class SwapiService {
	
	private String url = "https://swapi.dev/api/";
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private ObjectMapper mapper;
	
	public SwapiService() {
		
	}
	
	public Result getPeopleByName(String peopleName) throws JsonMappingException, JsonProcessingException {		
		
		ResponseEntity<String> p = restTemplate.getForEntity(url+"people/?search={peopleName}",String.class, peopleName);	
		Result result = mapper.readValue(p.getBody(), Result.class);
		
		System.out.println(p.getBody().toString());
				
		return result;
	}
	
	public Planet getPlanet(List<People> people) throws JsonMappingException, JsonProcessingException {
		
		StringBuilder stringBuilder = new StringBuilder(people.get(0).getHomeworld());
		stringBuilder.insert(4, "s");
		
		ResponseEntity<String> p = restTemplate.getForEntity(stringBuilder.toString(), String.class);
		
		Planet planet = mapper.readValue(p.getBody(), Planet.class);
		
		return planet;
		
	}
	
	public ArrayList<Film> getFilm(ArrayList<String> film) throws JsonMappingException, JsonProcessingException {
		
		ArrayList<Film> films = new ArrayList<>();
		
		for(int i=0; i<film.size();i++) {
			StringBuilder stringBuilder = new StringBuilder(film.get(i));
			stringBuilder.insert(4, "s");
			
			ResponseEntity<String> p = restTemplate.getForEntity(stringBuilder.toString(), String.class);
			Film f = mapper.readValue(p.getBody(), Film.class);
			films.add(f);
		}

		return films;
	
	}
	
	public ArrayList<Vehicle> getVehicle(ArrayList<String> vehicle) throws JsonMappingException, JsonProcessingException{
		
		ArrayList<Vehicle> vechicles = new ArrayList<>();
		
		for(int i=0; i<vehicle.size();i++) {
			StringBuilder stringBuilder = new StringBuilder(vehicle.get(i));
			stringBuilder.insert(4, "s");
			
			ResponseEntity<String> p = restTemplate.getForEntity(stringBuilder.toString(), String.class);
			Vehicle v = mapper.readValue(p.getBody(), Vehicle.class);
			vechicles.add(v);
		}

		return vechicles;
	}
	
	public ArrayList<Starship> getStarship(ArrayList<String> starship) throws JsonMappingException, JsonProcessingException{
		
		ArrayList<Starship> starships = new ArrayList<>();
		
		for(int i=0; i<starship.size();i++) {
			StringBuilder stringBuilder = new StringBuilder(starship.get(i));
			stringBuilder.insert(4, "s");
			
			ResponseEntity<String> p = restTemplate.getForEntity(stringBuilder.toString(), String.class);
			Starship s = mapper.readValue(p.getBody(), Starship.class);
			starships.add(s);
		}

		return starships;
	}
	
	public String faster(ArrayList<Vehicle> vehicle, ArrayList<Starship> starship) {
		
		int faster=0;
		String nameFaster="";
		
		for(int i=0; i<vehicle.size(); i++) {
			if(Integer.parseInt(vehicle.get(i).getMax_atmosphering_speed()) > faster) {
				faster = Integer.parseInt(vehicle.get(i).getMax_atmosphering_speed());
				nameFaster = vehicle.get(i).getName();
			}
		}
		
		for(int i=0; i<starship.size(); i++) {
			if(Integer.parseInt(starship.get(i).getMax_atmosphering_speed()) > faster) {
				faster = Integer.parseInt(starship.get(i).getMax_atmosphering_speed());
				nameFaster = starship.get(i).getName();
			}
		}
		
		return nameFaster;
	}
}
