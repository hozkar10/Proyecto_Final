package com.sophos.certification.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Validar_Registro_NewTours {
	
	//PASO 1
	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	//PASO 2
	driver.get("http://newtours.demoaut.com/");
	//PASO 3
	driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
	// PASO 4
	driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Oscar");
	// PASO 5
	driver.findElement(By.xpath("//select[@name='country']")).click();
	driver.findElement(By.xpath("//select[@name='country']")).sendKeys("COLOMBIA");
	driver.findElement(By.xpath("//select[@name='country']")).submit();
	System.out.println("Test Case Finalizado");
	driver.close();
}


