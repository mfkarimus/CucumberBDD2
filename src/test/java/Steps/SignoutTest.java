package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignoutTest {

    @Given("User already in facebook account page")
    public void user_already_in_facebook_account_page() {
        System.out.println("This is Given for Signout test already in facebook account page");
    }
    @When("I click in Signout")
    public void i_click_in_signout() {
        System.out.println("This is When for Signout test And click in Signout");
    }
    @Then("user should be signout successfully")
    public void user_should_be_signout_successfully() {
        System.out.println("This is Then for Signout test and signout successfully ");
    }

    @Then("user click signout and not working")
    public void user_click_signout_and_not_working() {
        System.out.println("This is Then for Signout test and signout not working ");
    }

}
