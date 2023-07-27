package com.kraftech.stepDefinitions;

import com.kraftech.pages.DashboardPage;
import com.kraftech.pages.EditProfilePage;
import com.kraftech.pages.UserProfilePage;
import com.kraftech.utilities.BrowserUtils;
import com.kraftech.utilities.Driver;
import io.cucumber.java.an.E;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import java.util.List;
import java.util.Map;

public class UserProfile_StepDefs {
    UserProfilePage userProfilePage = new UserProfilePage();
    EditProfilePage editProfilePage = new EditProfilePage();
    DashboardPage dashboardPage=new DashboardPage();


    @Then("The user should be able to see following submenu")
    public void the_user_should_be_able_to_see_following_submenu(List<String> submenu) {
        List<String> actualSubMenu = BrowserUtils.getElementsText(userProfilePage.tabList);
        System.out.println(submenu);
        System.out.println(actualSubMenu);
        Assert.assertEquals(submenu, actualSubMenu);

    }

    @When("The user navigates to {string}")
    public void the_user_navigates_to(String subMenu) {
        userProfilePage.navigateToOverViewMenu(subMenu);
        BrowserUtils.waitFor(2);
    }

    @When("The user adds {string} {string}")
    public void the_user_adds(String profileBox, String userInfo) {
        editProfilePage.editProfileInfo(profileBox, userInfo);
        BrowserUtils.waitFor(2);
    }

    @When("The user select {string} from menu")
    public void the_user_select_from_menu(String job) {
        editProfilePage.selectJob(job);
        JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
        jse.executeScript("window.scrollBy(0,1000);");
    }

    @When("The user clicks on save changes button")
    public void the_user_clicks_on_save_changes_button() {
        editProfilePage.saveChangeBtn.click();
    }



    @When("The user clicks on Dashboard button")
    public void the_user_clicks_on_dashboard_button() {
        dashboardPage.dasboardLink.click();
        BrowserUtils.waitFor(2);
    }

    @Then("The user should be able to see following profileDetails")
    public void the_user_should_be_able_to_see_following_profile_details(List<String>expectedProfileDetails) {
        List<String>actualProfileDetails=BrowserUtils.getElementsText(dashboardPage.profileDetails);
        Assert.assertEquals(expectedProfileDetails,actualProfileDetails);
    }

}