package com.co.qvision.stepdefinitions;


import com.co.qvision.tasks.Login;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class LoginStepDefinition {

    @Managed
    WebDriver hisBrowser;
    @Before
    public void setup() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("William");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^he user is on the page$")
    public void heUserIsOnThePage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.saucedemo.com/"));
    }

    @When("^he user enter credentials$")
    public void heUserEnterCredentials() {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.enterCredentials());

    }

    @Then("^he user his login$")
    public void heUserHisLogin() {

    }




}
