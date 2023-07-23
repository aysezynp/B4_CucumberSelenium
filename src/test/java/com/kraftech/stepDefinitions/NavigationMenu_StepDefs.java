package com.kraftech.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NavigationMenu_StepDefs {
    @When("Login as Mike")
    public void login_as_mike() {
        System.out.println("Login as Mike");
    }

    @Then("Validate that Dashboard text is visible")
    public void validate_that_dashboard_text_is_visible() {
        System.out.println("Validate that dashboard is visible");
    }

    @When("Go to developers menu")
    public void go_to_developers_menu() {
        System.out.println("Go to developers menu");

    }
    @When("Validate that Developers text is visible")
    public void validate_that_developers_text_is_visible() {
        System.out.println("validate that the developers text is visible");
    }

    @When("Login as Sebastian")
    public void login_as_sebastian() {
        System.out.println("Login as Sebastian");
    }

    @When("Go to forms-input menu")
    public void go_to_forms_input_menu() {
        System.out.println("Go to forms/input menu");
    }

    @When("Validate that General Form Elements - Input text is visible")
    public void validate_that_general_form_elements_ınput_text_is_visible() {
        System.out.println("Validate that General Form Elements / Input text is visible");
    }

    @When("Login as John")
    public void login_as_john() {
        System.out.println("Login as John");
    }
    @When("Go to my profile menu")
    public void go_to_my_profile_menu() {
        System.out.println("Go to my profile menu");

    }
    @When("Validate that User Profile text is visible")
    public void validate_that_my_profile_text_is_visible() {
        System.out.println("Validate that User Profile text is visible");

    }


}
