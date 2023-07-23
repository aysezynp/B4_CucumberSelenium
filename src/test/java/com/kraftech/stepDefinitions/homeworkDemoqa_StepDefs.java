package com.kraftech.stepDefinitions;

import com.kraftech.pages.HomeworkPage;
import com.kraftech.utilities.BrowserUtils;
import com.kraftech.utilities.ConfigurationReader;
import com.kraftech.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.awt.*;
import java.util.List;

public class homeworkDemoqa_StepDefs {
    HomeworkPage homeworkPage=new HomeworkPage();

    @Given("The user is on the home page")
    public void the_user_is_on_the_home_page() {
        Driver.get().get("https://demoqa.com");

    }
    @Then("Validate that the user should be able to see following menu")
    public void validate_that_the_user_should_be_able_to_see_following_menu(List<String> menu) {
        System.out.println(menu);
        List<String>actualMenu= BrowserUtils.getElementsText(homeworkPage.menu);
        System.out.println(actualMenu);
        Assert.assertEquals(menu,actualMenu);
    }


}
