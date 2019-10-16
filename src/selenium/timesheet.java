package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class timesheet {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Helina\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://onecognizant.cognizant.com/");
		WebElement username = driver.findElement(By.id("userNameInput"));
		username.sendKeys("721908");
		WebElement password = driver.findElement(By.id("passwordInput"));
		password.sendKeys("Dina@250");
		WebElement btn = driver.findElement(By.xpath("//input[@type='submit']"));
		btn.click();
		//WebElement btnl = driver.findElement(By.xpath("//input[@value='Yes']"));
		//btnl.click();
		WebElement btnl = driver.findElement(By.id("idSIButton9"));
		btnl.click();
	}

}
