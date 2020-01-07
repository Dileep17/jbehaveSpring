package learning.TestContext;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.stereotype.Component;

import java.io.File;

@Component
public class DriverProvider {
    public ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();

    public void setDriver() {
        String path = "src/main/resources/learning/chromedriver";
        File file = new File(path);
        String absolutePath = file.getAbsolutePath();
        System.setProperty("webdriver.chrome.driver", absolutePath);
        this.driver.set(new ChromeDriver());
    }

    public WebDriver getDriver() {
        System.out.println("In getDriver context = " + null + ". driver = " + driver + ". ThreadId = " + Thread.currentThread().getId());
        if (this.driver.get() == null)
            setDriver();
        return this.driver.get();
    }

    public void quitDriver() {

        if (this.driver.get() instanceof WebDriver)
            this.driver.get().quit();

        if (this.driver.get() != null)
            this.driver.remove();
    }
}