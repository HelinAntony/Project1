package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample1 {

public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Helina\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
   
    WebDriver Driver = new ChromeDriver();
    Driver.get("https://www.facebook.com/");
    
    String title =Driver.getTitle();
    System.out.println("Title" + title);
    

    String url =Driver.getCurrentUrl();
    System.out.println("url"  + url);
    
    WebElement ss = Driver.findElement(By.id("email"));
    ss.sendKeys("krishnansanjay52@gmail.com");
    
    WebElement s = Driver.findElement(By.id("pass"));
    s.sendKeys("8760124348");
    
   // WebElement s1 = Driver.findElement(By.xpath("//input[@value='Log In']"));
    //s1.click();
    
    WebElement s2 = Driver.findElement(By.id("u_0_m"));
    s.sendKeys("sanjay");
    
    WebElement s3 = Driver.findElement(By.id("u_0_o"));
    s.sendKeys("krish");


    WebElement s4 = Driver.findElement(By.id("u_0_r"));
    s.sendKeys("9698610814");
    

    WebElement s5 = Driver.findElement(By.id("u_0_y"));
    s.sendKeys("9999999");
}
}

