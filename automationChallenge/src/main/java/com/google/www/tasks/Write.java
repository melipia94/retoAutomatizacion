package com.google.www.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.Keys;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

public class Write implements Task {

	PageObject page;
	String termino;
	Target target;

	
	public Write(Target target,String termino) {
		this.termino = termino;
		this.target=target;
	}
	
	@Step("{0} busca #termino en la barra de busqueda de Wongo")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
					Enter.theValue(termino)
					.into(target)
					.thenHit(Keys.ENTER)
				);
		
		
	}

	public static Write TheInformation(Target target,String termino) {
		return instrumented(Write.class, target,termino);
	}

}

