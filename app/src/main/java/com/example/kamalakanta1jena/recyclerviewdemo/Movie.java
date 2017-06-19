package com.example.kamalakanta1jena.recyclerviewdemo;

/**
 * Created by Kamalakanta1.Jena on 15-06-2017.
 */

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Movie {

    @SerializedName("actors")
    @Expose
    private List<Actor> actors = null;

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

}