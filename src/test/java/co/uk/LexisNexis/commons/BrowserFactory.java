package co.uk.LexisNexis.commons;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static java.time.Duration.ofSeconds;

public class BrowserFactory extends DriverFactory{

    private WebDriver launchChrome(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        return new ChromeDriver();
    }

    private WebDriver launchFirefox(){
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }

    private WebDriver launchEdge(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/msedgedriver.exe");
        return new EdgeDriver();
    }

    private WebDriver launchHeadlessChrome(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-gpu","--headless");
        return new ChromeDriver(options);
    }



    public void launchBrowser(String browser){
        if (browser.equals("Chrome")){
            driver = launchChrome();
        } else if (browser.equals("Firefox")) {
            driver = launchFirefox();
        } else if (browser.equals("Edge")) {
            driver = launchEdge();
        } else if (browser.equals("HeadlessChrome")) {
            driver = launchHeadlessChrome();
        } else {
            driver = launchChrome();
        }

        driver.manage().timeouts().implicitlyWait(ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(ofSeconds(30));
        driver.manage().window().maximize();

    }

    public void closeBrowser(){
        driver.manage().deleteAllCookies();
        driver.close();
        driver.quit();
    }

}
