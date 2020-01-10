package com.google.www.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

public class GoTo implements Task {

	private Target target;

	public GoTo(Target target) {

		this.target = target;
	}

	@Override
	@Step("{0} go the option '#target' ")
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Click.on(target));

	}

	/**
	 * With the next method we can see the Liskov substitution principle, because we
	 * are working with our class ClickTo and this class implement the interface
	 * Task and if we check this class, it is extends of Performable and the method
	 * ClickTo needs to return a Performable. The summary is that it can work cause
	 * is a child of Performable.
	 */

	public static GoTo the(Target target) {

		return Tasks.instrumented(GoTo.class, target);

	}

}
