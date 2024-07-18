import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textbox {
    public static void main(String[] args) {
        System.getProperty("webdriver.chrome.driver", "\"C:\\Users\\ADMIN\\Downloads\\chromedriver-win64.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/input.xhtml");
        WebElement namebox = driver.findElement(By.xpath("//*[@id=\"j_idt88:name\"]"));
        namebox.sendKeys("Sritha");
        WebElement appendbox = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]"));
        appendbox.sendKeys("-India");
        WebElement clearbox = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt95\']"));
        clearbox.clear();
        WebElement emailbox = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt99\']"));
        emailbox.sendKeys("sritha.shanmugam@gmail.com");
    }
}