package com.tvapp.controller;

import com.tvapp.entity.HomePageModel;
import com.tvapp.entity.MovieDiscovery;
import com.tvapp.entity.MovieList;
import com.tvapp.entity.TvDiscovery;
import com.tvapp.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class HomeCont {

    @Autowired
    HomeService homeService;

    @GetMapping("/")
    public HomePageModel getHomePageMovies(){
        return homeService.getHomePageData();
        //System.out.println(movies);
    }
}
