package com.serenity.journey.tracks.actions;

import com.serenity.journey.tracks.ui.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class Start implements Performable {

    private LoginPage loginPage;

    public static Start openApplication() {
        return new Start();
    }

    @Step("{0} opens the application")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn().the(loginPage));
    }
}