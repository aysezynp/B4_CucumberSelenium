package com.kraftech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComponentsPage extends BasePage{

    @FindBy (xpath = "//a[.='Home']")
    public WebElement homeButton;

    @FindBy (xpath = "//li[text()='Components']")
    public WebElement dashBoardText;

    @FindBy(css = "main#main li:nth-of-type(3)")
    public WebElement title3;

    public String getHomeBtnText(){
        return homeButton.getText();
    }

    public String getDashBoardText(){
        return dashBoardText.getText();
    }

    public String getTitle3Text(){
        return title3.getText();

    }
}
