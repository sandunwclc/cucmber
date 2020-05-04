package com.cucmber.mygit.cucmberprj;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
    	System.out.println("hello sandun ....................");
    	WebDriver driver = new ChromeDriver();
    	driver.get("https://github.com/login");
    	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    	driver.manage().window().maximize();
    	
    	driver.findElement(By.xpath("//input[@id='login_field']")).clear();
    	driver.findElement(By.xpath("//input[@id='login_field']")).sendKeys("srabeyweera@gmail.com");
    	driver.findElement(By.xpath("//input[@id='password']")).clear();
    	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Virtusa@2");
    	driver.findElement(By.xpath("//input[@name='commit']")).click();
        assertTrue( true );
    }
}
