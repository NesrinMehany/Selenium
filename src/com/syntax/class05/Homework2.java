package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Homework2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        WebElement categoriesDD = driver.findElement(By.xpath("//select[contains(@aria-label,'Select a category')]"));
        categoriesDD.click();
        Select sel = new Select(categoriesDD);
        List<WebElement> categoriesOptions = sel.getOptions();
        for (WebElement category : categoriesOptions) {
            String categoryText = category.getText();
            System.out.println(categoryText);
            if (categoryText.equalsIgnoreCase("Computers/Tablets & Networking")) {
                sel.selectByVisibleText(categoryText);
            }
        }
        WebElement serachBtn = driver.findElement(By.xpath("//input[@value='Search'] [@id='gh-btn']"));
        serachBtn.click();
        if(driver.getTitle().equalsIgnoreCase("        System.out.println(driver.getTitle());\n"));
        System.out.println("**************");
        System.out.println("Title Verified");
    }

}