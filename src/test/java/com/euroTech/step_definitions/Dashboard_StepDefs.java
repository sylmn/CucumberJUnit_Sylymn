package com.euroTech.step_definitions;

import com.euroTech.pages.DashboardPage;
import com.euroTech.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Dashboard_StepDefs {

    DashboardPage dashboardPage=new DashboardPage();
    LoginPage loginPage=new LoginPage();

    @When("The user clicks on Developers link")
    public void the_user_clicks_on_developers_link() {
        loginPage.navigateToTabs("Developers");
        dashboardPage.navigateToTabs("Developers");

       // System.out.println("The user clicks on Developers link");
    }

    @Then("The user should be able to see developers' page title")
    public void the_user_should_be_able_to_see_developers_page_title() {
      //  System.out.println("The user should be able to see developers' page title");
    }
}
