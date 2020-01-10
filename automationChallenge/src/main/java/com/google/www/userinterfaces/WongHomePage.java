package com.google.www.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://www.wong.pe/especiales/cyberwong")
public class WongHomePage extends PageObject {
	public static final Target IMPUT = Target.the("The imput field").located(By.id("search-autocomplete-input"));
	public static final Target SELEC = Target.the("Selec the product").located(By.xpath("(//span[@class='product-add-to-cart__text'])[1]"));
	public static final Target CANCEL = Target.the("cancel the pop").located(By.id("onesignal-popover-cancel-button"));

}
