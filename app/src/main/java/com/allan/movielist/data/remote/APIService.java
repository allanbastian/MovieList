package com.allan.movielist.data.remote;

import com.allan.movielist.data.model.MovieCallObj;
import com.allan.movielist.data.model.MovieResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface APIService {

    @POST("movieList")
    Call<MovieResponse> getMovies(@Body MovieCallObj obj);
}
