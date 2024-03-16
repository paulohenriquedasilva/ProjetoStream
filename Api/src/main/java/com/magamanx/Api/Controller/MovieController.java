package com.magamanx.Api.Controller;

import com.magamanx.Api.Models.MovieListingDTO;
import com.magamanx.Api.Models.MovieRegistrationDTO;
import com.magamanx.Api.Service.MovieService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/search")
    public List<MovieListingDTO> listMovies (@RequestParam String name) {

        return movieService.listMovies(name);
        //ainda será inserido o tratamento de erro
    }

    @PostMapping
    @Transactional
    public void register (@RequestBody @Valid MovieRegistrationDTO data) {
        movieService.register(data);
        //ainda será inserido o tratamento de erro
    }
}
