package com.serenity.journey.tracks.api.questions;

import com.serenity.journey.tracks.api.model.context.Context;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.List;

public class Contexts implements Question<Integer> {

    private List<Context> contexts;

    public static Contexts count(List<Context> contexts) {
        return new Contexts(contexts);
    }

    private Contexts(List<Context> context) {
        this.contexts = context;
    }

    @Override
    public Integer answeredBy(Actor actor) {
        return contexts.size();
    }
}