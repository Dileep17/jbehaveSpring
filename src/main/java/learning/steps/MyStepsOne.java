package learning.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.When;
import org.springframework.stereotype.Component;

@Component
public class MyStepsOne extends BaseStepDefs {

    @Given("I store $i")
    public void givenIStore(int i) {
        this.context.setContext(i);
    }

    @When("I wait for some $n milliseconds")
    public void iWaitForGivenMilliSeconds(int n) throws InterruptedException {
        Thread.sleep(n);
    }
}
