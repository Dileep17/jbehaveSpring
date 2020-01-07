package learning.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.junit.Assert;
import org.springframework.stereotype.Component;

@Component
public class GmailStepDefs extends BaseStepDefs {

    @Given("I open gmail.com")
    public void givenIOpenGmail() {
        gmailPage.open();
    }

    @Then("gmail.com should load")
    public void gmailShouldLoad(){
        Assert.assertTrue(gmailPage.isSignInDisplayed());
    }
}
