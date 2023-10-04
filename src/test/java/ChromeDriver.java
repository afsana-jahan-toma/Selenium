import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class ChromeDriver {
    public WebDriver driver;

    @Test
    public void browser() throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<String, Object>();
        Map<String, Object> profile = new HashMap<String, Object>();
        Map<String, Integer> contentSettings = new HashMap<String, Integer>();
        //0 - Default, 1 - Allow, 2 - Block
        contentSettings.put("notifications", 2);
        contentSettings.put("geolocation", 2);
        profile.put("managed_default_content_settings", contentSettings);
        prefs.put("profile", profile);
        options.setExperimentalOption("prefs", prefs);
        options.addArguments("--remote-allow-origins=*");
//
//        options.addArguments("--no-sandbox");
//        options.addArguments("--disable-dev-shm-usage");
//        options.addArguments("--headless");
        WebDriverManager.chromedriver().setup();
        driver = new org.openqa.selenium.chrome.ChromeDriver(options);

        driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

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


    }
}
