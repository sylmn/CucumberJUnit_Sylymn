package com.euroTech.step_definitions;

import com.euroTech.pages.DashboardPage;
import com.euroTech.pages.LoginPage;
import com.euroTech.utilities.BrowserUtils;
import com.euroTech.utilities.ConfigurationReader;
import com.euroTech.utilities.Driver;
import com.euroTech.utilities.ExcelUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Map;

public class Login_StepDefs {
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();

    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));
        //System.out.println("The user navigates to the login page");
    }

    @When("The user enters Hasan's credentials")
    public void the_user_enters_hasan_s_credentials() {
      /*  Driver.get().findElement(By.id("email")).sendKeys(ConfigurationReader.get("email"));
        Driver.get().findElement(By.id("yourPassword")).sendKeys(ConfigurationReader.get("password"));
        Driver.get().findElement(By.xpath("//button[text()='Login']")).click();
       */
        loginPage.login();
        // System.out.println("The user enters Hasan's valid credentials");
    }

    @Then("The user should be able to see dashboard page")
    public void the_user_should_be_able_to_see_dashboard_page() {
       /* String actualUsername = dashboardPage.userName.getText();
        String expectedUsername = ConfigurationReader.get("userName");
        Assert.assertEquals("İsimler aynı olmalıdır",expectedUsername, actualUsername);
        */
        dashboardPage.verifyUsername(ConfigurationReader.get("userName"));
        //System.out.println("The user enters the dashboard page");
    }

    @When("The user enters Leroy's credentials")
    public void the_user_enters_leroy_s_credentials() {
        //System.out.println("The user enters Leroy's valid credentials");
       /* Driver.get().findElement(By.id("email")).sendKeys(ConfigurationReader.get("email_leroy"));
        Driver.get().findElement(By.id("yourPassword")).sendKeys(ConfigurationReader.get("password_leroy"));
        Driver.get().findElement(By.xpath("//button[text()='Login']")).click();
        */
        loginPage.login(ConfigurationReader.get("email_leroy"), ConfigurationReader.get("password_leroy"));

    }

    @Then("The user should be able to see Solo's name on the dashboard page")
    public void the_user_should_be_able_to_see_solo_s_name_on_the_dashboard_page() {
       /* String actualUsername = Driver.get().findElement(By.tagName("h2")).getText();
        String expectedUsername = ConfigurationReader.get("userName_leroy");
        Assert.assertEquals("İsimler aynı olmalıdır",expectedUsername, actualUsername);
        */
        dashboardPage.verifyUsername(ConfigurationReader.get("userName_solo"));
        //System.out.println("The user enters the dashboard page");
    }


    @When("The user enters mike's credentials")
    public void the_user_enters_mike_s_credentials() {
        loginPage.login(ConfigurationReader.get("email_mike"), ConfigurationReader.get("password_mike"));

    }


    @Then("The user should be able to see mike's name on the dashboard page")
    public void the_user_should_be_able_to_see_mike_s_name_on_the_dashboard_page() {
        dashboardPage.verifyUsername(ConfigurationReader.get("userName_mike"));
    }


    @When("The user enters Rosa's credentials")
    public void the_user_enters_rosa_s_credentials() {
        loginPage.login(ConfigurationReader.get("email_rosa"), ConfigurationReader.get("password_rosa"));

    }

    @Then("The user should be able to see Rosa's name on the dashboard page")
    public void the_user_should_be_able_to_see_rosa_s_name_on_the_dashboard_page() {
        dashboardPage.verifyUsername(ConfigurationReader.get("userName_rosa"));
    }


    @When("The user enters Mansimmo's credentials")
    public void the_user_enters_mansimmo_s_credentials() {
        loginPage.login(ConfigurationReader.get("email_mansimmo"), ConfigurationReader.get("password_mansimmo"));

    }

    @Then("The user should be able to see Mansimmo's name on the dashboard page")
    public void the_user_should_be_able_to_see_mansimmo_s_name_on_the_dashboard_page() {
        dashboardPage.verifyUsername(ConfigurationReader.get("userName_mansimmo"));
    }

    @When("The user logins with {string} and {string}")
    public void the_user_logins_with_and(String email, String password) {
        loginPage.login(email, password);
    }

    @Then("The user should be able to see {string} on dashboard page")
    public void the_user_should_be_able_to_see_on_dashboard_page(String username) {
        dashboardPage.verifyUsername(username);
    }

    @Then("The number is {int}")
    public void the_number_is(Integer intNumber) {
        System.out.println(intNumber);
    }

    @Then("The number also is {double}")
    public void the_number_also_is(Double doubleNumber) {
        System.out.println(doubleNumber);
    }

    @Then("The number can be {double}")
    public void the_number_cam_be(double double1Number) {
        System.out.println(double1Number);
    }

    @When("The user login and verify with following credentials")
    public void the_user_login_and_verify_with_following_credentials(List<String> credentials) {
        loginPage.login(credentials.get(0), credentials.get(1));
        dashboardPage.verifyUsername(credentials.get(2));
    }

    @When("The user login and verify with following credentials map")
    public void the_user_login_and_verify_with_following_credentials_map(Map<String, String> credentialsMap) {
       loginPage.login(credentialsMap.get("user_email"), credentialsMap.get("password"));
       dashboardPage.verifyUsername(credentialsMap.get("user_name"));
    }

    @Then("The user should be able to see warning {string}")
    public void the_user_should_be_able_to_see_warning(String warningMessage) {
            loginPage.verifyWarningMessage(warningMessage);
    }

    @When("The user logins with using excel file: {string} and {string} and {int}")
    public void the_user_logins_with_using_excel_file_and_and(String path, String sheetName, int row) {
        List<Map<String, String>> excelData = BrowserUtils.getExcelDataToListOfMap(path, sheetName);

        String yourEmail = excelData.get(row).get("Your Email");
        String password = excelData.get(row).get("Password");
        loginPage.login(yourEmail, password);


    }
    @Then("The user verifies success login with excel file: {string} and {string} and {int}")
    public void the_user_verifies_success_login_with_excel_file_and_and(String path, String sheetName, int row) {
        List<Map<String, String>> excelData = BrowserUtils.getExcelDataToListOfMap(path, sheetName);
        String expectedUserName = excelData.get(row).get("Your Name");
        dashboardPage.verifyUsername(expectedUserName);
    }


    @When("The user logins with using excel file: {int}")
    public void the_user_logins_with_using_excel_file(int row) {
        List<Map<String, String>> excelData = BrowserUtils.getExcelDataToListOfMap(ConfigurationReader.get("excelPath"), ConfigurationReader.get("sheet"));
        String yourEmail = excelData.get(row).get("Your Email");
        String password = excelData.get(row).get("Password");
        loginPage.login(yourEmail, password);
    }
    @Then("The user verifies success login with excel file: {int}")
    public void the_user_verifies_success_login_with_excel_file(int row) {
        List<Map<String, String>> excelData = BrowserUtils.getExcelDataToListOfMap(ConfigurationReader.get("excelPath"), ConfigurationReader.get("sheet"));
        String expectedUserName = excelData.get(row).get("Your Name");
        dashboardPage.verifyUsername(expectedUserName);
    }

    @When("The user logins with using excel file: {string} and {string} and makes verify")
    public void the_user_logins_with_using_excel_file_and_and_makes_verify(String path, String sheetName) {
        List<Map<String, String>> excelData = BrowserUtils.getExcelDataToListOfMap(path, sheetName);
        int rowCount = excelData.size();

        for (int i = 0; i < rowCount; i++) {
            String yourEmail = excelData.get(i).get("Your Email");
            String password = excelData.get(i).get("Password");
            loginPage.login(yourEmail, password);

            String expectedUserName = excelData.get(i).get("Your Name");
            dashboardPage.verifyUsername(expectedUserName);

            dashboardPage.navigateToTabs(expectedUserName, "Sign Out");

            loginPage.getLoginLink().click();

        }
    }

}
