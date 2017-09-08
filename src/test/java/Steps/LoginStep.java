package Steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginStep {
    @Given("^I navigate to login page$")
    public void iNavigateToLoginPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @And("^I click login button$")
    public void iClickLoginButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^i should see userform page$")
    public void iShouldSeeUserformPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @And("^I enter the username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void iEnterTheUsernameAsAndPasswordAs(String userName, String password) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }
}
