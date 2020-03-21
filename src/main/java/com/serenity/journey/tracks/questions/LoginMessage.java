package com.serenity.journey.tracks.questions;

import com.serenity.journey.tracks.ui.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.thucydides.core.annotations.Step;

public class LoginMessage implements Question<String> {

    public static Question<String> text() {
        return new LoginMessage();
    }

    @Override
    @Step("{0} see the login message")
    public String answeredBy(Actor theActor) {
        return Text.of(HomePage.LOGIN_MESSAGE)
                .viewedBy(theActor)
                .asString();
    }
}