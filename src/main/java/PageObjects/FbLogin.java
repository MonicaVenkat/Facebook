package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FbLogin {
	//PageObjects for login page.
	public WebDriver driver;//To use in the methods
	
   private By LoginId =By.id("email");
   private By Password = By.id("pass");
   private By SignIn = By.xpath("//input[@value='Log In']");
   private By alertMessage = By.xpath("//div[@role='alert']");
    
   //This constructor is used to give life to the driver object
   public FbLogin(WebDriver driver)
   {
	   this.driver=driver;
   }
	
public WebElement LoginId()
{
	return driver.findElement(LoginId);
}

public WebElement password()
{
	return driver.findElement(Password);
}
public WebElement SignInButton()
{
	return driver.findElement(SignIn);
}
public WebElement alertMessage()
{
	return driver.findElement(alertMessage);
}
}
