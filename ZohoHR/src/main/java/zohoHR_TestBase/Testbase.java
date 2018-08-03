package zohoHR_TestBase;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

import zohoHR_utils.TestUtils;



public class Testbase 
{
	public static Properties prop;
	public static WebDriver driver;
    public Testbase()
    {
    	try {
    	File file=new File("C:\\Users\\Harshita\\eclipse-workspace\\ZohoHR\\src\\main\\java\\zohoHR_config\\config.properties");
    	FileReader fr=new FileReader(file);
         prop=new Properties();
         prop.load(fr);
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    
    public static void initialization()
    {
    	String browser=prop.getProperty("browser");
    	if(browser.equals("chrome")||browser.equalsIgnoreCase("google"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Harshita\\eclipse-workspace\\FreeCRMCucumberFramework\\drivers\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox")||browser.equalsIgnoreCase("Mozilla"))
		{
			System.setProperty("webdriver.firefox.driver", "./geckodriver.exe");
			driver=new FirefoxDriver();		
		}
		else if(browser.equals("InternetExplorer")||browser.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver","./IEDriverServer.exe");
			InternetExplorerOptions ieo=new InternetExplorerOptions();
			ieo.introduceFlakinessByIgnoringSecurityDomains();
			driver=new InternetExplorerDriver();
		}
		else {
			System.out.println("Browser is not defined");
		}
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICIT_WAIT,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_LOAD,TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));	
    	
    }
}
