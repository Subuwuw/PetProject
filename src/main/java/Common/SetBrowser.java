package Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

import static Constants.Constant.BROWSER_TYPE;

public class SetBrowser {

    public static WebDriver CreateDriver(){
        WebDriver driver = null;

        switch (BROWSER_TYPE) {
            case "Chrome":
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case "Firefox":
                System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
                driver = new FirefoxDriver();

            default:
                System.out.println("driver = is null, Please choose BROWSER_TYPE in Constant.Java");
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

        return driver;
    }
}
