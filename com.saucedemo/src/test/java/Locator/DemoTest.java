package Locator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DemoTest {
    public static void main(String[] args) throws InterruptedException {     //throws InterruptedException for thread sleep
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        //open demo webpage
        driver.get("https://www.saucedemo.com/");

        //locate username by id
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(2000);

        //locate password by name
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        Thread.sleep(2000);

        //locate button by class name
        driver.findElement(By.className("submit-button")).click();
        Thread.sleep(2000);

        //Switch to product page
        String currentWin = driver.getWindowHandle();
        driver.switchTo().window(currentWin);
        //locate product by link text
        // driver.findElement(By.linkText("Sauce Labs Fleece Jacket")).click();  //click oparetion

        //locate product by partial link text
        //driver.findElement(By.partialLinkText("Backpack")).click();  //click oparetion

        //locate multiple elements
        List<WebElement> eleNumber = driver.findElements(By.partialLinkText("Sauce Labs"));
        System.out.println("find elements: "+eleNumber.size());


    }
}
