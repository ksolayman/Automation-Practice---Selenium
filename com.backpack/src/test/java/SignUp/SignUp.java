package SignUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SignUp {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//		get url
        driver.get("https://backpackbang.com/");

//		move to Signup page
        driver.findElement(By.xpath("//a[@onclick='Backpack.Modal.signup(event);']")).click();

//		Sign up with facebook
        driver.findElement(By.xpath("//button[normalize-space()='Sign Up with Facebook']")).click();

//		Signu up form fill up
        driver.findElement(By.xpath("//input[@id='full_name']")).sendKeys("Md Solayman Khan");
        driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("01515210371");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ksolayman911@gmail.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("@123456");
        driver.findElement(By.xpath("//button[@class='action stretched important']")).click();

//		After sign in browse product
        driver.findElement(By.xpath("//button[@class='different-option-button']")).click();
        driver.findElement(By.xpath("//button[@class='action']")).click();


//		move to login page
        driver.findElement(By.xpath("//div[@class='popup_generalDiv link floatLeft']")).click();

    }

}
