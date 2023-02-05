package DropDown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class DropDown {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        //get link
        driver.get("https://www.dummyticket.com/");
        driver.findElement(By.xpath("//a[contains(text(),'Buy Ticket')]")).click();
// click on dropdown
        driver.findElement(By.xpath("//span[@id='select2-reasondummy-container']")).click();
        //select dropdown
        List <WebElement> list = driver.findElements(By.xpath("//span[@id='select2-reasondummy-container']"));
        for (int i =1; i <=list.size(); i++){
            String text = driver.findElements(By.xpath("//span[@id='select2-reasondummy-container']")).get(i).getText();
            if(text.equals("Visa extension")){
                driver.findElements(By.xpath("//span[@id='select2-reasondummy-container']")).get(i).click();
                break;
            }

        }


    }
}
