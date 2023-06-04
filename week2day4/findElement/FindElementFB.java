package week2day4.findElement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementFB {

	public static void main(String[] args) {
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://www.facebook.com");	
			List<WebElement> links = driver.findElements(By.tagName("a"));
			
			int occurance = links.size();
			for (int i = 1; i< occurance; i++) {
			String ref = links.get(i).getText();
				System.out.println(i+1 +" Occurance: "+ ref);
			}
					driver.close();
			}

		

	}


