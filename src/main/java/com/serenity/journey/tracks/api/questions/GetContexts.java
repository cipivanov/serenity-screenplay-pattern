package com.serenity.journey.tracks.api.questions;

import com.serenity.journey.tracks.api.adapter.Adapter;
import com.serenity.journey.tracks.api.adapter.impl.ContextApiAdapter;
import com.serenity.journey.tracks.api.model.context.Context;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.thucydides.core.annotations.Step;

import java.util.List;

public class GetContexts implements Question<List<Context>> {

    private Adapter<List<Context>> adapter = new ContextApiAdapter();

    private String username;
    private String password;

    public static GetContexts forUser(String theUsername, String thePassword) {
        return new GetContexts(theUsername, thePassword);
    }

    private GetContexts(String theUsername, String thePassword) {
        this.username = theUsername;
        this.password = thePassword;
    }

    @Override
    @Step("{0} attempts to get contexts")
    public List<Context> answeredBy(Actor actor) {
        return adapter.getContexts(username, password);
    }
}