package learning.steps;

import learning.models.Pojo;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

public class MySteps {

    Pojo pojo;

    public void setPojo(Pojo pojo){
        this.pojo = pojo;
    }

    public MySteps(){
        System.out.println("MySteps constructor objectId = " + this + ". With pojo = " + pojo + ". In thread = " + Thread.currentThread().getId());
    }

    @Given("I store $i")
    public void givenIStore(int i) {
        this.pojo.setContext(i);
        System.out.println("In givenIAmAPendingStep = " + this + ". With Pojo = " + this.pojo +". ThreadId = " + Thread.currentThread().getId());
    }

    @When("I wait for some random time")
    public void whenAGoodSoulWillImplementMe() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("In whenAGoodSoulWillImplementMe = " + this + ". With Pojo = " + this.pojo +". ThreadId = " + Thread.currentThread().getId());
    }

    @Then("I shall be happy if I still hold $i")
    public void thenIShallBeHappy(int i) {
        System.out.println("In thenIShallBeHappy = " + this + ". With Pojo = " + this.pojo +". ThreadId = " + Thread.currentThread().getId());
        int actual = pojo.getContext();
        Assert.assertEquals(actual, i);
    }

}
