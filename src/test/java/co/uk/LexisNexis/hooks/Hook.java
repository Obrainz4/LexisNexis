package co.uk.LexisNexis.hooks;

import co.uk.LexisNexis.commons.BrowserFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends BrowserFactory {

    @Before
    public void setUp() {
        launchBrowser("");
    }

    @After
    public void tearDown() {
        closeBrowser();
    }

}
