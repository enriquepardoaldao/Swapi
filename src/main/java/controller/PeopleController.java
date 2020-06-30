package controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import entities.People;
import exception.HttpError;
import service.SwapiService;

	

@RestController
@RequestMapping("/swapi-proxy")
public class PeopleController {
	
	@Autowired
	private SwapiService swapiService;
	
	
	
	@GetMapping("/person-info")
	public ResponseEntity<?> findPeopleByName(
			@RequestParam(value = "name", defaultValue = "") String name) {
		
		
		try {
			HttpHeaders headers = new HttpHeaders();
			  headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
			  
			People response = swapiService.getPeopleByName(name);
		
			return new ResponseEntity<People>(response, headers, HttpStatus.OK);
			
		}catch (Exception e) {
			HttpHeaders headers = new HttpHeaders();
			  headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		      HttpError error = new HttpError();
				error.setMessage(e.toString());
			return new ResponseEntity<HttpError>(error,headers, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
