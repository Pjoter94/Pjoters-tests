package demoqacom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TextBoxPage extends BasePage {

    /* TextBox page webelements */

    @FindBy(id = "userName")
    private WebElement full_name_text;

    @FindBy(id = "userEmail")
    private WebElement email_text;

    @FindBy(id = "currentAddress")
    private WebElement current_address_text;

    @FindBy(id = "permanentAddress")
    private WebElement permanent_address_text;

    @FindBy(id = "submit")
    private WebElement submit_button;

    @FindBy(id = "name")
    private WebElement result_name;

    @FindBy(id = "email")
    private WebElement result_email;

    @FindBy(id = "(//p[@id='currentAddress'])[1]")
    private WebElement current_address_result;

    @FindBy(id = "(//p[@id='permanentAddress'])[1]")
    private WebElement permanent_address_result;

    public TextBoxPage(WebDriver driver) {
        super(driver);
    }

    public void insertFullName(String full_name) {
        waitForElementToAppear(full_name_text);
        full_name_text.sendKeys(full_name);
    }

    public void insertEmail(String email) {
        waitForElementToAppear(email_text);
        full_name_text.sendKeys(email);
    }

    public void insertCurrentAddress(String current_address) {
        waitForElementToAppear(current_address_text);
        full_name_text.sendKeys(current_address);
    }

    public void clickSubmit() {
        submit_button.click();
    }

    public String getResultName() {
        waitForElementToAppear(result_name);
        return result_name.getText();
    }

    public String getResultEmail() {
        waitForElementToAppear(result_email);
        return result_email.getText();
    }

    public String getCurrentAddressResult() {
        waitForElementToAppear(current_address_result);
        return current_address_result.getText();
    }

    public String getPermanentAddressResult() {
        waitForElementToAppear(permanent_address_result);
        return permanent_address_result.getText();
    }

}
