package com.co.qvision.tasks;


import com.co.qvision.userinterfaces.ProductPage;
import com.co.qvision.userinterfaces.YourCartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Product implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ProductPage.BTN_SAUCE_LABS_BACKPACK),
                Click.on(ProductPage.BTN_SAUCE_LABS_BIKE_LIGTH),
                Click.on(ProductPage.BTN_SHOP_CARS));
                Click.on(YourCartPage.BTN_CHECKOUT);
    }

    public static Product selectProducts() {

        return Tasks.instrumented(Product.class);
    }
}
