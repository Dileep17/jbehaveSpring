package learning.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.springframework.stereotype.Component;

@Component
public class LandingPage extends BasePage {

//    public LandingPage(){
//        PageFactory.initElements( driverProvider.getDriver(), this);
//    }

    public void open(){
        driverProvider.getDriver().get("http://automationpractice.com");
    }

    public boolean isSiginDisplayed(){
        return driverProvider.getDriver().findElement(By.linkText("Sign in")).isDisplayed();
    }

}
