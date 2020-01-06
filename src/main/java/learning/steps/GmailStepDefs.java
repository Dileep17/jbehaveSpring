package learning.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class GmailStepDefs extends BaseStepDefs {

    @Given("I open gmail.com")
    public void givenIOpenGmail() {
        System.out.println("In givenIOpenGmail = " + this + ". context = " + context + ". ThreadId = " + Thread.currentThread().getId());
        this.context.getDriver().get("https://www.google.com/intl/en-GB/gmail/about/#");
    }

    @Then("gmail.com should load")
    public void gmailShouldLoad(){
        System.out.println("In gmailShouldLoad = " + this + ". context = " + context + ". ThreadId = " + Thread.currentThread().getId());
        boolean pageLoaded = this.context.getDriver().findElement(By.linkText("Sign in")).isDisplayed();
        Assert.assertTrue(pageLoaded);
    }

    @When("I wait for some $n milliseconds")
    public void iWaitForGivenMilliSeconds(int n) throws InterruptedException {
        System.out.println("In iWaitForGivenMilliSeconds = " + this + ". context = " + context + ". ThreadId = " + Thread.currentThread().getId());
        Thread.sleep(n);
    }

}
