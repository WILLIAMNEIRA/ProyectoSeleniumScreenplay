package com.co.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CheckoutPage {
    public static final Target TXT_FIST_NAME = Target.the("Ingrese Nombre").locatedBy("//input[@id='first-name']");
    public static final Target TXT_LAST_NAME = Target.the("Ingrese Apellido").locatedBy("//input[@id='last-name']");
    public static final Target TXT_ZIPCODE = Target.the("Ingrese Codigo Postal").locatedBy("//input[@id='postal-code']");
    public static  final Target BTN_CONTINUE = Target.the("CLic Boton Contine").locatedBy("//input[@id='continue']");
}
