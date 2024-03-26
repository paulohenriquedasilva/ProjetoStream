package com.magamanx.Api.Controller;

import com.magamanx.Api.DTO.SerieListingDTO;
import com.magamanx.Api.Service.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("movies")
public class SerieController {
    @Autowired
    private SerieService serieService;

    @GetMapping("/search")
    public List<SerieListingDTO> listSerie (@RequestParam String name) {
        return serieService.listSeries(name);
    }
}
