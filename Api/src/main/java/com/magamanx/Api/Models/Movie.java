package com.magamanx.Api.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Table(name = "movies")
@Entity(name = "Movie")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "movieId")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long movieId;
    private String title;
    private String description;
    private Integer releaseYear;
    private String director;
    private Integer duration;
    private String posterURL;
    private String trailerURL;
    private Date addedDate;
    private Double rating;


    public Movie(MovieRegistrationDTO data) {
        this.title = data.title();
        this.description = data.description();
        this.releaseYear = data.releaseYear();
        this.director = data.director();
        this.duration = data.duration();
        this.posterURL = data.posterURL();
        this.trailerURL = data.trailerURL();
        this.addedDate = data.addedDate();
        this.rating = data.rating();
    }
}
