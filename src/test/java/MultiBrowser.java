import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class MultiBrowser {
    public static WebDriver driver;

    @Parameters("browser")
    @BeforeClass

    public void beforeTest(String browser) {
        if(browser.equalsIgnoreCase("firefox")){
            FirefoxOptions options = new FirefoxOptions();
            options.setProfile(new FirefoxProfile());
            options.addPreference("dom.webnotifications.enabled", false);
            options.addPreference("geo.enabled", true);
            options.addPreference("geo.prompt.testing", true);
            options.addPreference("geo.prompt.testing.allow", true);
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver(options);

        }
        else if(browser.equalsIgnoreCase("chrome")){

            ChromeOptions options = new ChromeOptions();
            Map<String, Object> prefs = new HashMap<String, Object>();
            Map<String, Object> profile = new HashMap<String, Object>();
            Map<String, Integer> contentSettings = new HashMap<String, Integer>();

            contentSettings.put("notifications", 2);
            contentSettings.put("geolocation", 2);
            profile.put("managed_default_content_settings", contentSettings);
            prefs.put("profile", profile);
            options.setExperimentalOption("prefs", prefs);
            options.addArguments("--remote-allow-origins=*");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(options);



        }
    }

    @Test
    public void test() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@name=\"name\"])[1]")).sendKeys("afsana");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@name=\"name\"])[2]")).sendKeys("Jahan toma");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@type=\"text\"])[3]")).sendKeys("afsana@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@type=\"password\"])[1]")).sendKeys("toma");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@type=\"password\"])[2]")).sendKeys("toma");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//button[@class=\"btn\"])[1]")).click();
        Thread.sleep(3000);
        //driver.quit();

    }
}