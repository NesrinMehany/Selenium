package com.syntax.class10;

import Utils.ConfigFile;
import Utils.Meth;
import Utils.SetDriver;
import com.syntax.MyLib.Lib;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static Pages.HRMSLoginPage.*;
import static Utils.SetDriver.driver;

public class HW extends Meth {
    public static void main(String[] args) throws InterruptedException {


        chrome(ConfigFile.configReader("url"));
        sendKeys(userNameTextBox, ConfigFile.configReader("userName"));
        sendKeys(passwordTextBox, ConfigFile.configReader("passWord"));
        click(loginButton);

        WebElement recruitmentTab = driver.findElement(By.xpath("//a[contains(@id,'viewRecruitmentModule')]"));
        recruitmentTab.click();

        WebElement calendar = driver.findElement(By.xpath("//label[text()='From']/following-sibling::img"));
        calendar.click();

        WebElement monthPicker = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select sel = new Select(monthPicker);
        sel.selectByVisibleText("Aug");

        WebElement yearPicker = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select sl = new Select(yearPicker);
        sl.selectByVisibleText("2023");

        List<WebElement> calendarTable = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        for (WebElement date : calendarTable) {
            if (date.getText().equalsIgnoreCase("8")) {
                date.click();
            }
            break;

        }
        driver.quit();
    }


}
