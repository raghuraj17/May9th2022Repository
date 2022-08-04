package Automationdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupBrowserDemo {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();
		handlingPopupBrowser();
	}
		private static void launchBrowser()
		{
			try
			{
				System.setProperty("webdriver.chrome.driver", "G:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\Drivers\\chromedriver.exe");
				oBrowser=new ChromeDriver();
				oBrowser.manage().window().maximize();
				
		    }catch (Exception e)
			{
		    	e.printStackTrace();
			}

	   }
		private static void navigate()
		{
			try
			{
				oBrowser.get("http://localhost/login.do");
				Thread.sleep(1000);
				}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static int popCount()
		{
			int count=0;
			count=oBrowser.getWindowHandles().size()-1;
			return count;
			
		}
		private static void handlingPopupBrowser()
		{
			WebElement oLink=null;
			try
			{
				oLink=oBrowser.findElement(By.linkText("actiTIME Inc."));
				System.out.println("#popup before clicking on the link :"+popCount());
				Thread.sleep(1000);
				oLink.click();
				System.out.println("# of Popups After Click on the Link :"+popCount());
				Thread.sleep(1000);
				if(popCount()>0)
				{
					popupBrowsers();
				}
				
			}catch(Exception e )
			{
				e.printStackTrace();
			}
		}
		private static void popupBrowsers()
		{
			String ParentBrowser;
			Object popups[];
			try
			{
				ParentBrowser=oBrowser.getWindowHandle();
				System.out.println("Parent Browser :"+ParentBrowser);
				popups=oBrowser.getWindowHandles().toArray();
				for(int i=1;i<popups.length;i++)
			{
					String childBrowser=popups[i].toString();
					System.out.println("Child Browser :"+childBrowser);
					oBrowser.switchTo().window(childBrowser);
					Thread.sleep(2000);
					String title=oBrowser.getTitle();
					System.out.println("Title of Child Browser :"+title);
					Thread.sleep(2000);
					String url=oBrowser.getCurrentUrl();
					System.out.println("URL of Child Browser :"+url);
					oBrowser.findElement(By.linkText("Try Free")).click();
					Thread.sleep(2000);
			}
					
			}catch(Exception e)
			{
				e.printStackTrace();
			}

            }
}
	