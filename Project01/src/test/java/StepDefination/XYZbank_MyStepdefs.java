package StepDefination;

import Core.Helper;
import POM.WebElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XYZbank_MyStepdefs {
    WebElements elements;

    static WebDriver driver;

    @Given("XYZ add customer page")
    public void xyzAddCustomerPage() {
        Helper hp = new Helper();
        driver = hp.chromeLaunch();
        
    }

    @When("sends customer {string} and {string} and {string}")
    public void sendsCustomerFirstNameAndLastNameAndPostCode(String FirstName,String LastName,String PostCode) throws InterruptedException {
     elements=new WebElements(driver);
     elements.Customerdata(FirstName,LastName,PostCode);
        
    }

    @And("Click add customer button")
    public void clickAddCustomerButton() throws InterruptedException {
        elements.clickTheAddCustomer();

        
    }

    @Then("go to the next page")
    public void goToTheNextPage() {
    }
}
