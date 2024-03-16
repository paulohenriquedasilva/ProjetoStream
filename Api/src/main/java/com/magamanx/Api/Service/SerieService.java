package com.magamanx.Api.Service;

import com.magamanx.Api.Models.MovieListingDTO;
import com.magamanx.Api.Models.SerieListingDTO;
import com.magamanx.Api.Repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SerieService {
    @Autowired
    private SerieRepository serieRepository;

    public List<SerieListingDTO> listSeries (String name) {
        return  serieRepository.findByNameContainingIgnoreCase(name)
                .stream()
                .map(SerieListingDTO::new).toList();
        //ainda será inserido o tratamento de erro
    }
}
