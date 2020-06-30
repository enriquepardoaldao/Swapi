package service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import entities.People;
import entities.Planet;

@Service
public class SwapiService {
	
	private String url = "https://swapi.dev/api/";
	
	//Para buscar la url es así https://swapi.dev/api/people/?search=Luke Skywalker
	
	@Autowired
	private RestTemplate restTemplate;
	
	public SwapiService() {
		
	}
	
	public People getPeopleByName(String peopleName) {		
		
		
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		
		ResponseEntity<People> p = restTemplate.exchange(url + "people?search=" + peopleName, HttpMethod.GET, entity,People.class);
		
		System.out.println("Parada");
		People people = new People(p.getBody().getName(), p.getBody().getBirth_year(), p.getBody().getGender(), p.getBody().getHomeworld());
				
		return people;
	}
	
	public Planet getPlanet(String urlPlanet) {
		
		ResponseEntity<Planet> re = restTemplate.getForEntity(urlPlanet, Planet.class);
		
		return re.getBody();
		
	}
	
	
}
