package starter.steps;

import static org.assertj.core.api.Assertions.assertThat;

import net.serenitybdd.annotations.Step;

public class UserSteps {


	@Step
	public void assertInDoubleNestedStepMethod() {
		assertInStepMethod();
	}

	@Step
	public void assertInStepMethod() {
		assertThat(false).isTrue();
	}
}
