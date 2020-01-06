package learning.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.When;

public class MyStepsOne extends BaseStepDefs {

    @Given("I store $i")
    public void givenIStore(int i) {
        this.context.setContext(i);
    }
}
