package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class HomeWrok {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        WebElement newAccountBtn = driver.findElement(By.xpath("//a[contains(text(),'new account')]"));
        newAccountBtn.click();
        Thread.sleep(2000);
        WebElement firstNameBox = driver.findElement(By.cssSelector("input[name='firstname']"));
        firstNameBox.sendKeys("Nesrin");
        WebElement lastNameBox = driver.findElement(By.xpath("//input[@name='lastname']"));
        lastNameBox.sendKeys("Mehany");
        WebElement phoneOrEmail = driver.findElement(By.cssSelector("input[aria-label*='number or email']"));
        phoneOrEmail.sendKeys("123-456-7890");
        WebElement newPassword = driver.findElement(By.cssSelector("input[autocomplete='new-password']"));
        newPassword.sendKeys("123456789");

        List<WebElement> birthday = new ArrayList<>();
        birthday.add(driver.findElement(By.id("month")));
        birthday.add(driver.findElement(By.id("day")));
        birthday.add(driver.findElement(By.id("year")));

        for (int i = 0; i < birthday.size(); i++) {
            Select sel = new Select(birthday.get(i));
            String dorbDownName = birthday.get(i).getAttribute("id");

            if (dorbDownName.equalsIgnoreCase("month")) {
                sel.selectByValue("7");
            } else if (dorbDownName.equalsIgnoreCase("day")) {
                sel.selectByValue("7");
            } else if (dorbDownName.equalsIgnoreCase("year")) {
                sel.selectByValue("2020");
            }

            List<WebElement> sexRadioButtons = driver.findElements(By.cssSelector("label._58mt"));
            for (WebElement sexRadioButton : sexRadioButtons) {
                String RBT = sexRadioButton.getText();
                if (RBT.equalsIgnoreCase("Female")) {
                    sexRadioButton.click();
                }
            }
        }
    }
}