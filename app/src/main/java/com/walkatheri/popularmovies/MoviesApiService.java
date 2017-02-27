package com.walkatheri.popularmovies;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;


public interface MoviesApiService {

    @GET("/movie/popular")
    void getPopularMovies(Callback<Movie.MovieResult> cb);
    @GET("/movie/top_rated")
    void getPopularMovie(Callback<Movie.MovieResult> cb);
}
