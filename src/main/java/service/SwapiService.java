package service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import entities.People;
import entities.Planet;
import entities.Result;

@Service
public class SwapiService {
	
	private String url = "https://swapi.dev/api/";
	
	//Para buscar la url es así https://swapi.dev/api/people/?search=Luke Skywalker
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private ObjectMapper mapper;
	
	public SwapiService() {
		
	}
	
	public Result getPeopleByName(String peopleName) throws JsonMappingException, JsonProcessingException {		
		
		/*HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<>(peopleName, headers);*/
		
		ResponseEntity<String> p = restTemplate.getForEntity(url+"people/?search={peopleName}",String.class, peopleName);
		
		Result result = mapper.readValue(p.getBody(), Result.class);
		
		getPlanet(result.getResults());
		
		System.out.println(p.getBody().toString());
				
		return result;
	}
	
	public Planet getPlanet(List<People> people) throws JsonMappingException, JsonProcessingException {
		
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<>(headers);
		
		ResponseEntity<String> p = restTemplate.exchange(people.get(0).getHomeworld(), HttpMethod.GET, entity, String.class);
		
		Planet planet = mapper.readValue(p.getBody(), Planet.class);
		
		return planet;
		
	}
	
	
}
