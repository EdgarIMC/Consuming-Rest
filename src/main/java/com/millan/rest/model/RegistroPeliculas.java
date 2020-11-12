package com.millan.rest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "peliculas")
public class RegistroPeliculas {

	@Id
	private int id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "anioVista")
	private String anioVista;
	@Column(name = "comentarios")
	private String comentarios;
	@Column(name = "imdbID")
	private String imdbID;
	@Column(name = "rating")
	private String rating;
	
	public RegistroPeliculas() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAnioVista() {
		return anioVista;
	}

	public void setAnioVista(String anioVista) {
		this.anioVista = anioVista;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	public String getImdbID() {
		return imdbID;
	}

	public void setImdbID(String imdbID) {
		this.imdbID = imdbID;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "RegistroPeliculas [id=" + id + ", nombre=" + nombre + ", anioVista=" + anioVista + ", comentarios="
				+ comentarios + ", imdbID=" + imdbID + ", rating=" + rating + "]";
	}
	
	
	
	

}
