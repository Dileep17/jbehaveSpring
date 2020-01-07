package learning.pages;

import learning.TestContext.DriverProvider;
import org.springframework.beans.factory.annotation.Autowired;

public class BasePage {

    @Autowired
    DriverProvider driverProvider;
}
