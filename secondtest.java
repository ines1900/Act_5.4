package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class secondtest {
	public static void main(String[] args) {
		
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.get("http://demo.guru99.com/test/newtours/");
	driver.findElement(By.linkText("SIGN-ON")).click();
	driver.findElement(By.name("userName")).sendKeys("inesmas");
	driver.findElement(By.name("password")).sendKeys("azerty");
	driver.findElement(By.name("submit")).click();
}
}
