package com.comcast.contactest.crm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class CreateContactTest {

    @Test
    public void createContact(){

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://demowebshop.tricentis.com/");

        driver.findElement(By.linkText("Register")).click();

        driver.findElement(By.xpath("//input[@id=\"gender-male\"]")).click();

        driver.findElement(By.xpath("//input[@id=\"FirstName\"]")).sendKeys("Soumya");

        driver.findElement(By.xpath("//input[@id=\"LastName\"]")).sendKeys("Ranjan");

        driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys("soumyaranjansomu34@gmail.com");

        driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys("Soumya@1234");

        driver.findElement(By.xpath("//input[@id=\"ConfirmPassword\"]")).sendKeys("Soumya@1234");

        driver.findElement(By.xpath("//input[@id=\"register-button\"]")).click();
        // driver.close();
    }

}
