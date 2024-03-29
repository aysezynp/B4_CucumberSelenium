package com.kraftech.pages;

import com.kraftech.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class DashboardPage extends BasePage {

@FindBy(xpath ="//li[@class='breadcrumb-item'][2]")
    public WebElement dashboard;

@FindBy(xpath = "(//span[@class='afm'])[1]")
public WebElement dasboardLink;

@FindBy(xpath = "//div[@id='profile-overview']//div[@class='col-lg-9 col-md-8']")
    public List<WebElement> profileDetails;


public String getProfilDetails (String details){
   return Driver.get().findElement(By.xpath("//div[text()='"+details+"']")).getText();

}

}