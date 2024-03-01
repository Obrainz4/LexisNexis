package co.uk.LexisNexis.pages;

import co.uk.LexisNexis.commons.DriverFactory;

public class BasePage extends DriverFactory {

    public String Base_URL = "https://www.lexisnexis.co.uk/";

    public void launchUrl(){
        driver.navigate().to(Base_URL);
    }
}
