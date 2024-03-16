package com.magamanx.Api.Service;

import com.magamanx.Api.Models.Movie;
import com.magamanx.Api.Models.MovieListingDTO;
import com.magamanx.Api.Models.MovieRegistrationDTO;
import com.magamanx.Api.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    public List<MovieListingDTO> listMovies (String name) {
        return  movieRepository.findByNameContainingIgnoreCase(name)
                .stream()
                .map(MovieListingDTO::new).toList();
        //ainda será inserido o tratamento de erro
    }


    public void register (MovieRegistrationDTO data) {
        movieRepository.save(new Movie(data));
        //ainda será inserido o tratamento de erro
    }
}
