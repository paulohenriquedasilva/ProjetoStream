package com.magamanx.Api.DTO;

import java.time.LocalDate;

public record SerieDTO(String title,
                       String description,
                       int releaseYear,
                       String creator,
                       int seasons,
                       String posterURL,
                       String trailerURL,
                       LocalDate addedDate,
                       double rating) {

}
