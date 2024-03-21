package com.magamanx.Api.Models;

import java.util.Date;
import java.util.List;

public record MovieListingDTO(String title,
                              String description,
                              Integer releaseYear,
                              String director,
                              Integer duration,
                              String posterURL,
                              String trailerURL,
                              Date addedDate,
                              Double rating) {

    public MovieListingDTO (Movie movie) {
        this(movie.getTitle(),
             movie.getDescription(),
             movie.getReleaseYear(),
             movie.getDirector(),
             movie.getDuration(),
             movie.getPosterURL(),
             movie.getTrailerURL(),
             movie.getAddedDate(),
             movie.getRating());
    }


}
