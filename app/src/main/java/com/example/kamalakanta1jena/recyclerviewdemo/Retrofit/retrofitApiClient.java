package com.example.kamalakanta1jena.recyclerviewdemo.Retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Kamalakanta1.Jena on 19-06-2017.
 */

public class retrofitApiClient {
    public static final String BASE_URL = "http://microblogging.wingnity.com/JSONParsingTutorial/";
    private static Retrofit retrofit = null;


    public static Retrofit getClient() {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
