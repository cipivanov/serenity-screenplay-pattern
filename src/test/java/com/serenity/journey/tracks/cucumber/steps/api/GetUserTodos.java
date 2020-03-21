package com.serenity.journey.tracks.cucumber.steps.api;

import com.serenity.journey.tracks.api.model.context.Context;
import com.serenity.journey.tracks.api.questions.Contexts;
import com.serenity.journey.tracks.api.questions.GetContexts;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.Is.is;

public class GetUserTodos {

    private List<Context> contexts;

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^an (\\w+)$")
    public void aActorWithUsernameAndPasswordCredentials(String theActor) {
        theActorCalled(theActor);
    }

    @When("^he attempts to retrieve contexts with username (\\w+) and password (\\w+)$")
    public void heAttemptsToRetrieveTODOs(String theUsername, String thePassword) {
        contexts = theActorInTheSpotlight().asksFor(GetContexts.forUser(theUsername, thePassword));
    }

    @Then("^all contexts are returned$")
    public void allTODOsAreReturned() {
        theActorInTheSpotlight().should(seeThat(Contexts.count(contexts), is(1)));
    }
}