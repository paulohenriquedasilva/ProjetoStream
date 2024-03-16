package com.magamanx.Api.Repository;

import com.magamanx.Api.Models.Movie;
import com.magamanx.Api.Models.MovieListingDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    List<Movie> findByNameContainingIgnoreCase(String name);
}
