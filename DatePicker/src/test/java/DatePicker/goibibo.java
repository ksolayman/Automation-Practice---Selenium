package DatePicker;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class goibibo {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        String monthYear = "April 2023";
        String dayMonth = "29";
        //get link
        driver.get("https://www.goibibo.com/");
        driver.findElement(By.xpath("//span[@class='sc-iwjdpV jUsACy fswDownArrow']")).click();
        //select month year
        while (true){
            String currentMonth = driver.findElement(By.xpath("//div[@role='heading'][1]")).getText();
            if(currentMonth.equals(monthYear)){
                break;
            }else{
                driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
            }
        }
        //select day
        List<WebElement> dayList = driver.findElements(By.xpath("(//div[@role='rowgroup'])//p"));
        for (WebElement element: dayList) {
            String date = element.getText();
            if (date.equals(dayMonth)) {
                element.click();
                break;
            }
        }
        driver.findElement(By.xpath("//div[@class='sc-nVkyK kXKaJU']//span[@class = 'fswTrvl__done']")).click();
    }



}

