package service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import dtos.PeopleDto;
import entities.Result;
import entities.Root;

public class SwapiService {
	
	private String url = "https://swapi.dev/api/";
	
	@Autowired
	private RestTemplate restClient;
	
	public SwapiService() {
		
	}
	
	public PeopleDto getPeopleByName(String name) {
		
		
		
		RestTemplate restTemplate = new RestTemplate();
		
		PeopleDto peopleDto = new PeopleDto();
		
		ResponseEntity<Result> response = restTemplate.exchange(getRoot(), HttpMethod.GET, getHttpEntity(), Result.class);
		response.getBody().getResults().forEach((p)-> {
			if(p.getName().contains(name)) {
				peopleDto.setName(p.getName());
				peopleDto.setBirth_year(p.getBirth_year());
				peopleDto.setGender(p.getGender());
				//peopleDto.setPlanet_name(p.get);
			}
		});
		return peopleDto;
		
		
	}
	
	public HttpEntity<String> getHttpEntity() {

		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.add("user-agent",
				"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
		return new HttpEntity<String>("parameters", headers);

	}
	
	public String getRoot() {

		ResponseEntity<Root> response = restClient.exchange(url, HttpMethod.GET, getHttpEntity(), Root.class);
		return response.getBody().getPeople();
	}
	
}
