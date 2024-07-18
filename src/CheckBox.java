import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
    public static void main(String[] args) throws InterruptedException {
        System.getProperty("webdriver.chrome.driver","\"C:\\Users\\ADMIN\\Downloads\\chromedriver-win64.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.leafground.com/checkbox.xhtml");
        WebElement basic= driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt89\"]/div[2]"));
        basic.click();
        Thread.sleep(3000);

        WebElement favlang=driver.findElement(By.xpath("//*[@id=\"j_idt87:basic\"]/tbody/tr/td[1]/div/div[2]"));
        favlang.click();
        WebElement f2=driver.findElement(By.xpath("//*[@id=\"j_idt87:basic\"]/tbody/tr/td[3]/div/div[2]"));
        f2.click();
        Thread.sleep(1000);
        WebElement f3=driver.findElement(By.xpath("//*[@id=\"j_idt87:basic\"]/tbody/tr/td[4]/div/div[2]"));
        f3.click();

        boolean enabled=driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt102_input\"]")).isEnabled();
        System.out.println("is enabled--->" +enabled);

        WebElement selmul=driver.findElement(By.xpath("//*[@id=\"j_idt87:multiple\"]/div[3]"));
        selmul.click();
        Thread.sleep(3000);
        WebElement selall=driver.findElement(By.xpath("//*[@id=\"j_idt87:multiple_panel\"]/div[1]/div[1]/div[2]"));
        selall.click();
        driver.findElement(By.xpath("//*[@id=\"j_idt87:multiple_panel\"]/div[1]/a")).click();

        WebElement noti=driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt91\"]/div[2]"));
        noti.click();
        Thread.sleep(3000);

        WebElement toggle=driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt100\"]"));
        toggle.click();

        WebElement tristate=driver.findElement(By.xpath("//*[@id=\"j_idt87:ajaxTriState\"]/div[2]"));
        tristate.click();
        



    }
}
