package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
	public static WebDriver driver;
	public Properties prop;

	public WebDriver initializeDriver() throws IOException {
		prop = new Properties();
		// System.getProperty("user.dir")
		FileInputStream fis = new FileInputStream(
		System.getProperty("user.dir") + "\\src\\main\\java\\Resources\\data.properties");
		String path = System.getProperty("user.dir");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		//System.out.println(browserName);

		if (browserName.contains("chrome")) {
			System.setProperty("webdriver.chrome.driver", path+"\\chromedriver.exe");
			
			ChromeOptions options = new ChromeOptions();
			if (browserName.contains("headless")) {
				options.addArguments("headless");
			}
			driver = new ChromeDriver(options);
			// execute in chrome driver

		} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\Owner\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();

		} else if (browserName.equals("IE")) {
//		IE code
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;

	}

}
