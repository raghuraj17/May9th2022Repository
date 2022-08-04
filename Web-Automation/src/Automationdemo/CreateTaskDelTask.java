package Automationdemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateTaskDelTask {
	public static WebDriver oB=null;
	
	@Test(priority=1)
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","G:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\Drivers\\chromedriver.exe"); 
					oB=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=2)
	private static void navigate()
	{
		try
		{
			oB.get("http://localhost/login.do");
			Thread.sleep(1000);
			oB.manage().window().maximize();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=3)
	private static void login()
	{
		try
		{
			oB.findElement(By.name("username")).sendKeys("admin");
			Thread.sleep(1000);
			oB.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(1000);
			oB.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=4)
	private static void minimizeFlyOutWindow()
	{
		try
		{
			oB.findElement(By.id("gettingStartedShortcutsPanelId")).click();;
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=5)
	private static void createCustomer()
	{
		try
		{
			//clicking on task
			oB.findElement(By.xpath("//*[@id='topnav']/tbody/tr/td[3]/a")).click();
			Thread.sleep(2000);
			//clicking on add new
			oB.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div")).click();
			Thread.sleep(1000);
			//add customer
			oB.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			//entering the Customer name
			oB.findElement(By.id("customerLightBox_nameField")).sendKeys("Nakshatra Groups");
			Thread.sleep(1000);
			oB.findElement(By.id("customerLightBox_commitBtn")).click();
			Thread.sleep(1000);
			}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=6)
	private static void createProject()
	{
		try
		{
			//clicking on add project
			oB.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div")).click();
			Thread.sleep(1000);
			//create project
			oB.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
			Thread.sleep(1000);
			//giving name to project
			oB.findElement(By.id("projectPopup_projectNameField")).sendKeys("IT Solutions");
			Thread.sleep(1000);
			//clicking on create project
			oB.findElement(By.id("projectPopup_commitBtn")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=7)
	private static void createTask()
	{
		try
		{
			//clicking on add new task
			oB.findElement(By.xpath("//*[@id='taskListBlock']/div[1]/div[1]/div[3]/div")).click();
			Thread.sleep(1000);
			//clicking on create new task
			oB.findElement(By.xpath("/html/body/div[13]/div[1]")).click();
			Thread.sleep(1000);
		//clicking on the name feild
			oB.findElement(By.xpath("//*[@id='createTasksPopup_createTasksTableContainer']/table/tbody/tr[1]/td[1]/input")).click();
			Thread.sleep(1000);
			oB.findElement(By.xpath("//*[@id='createTasksPopup_createTasksTableContainer']/table/tbody/tr[1]/td[1]/input")).sendKeys("Cyber Security Project");
			Thread.sleep(1000);
			//confirming task
			oB.findElement(By.xpath("//*[@id='createTasksPopup_commitBtn']")).click();
			Thread.sleep(1000);
			}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=8)
	private static void deleteTask()
	{
		try
		{
			//clicking on task
			oB.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[2]")).click();
			Thread.sleep(1000);
			//clicking on action
			oB.findElement(By.xpath("//*[@id='taskListBlock']/div[3]/div[1]/div[2]/div[3]/div/div")).click();
			Thread.sleep(2000);
			oB.findElement(By.xpath("//*[@id='taskListBlock']/div[3]/div[4]/div/div[3]/div")).click();
			Thread.sleep(2000);
			//conformation Deleting 
			oB.findElement(By.xpath("//*[@id=\'taskPanel_deleteConfirm_submitBtn\']/div")).click();	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=9)
	private static void deleteProject()
	 {
		 try
		 {
			 oB.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			 Thread.sleep(2000);
			 oB.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[3]/div/div")).click();
			 oB.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[4]/div/div[3]/div")).click();  
			 oB.findElement(By.id("projectPanel_deleteConfirm_submitTitle")).click();
			 Thread.sleep(2000);
			 Alert oAlert=oB.switchTo().alert();
			 String content=oAlert.getText();
			 System.out.println(content);
			 oAlert.accept();
			 Thread.sleep(1000);
       }catch(Exception e)
		 {
	     e.printStackTrace();
	     
		 }

	 }
	
	@Test(priority=10)
	 private static void deleteCustomer()
	 {
		 try
		 {
			 oB.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			 Thread.sleep(1000);
			 oB.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div/div[2]")).click();
			 Thread.sleep(2000);
			 oB.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[4]/div/div[3]/div")).click();
			 Thread.sleep(1000);
			 oB.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
			 Thread.sleep(2000);
			 Alert oAlert=oB.switchTo().alert();
			 String content=oAlert.getText();
			 System.out.println(content);
			 oAlert.accept();
			 Thread.sleep(3000);
		 }catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	 }
	
	@Test(priority=11)
	 private static void logOut()
	 {
		 try
		 {
			 oB.findElement(By.id("Logout")).click();
			 Thread.sleep(5000);
		 }catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	 }
	
	@Test(priority=12)
	 private static void closeApplication()
		{
		   try
		   {
			   oB.quit(); 
			   Thread.sleep(5000);
		   }catch(Exception e)
		   {
			   e.printStackTrace();
		   }
		}
}
