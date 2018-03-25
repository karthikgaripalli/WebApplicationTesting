package com.NewTours;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_Register 
{
	public static void main(String[] args) 
	{
		String url="http://newtours.demoaut.com";
		FirefoxDriver driver = new FirefoxDriver();
		driver.get(url);
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		driver.close();

	}

}
