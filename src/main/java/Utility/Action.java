package Utility;

import Page.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.time.Duration.ofSeconds;

public class Action {
    WebDriver driver;

    public Action(WebDriver driver) {this.driver = driver;}


    public Action typeFieldByXpath(String element, String sometext){
        driver.findElement(By.xpath(element)).sendKeys(sometext);
        return this;
    }

    public Action clickByXpath(String element){
        driver.findElement(By.xpath(element)).click();
        return this;
    }

    public Action waitElementVisibil(String xpath){
       new WebDriverWait(driver,Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(xpath))));
       return this;
    }
}
