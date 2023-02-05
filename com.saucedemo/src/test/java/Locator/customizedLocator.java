package Locator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class customizedLocator {
    public static void main(String[] args) throws InterruptedException {
        // "throws InterruptedException" for waiting time
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(2000);  //wait 2 sec

        //combination tag#id
        driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
        Thread.sleep(2000);

        //combination tag[attribute = value]
        driver.findElement(By.cssSelector("input[name = password]")).sendKeys("secret_sauce");
        Thread.sleep(2000);

        //combination tag.value of class name
        driver.findElement(By.cssSelector("input.submit-button")).click();

        String currentWin = driver.getWindowHandle();
        driver.switchTo().window(currentWin);
        //tag.classValue[attribute = value]
        driver.findElement(By.cssSelector("button.btn[name = add-to-cart-sauce-labs-fleece-jacket]")).click();
        Thread.sleep(2000);

        // subString...... first - ^, last - $, any - *
        driver.findElement(By.cssSelector("button[name*=light]")).click();
    }
}
