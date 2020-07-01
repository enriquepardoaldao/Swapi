package controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
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
import service.SwapiService;

	

@RestController
@RequestMapping("/swapi-proxy")
public class PeopleController {
	
	@Autowired
	private SwapiService swapiService;
	
	
	
	@GetMapping("/person-info")
	public PeopleDto showPeople(
			@RequestParam(
						value = "name", 
						required=true) 
						String name) throws JsonMappingException, JsonProcessingException {
		
			HttpHeaders headers = new HttpHeaders();
			  headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
			Result result = swapiService.getPeopleByName(name);
			Planet planet = swapiService.getPlanet(result.getResults());
			ArrayList<Film> film = swapiService.getFilm(result.getResults().get(0).getFilms());;
			ArrayList<FilmDto> filmDto = new ArrayList<>();
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
			
			for(int i=0; i<film.size(); i++) {
				String date = simpleDateFormat.format(film.get(i).getRelease_date());
				filmDto.add(new FilmDto(film.get(i).getTitle(), date));
			}

			return new PeopleDto(result.getResults().get(0).getName(), result.getResults().get(0).getBirth_year(),
					result.getResults().get(0).getGender(), planet.getName(), filmDto);
			
		
	}
	
}

