package com.magamanx.Api.Service;

import com.magamanx.Api.Models.Movie;
import com.magamanx.Api.Models.MovieListingDTO;
import com.magamanx.Api.Models.MovieRegistrationDTO;
import com.magamanx.Api.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    public Movie movie(String name) {
        return movieRepository.findByNameIgnoreCase(name);
    }

    public List<MovieListingDTO> listMovies(String name) {
        return movieRepository.findByNameContainingIgnoreCase(name)
                .stream()
                .map(MovieListingDTO::new).toList();
    }

    public void register(MovieRegistrationDTO data) {
        movieRepository.save(new Movie(data));
    }


    public Page<MovieListingDTO> listPage(@PageableDefault(size = 10)Pageable paginacao) {
        return movieRepository.findAll(paginacao).map(MovieListingDTO::new);
    }

}