package StepDefination;

import Core.Helper;
import POM.WebElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import static StepDefination.XYZbank_MyStepdefs.driver;


public class Open_Account_MyStepdefs {
    WebElements elements;

    @Given("Open account page")
    public void openAccountPage() {
        System.out.println("................");

    }

    @When("Click open account button")
    public void clickOpenAccountButton() throws InterruptedException {
        elements= new WebElements(driver);
     elements.clickOpenAccountButton();


    }

    @And("manager click on dropdown button  and select customer name")
    public void managerClickOnDropdownButtonAndSelectCustomerName() {
        elements.managerClickOnDropdownButtonAndSelectCustomerName();


    }

    @And("manager click on dropdown button and select currency")
    public void managerClickOnDropdownButtonAndSelectCurrency() {
        elements.managerClickOnDropdownButtonAndSelectCurrency();

    }

    @And("click on process button")
    public void clickOnProcessButton() {
        elements.clickOnProcessButton();

    }

    @Then("account could be open")
    public void accountCouldBeOpen() {
        System.out.println(" account could be open");
    }
}
