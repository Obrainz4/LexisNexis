package co.uk.LexisNexis.stepDefinitions;

import co.uk.LexisNexis.pages.BasePage;
import co.uk.LexisNexis.pages.LexisHomePage;
import co.uk.LexisNexis.pages.NewsInsightPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class LexisNexisSteps extends BasePage {

    LexisHomePage LexisHomePage = PageFactory.initElements(driver, co.uk.LexisNexis.pages.LexisHomePage.class);

    NewsInsightPage NewsInsightPage = PageFactory.initElements(driver, co.uk.LexisNexis.pages.NewsInsightPage.class);

    @Given("User is on the LexisNexis.co.uk homepage")
    public void user_is_on_the_lexis_nexis_co_uk_homepage() throws InterruptedException {
    launchUrl();
        Thread.sleep(2000);
        LexisHomePage.clickAcceptAllCookie();
    }

    @When("user opens the site")
    public void user_opens_the_site() throws InterruptedException {

    }

    @Then("the user should see the LexisNexis logo and the search bar")
    public void the_user_should_see_the_lexis_nexis_logo_and_the_search_bar() {
    LexisHomePage.LexisNexisLogoIsVisible();
    }

    @When("User enters {string} in the search bar")
    public void user_enters_in_the_search_bar(String search) throws InterruptedException {
    Thread.sleep(2000);
    LexisHomePage.clickNoNotification();
    Thread.sleep(2000);
    LexisHomePage.enterSearchWord(search);

    }

    @When("User clicks on the search button")
    public void user_clicks_on_the_search_button() throws InterruptedException {
    Thread.sleep(2000);
    LexisHomePage.clickSearchButton();
    }

    @Then("Search results related to legal research should be displayed")
    public void search_results_related_to_legal_research_should_be_displayed() throws InterruptedException {
        Thread.sleep(2000);
        LexisHomePage.clickOnLexisResearch();
        Thread.sleep(2000);
        LexisHomePage.legalNewsIsDisplayed();
        LexisHomePage.legalGlossaryIsDisplayed();
        LexisHomePage.legislationIsDisplayed();
    }

    @When("User clicks on the News & Insights section")
    public void user_clicks_on_the_news_insights_section() throws InterruptedException {
        Thread.sleep(2000);
    NewsInsightPage.clickNewsInsightMenu();
        Thread.sleep(1000);
    NewsInsightPage.clickNewsDesk();
    }

    @Then("User should be redirected to the News page")
    public void user_should_be_redirected_to_the_news_page() throws InterruptedException {
        NewsInsightPage.blogLogoIsDisplayed();
        Thread.sleep(1000);

    }

    @Then("User should see latest news articles")
    public void user_should_see_latest_news_articles() {
        NewsInsightPage.subscribeButtonIsDisplayed();
    }



    @When("User clicks on the Product Sign In button")
    public void user_clicks_on_the_product_sign_in_button() {

    }

    @Then("User should be directed to the Login page")
    public void user_should_be_directed_to_the_login_page() {

    }

    @Then("User should be able to log in with valid credentials")
    public void user_should_be_able_to_log_in_with_valid_credentials() {

    }

    @When("User explores the Tax Solutions section")
    public void user_explores_the_tax_solutions_section() {

    }

    @Then("User should find a variety of Tax documents and Guidance")
    public void user_should_find_a_variety_of_tax_documents_and_guidance() {

    }

    @When("User clicks on the Contact Us link")
    public void user_clicks_on_the_contact_us_link() {

    }

    @Then("User should be directed to the Contact page")
    public void user_should_be_directed_to_the_contact_page() {

    }

    @Then("User should find contact details to reach LexisNexis support")
    public void user_should_find_contact_details_to_reach_lexis_nexis_support() {

    }

}
