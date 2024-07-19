import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static void main(String[] args) throws InterruptedException {
        System.getProperty("webdriver.chrome.driver","\"C:\\Users\\ADMIN\\Downloads\\chromedriver-win64.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.leafground.com/drag.xhtml");
        driver.manage().window().maximize();

        //Drag me around
        WebElement around=driver.findElement(By.id("form:conpnl"));
        Actions builder=new Actions(driver);
        int x=around.getLocation().getX();
        int y=around.getLocation().getY();
        builder.dragAndDropBy(around,x+60,y+50).perform();
        Thread.sleep(3000);

        //Drag & Drop
        WebElement From=driver.findElement(By.id("form:drag_content"));
        WebElement To=driver.findElement(By.id("form:drop_content"));

        Actions actions=new Actions(driver);
        actions.clickAndHold(From).moveToElement(To).release(To).build().perform();
        actions.dragAndDrop(From,To);
        Thread.sleep(3000);
        driver.close();

    }
}
