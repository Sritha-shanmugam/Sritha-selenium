import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class window {
    public static void main(String[] args) throws InterruptedException {
        System.getProperty("driver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver-win64.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.leafground.com/window.xhtml");

        String oldwindow= driver.getWindowHandles().toString();

        WebElement button=driver.findElement(By.id("j_idt88:new"));
        button.click();
        Thread.sleep(3000);

        Set<String> handles=driver.getWindowHandles();

        for (String newwindow:handles){
            driver.switchTo().window(newwindow);
        }

    }
}
