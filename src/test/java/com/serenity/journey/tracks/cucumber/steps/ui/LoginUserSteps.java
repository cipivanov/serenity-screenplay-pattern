package com.serenity.journey.tracks.cucumber.steps.ui;

import com.serenity.journey.tracks.ui.actions.Start;
import com.serenity.journey.tracks.ui.questions.LoginMessage;
import com.serenity.journey.tracks.ui.tasks.LoginUser;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.containsString;

public class LoginUserSteps {

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^a (\\w+) is on the application Login Page$")
    public void actorIsOnTheApplicationLoginPage(String theActor) {
        theActorCalled(theActor).wasAbleTo(Start.openApplication());
    }

    @When("^he attempts to sign in with username (\\w+) and password (\\w+)$")
    public void userAttemptsToLogin(String theUsername, String thePassword) {
        theActorInTheSpotlight().attemptsTo(LoginUser.withCredentials(theUsername, thePassword));
    }

    @Then("^(.*) message is displayed$")
    public void loginIsSuccessful(String theMessage) {
        theActorInTheSpotlight().should(seeThat(LoginMessage.text(), containsString(theMessage)));
    }
}