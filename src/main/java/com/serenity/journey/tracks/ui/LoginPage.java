package com.serenity.journey.tracks.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://35.205.178.227:3000/login")
public class LoginPage extends PageObject {

    public final static Target USERNAME_TEXT_BOX =
            Target.the("username text box").locatedBy("#user_login");
    public final static Target PASSWORD_TEXT_BOX =
            Target.the("password text box").locatedBy("#user_password");
    public final static Target LOGIN_BUTTON =
            Target.the("login button").locatedBy("[name=login]");
}