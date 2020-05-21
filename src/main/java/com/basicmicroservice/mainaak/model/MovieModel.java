package com.basicmicroservice.mainaak.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.internal.NotNull;

public class MovieModel {

    @JsonProperty("movieId")
    private String movieId;

    @JsonProperty("name")
    private String name;

    //Remember to make this or else
    public MovieModel() {
    }

    public MovieModel(@NotNull String movieId, String name) {
        this.movieId = movieId;
        this.name = name;
    }

    public String getMovieId() {
        return movieId;
    }

    public String getName() {
        return name;
    }
}
