package com.cydeo.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefinitions {
    @Given("user is on the library login page")
    public void user_is_on_the_library_login_page() {
        System.out.println("user is on the library login page");
    }
    @When("user enters librarian username")
    public void user_enters_librarian_username() {
        System.out.println("user enters librarian username");
    }
    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        System.out.println("user enters librarian password");

        //TODO: I need to do implementation for librarian password
    }
    @Then("user should see dashboard")
    public void user_should_see_dashboard() {
        System.out.println("user should see dashboard");
    }
    @When("user enters student username")
    public void userEntersStudentUsername() {
        System.out.println("user enters student username");
    }
    @And("user enters student password")
    public void userEntersStudentPassword() {
        System.out.println("user enters student password");
    }

    @When("user enters admin username")
    public void userEntersAdminUsername() {
        System.out.println("user enters admin username");
    }

    @And("user enters admin password")
    public void userEntersAdminPassword() {
        System.out.println("user enters admin password");
    }
    //on webtableLogin.feature class while writing scenarios Given-When-And-Then  for getting snippets we can go on
    // highlighted explanations and click create step definitions and then choose the class but if you want to create
    // all snippets once then go click on more actions for getting snippets and then click create all step definitions


}
