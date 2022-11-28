package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Meth extends SetDriver{

    public static void sendKeys(String xpath, String keys){
        driver.findElement(By.xpath(xpath)).sendKeys(keys);
    }

    public static void sendKeys(WebElement webElement, String keys){
        webElement.sendKeys(keys);
    }


    public static void click(String xpath) {
        driver.findElement(By.xpath(xpath)).click();

    }


    public static void click(WebElement webElement) {
       webElement.click();

    }



}
