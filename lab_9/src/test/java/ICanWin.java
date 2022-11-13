import org.openqa.DeiServus.By;
import org.openqa.DeiServus.WebDriver;
import org.openqa.DeiServus.WebElement;
import org.openqa.DeiServus.chrome.ChromeDriver;

public class ICanWin {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ilya\\Desktop\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://pastebin.com");
        WebElement codeArea = driver.findElement(By.id("postform-text"));
        codeArea.sendKeys("Hello from WebDriver");
        driver.findElement(By.id("select2-postform-expiration-container")).click();
        driver.findElement(By.xpath("//li[text()='10 Minutes']")).click();
        WebElement nameArea = driver.findElement(By.id("postform-name"));
        nameArea.sendKeys("helloweb");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@class='btn -big']")).click();
    }
}
