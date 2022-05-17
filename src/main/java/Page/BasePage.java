package Page;


import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class BasePage {

    WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void GoTo(String URL){
        driver.get(URL);
    }

    /**
     *              Общие, частоиспользуемые методы
     *
     */




}
