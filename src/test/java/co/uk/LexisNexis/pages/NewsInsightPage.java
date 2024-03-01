package co.uk.LexisNexis.pages;

import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewsInsightPage extends BasePage {
    public NewsInsightPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//a[normalize-space()='News & Insights']")
    private WebElement newsInsightMenu;

    public void clickNewsInsightMenu() {
        newsInsightMenu.click();
    }

    @FindBy(xpath = "//a[normalize-space()='LexisNexis Blog']")
    private WebElement newsDesk;

    public void clickNewsDesk() {
        newsDesk.click();
    }

    @FindBy(xpath = "//h2[@class='mb-4 font-text-blog mt-4']")
    private WebElement newsBlogLogo;

    public void blogLogoIsDisplayed() {
        Assert.assertTrue(newsBlogLogo.isDisplayed());
    }

    @FindBy(xpath = "//button[normalize-space()='Subscribe to our newsletter']")
    private WebElement subscribeButton;

    public void subscribeButtonIsDisplayed() {
        Assert.assertTrue(subscribeButton.isDisplayed());


    }

}
