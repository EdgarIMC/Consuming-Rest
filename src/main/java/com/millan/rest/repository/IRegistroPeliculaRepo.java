package com.millan.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.millan.rest.model.RegistroPeliculas;

public interface IRegistroPeliculaRepo extends JpaRepository<RegistroPeliculas, Integer> {

}
