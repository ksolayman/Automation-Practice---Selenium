package LogIn;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class LogIn {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =  new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://flightexpert.com/");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ksolayman911@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='remember-me']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();

////        Signin with facebook
//        driver.findElement(By.xpath("//button[normalize-space()='Facebook']")).click();
//
//        //        Signin with google
//        driver.findElement(By.xpath("//span[normalize-space()='Google']")).click();
//
////        Don't have a Flight Expert Account yet? Create an Account
//        driver.findElement(By.xpath("//button[normalize-space()='Create an Account']")).click();

    }
}
