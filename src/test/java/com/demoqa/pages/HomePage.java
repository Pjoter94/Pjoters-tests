package com.demoqa.pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    @FindBy(xpath = "//h5[contains(text(),'Elements')]")
    private WebElement elements;

    @FindBy(xpath = "//h5[contains(text(),'Forms')]")
    private WebElement forms;

    @FindBy(xpath = "//h5[contains(text(),'Alerts, Frame & Windows')]")
    private WebElement alerts;

    @FindBy(xpath = "//h5[contains(text(),'Widgets')]")
    private WebElement widgets;

    @FindBy(xpath = "//h5[contains(text(),'Interactions')]")
    private WebElement interactions;

    @FindBy(xpath = "//h5[contains(text(),'Book Store Application')]")
    private WebElement book_store;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public ElementsPage clickOnElements() {
        elements.click();
        return new ElementsPage(driver);
    }


}
