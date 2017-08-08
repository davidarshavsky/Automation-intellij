import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by davida on 07/08/2017
 */
public class test extends initBrowser {

    @When("^User Navigate to LogIn Page$")
    public void userNavigateToLogInPage() throws Throwable {

    }

    @And("^User enters UserName and Password$")
    public void userEntersUserNameAndPassword() throws Throwable {

    }

    @Then("^Message displayed Login Successfully$")
    public void messageDisplayedLoginSuccessfully() throws Throwable {

    }

    @Given("^User is on google Home Page$")
    public void userIsOnGoogleHomePage() throws Throwable {
        driver.navigate().to("http://www.google.com/");
    }


    @Then("^the browser is closed$")
    public void theBrowserIsClosed() throws Throwable {

    }


}
