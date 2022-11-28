package com.syntax.class08;

import com.syntax.MyLib.Lib;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class HW {
    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 20);
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        WebElement checkBox = driver.findElement(By.xpath("//input[@label='blah']"));
        checkBox.click();
        WebElement removeButton = driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']"));
        removeButton.click();
        WebElement textDisplayed= driver.findElement(By.xpath("//p[text()= \"It's gone!\"]"));
        System.out.println(textDisplayed.getAttribute("innerText"));
        WebElement enableButton = driver.findElement(By.xpath("//button[@onclick='swapInput()']"));
        WebElement textBox= driver.findElement(By.xpath("//form[@id='input-example']/input"));
        wait.until(ExpectedConditions.elementToBeClickable(textBox));
        WebElement textBoxStatus = driver.findElement(By.xpath("//p[@id='message']"));
        String status= textBoxStatus.getText();
        System.out.println(status);
        System.out.println(textBox.isEnabled());
        textBox.sendKeys(status);
        enableButton.click();
        WebElement disabledText= driver.findElement(By.xpath("//p[@id='message']"));
        wait.until(ExpectedConditions.visibilityOf(disabledText));
        String newStatus = disabledText.getText();
        System.out.println(newStatus);
        System.out.println(textBox.isEnabled());



    }


}
