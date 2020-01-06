package learning.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.When;

public class MyStepsOne extends BaseStepDefs {

    public MyStepsOne(){
        System.out.println("MySteps constructor objectId = " + this + ". With pojo = " + context + ". In thread = " + Thread.currentThread().getId());
    }

    @Given("I store $i")
    public void givenIStore(int i) {
        this.context.setContext(i);
        System.out.println("In givenIAmAPendingStep = " + this + ". With Pojo = " + this.context +". ThreadId = " + Thread.currentThread().getId());
    }

    @When("I wait for some random time")
    public void whenAGoodSoulWillImplementMe() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("In whenAGoodSoulWillImplementMe = " + this + ". With Pojo = " + this.context +". ThreadId = " + Thread.currentThread().getId());
    }

}
