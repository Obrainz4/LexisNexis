package co.uk.LexisNexis.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LexisHomePage extends BasePage {

    public LexisHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
    private WebElement acceptCookie;

    public void clickAcceptAllCookie() {
        acceptCookie.click();
    }

    @FindBy(xpath = "//a[@role='logo']//img")
    private WebElement lexisLogo;

    public void LexisNexisLogoIsVisible() {
        Assert.assertTrue(lexisLogo.isDisplayed());
    }

    @FindBy(xpath = "//button[@class='pushcrew-chrome-style-notification-btn pushcrew-btn-close']")
    private WebElement doNotAllowNotification;

    public void clickNoNotification() {
        doNotAllowNotification.click();

    }

    @FindBy(xpath = "//input[@id='LN_searchbox']")
    private WebElement searchField;

    public void enterSearchWord (String search){
        searchField.sendKeys(search);
    }

    @FindBy(xpath = "//button[@id='searchbtnheader']")
    private WebElement searchButton;

    public void clickSearchButton() {
        searchButton.click();
    }

    @FindBy(xpath = "//a[@href='https://www.lexisnexis.co.uk/legal/research']//span[@class='st-ui-type-heading']//em[contains(text(),'Research')]")
    private WebElement lexisResearch;

    public void clickOnLexisResearch() {
        lexisResearch.click();
    }

    @FindBy(xpath = "//span[normalize-space()='Legislation']")
    private WebElement legislation;

    public void legislationIsDisplayed() {
        Assert.assertTrue(legislation.isDisplayed());
    }

    @FindBy(xpath = "//span[normalize-space()='Legal glossary']")
    private WebElement legalGlossary;

    public void legalGlossaryIsDisplayed() {
        Assert.assertTrue(legalGlossary.isDisplayed());
    }
    @FindBy(xpath = "//div[@class='legalnewspage-box']")
    private WebElement legalNews;

    public void legalNewsIsDisplayed() {
        Assert.assertTrue(legalNews.isDisplayed());
    }

}
