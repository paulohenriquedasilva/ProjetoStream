package com.magamanx.Api.Repository;

import com.magamanx.Api.Models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    Movie findByNameIgnoreCase(String name);
    List<Movie> findByNameContainingIgnoreCase(String name);

//    Page<Movie> findAllByAtivoTrue(Pageable pageable);

}
