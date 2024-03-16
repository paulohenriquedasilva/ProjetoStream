package com.magamanx.Api.Repository;

import com.magamanx.Api.Models.Movie;
import com.magamanx.Api.Models.Serie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SerieRepository extends JpaRepository<Serie, Long> {
    List<Serie> findByNameContainingIgnoreCase(String name);
}
