package com.serenity.journey.tracks.api.adapter;

public interface Adapter<T> {

    T getContexts(String username, String password);
}