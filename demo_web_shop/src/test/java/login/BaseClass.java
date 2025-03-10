package login;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import testdata.CommonTestData;

public class BaseClass {
	WebDriver driver;
	LoginPage lp;
	
	@BeforeClass
	public void homePage() throws IOException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(CommonTestData.propertyFileData("baseURL"));
	}
	@BeforeMethod
	public void login() {
		lp=new LoginPage(driver);
		lp.getLoginLink().click();
		lp.getEmail().sendKeys("amanchandra12344@gmail.com");
		lp.getPassword().sendKeys("Aman@123");
		lp.getRememberMeCeck().click();
		lp.getLoginBtn().click();
	}
	@AfterMethod
	public void logout() {
		lp.getLogoutLink().click();
	}
	@AfterClass
	public void close() {
		driver.quit();
	}
}
