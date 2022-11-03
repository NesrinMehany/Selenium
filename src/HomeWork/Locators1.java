package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        driver.findElement(By.linkText("Register")).click();
        driver.findElement(By.id("customer.firstName")).sendKeys("Nes");
        driver.findElement(By.id("customer.lastName")).sendKeys("Meh");
        driver.findElement(By.name("customer.address.street")).sendKeys("35 str. No.24");
        driver.findElement(By.id("customer.address.city")).sendKeys("NYC");
        driver.findElement(By.id("customer.address.state")).sendKeys("NY");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("654321");
        driver.findElement(By.name("customer.phoneNumber")).sendKeys("7036985421");
        driver.findElement(By.name("customer.ssn")).sendKeys("68952");
        driver.findElement(By.id("customer.username")).sendKeys("nmnmnm");
        driver.findElement(By.id("customer.password")).sendKeys("123456789");
        driver.findElement(By.id("repeatedPassword")).sendKeys("123456789");
        driver.findElement(By.className("button")).click();
        Thread.sleep(2000);
//Task #2
        driver.navigate().to("https://www.facebook.com/");
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Nes");
        driver.findElement(By.name("lastname")).sendKeys("Meh");
        driver.findElement(By.className("_8idr.img")).click();
        driver.quit();

    }
}
