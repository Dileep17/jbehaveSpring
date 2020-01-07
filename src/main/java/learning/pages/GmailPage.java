package learning.pages;

import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

@Component
public class GmailPage extends BasePage {

    public void open(){
        driverProvider.getDriver().get("https://www.google.com/intl/en-GB/gmail/about/#");
    }


    public boolean isSignInDisplayed() {
        return this.driverProvider.getDriver().findElement(By.linkText("Sign in")).isDisplayed();
    }
}
