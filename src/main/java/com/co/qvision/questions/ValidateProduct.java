package com.co.qvision.questions;

import com.co.qvision.userinterfaces.ProductPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidateProduct implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(ProductPage.LBL_PRODUCTS).viewedBy(actor).asString();
    }
    public static ValidateProduct compare(){
        return  new ValidateProduct();
    }
}
