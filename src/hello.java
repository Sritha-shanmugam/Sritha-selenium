import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.By.*;

public class hello {
    public static void main(String[] args) throws InterruptedException {
        System.getProperty("webdriver.chrome.driver","\"C:\\Users\\ADMIN\\Downloads\\chromedriver-win64.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.leafground.com/radio.xhtml");

        WebElement age=driver.findElement(By.xpath("//*[@id=\'j_idt87:age\']/div/div[1]/div/div[2]"));
        WebElement age1=driver.findElement(By.xpath("//*[@id=\'j_idt87:age\']/div/div[2]/div/div[2]"));
        WebElement age2=driver.findElement(By.xpath("//*[@id=\"j_idt87:age\"]/div/div[3]/div/div[2]"));

        boolean select1=age.isSelected();
        boolean select2=age1.isSelected();
        boolean select3=age2.isSelected();

        Thread.sleep(3000);

        WebElement SA=driver.findElement(By.xpath("//*[@id=\"j_idt87:age\"]/div/div[1]/div/div[2]"));
        SA.click();
        System.out.println("option 1 is selected----" +select1);
        System.out.println("option 2 is selected----" +select2);
        System.out.println("option 3 is selected----" +select3);
    }
}
