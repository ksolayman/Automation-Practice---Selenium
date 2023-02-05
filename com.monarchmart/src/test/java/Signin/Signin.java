package Signin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Signin {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        //open MonarchMart website
        driver.get("https://monarchmart.com/");

        //open login page
        driver.findElement(By.xpath("//button[@title='User']")).click();
        Thread.sleep(1000);

        //Login Form
        // send email
        driver.findElement(By.xpath("//input[@placeholder='Write your email or phone']")).sendKeys("khanjahan@gmail.com");
        Thread.sleep(1000);
        //send-password
        driver.findElement(By.xpath("//input[@placeholder='Enter password']")).sendKeys("111111");
        Thread.sleep(1000);
        //submit
        driver.findElement(By.xpath("//button[@class='ButtonPrimary_ButtonPrimary__GpmXR  login_button___J4Zw' and @type = 'submit']")).click();
        //End Login Form


        //Login By Phone
        driver.findElement(By.xpath("//input[@placeholder='Enter phone number' and @class = 'InputPhone_input__0mrGh']")).sendKeys("0171111111");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@type='button' and @class = 'ButtonPrimary_ButtonPrimary__GpmXR ButtonPrimary_dark__WHIz7 login_button___J4Zw']")).click();

        // Signup with gmail
        driver.findElement(By.xpath("(//button[@class='login_link__7GCE4'])[1]")).click();

        //Signup with facebook
        driver.findElement(By.xpath("(//button[@class='login_link__7GCE4'])[2]")).click();

    }
}
