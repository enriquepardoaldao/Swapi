package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dtos.PeopleDto;
import exception.HttpError;
import service.SwapiService;

	

@RestController
@RequestMapping("/swapi-proxy")
public class PeopleController {
	
	@Autowired
	private SwapiService swapiService;
	
	
	
	@GetMapping("/person-info")
	public ResponseEntity<?> findPeopleByName(
			@RequestParam(value = "name", 
			defaultValue = "") String name) {
		
		
		try {
			HttpHeaders headers = new HttpHeaders();
				headers.add("Content-Type", MediaType.APPLICATION_JSON_VALUE);
				
			if(name.isEmpty()) {
				HttpError error = new HttpError();
				error.setMessage("Nombre Vacio");
				return new ResponseEntity<HttpError>(error, headers, HttpStatus.NOT_FOUND);
			}
			
			PeopleDto response = swapiService.getPeopleByName(name);
			if(response.getName() == null) {
				HttpError error = new HttpError();
				error.setMessage("No existe ese nombre");
				return new ResponseEntity<HttpError>(error,headers, HttpStatus.NOT_FOUND);
			}
			
			return new ResponseEntity<PeopleDto>(response, headers, HttpStatus.OK);
			
		}catch (Exception e) {
			HttpHeaders headers = new HttpHeaders();
		      headers.add("Content-Type", MediaType.APPLICATION_JSON_VALUE);
		      HttpError error = new HttpError();
				error.setMessage(e.toString());
			return new ResponseEntity<HttpError>(error,headers, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
