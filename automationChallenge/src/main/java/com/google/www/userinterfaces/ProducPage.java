package com.google.www.userinterfaces;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ProducPage extends PageObject {
	public static final Target WATCH = Target.the("Watch product").located(By.xpath("//*[@id=\"J-ls-grid-action\"]/div[2]/div/div[1]/div/div[1]/h1"));
	public static final Target ADD = Target.the("add product").located(By.xpath("//*[@id='skuWrap']/dl/dd/div/div[2]/div[1]/a[2]"));
	public static final Target ADDCAR = Target.the("add product to car").located(By.xpath("//*[@id='skuWrap']/dl/dd/div/div[2]/div[1]/a[2]"));
	public static final Target LOGIN = Target.the("Login to see the car").located(By.xpath("/html/body/div[15]/div/div[1]/div/div/div[1]"));
	public static final Target CLOSE = Target.the("cerrrar pop").located(By.xpath("//button[@class=\"modal-address__close font-icn cross\"]"));
	public static final Target CAR = Target.the("car botton").located(By.xpath("(//*[@class=\"btn primary minicart__action minicart__action--buy\"])[3]"));
	public static final Target CARFINISH = Target.the("carrito").located(By.xpath("//span[@class='totalizers-product-total']"));

}
