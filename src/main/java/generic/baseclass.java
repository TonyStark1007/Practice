package generic;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class baseclass implements Autoconstant {
	public WebDriverUtilies utilies=new  WebDriverUtilies ();
	public WebDriver driver;
	public propertyFile p=new propertyFile();
	@BeforeMethod
	public void openApp() throws FileNotFoundException, IOException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(p.getData("url"));
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}

	@AfterMethod
	public void closeApp(ITestResult r) throws IOException {
		int status=r.getStatus();
		String name=r.getName();
		if (status==2) {
			Screenshots s=new Screenshots();
			s.getPhoto(driver,name);
		}

		driver.quit();
	}
}