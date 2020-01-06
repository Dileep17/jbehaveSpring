package learning.steps;

import learning.models.Context;
import org.jbehave.core.annotations.AfterStories;
import org.jbehave.core.annotations.AfterStory;

public class BaseStepDefs {
    Context context;

    public void setContext(Context context){
        this.context = context;
    }

}
