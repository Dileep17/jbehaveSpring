package learning.steps;

import org.jbehave.core.annotations.AfterStory;
import org.springframework.stereotype.Component;

@Component
public class Hooks extends BaseStepDefs{

    @AfterStory
    public void tearDown(){
        context.quitDriver();
        System.out.println("************** in teardown");
    }

}
