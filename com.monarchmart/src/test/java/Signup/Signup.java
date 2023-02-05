package Signup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Signup {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        //open MonarchMart website
        driver.get("https://monarchmart.com/");
        Thread.sleep(2000);
        //open login page
        driver.findElement(By.xpath("//button[@title='User']")).click();
        Thread.sleep(2000);

        //Click signup link
        driver.findElement(By.xpath("//button[@class = 'login_actionButton__HXQp9']")).click();
        Thread.sleep(2000);

        //fill up reg form
        driver.findElement(By.xpath("//input[@type='text' and @placeholder = 'Write your first name'] ")).sendKeys("Khan");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@type='text' and @placeholder = 'Write your last name'] ")).sendKeys("Jahan Ali");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@type='text' and @placeholder = 'Write your phone number']")).sendKeys("01711111111");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@type='email' and @placeholder = 'Write your email address'] ")).sendKeys("khanjahan@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='mantine-r0' and @placeholder = 'Password'] ")).sendKeys("111111");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='mantine-r1' and @placeholder = 'Password'] ")).sendKeys("111111");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@type='submit' and  @class = 'ButtonPrimary_ButtonPrimary__GpmXR  login_button___J4Zw']")).click();
        //form fil lup end

        // Signup with gmail
        driver.findElement(By.xpath("(//button[@class='login_link__7GCE4'])[1]")).click();

        //Signup with facebook
        driver.findElement(By.xpath("(//button[@class='login_link__7GCE4'])[2]")).click();

    }
}
