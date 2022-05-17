package Base;

import Common.SetBrowser;
import Page.BasePage;
import Utility.Action;
import Utility.AssertCustom;
import org.openqa.selenium.WebDriver;

public class BaseTest {

    protected static WebDriver driver = SetBrowser.CreateDriver();
    protected static BasePage basePage = new BasePage(driver);
    protected static AssertCustom assertCustom = new AssertCustom(driver);
    protected static Action action = new Action(driver);

}
