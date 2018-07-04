package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;

public class collegeweeklive2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.collegeweeklive.com/go-signup/");
		driver.findElement(By.id("firstName")).sendKeys("vasu");
		driver.findElement(By.name("lastName")).sendKeys("Singareddy");
		driver.findElement(By.id("emailAddress")).sendKeys("vasu.next@gmail.com");
		driver.findElement(By.id("phoneNumber")).sendKeys("8884314321");
		driver.findElement(By.name("password")).sendKeys("test123");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("test123");
		new Select(driver.findElement(By.name("nationality"))).selectByVisibleText("INDIA");
		new Select(driver.findElement(By.name("attendeeType"))).selectByVisibleText("High School Student/Future Undergraduate Student");
		new Select(driver.findElement(By.id("questions[q_134]"))).selectByVisibleText("Fall 2018");
		new Select(driver.findElement(By.id("questions_16_Month"))).selectByVisibleText("May");
		new Select(driver.findElement(By.id("questions_16_DayOfMonth"))).selectByVisibleText("17");
		new Select(driver.findElement(By.id("questions_16_DOBYear"))).selectByVisibleText("1988");

	}

}
