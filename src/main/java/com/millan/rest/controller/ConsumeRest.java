package com.millan.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.millan.rest.model.Pelicula;
import com.millan.rest.model.Quote;
import com.millan.rest.model.RegistroPeliculas;
import com.millan.rest.repository.IRegistroPeliculaRepo;

@RestController
@RequestMapping("/servicios")
public class ConsumeRest {
	
	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private IRegistroPeliculaRepo repo;
	
	@GetMapping
	public Quote getQuote() {
		Quote quote = restTemplate.getForObject("https://gturnquist-quoters.cfapps.io/api/random", Quote.class);
		return quote;
	} 
	
	@GetMapping("/search")
	public Pelicula getPelicula(@RequestParam String nombre) {
		Pelicula pelicula = restTemplate.getForObject("http://www.omdbapi.com/?t="+nombre+"&apikey=00000000", Pelicula.class);
		return pelicula;
	}
	
	@GetMapping("/vistas")
	public List<RegistroPeliculas> getPeliculas() {
		return repo.findAll();
	}
	
	@PostMapping("/insert")
	public void insertPelicula(@RequestBody RegistroPeliculas reg) {
		Pelicula pelicula = restTemplate.getForObject("http://www.omdbapi.com/?t="+reg.getNombre()+"&apikey=00000000", Pelicula.class);
		reg.setImdbID(pelicula.getImdbId());
		repo.save(reg);		
	}
	@PutMapping("/update")
	public void updatePelicula(@RequestBody RegistroPeliculas reg) {
		Pelicula pelicula = restTemplate.getForObject("http://www.omdbapi.com/?t="+reg.getNombre()+"&apikey=00000000", Pelicula.class);
		reg.setImdbID(pelicula.getImdbId());
		repo.save(reg);		
	}
	@DeleteMapping("/delete/{id}")
	public void updatePelicula(@PathVariable("id") Integer id) {
		repo.deleteById(id);		
	}

}
