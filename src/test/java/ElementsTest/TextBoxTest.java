package ElementsTest;

import Base.BaseTest;
import com.github.javafaker.Faker;
import org.testng.annotations.Test;

import static Constants.HooksElements.*;
import static Constants.Urls.TEXTBOX;

public class TextBoxTest extends BaseTest {
    static Faker faker = new Faker();
    static private final String StaticFullname = faker.name().fullName();
    static private final String StaticEmail = faker.internet().emailAddress();
    static private final String StaticAdress = faker.address().fullAddress();

    static private final String AssertFullName = "Name:"+StaticFullname;
    static private final String AssertEmail = "Email:"+StaticEmail;
    static private final String AssertCurrentAdrs = "Current Address :"+StaticAdress;
    static private final String AssertPermAdrs = "Permananet Address :"+StaticAdress;


    @Test(description = "Проверка отправленных, заполненных полей.")
    public static void CheckTextBox(){
    basePage.GoTo(TEXTBOX);
    action
            .typeFieldByXpath(FULLname,StaticFullname)
            .typeFieldByXpath(EMAIL,StaticEmail)
            .typeFieldByXpath(CURRENtAdress,StaticAdress)
            .typeFieldByXpath(PERMANENtAdress,StaticAdress)
            .clickByXpath(BUTTON);
    assertCustom.assertAttributeInnerText(AssertFullName,ResulName);
    assertCustom.assertAttributeInnerText(AssertEmail,ResulEmail);
    assertCustom.assertAttributeInnerText(AssertCurrentAdrs,ResulCurrentAdrs);
    assertCustom.assertAttributeInnerText(AssertPermAdrs,ResulPermanAdrs);
    }


}
