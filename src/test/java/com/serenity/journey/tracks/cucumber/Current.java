package com.serenity.journey.tracks.cucumber;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        tags = {"@current"},
        features = "src/test/resources/features",
        format = {"pretty", "html:target/cucumber", "json:target/cucumber.json"})
public class Current {
}