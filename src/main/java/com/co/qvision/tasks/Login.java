package com.co.qvision.tasks;

import com.co.qvision.userinterfaces.Homepage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("standard_user").into(Homepage.TXT_USERNAME));
        actor.attemptsTo(Enter.theValue("secret_sauce").into(Homepage.TXT_PASSWORD));
        actor.attemptsTo(Click.on(Homepage.BTN_LOGIN));
    }
    public static Login enterCredentials(){
        return Tasks.instrumented(Login.class);
    }
}
