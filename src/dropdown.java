import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class dropdown {
    public static void main(String[] args) throws InterruptedException {
        System.getProperty("webdriver.chrome.driver","\"C:\\Users\\ADMIN\\Downloads\\chromedriver-win64.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.leafground.com/select.xhtml");

        WebElement tool=driver.findElement(By.className("ui-selectonemenu"));
        tool.click();
        Select select=new Select(tool);
        select.selectByIndex(2);

        WebElement dropdown=driver.findElement(By.id("j_idt87:country_label"));
        dropdown.click();
        Thread.sleep(3000);
        WebElement text =driver.findElement(By.id("j_idt87:country_focus"));
        text.sendKeys("USA" +Keys.ENTER);
        Thread.sleep(3000);


        WebElement city=driver.findElement(By.id("j_idt87:city_label"));
        city.click();
        Thread.sleep(3000);
        WebElement selectcity= driver.findElement(By.id("j_idt87:city_focus"));
        selectcity.sendKeys("Denver" +Keys.ENTER);

        //WebElement course= driver.findElement(By.id("j_idt87:auto-complete_input"));
        //course.click();
        //WebElement coursetxt=driver.findElement(By.xpath("//*[@id=\"j_idt87:auto-complete_input\"]"));
        //coursetxt.sendKeys("Appium" +Keys.ENTER);
        Thread.sleep(3000);

        WebElement lang=driver.findElement(By.id("j_idt87:lang"));
        lang.click();
        WebElement selectlang=driver.findElement(By.id("j_idt87:lang_focus"));
        selectlang.sendKeys("Tamil" +Keys.ENTER);
        Thread.sleep(3000);















    }
}

