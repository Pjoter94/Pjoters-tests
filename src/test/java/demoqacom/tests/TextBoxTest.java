package demoqacom.tests;

import demoqacom.pages.ElementsPage;
import demoqacom.pages.HomePage;
import demoqacom.pages.TextBoxPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TextBoxTest extends BaseTest{

    private String fullName = "John Doe";
    private String email = "mail@mail.come";
    private String currentAddress = "John Doe";
    private String permanentAddress = "";

    @Test
    public void basicTextBoxTest(){
        WebDriver driver = getDriver();
        HomePage homePage = new HomePage(driver);
        ElementsPage elementsPage = homePage.initElementsPage();
        log.info("Click on 'Elements'");
        TextBoxPage textBoxPage = elementsPage.selectTextBox();
        log.info("Click on 'TextBox'");
        textBoxPage.insertFullName(fullName);
        log.info("Insert 'fullName'");
        textBoxPage.insertEmail(email);
        log.info("Insert 'email'");
        textBoxPage.insertCurrentAddress(currentAddress);
        log.info("Insert 'current address'");
        textBoxPage.insertPermanentAddress(permanentAddress);
        log.info("Insert 'permanent address'");
        textBoxPage.clickSubmit();
        log.info("Click on submit button");
    }


}
