package com.co.qvision.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;

public class ProductPage {
    public static final Target LBL_PRODUCTS = Target.the("Nombre de la pagina").locatedBy("//span[@class='title']");
    public static final Target BTN_SAUCE_LABS_BACKPACK = Target.the("clic en el boton agregar al carro del producto Sauce Labs Backpack").locatedBy("//button[@id=\"add-to-cart-sauce-labs-backpack\"]");
    public static final Target BTN_SAUCE_LABS_BIKE_LIGTH = Target.the(("clic en el boton agregar al carro el producto Sauce Labs Bike Light")).locatedBy("//button[@id=\"add-to-cart-sauce-labs-bike-light\"]");
    public static final Target BTN_SHOP_CARS = Target.the("clic carrito de compras").locatedBy("//a[@class='shopping_cart_link']");

}
