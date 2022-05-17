package ElementsTest;

import Base.BaseTest;
import Utility.Action;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static Constants.HooksElements.*;
import static Constants.Urls.RADIOBTN;

public class RadioButtonTest extends BaseTest {

    @Test
    public void RadioButton() {
        basePage.GoTo(RADIOBTN);
        action.clickByXpath(RADIO_YES);
        assertCustom
                .assertAttributeInnerText("Yes", RADIO_YES,"After Pressed to the radio-button showed text 'Yes' ")
                .assertIsSelectedByXpath(INPUT_YES);

        action.clickByXpath(RADIO_Impressive);
        assertCustom
                .assertAttributeInnerText("Impressive", RADIO_Impressive)
                .assertIsSelectedByXpath(INPUT_Impressive);
        action.clickByXpath(RADIO_No);
        assertCustom.assertNotSelected(INPUT_No);
    }
}
