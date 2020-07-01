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
}
