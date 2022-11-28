package Pages;

import Utils.CommonMethods;
import Utils.SetDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HRMSLoginPage extends CommonMethods {
   public static  WebElement userNameTextBox = driver.findElement(By.id("txtUsername"));
    public static WebElement passwordTextBox = driver.findElement(By.id("txtPassword"));
    public static WebElement loginButton = driver.findElement(By.name("Submit"));
    public WebElement LoginSign = driver.findElement(By.xpath(" //div[text()='LOGIN Panel']"));
}
