package com.google.www.stepdefinitios;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import org.openqa.selenium.WebDriver;

import com.google.www.tasks.OpenTheBrowser;
import com.google.www.userinterfaces.WongHomePage;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class automationChallengeStepDefinitions {
	@Managed(driver = "chrome")
	private WebDriver herBrowser;
	private Actor Melissa = Actor.named("Melissa");
//	private AlibabaHomePage alibabaHomePage;
	private WongHomePage wongHomePage;

	@Before
	public void setUp() {
		herBrowser.manage().window().maximize();
		Melissa.can(BrowseTheWeb.with(herBrowser));

	}

	@Given("^Estoy en la pagina$")
	public void estoyEnLaPGina() throws Exception {
		Melissa.wasAbleTo(OpenTheBrowser.on(wongHomePage)); 
	}



	@Given("^Doy clic en \"([^\"]*)\"$")
	public void doyClicEn(String arg1) throws Exception {

	}

	@Given("^Ingreso \"([^\"]*)\" en el campo \"([^\"]*)\"$")
	public void ingresoEnElCampo(String arg1, String arg2) throws Exception {
		
	}

	@Then("^Aparecera en pantalla el car \"([^\"]*)\"$")
	public void aparecerEnPantallaElCar(String arg1) throws Exception {
	
	}

}
