package com.google.www.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/com/google/www/features",
        tags= {"@feature"},
        glue= {"com.google.www.stepdefinitios"},
        snippets=SnippetType.CAMELCASE,
        monochrome = true,
        dryRun = false,
        plugin = {"json:reportJson/cucumber.json"})
public class automationChallengeRunner {

}
