package learning.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

@Component
public class GmailStepDefs extends BaseStepDefs {

    @Given("I open gmail.com")
    public void givenIOpenGmail() {
        this.context.getDriver().get("https://www.google.com/intl/en-GB/gmail/about/#");
    }

    @Then("gmail.com should load")
    public void gmailShouldLoad(){
        boolean pageLoaded = this.context.getDriver().findElement(By.linkText("Sign in")).isDisplayed();
        Assert.assertTrue(pageLoaded);
    }
}
