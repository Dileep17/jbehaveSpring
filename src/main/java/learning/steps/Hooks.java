package learning.steps;

import learning.TestContext.DriverProvider;
import org.jbehave.core.annotations.AfterStory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Hooks extends BaseStepDefs{

    @Autowired
    DriverProvider driverProvider;

    @AfterStory
    public void tearDown(){
        driverProvider.quitDriver();
        System.out.println("************** in teardown");
    }

}
