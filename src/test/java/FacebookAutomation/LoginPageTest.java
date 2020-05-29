package FacebookAutomation;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import PageObjects.FbLogin;
import Resources.base;

public class LoginPageTest extends base{
	
	public WebDriver driver;
	
	
	@BeforeTest
	public void BrowserInitialization() throws IOException
	{
		driver=initializeDriver();
		String Testurl = prop.getProperty("url");		
		driver.get(Testurl);
		driver.manage().window().maximize();        
        driver.manage().deleteAllCookies();
	}
	
	
	@Test
	public void Login() throws InterruptedException
	{
    FbLogin FbLogin = new FbLogin(driver);  //object should be created after initialize method else u will get null pointer exception
    FbLogin.LoginId().sendKeys(prop.getProperty("username"));
	FbLogin.password().sendKeys(prop.getProperty("password"));
	FbLogin.SignInButton().click();
	}
	
	
	@Test
	public void testingFromClonedProject()
	{
		System.out.println("GIT is merging");
	}
	
	@Test
	public void ChangedsecondTime()
	{
		System.out.println("GIT is cool");
	}
	
	@AfterTest
	public void BrowserShutdown()
	{
		driver.close();
	}

}
