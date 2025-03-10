package signup;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import testdata.CommonTestData;

public class BaseClass {
	WebDriver driver;
	RegisterPage rp;
	@BeforeClass
	public void homePage() throws IOException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(CommonTestData.propertyFileData("baseURL"));
	}
	@BeforeMethod
	public void signUp() {
		rp=new RegisterPage(driver);
		rp.getRegisterLink().click();
		rp.getFirstName().sendKeys("Aman");
		rp.getLastName().sendKeys("Chandra");
		rp.getEmail().sendKeys("amanchandra12344@gmail.com");
		rp.getPassword().sendKeys("Aman@123");
		rp.getConfirmPassword().sendKeys("Aman@123");
		rp.getRegisterBtn().click();
		rp.getContiBtn().click();
	}
	@AfterMethod
	public void logout() {
		rp.getLogoutLink().click();
	}
	@AfterClass
	public void close() {
		driver.quit();
	}
	
}
