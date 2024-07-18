import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class CreateGmail {
    public static void main(String[] args) throws InterruptedException {
        System.getProperty("webdriver.chrome.driver","\"C:\\Users\\ADMIN\\Downloads\\chromedriver-win64.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://accounts.google.com/v3/signin/identifier?continue=https://mail.google.com/mail/&service=mail&theme=glif&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
        driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[3]/div/div[2]/div/div/div[1]/div/button/span")).click();
        driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[3]/div/div[2]/div/div/div[2]/div/ul/li[1]/span[3]")).click();

        WebElement firstname=driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
        firstname.sendKeys("Sritha");
        WebElement lastname=driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
        lastname.sendKeys("shanmugam");
        driver.findElement(By.className("VfPpkd-vQzf8d")).click();
        Thread.sleep(3000);

        WebElement dropdown=driver.findElement(By.xpath("//*[@id=\"month\"]"));
        dropdown.click();
        Thread.sleep(3000);

        dropdown.sendKeys("March"  + Keys.RETURN);
        //Select select=new Select(dropdown);
        //select.selectByIndex(3);











}



    }

