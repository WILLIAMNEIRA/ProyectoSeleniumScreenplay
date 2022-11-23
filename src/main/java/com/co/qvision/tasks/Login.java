package com.co.qvision.tasks;

import com.co.qvision.models.Credential;
import com.co.qvision.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {
    Credential credential;

    public Login(Credential credential) {
        this.credential = credential;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo
                (Enter.theValue(credential.getUsername()).into(HomePage.TXT_USERNAME),
                        Enter.theValue(credential.getPassword()).into(HomePage.TXT_PASSWORD),
                        Click.on(HomePage.BTN_LOGIN));

    }

    public static Login enterCredentials(Credential credential) {
        return Tasks.instrumented(Login.class, credential);
    }
}
