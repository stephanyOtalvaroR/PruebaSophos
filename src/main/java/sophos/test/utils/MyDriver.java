package sophos.test.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MyDriver {
    private static WebDriver driver;

    public static MyDriver aChromeDriver() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito", "--start-maximized", "--disable-infobars");
        driver = new ChromeDriver(options);
        return new MyDriver();
    }

    public WebDriver inTheWebPage(String url) {
        driver.get(url);
        return driver;
    }
}
