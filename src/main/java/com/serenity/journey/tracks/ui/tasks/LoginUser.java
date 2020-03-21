package com.serenity.journey.tracks.ui.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static com.serenity.journey.tracks.ui.ui.LoginPage.*;

public class LoginUser implements Performable {

    private String username;
    private String password;


    private LoginUser(String theUsername, String thePassword) {
        username = theUsername;
        password = thePassword;
    }

    public static LoginUser withCredentials(String theUsername, String thePassword) {
        return new LoginUser(theUsername, thePassword);
    }


    @Override
    @Step("{0} attempts to log in with username <#username> and password <#password>")
    public <T extends Actor> void performAs(T theActor) {
        theActor.attemptsTo(Enter.theValue(username).into(USERNAME_TEXT_BOX));
        theActor.attemptsTo(Enter.theValue(password).into(PASSWORD_TEXT_BOX));
        theActor.attemptsTo(Click.on(LOGIN_BUTTON));
    }
}