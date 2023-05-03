package com.example.demo.day7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class one {
  @Test
  public void tc_001() {
	  WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
		String title=driver.getTitle();
		System.out.print(title);
		org.testng.Assert.assertEquals(title,"Guest Registration Form – User Registration");
  }
}