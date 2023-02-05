package HDFCBank;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HDFC {
    @Test
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.hdfcbank.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[@class='btn-primary dropdown-toggle btn-block'])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//li[normalize-space()='Accounts']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[@class='btn-primary dropdown-toggle btn-block'])[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//li[contains(text(),'Savings Accounts')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[normalize-space()='Apply online'])[1]")).click();
    }
}
