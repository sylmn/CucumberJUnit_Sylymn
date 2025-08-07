package com.euroTech.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefs {
    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("The user navigates to the login page");
    }
    @When("The user enters Hasan's credentials")
    public void the_user_enters_hasan_s_credentials() {
        System.out.println("The user enters Hasan's valid credentials");
    }
    @Then("The user should be able to see dashboard page")
    public void the_user_should_be_able_to_see_dashboard_page() {
        System.out.println("The user enters the dashboard page");
    }
    @When("The user enters Leroy's credentials")
    public void the_user_enters_leroy_s_credentials() {
        System.out.println("The user enters Leroy's valid credentials");
    }

    @When("The user enters mike's credentials")
    public void the_user_enters_mike_s_credentials() {
        System.out.println("The user enters mike's valid credentials");
    }

}
