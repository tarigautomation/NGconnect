package automation_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglWebElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\TestAutomation\\IQ\\IQ-TestAutomation\\chromedriver.exe");
		for(int i=0; i<5;i++){
			// find element Images Link  using Xpath - first Index 
			if (i==0){
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.google.com/");
				driver.findElement(By.xpath("//div[@class='gb_Q gb_R'][1]")).click();
			}
			// find element Gmail LInk  using Xpath - second Index 
			else if (i==1) {WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			driver.findElement(By.xpath("//div[@class='gb_Q gb_R'][2]")).click();
		
			}
			// find the element google logo 
			else if (i==2) {WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			driver.findElement(By.id("hplogo")).click();
			}
			else if (i==3) {WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			driver.findElement(By.className("gsst_a")).click();
			}
			
			else if (i==4) {WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			driver.findElement(By.id("gbqfbb")).click();
			}
		}

	}
	
	// switch to the I frame 
	// move between tabe using the widow handler 
	// get the url  use the get the current url 
	// get title to get the title of the page 
	// get page source, it will return the whole HTML code 
	// close 
	// quit 
	// collection set 
	// for each 
	// select by visible text -use for drop down list 
	// select by index  - use for drop down list 
	// select by value - use for drop down list 
	// is displayed 
	// is present 
	// is enabled 
	// dealing with HTML table 
	// collection in java 
	// access modifier 
	// good instructor 
	

}
