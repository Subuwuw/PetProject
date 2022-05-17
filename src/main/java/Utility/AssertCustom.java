package Utility;

import Page.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AssertCustom {
    WebDriver driver;

    public AssertCustom(WebDriver driver) {
        this.driver = driver;
    }

    /**
     *
     * @
     * @ Equals actual result with expected result who a searching by xpath and get Attribute innerText
     * @
     */
    public AssertCustom assertAttributeInnerText(String actual, String ExpResByXpath){
        Assertions.assertEquals(actual,driver.findElement(By.xpath(ExpResByXpath)).getAttribute("innerText"));
        return this;
    }
    public AssertCustom assertAttributeInnerText(String actual, String ExpResByXpath,String message){
        Assertions.assertEquals(actual,driver.findElement(By.xpath(ExpResByXpath)).getAttribute("innerText"),message);
        return this;
    }
    /**
     * @
     * @------------------------------------------------------------------------------------------------
     * @
     */

    public AssertCustom assertNotSelected(String xpath){
        Assertions.assertFalse(driver.findElement(By.xpath(xpath)).isSelected(),"Element must not be selected");
        return this;
    }
    public AssertCustom assertIsSelectedByXpath(String xpath){
        Assertions.assertTrue(driver.findElement(By.xpath(xpath)).isSelected(),"Element must be selected");
        return this;
    }
}
