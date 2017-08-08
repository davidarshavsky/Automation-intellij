import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by davida on 07/08/2017.
 */
public class initBrowser {
    public static WebDriver driver;

    public static void start() {
        System.setProperty("webdriver.chrome.driver", "/Users/davida/IdeaProjects/CasinoWeb/src/test/java/chromedriver/chromedriver");
        driver = new ChromeDriver();
        //driver.navigate().to("http://www.google.com");
    }

    public static void stop() {
        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }
}
