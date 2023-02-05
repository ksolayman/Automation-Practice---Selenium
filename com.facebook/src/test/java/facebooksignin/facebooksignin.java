package facebooksignin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebooksignin {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/signup");
        Thread.sleep(2000);

        //locate firstname
        driver.findElement(By.name("firstname")).sendKeys("Solayman");
        Thread.sleep(2000);

        //locate surname
        driver.findElement(By.name("lastname")).sendKeys("Khan");
        Thread.sleep(2000);

        //locate email
        driver.findElement(By.name("reg_email__")).sendKeys("solayman@yahoo.com");
        Thread.sleep(2000);

        //locate email confirmation
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("solayman@yahoo.com");
        Thread.sleep(2000);

        //locate password
        driver.findElement(By.id("password_step_input")).sendKeys("SolaymanKhan12345");
        Thread.sleep(2000);

        //locate day
        driver.findElement(By.id("day")).sendKeys("29");
        Thread.sleep(2000);

        //locate month
        driver.findElement(By.id("month")).sendKeys("feb");
        Thread.sleep(2000);

        //locate year
        driver.findElement(By.id("year")).sendKeys("1996");
        Thread.sleep(2000);

        //locate sex
        driver.findElement(By.xpath("//input[@type = 'radio' and @name = 'sex' and  @value = '2']"));
        Thread.sleep(2000);

        //locate submit buttom
        driver.findElement(By.name("websubmit")).click();



    }
}
