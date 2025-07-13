package stepdefinitions;

import Pages.loginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class loginpageStepdefinition {
    loginPage lp=new loginPage();
    @Given("user is on the login page")
    public void userIsOnTheLoginPage()
    {
        Assert.assertTrue(lp.verifytitle().equalsIgnoreCase("OrangeHRM"),"Title is not matching");
    }

    @When("the user tries to login the application with {string} and {string}")
    public void theUserTriesToLoginTheApplicationWithAnd(String username, String password) throws InterruptedException {
        lp.performLogin(username, password);
    }

    @Then("the user should successfully login to the application")
    public void theUserShouldSuccessfullyLoginToTheApplication() {
    }


}
