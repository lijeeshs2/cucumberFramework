package stepdefinitions;

import Pages.AdminPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class AdminStepDefinitions
{
    AdminPage adminPage=new AdminPage();
    @And("user navigate to the admin page")
    public void userNavigateToTheAdminPage() {
        adminPage.NavigateToAdminPage();
    }

    @And("user searches for a user with {string}")
    public void userSearchesForAUserWith(String arg0) {
    }

    @Then("user should see the details of the user")
    public void userShouldSeeTheDetailsOfTheUser() {
    }
}
