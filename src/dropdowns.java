import org.bouncycastle.jcajce.provider.asymmetric.ec.KeyFactorySpi;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class dropdowns {
    public static void main(String[] args) throws InterruptedException {
        System.getProperty("webdriver.chrome.driver","\"C:\\Users\\ADMIN\\Downloads\\chromedriver-win64.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.leafground.com/select.xhtml");

        WebElement coursedropdown=driver.findElement(By.cssSelector("#j_idt87\\:auto-complete > button"));
        coursedropdown.click();
        Thread.sleep(3000);

        List <WebElement> course=driver.findElements(By.cssSelector("#j_idt87\\:auto-complete_panel > ul"));
        for(WebElement coursee : course){
            if(coursee.getText().equals("JMeter")) {
                coursee.click();
                Thread.sleep(3000);
                break;
            }
        }





        }
    }













