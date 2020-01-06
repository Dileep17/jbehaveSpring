package learning.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

public class AutomationPracticeStepDefs extends BaseStepDefs {

    @Given("I open automationpractice.com")
    public void givenIOpenAutoPrac() {
        this.context.getDriver().get("http://automationpractice.com");
    }

    @Then("yahoo.com should load")
    public void autoPracShouldLoad(){
        boolean pageLoaded = this.context.getDriver().findElement(By.linkText("Sign in")).isDisplayed();
        Assert.assertTrue(pageLoaded);
    }
}
