package controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.management.InstanceNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

import dtos.FilmDto;
import dtos.PeopleDto;
import entities.Film;
import entities.Planet;
import entities.Result;
import entities.Starship;
import entities.Vehicle;
import exception.HttpError;
import service.SwapiService;

	

@RestController
@RequestMapping("/swapi-proxy")
public class PeopleController {
	
	@Autowired
	private SwapiService swapiService;
	
	
	
	@GetMapping("/person-info")
	public ResponseEntity<?> showPeople(
			@RequestParam(value = "name", 
							required=true) 
							String name) throws JsonMappingException, JsonProcessingException, InstanceNotFoundException {
		try {
			HttpHeaders headers = new HttpHeaders();
				headers.add("Content-Type", MediaType.APPLICATION_JSON_VALUE);
			
			Result result = swapiService.getPeopleByName(name);
			
			if (result.getCount() == 0) {
				HttpError error = new HttpError();
				error.setMessage("no existe nombre");
				return new ResponseEntity<HttpError>(error,headers, HttpStatus.NOT_FOUND);
			}			
			
			Planet planet = swapiService.getPlanet(result.getResults());
			
			
			ArrayList<Film> film = swapiService.getFilm(result.getResults().get(0).getFilms());;
			ArrayList<FilmDto> filmDto = new ArrayList<>();
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
			
			for(int i=0; i<film.size(); i++) {
				String date = simpleDateFormat.format(film.get(i).getRelease_date());
				filmDto.add(new FilmDto(film.get(i).getTitle(), date));
			}

			ArrayList<Vehicle> vehicles = swapiService.getVehicle(result.getResults().get(0).getVehicles());
			ArrayList<Starship> starships = swapiService.getStarship(result.getResults().get(0).getStarships());
			
						
			//return new ResponseEntity<PeopleDto>(result,headers, HttpStatus.OK);
			
			PeopleDto pd = new PeopleDto(result.getResults().get(0).getName(), result.getResults().get(0).getBirth_year(),
					result.getResults().get(0).getGender(), planet.getName(), swapiService.faster(vehicles, starships), filmDto);

			return new ResponseEntity<PeopleDto>(pd, headers, HttpStatus.OK);
		
		} catch	(Exception e) {
			HttpHeaders headers = new HttpHeaders();
		      headers.add("Content-Type", MediaType.APPLICATION_JSON_VALUE);
		      HttpError error = new HttpError();
				error.setMessage(e.toString());
			return new ResponseEntity<HttpError>(error,headers, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
}

