package com.rspesce.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rspesce.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
