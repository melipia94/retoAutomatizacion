package com.google.www.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class TheMessage implements Question<String> {

	private Target target;

	public TheMessage(Target target) {
		this.target = target;
	}

	public static TheMessage of(Target target) {

		return new TheMessage(target);
	}

	/**
	 * The previous method is an example of "Dependency inversion principle"
	 * implement the Dependency Injection pattern through the TheMessage() method.
	 */

	@Override
	public String answeredBy(Actor actor) {

		String carText= Text.of(target).viewedBy(actor).asString();
		return carText;
	}

}