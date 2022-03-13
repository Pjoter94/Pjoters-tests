package com.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElementsPage extends BasePage {

    @FindBy(xpath = "(//div[@class='header-right'])[1]")
    private WebElement menu_arrow;

    @FindBy(xpath = "(//li[@id='item-0'])[1]")
    private WebElement text_box_menu;

    @FindBy(xpath = "(//li[@id='item-1'])[1]")
    private WebElement check_box_menu;

    @FindBy(xpath = "(//li[@id='item-2'])[1]")
    private WebElement radio_button_menu;

    @FindBy(xpath = "(//li[@id='item-3'])[1]")
    private WebElement web_tables_menu;

    @FindBy(xpath = "(//li[@id='item-4'])[1]]")
    private WebElement buttons_menu;

    @FindBy(xpath = "(//li[@id='item-5'])[1]")
    private WebElement links_menu;

    @FindBy(xpath = "(//li[@id='item-6'])[1]]")
    private WebElement broken_links_menu;

    @FindBy(xpath = "(//li[@id='item-7'])[1]")
    private WebElement upload_download_menu;

    @FindBy(xpath = "(//li[@id='item-8'])[1]")
    private WebElement dynamic_properties_menu;


    public ElementsPage(WebDriver driver) {
        super(driver);
    }

    public void selectTextBox(){
        menu_arrow.click();
        text_box_menu.click();
    }


}
