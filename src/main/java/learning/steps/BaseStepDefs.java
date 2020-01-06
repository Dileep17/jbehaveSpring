package learning.steps;

import learning.models.Context;
import org.jbehave.core.annotations.AfterStories;
import org.jbehave.core.annotations.AfterStory;

public class BaseStepDefs {
    Context context;

    public void setContext(Context context){
        this.context = context;
        System.out.println("In BaseStepDefs construct = " + this + ". context = " + context + ". ThreadId = " + Thread.currentThread().getId());
    }

    @AfterStory
    public void tearDown(){
        context.quitDriver();
        System.out.println("************** in teardown");

//        System.out.println("In tearDown context = " + this + ". context = " + context + ". ThreadId = " + Thread.currentThread().getId());
    }

}
