import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
    public static void main(String[] args) throws InterruptedException {
        System.getProperty("webdriver.chrome.driver","\"C:\\Users\\ADMIN\\Downloads\\chromedriver-win64.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.leafground.com/radio.xhtml");

        WebElement Safari=driver.findElement(By.id("j_idt87:console2:2"));
        WebElement chrome=driver.findElement(By.id("j_idt87:console2:0"));
        WebElement firefox=driver.findElement(By.xpath("//*[@id=\"j_idt87:console2\"]/tbody/tr/td[3]/div/div[2]"));
        WebElement edge=driver.findElement(By.xpath("//*[@id=\"j_idt87:console2\"]/tbody/tr/td[4]/div/div[2]"));

        boolean status1=Safari.isSelected();
        boolean status2=chrome.isSelected();
        boolean status3= firefox.isSelected();
        boolean status4=edge.isSelected();

        System.out.println("status1----" +status1);
        System.out.println("status2----" +status2);
        System.out.println("status3----" +status3);
        System.out.println("status4----" +status4);

        WebElement favbrowser=driver.findElement(By.xpath("//*[@id=\"j_idt87:console1\"]/tbody/tr/td[1]/div/div[2]"));
        favbrowser.click();
        Thread.sleep(3000);

        WebElement unselectable=driver.findElement(By.xpath("//*[@id=\"j_idt87:city2\"]/div/div[1]/div/div[2]"));
        unselectable.click();

        WebElement age=driver.findElement(By.xpath("//*[@id=\'j_idt87:age\']/div/div[1]/div/div[2]"));
        WebElement age1=driver.findElement(By.xpath("//*[@id=\'j_idt87:age\']/div/div[2]/div/div[2]"));
        WebElement age2=driver.findElement(By.xpath("//*[@id=\"j_idt87:age\"]/div/div[3]/div/div[2]"));

        boolean select1=age.isSelected();
        boolean select2=age1.isSelected();
        boolean select3=age2.isSelected();
        System.out.println("option 1 is selected----" +select1);
        System.out.println("option 2 is selected----" +select2);
        System.out.println("option 3 is selected----" +select3);
        Thread.sleep(3000);

        //WebElement SA=driver.findElement(By.xpath("//*[@id=\"j_idt87:age\"]/div/div[1]/div/div[2]"));
        //SA.click();



    }
}
