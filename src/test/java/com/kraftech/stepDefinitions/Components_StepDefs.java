package com.kraftech.stepDefinitions;

import com.kraftech.pages.ComponentsPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class Components_StepDefs {
    ComponentsPage components=new ComponentsPage();

    @Then("Validate that {string} and {string} and {string}")
    public void validate_that_and_and(String expected1, String expected2, String expected3) {
        String actual1=components.getHomeBtnText();
        String actual2=components.getDashBoardText();
        String actual3=components.getTitle3Text();

        Assert.assertEquals(expected1,actual1);
        Assert.assertEquals(expected2,actual2);
        Assert.assertEquals(expected3,actual3);
    }

}
