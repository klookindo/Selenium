package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
//launch chrome browser
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.id("email")).sendKeys("vasu.next@gmail.com");
		//driver.findElement(By.id("pass")).sendKeys("password");
		//driver.findElement(By.id("loginbutton")).click();
		//driver.findElement(By.linkText("Forgotten account?")).click();
		driver.findElement(By.xpath("//*[@id='u_0_l']")).sendKeys("firstname");
	}

}
