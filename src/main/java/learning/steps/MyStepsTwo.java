package learning.steps;

import org.jbehave.core.annotations.Then;
import org.junit.Assert;

public class MyStepsTwo extends BaseStepDefs {

    public MyStepsTwo(){
        System.out.println("MySteps constructor objectId = " + this + ". With pojo = " + context + ". In thread = " + Thread.currentThread().getId());
    }

    @Then("I shall be happy if I still hold $i")
    public void thenIShallBeHappy(int i) {
        System.out.println("In thenIShallBeHappy = " + this + ". With Pojo = " + this.context +". ThreadId = " + Thread.currentThread().getId());
        int actual = context.getContext();
        Assert.assertEquals(actual, i);
    }

}
