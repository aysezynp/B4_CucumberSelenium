package com.kraftech.pages;

import com.kraftech.utilities.ConfigurationReader;
import com.kraftech.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class LoginPage extends BasePage {

    public LoginPage (){
       super();//Base Page'deki constructor ı çağırır.
       // PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(css="#email")
    public WebElement emailInputBox;

    @FindBy(css="#yourPassword")
    public WebElement passwordInputBox;

    @FindBy(xpath="//*[.='Login']")
    public WebElement loginButton;

    @FindBy(xpath = "//div[contains(text(),'incorrect')]")
    public WebElement passwordErrorMessage;

    @FindBy(xpath = "//div[contains(text(),'incorrect')]")
    public WebElement userEmailErrorMessage;

    //AND logic
    @FindBys({
            @FindBy(css="#email"),
            @FindBy(name="email")
    })
    public WebElement emailInputBoxWithFinBys;

    //OR logic
    @FindAll({
            @FindBy(id="email"),
            @FindBy(name="another")
    })
    public WebElement emailInputBoxFİndAll;


    public void login(String userEmail,String password){
        emailInputBox.sendKeys(userEmail);
        passwordInputBox.sendKeys(password);
        loginButton.click();

    }
    //method Overloading
    public void login() {
        emailInputBox.sendKeys(ConfigurationReader.get("userEmail"));
        passwordInputBox.sendKeys(ConfigurationReader.get("userPassword"));
        loginButton.click();
    }

    public String getWarningMessageText(String message){
        return Driver.get().findElement(By.xpath("//div[contains(text(),'"+message+"')]")).getText();

    }
}
