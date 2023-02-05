package DatePicker;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DatePicker {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        //get link
        driver.get("https://www.dummyticket.com/");
        driver.findElement(By.xpath("//a[contains(text(),'Buy Ticket')]")).click();
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
//end Select DOB


    }
}
