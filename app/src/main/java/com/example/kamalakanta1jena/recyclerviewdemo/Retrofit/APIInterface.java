package com.example.kamalakanta1jena.recyclerviewdemo.Retrofit;

import com.example.kamalakanta1jena.recyclerviewdemo.POJO.Movie;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Kamalakanta1.Jena on 19-06-2017.
 */

public interface APIInterface {
    @GET("jsonActors")
    Call<Movie> getActorData();
}
