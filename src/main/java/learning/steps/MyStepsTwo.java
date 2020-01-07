package learning.steps;

import org.jbehave.core.annotations.Then;
import org.junit.Assert;
import org.springframework.stereotype.Component;

@Component
public class MyStepsTwo extends BaseStepDefs {

    @Then("I shall be happy if I still hold $i")
    public void thenIShallBeHappy(int i) {
        int actual = context.getContext();
        Assert.assertEquals(actual, i);
    }

}
