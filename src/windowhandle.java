import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class windowhandle {
    public static void main(String[] args) throws InterruptedException {
        System.getProperty("webdriver.chrome.driver","\"C:\\Users\\ADMIN\\Downloads\\chromedriver-win64.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://letcode.in/windows");

        String oldwindow=driver.getWindowHandle();

        WebElement button= driver.findElement(By.id("home"));
        button.click();

        Set<String> handles=driver.getWindowHandles();
        Thread.sleep(3000);


        for(String newwindow : handles){
            driver.switchTo().window(newwindow);
        }
        WebElement edit=driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[2]/app-menu/div/footer/a"));
        edit.click();
        //driver.close();

        driver.switchTo().window(oldwindow);
        //WebElement openMultiple=driver.findElement(By.id("multi"));
        //openMultiple.click();
        //Thread.sleep(3000);

        int numberOfWindows=driver.getWindowHandles().size();
        System.out.println("No of windows opened--" +numberOfWindows );


    }

    }
