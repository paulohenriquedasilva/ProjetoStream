package com.magamanx.Api.Controller;

import com.magamanx.Api.Models.Movie;
import com.magamanx.Api.Models.MovieDataDetailingDTO;
import com.magamanx.Api.Models.MovieListingDTO;
import com.magamanx.Api.Models.MovieRegistrationDTO;
import com.magamanx.Api.Service.MovieService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/search")
    public ResponseEntity movie (@RequestParam String name) {
        var movie = movieService.movie(name);
        return  ResponseEntity.ok(new MovieListingDTO(movie));
    }

    public Page<MovieListingDTO> listMovies(Pageable paginacao) {
        return movieService.listPage(paginacao);
    }
/*
    @GetMapping("/search")
    public List<MovieListingDTO> listMovies (@RequestParam String name) {

        return movieService.listMovies(name);
        //ainda será inserido o tratamento de erro
    }
*/

//    @GetMapping
//    public ResponseEntity<Page<DadosListagemMedico>> listar(Pageable paginacao) {
//        var page = repository.findAllByAtivoTrue(paginacao)
//                .map(DadosListagemMedico::new);
//        return ResponseEntity.ok(page);
//    }

    @PostMapping
    @Transactional
    public ResponseEntity register (@RequestBody @Valid MovieRegistrationDTO data, UriComponentsBuilder uriBuilder) {
        var movie = new Movie(data);
        movieService.register(data);

        var uri = uriBuilder.path("/movies/{movieId}").buildAndExpand(movie.getMovieId()).toUri();

        return ResponseEntity.created(uri).body(new MovieDataDetailingDTO(movie));
    }
}
