package com.kraftech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.util.List;


public class HomeworkPage extends BasePage{

    @FindBy(xpath = "//h5")
    public List<WebElement>menu;
}
