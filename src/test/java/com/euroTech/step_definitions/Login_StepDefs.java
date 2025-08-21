package com.euroTech.step_definitions;

import com.euroTech.pages.DashboardPage;
import com.euroTech.pages.LoginPage;
import com.euroTech.utilities.ConfigurationReader;
import com.euroTech.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class Login_StepDefs {
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();

    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));
        //System.out.println("The user navigates to the login page");
    }

    @When("The user enters Solo's credentials")
    public void the_user_enters_solo_s_credentials() {
        /*Driver.get().findElement(By.id("email")).sendKeys(ConfigurationReader.get("email"));
        Driver.get().findElement(By.id("yourPassword")).sendKeys(ConfigurationReader.get("password"));
        Driver.get().findElement(By.xpath("//button[text()='Login']")).click();
         */
        loginPage.login();
        //System.out.println("The user enters the Solo's credentials");
    }

    @Then("The user should be able to see dashboard page")
    public void the_user_should_be_able_to_see_dashboard_page() {
        /*String actualUserName = dashboardPage.userName.getText();
        String expectedUserName = ConfigurationReader.get("userName");
        Assert.assertEquals("Isimler ayni olmalidir", expectedUserName, actualUserName);
        */
        dashboardPage.verifyUserName(ConfigurationReader.get("userName"));
        //System.out.println("The user enters dashboard page");
    }

    @When("The user enters User11's credentials")
    public void the_user_enters_user11_s_credentials() {
        /*Driver.get().findElement(By.id("email")).sendKeys(ConfigurationReader.get("email_user11"));
        Driver.get().findElement(By.id("yourPassword")).sendKeys(ConfigurationReader.get("password_user11"));
        Driver.get().findElement(By.xpath("//button[text()='Login']")).click();
         */
        loginPage.login(ConfigurationReader.get("email_user11"), ConfigurationReader.get("password_user11"));
        System.out.println("email_user11 = " + ConfigurationReader.get("email_user11"));
        System.out.println("password_user11 = " + ConfigurationReader.get("password_user11"));
        //System.out.println("The user enters the User11's credentials");
    }

    @Then("The user should be able to see User11's name on the dashboard page")
    public void the_user_should_be_able_to_see_user11_s_name_on_the_dashboard_page() {
        /*String actualUserName = Driver.get().findElement(By.tagName("h2")).getText();
        String expectedUserName = ConfigurationReader.get("userName_user11");
        Assert.assertEquals("Isimler ayni olmalidir", expectedUserName, actualUserName);
         */
        dashboardPage.verifyUserName(ConfigurationReader.get("userName_user11"));
    }

    @When("The user enters mike's credentials")
    public void the_user_enters_mike_s_credentials() {
        loginPage.login(ConfigurationReader.get("email_mike"), ConfigurationReader.get("password_mike"));
        //System.out.println("The user enters the mike's credentials");
    }

    @Then("The user should be able to see mike's name on the dashboard page")
    public void the_user_should_be_able_to_see_mike_s_name_on_the_dashboard_page() {
        dashboardPage.verifyUserName(ConfigurationReader.get("userName_mike"));
    }

    @When("The user enters Rosa's credentials")
    public void the_user_enters_rosa_s_credentials() {
        loginPage.login(ConfigurationReader.get("email_rosa"), ConfigurationReader.get("password_rosa"));
        //System.out.println("The user enters the Rosa's credentials");
    }

    @Then("The user should be able to see Rosa's page on the dashboard page")
    public void the_user_should_be_able_to_see_rosa_s_page_on_the_dashboard_page() {
        dashboardPage.verifyUserName(ConfigurationReader.get("userName_rosa"));
    }

    @When("The user enters Mansimmo's credentials")
    public void the_user_enters_mansimmo_s_credentials() {
        loginPage.login(ConfigurationReader.get("email_mansimo"), ConfigurationReader.get("password_mansimo"));
        // System.out.println("The user enters the Mansimmo's credentials");
    }

    @Then("The user should be able to see Mansimo's page on the dashboard page")
    public void the_user_should_be_able_to_see_mansimo_s_page_on_the_dashboard_page() {
        dashboardPage.verifyUserName(ConfigurationReader.get("userName_mansimo"));
    }
}
