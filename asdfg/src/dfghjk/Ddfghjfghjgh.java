package dfghjk;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Ddfghjfghjgh {

	public static void main(String[] args) {
		 public WebDriver driver;
		  @Test
		  public void Initialaize(){
			  System.setProperty("WebDriver.Chrome.Driver", "put the path of the Driver");//
			 driver = new ChromeDriver(); 
			 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			 driver.get("https://www.aldirapublic.com/");
			 String title;
			 title=driver.getTitle();
			Assert.assertEquals("ALDIRA", title, "that is not the correct title name");
		  }
			
			public static void main(String[] args) {

			}

		}