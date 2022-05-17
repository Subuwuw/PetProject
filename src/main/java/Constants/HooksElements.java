package Constants;

public class HooksElements {

    /**
     * Elements for Text Box
     */
    public static final String FULLname = "//input[@id='userName']";
    public static final String EMAIL = "//input[@id='userEmail']";
    public static final String CURRENtAdress = "//textarea[@id='currentAddress']";
    public static final String PERMANENtAdress = "//textarea[@id='permanentAddress']";
    public static final String BUTTON = "//button[@id='submit']";
    //result of element
    public static final String ResulName = "//p[@id='name']";
    public static final String ResulEmail = "//p[@id='email']";
    public static final String ResulCurrentAdrs = "//p[@id='currentAddress']";
    public static final String ResulPermanAdrs = "//p[@id='permanentAddress']";

    /**
     * ---------------------
     */

    /**
     * Elements for Check Box
     */
    public static final String COLLAPSE_HOME = "(//button[@class='rct-collapse rct-collapse-btn'])[1]";
    public static final String COLLAPSE_Desktop = "(//button[@class='rct-collapse rct-collapse-btn'])[2]";
    public static final String COLLAPSE_Documents = "(//button[@class='rct-collapse rct-collapse-btn'])[3]";
    public static final String COLLAPSE_WorkSpace = "(//button[@class='rct-collapse rct-collapse-btn'])[4]";
    public static final String COLLAPSE_Office = "(//button[@class='rct-collapse rct-collapse-btn'])[5]";
    public static final String COLLAPSE_Downloads = "(//button[@class='rct-collapse rct-collapse-btn'])[6]";
    //radio-check
    public static final String Expand_ALL = "//button[@title='Expand all']";
    /**
     * ---------------------
     */

    /**
     * Radio Buttton
     */
    public static final String INPUT_YES = "//input[@id='yesRadio']";
    public static final String RADIO_YES = "//label[normalize-space()='Yes']";
    public static final String INPUT_Impressive = "//input[@id='impressiveRadio']";
    public static final String RADIO_Impressive = "//label[normalize-space()='Impressive']";
    public static final String INPUT_No = "//input[@id='noRadio']";
    public static final String RADIO_No = "//label[normalize-space()='No']";
    // msg: You have selected :
    public static final String Result_Text = "//span[@class='text-success']";

    /**
     * Web Tables
     */
    public static final String ADD_NEW = "//button[@id='addNewRecordButton']";
    public static final String FIELD_Search = "//input[@id='searchBox']";

    public static final String FIELD_TABLE_first = "(//div[@class='rt-tr-group'])[1]";
    public static final String FIELD_TABLE_secound = "(//div[@class='rt-tr-group'])[2]";
    public static final String FIELD_TABLE_third = "(//div[@class='rt-tr-group'])[3]";

    public static final String FILD_ACTION_EDIT = "//span[@id='edit-record-1']";
    public static final String FILD_ACTION_EDIT2 = "//span[@id='edit-record-2']";
    public static final String FILD_ACTION_EDIT3 = "//span[@id='edit-record-3']";

    public static final String FILD_ACTION_DEL = "//span[@id='delete-record-1']";
    public static final String FILD_ACTION_DEL2 = "//span[@id='delete-record-2']";
    public static final String FILD_ACTION_DEL3 = "//span[@id='delete-record-3']";


}
