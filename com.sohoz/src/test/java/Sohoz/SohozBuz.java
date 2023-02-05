package Sohoz;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SohozBuz {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //openlink
        driver.get("https://www.shohoz.com/bus-tickets");
        Thread.sleep(1000);
        String currentMonth = "March";
        String currentYear = "2023";
        String currentDate = "20";

        driver.findElement(By.xpath("//input[@id='dest_from']")).sendKeys("Dhaka");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='dest_to']")).sendKeys("Barishal");
        Thread.sleep(1000);

        //SELECT MONTH YEAR
        driver.findElement(By.xpath("//input[@id='doj']")).click();
        while (true){
            String mon = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            String yr = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

            if (mon.equalsIgnoreCase(currentMonth) && yr.equalsIgnoreCase(currentYear)){
                break;}
            else {driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();}
        }
        // SELECT DATE
        List <WebElement> listDay = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
        for (int i = 1; i<= listDay.size(); i++) {
            String date = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td")).get(i).getText();
            if(date.equalsIgnoreCase(currentDate)){
                driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td")).get(i).click();
            }
        }
        Thread.sleep(1000);
        //search button
        driver.findElement(By.xpath("//button[normalize-space()='Search Buses']")).click();
    }
}
