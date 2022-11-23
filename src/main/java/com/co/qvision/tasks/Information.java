package com.co.qvision.tasks;


import com.co.qvision.userinterfaces.CheckoutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Information implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("William").into(CheckoutPage.TXT_FIST_NAME),
                Enter.theValue("Neira").into(CheckoutPage.TXT_LAST_NAME),
                Enter.theValue("546551").into(CheckoutPage.TXT_ZIPCODE),
                Click.on(CheckoutPage.BTN_CONTINUE));
    }
    public static Information enterInformations(){
        return Tasks.instrumented(Information.class);

    }
}
