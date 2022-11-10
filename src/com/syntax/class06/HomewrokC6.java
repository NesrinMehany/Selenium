package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HomewrokC6 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://chercher.tech/practice/frames");
        driver.manage().window().maximize();
        driver.switchTo().frame("frame1");
        WebElement childframe = driver.findElement(By.xpath("//iframe[@id='frame3']"));
        driver.switchTo().frame(childframe);
        WebElement checkBox = driver.findElement(By.id("a"));
        checkBox.click();
        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);
        WebElement drobDown = driver.findElement(By.id("animals"));
        Select sel = new Select(drobDown);
        sel.selectByVisibleText("Baby Cat");
        List<WebElement> animalsOptions = sel.getOptions();
        for (WebElement animal : animalsOptions) {
            System.out.println(animal.getText());}
            driver.switchTo().defaultContent();
            driver.switchTo().frame("frame1");
            WebElement textBoxInFrame1 = driver.findElement(By.tagName("input"));
            textBoxInFrame1.sendKeys("Done");



    }
}