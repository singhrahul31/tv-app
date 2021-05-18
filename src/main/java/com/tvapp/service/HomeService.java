package com.tvapp.service;

import com.tvapp.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class HomeService {

    @Value("${base.url}")
    private String baseUrl;
    @Value("${api.key}")
    private String apiKey;
    @Value("${image.url}")
    private String imageUrl;

    @Autowired
    RestTemplate restTemplate;

    public HomePageModel getHomePageData() {
        MovieDiscovery movies = restTemplate.getForObject(baseUrl+"/discover/movie?"+apiKey+"&sort_by=popularity.desc", MovieDiscovery.class);
        List<MovieSnapshot> movieList = movies.getMovies().stream()
                                            .limit(10)
                                            .map(item -> {
                                                item.setPosterPath(imageUrl+"w500"+item.getPosterPath());
                                                return item;
                                            })
                                            .collect(Collectors.toList());
        TvDiscovery tvShows = restTemplate.getForObject(baseUrl+"/discover/tv?"+apiKey+"&sort_by=popularity.desc", TvDiscovery.class);
        List<TvSnapshot> tvShowList = tvShows.getTvShowList().stream()
                                        .limit(10)
                                        .map(item -> {
                                            item.setPosterPath(imageUrl+"w500"+item.getPosterPath());
                                            return item;
                                        })
                                        .collect(Collectors.toList());
        return new HomePageModel(movieList, tvShowList);
    }
}
