package POM;
import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class WebElements {
    WebDriver driver;
    By FirstnameXpath =By.xpath("(//input[@type=\"text\"])[1]");
    By LastNameXpath = By.xpath("(//input[@type=\"text\"])[2]");
    By PostCodeXpath = By.xpath("(//input[@type=\"text\"])[3]");
    By ClickButton = By.xpath("//button[@class=\"btn btn-default\"]");

    //TC_02_xpaths;
    By ClickOpenAccount = By.xpath("(//button[@class=\"btn btn-lg tab\"])[1]");


    By CustomerName = By.xpath("//select[@id=\"userSelect\"]");

    By selectname = By.xpath("//option[@value=\"6\"]");
    By Currency = By.xpath("//select[@id=\"currency\"]");
    By selecurrency = By.xpath("//option[@value=\"Dollar\"]");
    By Process = By.xpath("//button[@type=\"submit\"]");


    public WebElements(WebDriver driver){
        this.driver=driver;
        this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void Customerdata (String FirstName,String LastName,String PostCode) throws InterruptedException {
         Thread.sleep(2000);
        driver.findElement(FirstnameXpath).sendKeys(FirstName);
        Thread.sleep(3000);
        driver.findElement(LastNameXpath).sendKeys(LastName);
        Thread.sleep(2000);
        driver.findElement(PostCodeXpath).sendKeys(PostCode);

    }

    public void clickTheAddCustomer() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(ClickButton).click();
        driver.switchTo().alert().accept();
    }

    //TC_02_xpaths;

    public void clickOpenAccountButton() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(ClickOpenAccount).click();
    }




    public void managerClickOnDropdownButtonAndSelectCustomerName() {
        driver.findElement(CustomerName).click();
        driver.findElement(selectname).click();

    }

    public void managerClickOnDropdownButtonAndSelectCurrency() {
        driver.findElement(Currency).click();
        driver.findElement(selecurrency).click();

    }
    public void clickOnProcessButton() {
        driver.findElement(Process).click();
        driver.switchTo().alert().accept();

    }



}
