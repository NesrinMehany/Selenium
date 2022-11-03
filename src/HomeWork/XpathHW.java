package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathHW {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://syntaxprojects.com/");
        driver.findElement(By.xpath("//a[@id='btn_basic_example']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[contains(text(),'Simple Form')])[2]")).click();
        driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys("Here is my first Xpath locator Homework");
        driver.findElement(By.xpath("//button[text()='Show Message']")).click();

    }
}
