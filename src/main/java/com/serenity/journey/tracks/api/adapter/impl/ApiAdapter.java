package com.serenity.journey.tracks.api.adapter.impl;

import com.serenity.journey.tracks.api.adapter.Adapter;
import io.restassured.specification.RequestSpecification;

import static net.serenitybdd.rest.SerenityRest.given;


public abstract class ApiAdapter<T> implements Adapter<T> {

    private static final RequestSpecification requestSpecification;

    static {
        //TODO: Move to .properties file
        requestSpecification = given().baseUri("http://35.205.178.227:3000").log().all();
    }

    public RequestSpecification getRequestSpecification() {
        return requestSpecification;
    }
}