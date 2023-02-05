package SignUp;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SignUp {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =  new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://flightexpert.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[normalize-space()='Create an Account']")).click();
        Thread.sleep(2000);

//        fill up signup form
        driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Sabuz");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Khan");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ksolayman911@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Phone Number*']")).sendKeys("01515210371");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='confirmedPassword']")).sendKeys("123456");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();

//        Already have an account? Move to login page
        //driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
    }
}
