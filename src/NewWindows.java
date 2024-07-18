import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class NewWindows {
    public static void main(String[] args) throws InterruptedException {
        System.getProperty("webdriver.chrome.driver","\"C:\\Users\\ADMIN\\Downloads\\chromedriver-win64.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.leafground.com/window.xhtml;jsessionid=node01di37a898xzd71k336knoo016b4986994.node0");
        //To store current window
        String oldwindow=driver.getWindowHandle();

        WebElement click= driver.findElement(By.id("j_idt88:new"));
        click.click();

        //switch to new window
        //store total windows in handles
       Set<String> handles=driver.getWindowHandles();

        for (String newWindow : handles) {
            driver.switchTo().window(newWindow);

        }

        //get no. of windows opened
        int openedwindows=driver.getWindowHandles().size();
        System.out.println("No. of windows opened--->" +openedwindows);
        Thread.sleep(2000);
        driver.close();

        //switch to parent window
        driver.switchTo().window(oldwindow);
        Thread.sleep(3000);
        WebElement multi= driver.findElement(By.id("j_idt88:j_idt91"));
        multi.click();
        Thread.sleep(3000);

        // get no. of windows opened
        int numberofWindows=driver.getWindowHandles().size();
        System.out.println("No. of windows opened:" +numberofWindows);
        Thread.sleep(3000);

        WebElement dontCloseMe=driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]"));
        dontCloseMe.click();

        int numofWindows=driver.getWindowHandles().size();
        System.out.println("No. of windows opened:" +numofWindows);
        Thread.sleep(3000);

        Set<String> newWindowHandles=driver.getWindowHandles();

        for (String allWindows : newWindowHandles) {
            if(!allWindows.equals(oldwindow)){
                driver.switchTo().window(allWindows);
                driver.close();
                Thread.sleep(2000);
            }

        }
        int noofWindows=driver.getWindowHandles().size();
        System.out.println("No. of windows opened:" +noofWindows);
        Thread.sleep(3000);
        driver.quit();


        }

    }

