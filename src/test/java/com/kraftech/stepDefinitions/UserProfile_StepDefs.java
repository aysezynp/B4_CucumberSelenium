package com.kraftech.stepDefinitions;

import com.kraftech.pages.DashboardPage;
import com.kraftech.pages.UserProfilePage;
import com.kraftech.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class UserProfile_StepDefs {
    UserProfilePage userProfilePage=new UserProfilePage();
    @Then("The user should be able to see following submenu")
    public void the_user_should_be_able_to_see_following_submenu(List<String> submenu) {
       List<String>actualSubMenu=BrowserUtils.getElementsText(userProfilePage.tabList);
        System.out.println(submenu);
        System.out.println(actualSubMenu);
       Assert.assertEquals(submenu,actualSubMenu);

    }
}
