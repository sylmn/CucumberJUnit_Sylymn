package com.euroTech.step_definitions;

import com.euroTech.pages.DashboardPage;
import com.euroTech.pages.DevelopersPage;
import com.euroTech.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Dashboard_StepDefs {

    DashboardPage dashboardPage = new DashboardPage();
    DevelopersPage developersPage = new DevelopersPage();

    @When("The user clicks on Developers link")
    public void the_user_clicks_on_developers_link() {
        dashboardPage.navigateToTabs("Developers");
    }

    @Then("The user should be able to see developers' page title")
    public void the_user_should_be_able_to_see_developers_page_title() {

        /* String actualTitle = developersPage.getPageTitle();
        String expectedTitle = "Developers";
        Assert.assertEquals(expectedTitle, actualTitle);
        */

        developersPage.verifyPageTitle("Developers");
    }
}
