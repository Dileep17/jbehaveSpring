package learning.models;

import org.jbehave.core.annotations.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;


public class Context {

    private static ThreadLocal<Integer> context = new ThreadLocal<Integer>();;
    public ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();;;

    public Context(){
        System.out.println("In Context construct = " + this + ". driver = " + driver + ". ThreadId = " + Thread.currentThread().getId());
    }

    public void setContext(int i) {
        this.context.set(i);
    }

    public int getContext() {
        return this.context.get();
    }

    public void setDriver() {
        String path = "src/main/resources/learning/chromedriver";
        File file = new File(path);
        String absolutePath = file.getAbsolutePath();
//         "/Users/dileepbellamkonda/Documents/Learning/automationPracCucumber/chromedriver"
        System.setProperty("webdriver.chrome.driver", absolutePath);
        this.driver.set(new ChromeDriver());
    }

    public void restDriver(){
        System.out.println("In restDriver context = " + this + ". driver = " + driver + ". ThreadId = " + Thread.currentThread().getId());
        if(this.driver.get() != null)
            this.driver.set(null);
    }

    public WebDriver getDriver() {
        System.out.println("In getDriver context = " + this + ". driver = " + driver + ". ThreadId = " + Thread.currentThread().getId());
        if(this.driver.get() == null)
            setDriver();
        return this.driver.get();
    }

    public void quitDriver(){

        if(this.driver.get() instanceof WebDriver)
            this.driver.get().quit();

        if(this.driver.get() != null)
            this.driver.remove();
    }

}
