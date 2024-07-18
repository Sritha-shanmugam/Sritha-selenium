import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
    public static void main (String[] args){
        System.getProperty("webdriver.chrome.driver","\"C:\\Users\\ADMIN\\Downloads\\chromedriver-win64.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.leafground.com/alert.xhtml");

        WebElement alertBox= driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]"));
        alertBox.click();


    }
}
