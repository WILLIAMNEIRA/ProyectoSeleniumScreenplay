package com.co.qvision.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;

public class Homepage {
    public static  final Target TXT_USERNAME  = Target.the("Ingrese usuario").locatedBy("//input[@id='user-name']");
    public static  final Target TXT_PASSWORD  = Target.the("Ingrese contraseña").locatedBy("//input[@id='password']");
    public static  final Target BTN_LOGIN  = Target.the("Clic boton login").locatedBy("//input[@id='login-button']");
}
