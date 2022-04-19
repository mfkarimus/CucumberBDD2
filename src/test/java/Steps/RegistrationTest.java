package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationTest {

    @Given("User already in landing page")
    public void user_already_in_landing_page() {
        System.out.println("This is Given for registration test user already in landing page");
    }



    @When("I enter valid information")
    public void i_enter_valid_information() {
        System.out.println("This is When for registration test enter valid information");
    }
    @Then("user should be submite all information successfully")
    public void user_should_be_submite_all_information_successfully() {
        System.out.println("This is Then for registration test submite all information successfully");
    }



    @When("I enter invalid information")
    public void i_enter_invalid_information() {
        System.out.println("This is When for registration test enter invalid information");
    }
    @Then("user should not be submite all information successfully")
    public void user_should_not_be_submite_all_information_successfully() {
        System.out.println("This is Then for registration test submite wrong information");
    }



    @When("I enter Correct name and wrong date of birth in the registration form")
    public void i_enter_correct_name_and_wrong_date_of_birth_in_the_registration_form() {
        System.out.println("This is When for registration test enter correct name and wrong date of birth");
    }
    @Then("user would be submite all information not successfully")
    public void user_would_be_submite_all_information_not_successfully() {
        System.out.println("This is Then for registration test submite correct and wrong information");
    }



    @When("I enter wrong gender")
    public void i_enter_wrong_gender() {
        System.out.println("This is When for registration test enter wrong gender");
    }
    @Then("user submite wrong gender not successfully")
    public void user_submite_wrong_gender_not_successfully() {
        System.out.println("This is Then for registration test submite wrong gender");
    }



    @When("I enter blank information")
    public void i_enter_blank_information() {
        System.out.println("This is When for registration test submite blank information");
    }
    @Then("user submite without information not successfully")
    public void user_submite_without_information_not_successfully() {
        System.out.println("This is Then for registration test submite without information");

    }


}
