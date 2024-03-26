package com.magamanx.Api.DTO;

import com.magamanx.Api.Models.Serie;

import java.util.Date;

public record SerieListingDTO(
        String title,
        String description,
        Integer releaseYear,
        String creator,
        Integer seasons,
        String posterURL,
        String trailerURL,
        Date addedDate,
        Double rating) {

    public SerieListingDTO (Serie serie) {
        this(serie.getTitle(),
             serie.getDescription(),
             serie.getReleaseYear(),
             serie.getCreator(),
             serie.getSeasons(),
             serie.getPosterURL(),
             serie.getTrailerURL(),
             serie.getAddedDate(),
             serie.getRating());
    }

}
