package com.example.kamalakanta1jena.recyclerviewdemo.POJO;

/**
 * Created by Kamalakanta1.Jena on 15-06-2017.
 */

import java.util.List;

import com.example.kamalakanta1jena.recyclerviewdemo.POJO.Actor;

public class Movie {

    private List<Actor> actors = null;

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

}