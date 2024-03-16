package com.magamanx.Api.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Table(name = "series")
@Entity(name = "Serie")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "serieId")
public class Serie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long serieId;
    private String title;
    private String description;
    private Integer releaseYear;
    private String Creator;
    private Integer Seasons;
    private String posterURL;
    private String trailerURL;
    private Date addedDate;
    private Double rating;
}
