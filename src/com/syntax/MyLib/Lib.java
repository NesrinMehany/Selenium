package com.syntax.MyLib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Lib {

   /* var path="/Users/apple/IdeaProjects/SDETBatch14Java/Data/config.properties"; //location of the file
    var fileInputStream=new FileInputStream(path); //it helps us Navigate to the file
    var properties=new Properties(); // that special software which helps us read data from that file
        properties.load(fileInputStream); //loads all the data from the file inside(Memory)
        System.out.println(properties.getProperty("URl"));
        System.out.println(properties.getProperty("password"));*/
   public static WebDriver chrome(){

       System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       WebDriverWait wait = new WebDriverWait(driver, 20);
       driver.manage().window().maximize();

return driver;  }


    }

  /*  public static void sendKeys( String xpath, String keys){
        WebElement element= driver.findElement(By.xpath("xpath"));
       element.sendKeys(keys);
    }

    public static void getUrl(String url){
        driver.get(url);
    }*/

