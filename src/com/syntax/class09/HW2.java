package com.syntax.class09;

import com.syntax.MyLib.Lib;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HW2 extends Lib {





    public static void main(String[] args) {


       /*getUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
       sendKeys("//input[@name='txtUsername']","admin");*/
  /*
    WebElement loginpass=driver.findElement(By.xpath("//input[@id='txtPassword']"));
       loginpass.sendKeys("Hum@nhrm123");
    WebElement loginbut=driver.findElement(By.xpath("//input[@id='btnLogin']"));
       loginbut.click();
    WebElement pimbut = driver.findElement(By.xpath("//b[text()='PIM']"));
        pimbut.click();
    WebElement employee_list = driver.findElement(By.linkText("Employee List"));
        employee_list.click();

    //Task retriving all elements from row

    List<WebElement> alllist =driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));

        System.out.println(alllist.size()); //50

        for(int i=0 ; i<=alllist.size(); i++){

        String allPeople=alllist.get(i).getText();

        //task 2 from the list select all the people name who are "Employee" in syntax
        int row=i+1;

        if(allPeople.contains("Employee")){


            //System.out.println("Syntax employe's who are deleted  -->" +allPeople);

            WebElement emplyeeName=driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + (row) + "]/td[1]"));
            emplyeeName.click();

        }

        }

*/
    }
}
