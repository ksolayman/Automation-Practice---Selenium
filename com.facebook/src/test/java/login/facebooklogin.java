package login;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebooklogin {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/login");
        Thread.sleep(2000);

        //locate firstname
        driver.findElement(By.id("email")).sendKeys("solayman@yahoo.com");
        Thread.sleep(2000);

        //locate surname
        driver.findElement(By.id("pass")).sendKeys("SolaymanKhan12345");
        Thread.sleep(2000);

        //locate submit buttom
        driver.findElement(By.id("loginbutton")).click();
    }
}


