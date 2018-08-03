package zohoHR_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import zohoHR_TestBase.Testbase;

public class LoginPage extends Testbase {
	
	@FindBy(xpath="//input[@id='lid']")
	WebElement user;
	
	@FindBy(xpath="//input[@id='pwd']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='signin_submit']")
	WebElement loginbtn;
	
	public LoginPage()
	{
		PageFactory.initElements(driver,this);	
	}
	public HomePage verifyLogin(String username,String pwd)
	{
		user.sendKeys(username);
		password.sendKeys(pwd);
		loginbtn.click();
		return new HomePage();
	}

}
