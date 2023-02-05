package Dummy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class dummyticket {
    public static void main(String[] args) throws InterruptedException {

        String eDay = "29";
        String eMonth = "Feb";
        String eYear = "1996";

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.dummyticket.com/");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[contains(text(),'Buy Ticket')]")).click();
        Thread.sleep(2000);


        //Form
        driver.findElement(By.id("product_549")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[placeholder = 'first and middle name as on passport']")).sendKeys("Solayman");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[name = 'travlastname']")).sendKeys("Khan");
        Thread.sleep(1000);
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@id='sex_1'])[1]")).click();
        Thread.sleep(1000);
// click on dob
        driver.findElement(By.xpath("//input[@id='dob']")).click();
        //select month
        WebElement cMonth = driver.findElement(By.xpath("//select[@aria-label='Select month']"));
        Select dropdownMonth = new Select(cMonth);
        dropdownMonth.selectByVisibleText("Feb");
        //select year
        WebElement cYear = driver.findElement(By.xpath("//select[@aria-label='Select year']"));
        Select dropdownYear = new Select(cYear);
        dropdownYear.selectByVisibleText("1996");
        //select day
        List <WebElement> cDays = driver.findElements(By.xpath("(//td[@data-handler='selectDay'])"));
        for (int i=1; i<=cDays.size(); i++){
            String text = driver.findElements(By.xpath("//td[@data-handler='selectDay']")).get(i).getText();
            if(text.equals("29")){
                driver.findElements(By.xpath("//td[@data-handler='selectDay']")).get(i).click();
                break;
            }
        }
// end select dob
        driver.findElement(By.xpath("(//input[@id='traveltype_2'])[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("fromcity")).sendKeys("Dhaka/Bangladesh");
        Thread.sleep(1000);
        driver.findElement(By.name("tocity")).sendKeys("Kolkata/India");
        Thread.sleep(1000);

        driver.close();

        //Delivery options:
    }
}
