package com.magamanx.Api.Models;

import jakarta.validation.constraints.NotBlank;

import java.util.Date;

public record MovieRegistrationDTO(
        @NotBlank
        String title,
        @NotBlank
        String description,
        @NotBlank
        Integer releaseYear,
        @NotBlank
        String director,
        @NotBlank
        Integer duration,
        @NotBlank
        String posterURL,
        @NotBlank
        String trailerURL,
        @NotBlank
        Date addedDate,
        @NotBlank
        Double rating) {
}
