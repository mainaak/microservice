package com.basicmicroservice.mainaak.controller;

import com.basicmicroservice.mainaak.model.MovieModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("microservice")
public class CallToMovieController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping (path = "/{movieId}")
    public MovieModel callingDataFromMicroservice(@PathVariable("movieId") String url){
        return restTemplate.getForObject(
                "http://localhost:8081/movies/" + url,
                MovieModel.class
        );
    }
}
