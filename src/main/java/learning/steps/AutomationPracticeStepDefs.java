package learning.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.junit.Assert;
import org.springframework.stereotype.Component;

@Component
public class AutomationPracticeStepDefs extends BaseStepDefs {

    @Given("I open automationpractice.com")
    public void givenIOpenAutoPrac() {
        landingPage.open();
    }

    @Then("I should see sign in option")
    public void iShouldSeeSigninOption(){
        Assert.assertTrue(landingPage.isSiginDisplayed());
    }
}
