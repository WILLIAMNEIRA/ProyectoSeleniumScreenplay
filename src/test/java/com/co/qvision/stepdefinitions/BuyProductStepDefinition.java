package com.co.qvision.stepdefinitions;

import com.co.qvision.tasks.Information;
import com.co.qvision.tasks.Product;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

public class BuyProductStepDefinition {

    @When("^he user buy a product$")
    public void heUserBuyAProduct() {
        OnStage.theActorInTheSpotlight().attemptsTo(Product.selectProducts());
       OnStage.theActorInTheSpotlight().attemptsTo(Information.enterInformations());

    }


    @Then("^he user bougth a product$")
    public void heUserBougthAProduct() {

    }
}
