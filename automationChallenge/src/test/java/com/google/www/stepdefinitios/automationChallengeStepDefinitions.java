package com.google.www.stepdefinitios;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

import org.openqa.selenium.WebDriver;
import com.google.www.tasks.OpenTheBrowser;
import com.google.www.userinterfaces.WongHomePage;
import com.google.www.questions.TheElementVisibility;
import com.google.www.questions.TheMessage;
import com.google.www.tasks.GoTo;
import com.google.www.tasks.Switch;
import com.google.www.tasks.Write;
import com.google.www.userinterfaces.ProducPage;
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
	private WongHomePage wongHomePage;

	@Before
	public void setUp() {
		herBrowser.manage().window().maximize();
		Melissa.can(BrowseTheWeb.with(herBrowser));

	}

	@Given("^Estoy en la pagina$")
	public void estoyEnLaPGina() throws Exception {
		Melissa.wasAbleTo(OpenTheBrowser.on(wongHomePage)
				);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@When("^Busco el producto \"([^\"]*)\"$")
	public void buscoElProducto(String producto) throws Exception {
		Melissa.attemptsTo(GoTo.the(wongHomePage.CANCEL),
				GoTo.the(wongHomePage.IMPUT),
				Write.TheInformation(wongHomePage.IMPUT, producto),
				GoTo.the(wongHomePage.SELEC));
	}
	
	@Then("^Aparecera en pantalla el producto \"([^\"]*)\"$")
	public void aparecerEnPantallaElProducto(String arg1) throws Exception {
		Melissa.should(seeThat(TheElementVisibility.of(ProducPage.WATCH)));
	    
	 System.out.println("si esta el pruducto");
	}
	@Then("^Agrega el producto a mi carro de compras$")
	public void agregaElProductoAMiCarroDeCompras() throws Exception {
		Melissa.attemptsTo(GoTo.the(ProducPage.CLOSE),
				GoTo.the(ProducPage.CAR)
				
						);
	}

	@Then("^En el carro de compra aprece el producto$")
	public void enElCarroDeCompraApreceElProducto()  {
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
//		Melissa.should(seeThat(TheElementVisibility.of(ProducPage.CARFINISH)));
		Melissa.should(
				seeThat(TheMessage.of(ProducPage.CARFINISH), equalTo("1 items")));
	
	}


	

}
