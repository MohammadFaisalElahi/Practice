package com.bank.faisal;

 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

 

/**
 * Unit test for simple App.
 */
public class AppTest {
    
    @Test
    public void testCast() {
        System.out.println("Inside test case");
    }
    @Test
    public void testCast1() {
        System.out.println("Inside test case 1");
    }
    @Test
    public void testCast2() {
        System.out.println("Inside test case 2");
    }
    @Test
    public void testCast3() {
        System.out.println("Inside test case 3");
    }
    
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Inside before suite");
        
    }
    
    @AfterSuite
    public void afterSuite() {
        System.out.println("Inside after suite");
    }
    @BeforeTest
    public void beforeTest() {
        System.out.println("Inside before test");
    }
    
    @AfterTest
    public void afterTest() {
        System.out.println("Inside after test");
    }
    
    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("Inside before method");
        
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("Inside after method");
    }
    
}