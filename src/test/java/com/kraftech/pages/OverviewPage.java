package com.kraftech.pages;

import com.kraftech.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OverviewPage extends BasePage{


    public String controlOverviewTableCell(String target){
       WebElement tdName= Driver.get().findElement(By.xpath("//tbody//td[.='"+target+"']"));
       return tdName.getText();
    }
}
