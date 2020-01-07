package learning.steps;

import learning.TestContext.Context;
import learning.pages.ContactUs;
import learning.pages.GmailPage;
import learning.pages.LandingPage;
import learning.pages.SignInPage;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseStepDefs {
    @Autowired
    Context context;

    @Autowired
    GmailPage gmailPage;

    @Autowired
    LandingPage landingPage;

    @Autowired
    SignInPage signInPage;

    @Autowired
    ContactUs contactUs;
}
