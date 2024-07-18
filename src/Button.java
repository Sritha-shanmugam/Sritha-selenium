import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button {
    public static void main(String[] args){
        System.getProperty("webdriver.chrome.driver","\"C:\\Users\\ADMIN\\Downloads\\chromedriver-win64.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.leafground.com/button.xhtml");

        WebElement position= driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt94\"]"));
        Point xypoint=position.getLocation();
        int xvalue= xypoint.getX();
        int yvalue= xypoint.getY();
        System.out.println("X value is :" +xvalue+ "Y value is :" +yvalue);

        WebElement buttoncolour= driver.findElement(By.id("j_idt88:j_idt96"));
        String color=buttoncolour.getCssValue("background-color");
        System.out.println("Button color is :" +color);

        WebElement buttonsize= driver.findElement(By.name("j_idt88:j_idt98"));
        int height=buttonsize.getSize().getHeight();
        int width=buttonsize.getSize().getWidth();
        System.out.println("Height is " +height + "  Width is " +width);

        WebElement homebutton= driver.findElement(By.name("j_idt88:j_idt90"));
        homebutton.click();

    }
}
