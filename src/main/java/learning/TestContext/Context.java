package learning.TestContext;

import org.openqa.selenium.WebDriver;
import org.springframework.stereotype.Component;


@Component
public class Context {

    private static ThreadLocal<Integer> context = new ThreadLocal<Integer>();;

    public void setContext(int i) {
        this.context.set(i);
    }

    public int getContext() {
        return this.context.get();
    }

}
