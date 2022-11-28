package com.syntax.class09;

import Utils.ConfigFile;
import com.syntax.MyLib.Lib;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class HW {
    public static void main(String[] args) throws InterruptedException, IOException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 20);
        driver.manage().window().maximize();

        driver.get(ConfigFile.configReader("url"));

        WebElement userNameTextBox = driver.findElement(By.id("txtUsername"));
        userNameTextBox.sendKeys(ConfigFile.configReader("userName"));

        WebElement passwordTextBox = driver.findElement(By.id("txtPassword"));
        passwordTextBox.sendKeys(ConfigFile.configReader("passWord"));

        WebElement loginButton = driver.findElement(By.name("Submit"));
        loginButton.click();
        WebElement pimTap = driver.findElement(By.linkText("PIM"));
        pimTap.click();
        WebElement EmployeeTap = driver.findElement(By.linkText("Employee List"));
        EmployeeTap.click();
        List<WebElement> headers = driver.findElements(By.xpath("//table[@id='resultTable']/thead/tr/th"));


        for (int i =0; i < headers.size(); i++) {
            if (headers.get(i).getText().equalsIgnoreCase("Id")) {
                List<WebElement> ColumnOfIds = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[" + (i+1) + "]"));

            for (int j = 0; j < ColumnOfIds.size(); j++) {
                    if (ColumnOfIds.get(j).getText().equalsIgnoreCase("5675733")) {
                        List<WebElement> CheckBoxes = driver.findElements(By.xpath("//input[@name='chkSelectRow[]']"));
                        CheckBoxes.get(j).click();
                    }
                }

            }
        }




        
    }
}

