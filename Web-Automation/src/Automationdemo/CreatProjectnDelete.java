package Automationdemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreatProjectnDelete {
public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createCustomer1();
		projectDemo();
		deleteProject1();
		DeleteCustomer1();
		logOut();
		closeApplication();
	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","G:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			
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
	
	 private static void login()
	 {
	    try
	    {
		 oBrowser.findElement(By.id("username")).sendKeys("admin");
		 oBrowser.findElement(By.name("pwd")).sendKeys("manager");
		 oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
		 Thread.sleep(5000);
	    }catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
	 } 
	 private static void minimizeFlyOutWindow()
	 {
		 try
		 {
			 oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();; 
			 Thread.sleep(2000);
		 }catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	 }
	 
	 private static void createCustomer1()
	 {
		 try
		 {
			 oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[3]/a/div[2]")).click();
			 Thread.sleep(2000);
			 oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[2]")).click();
			 oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			 Thread.sleep(2000);
			 oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("Facebook");
			 Thread.sleep(1000);
			 oBrowser.findElement(By.id("customerLightBox_descriptionField")).sendKeys("Connects the peoples");
			 Thread.sleep(1000);
			 oBrowser.findElement(By.xpath("//*[@id=\"customerLightBox_commitBtn\"]/div/span")).click();
			 Thread.sleep(2000);
		 }catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	 }
	 private static void projectDemo()
	 {
		 try
		 {
			 oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[2]")).click();
			 Thread.sleep(2000);
			 oBrowser.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
			 Thread.sleep(2000);
			 oBrowser.findElement(By.id("projectPopup_projectNameField")).sendKeys("Project1");
			 oBrowser.findElement(By.name("projectDescriptionField")).sendKeys("Say about Project ");
			 oBrowser.findElement(By.xpath("//*[@id=\"projectPopup_commitBtn\"]/div/span")).click();
			 Thread.sleep(3000);
		 }catch(Exception e)
		 {
			 e.printStackTrace();
		 }
		
	 }
	 private static void deleteProject1()
	 {
		 try
		 {
			 oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			 Thread.sleep(2000);
			 oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[3]/div/div")).click();
			 oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[4]/div/div[3]/div")).click();  
			 oBrowser.findElement(By.id("projectPanel_deleteConfirm_submitTitle")).click();
			 Thread.sleep(2000);
			 Alert oAlert=oBrowser.switchTo().alert();
			 String content=oAlert.getText();
			 System.out.println(content);
			 oAlert.accept();
			 Thread.sleep(1000);
        }catch(Exception e)
		 {
	     e.printStackTrace();
	     
		 }
	 }
		 private static void DeleteCustomer1()
		 {
			 try
			 {
				 oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
				 Thread.sleep(1000);
				 oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div/div[2]")).click();
				 Thread.sleep(2000);
				 oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[4]/div/div[3]/div")).click();
				 Thread.sleep(1000);
				 oBrowser.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
				 Thread.sleep(2000);
				 Alert oAlert=oBrowser.switchTo().alert();
				 String content=oAlert.getText();
				 System.out.println(content);
				 oAlert.accept();
				 Thread.sleep(3000);
			 }catch(Exception e)
			 {
				 e.printStackTrace();
			 }
		 }
		
		 private static void logOut()
		 {
			 try
			 {
				 oBrowser.findElement(By.id("Logout")).click();
				 Thread.sleep(5000);
			 }catch(Exception e)
			 {
				 e.printStackTrace();
			 }
		 }
		 private static void closeApplication()
			{
			   try
			   {
				   oBrowser.quit();  
			   }catch(Exception e)
			   {
				   e.printStackTrace();
			   }
			}
}
