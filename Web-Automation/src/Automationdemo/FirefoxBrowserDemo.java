package Automationdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserDemo {
	public static WebDriver oBrowser=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		closeApplication();

	}
		private static void launchBrowser()
		{
			try
			{
				System.setProperty("webdriver.gecko.driver","G:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\Drivers\\geckodriver.exe");
				oBrowser=new FirefoxDriver();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void navigate()
		{
			try
			{
				oBrowser.get("http://localhost/login.do");
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void closeApplication()
		{
			try
			{
			 oBrowser.close();	
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
}
