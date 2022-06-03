
package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class firsttest {
	public static void main(String[] args) {
        
		//System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("ines");
		driver.findElement(By.name("lastName")).sendKeys("masmoudi");
		driver.findElement(By.name("phone")).sendKeys("21240226");
		driver.findElement(By.name("userName")).sendKeys("ines@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("Gremdasfax");
		driver.findElement(By.name("city")).sendKeys("sfax");
		driver.findElement(By.name("state")).sendKeys("sfax");
		driver.findElement(By.name("postalCode")).sendKeys("2053");
		driver.findElement(By.name("country")).sendKeys("TUNISIA");
		driver.findElement(By.name("email")).sendKeys("inesmas");
		driver.findElement(By.name("password")).sendKeys("azerty");
		driver.findElement(By.name("confirmPassword")).sendKeys("azerty");
		driver.findElement(By.name("submit")).click();
		
        //driver.close();
	}
}
