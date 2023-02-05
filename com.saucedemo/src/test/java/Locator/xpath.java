package Locator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(2000);  //wait 2 sec
        // locate user name with xpath
        driver.findElement(By.xpath("//input[@id ='user-name']")).sendKeys("standard_user");

        // locate password with xpath
        driver.findElement(By.xpath("//input[@name = 'password'][@placeholder='Password']")).sendKeys("secret_sauce");

        // locate button with xpath
        driver.findElement(By.xpath("//input[@class = 'submit-button btn_action'][@name = 'login-button']")).click();

        //switch to product
        String currentWin = driver.getWindowHandle();
        driver.switchTo().window(currentWin);

        // xpath and oparetion
        driver.findElement(By.xpath("//button[@class = 'btn btn_primary btn_small btn_inventory' and @name = 'add-to-cart-sauce-labs-bolt-t-shirt']")).click();

        // xpath or oparetion
        driver.findElement(By.xpath("//button[@id = 'add-to-cart-sauce-labs-onesie' or @name = 'add-to-cart-sauce-labs-bolt-t-shirt']")).click();

    }
}

