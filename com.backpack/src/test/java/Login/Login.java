package Login;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//		get url
        driver.get("https://backpackbang.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

//		move to login page
        driver.findElement(By.xpath("//a[@onclick='Backpack.Modal.login(event);']")).click();

////		login with facebook
//		driver.findElement(By.xpath("//button[normalize-space()='Log in with Facebook']")).click();
//
//		login form
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ksolayman911@gmail.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("@123456");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.findElement(By.xpath("//button[@type='button']")).click();
//
////		move on sign up page
//		driver.findElement(By.xpath("//div[@class='popup_generalDiv floatLeft link']")).click();
//
//

    }

}
