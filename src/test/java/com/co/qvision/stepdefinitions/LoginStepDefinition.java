package com.co.qvision.stepdefinitions;


import com.co.qvision.models.Credential;
import com.co.qvision.questions.ValidateProduct;
import com.co.qvision.tasks.Login;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import javax.swing.*;
import java.util.List;

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
    public void heUserEnterCredentials(List<Credential> credentialList) {
        Credential credential;
        credential= credentialList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(Login.enterCredentials(credential));

    }

    @Then("^he user his login$")
    public void heUserHisLogin() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateProduct.compare(),Matchers.equalTo("PRODUCTS")));

    }




}
