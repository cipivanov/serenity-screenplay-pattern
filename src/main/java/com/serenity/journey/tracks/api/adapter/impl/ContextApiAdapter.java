package com.serenity.journey.tracks.api.adapter.impl;

import com.serenity.journey.tracks.api.model.context.Context;
import com.serenity.journey.tracks.api.model.context.Contexts;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;

import java.util.List;

public class ContextApiAdapter extends ApiAdapter<List<Context>> {

    public List<Context> getContexts(String username, String password) {
        Response response = getRequestSpecification()
                .auth().basic(username, password)
                .get("/contexts.xml");

        return response.as(Contexts.class, ObjectMapperType.JAXB).getContexts();
    }
}