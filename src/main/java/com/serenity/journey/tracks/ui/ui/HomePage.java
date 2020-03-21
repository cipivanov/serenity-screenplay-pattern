package com.serenity.journey.tracks.ui.ui;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

    public final static Target LOGIN_MESSAGE =
            Target.the("login message").locatedBy("#flash");
}