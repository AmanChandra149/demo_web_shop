package signup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	@FindBy(xpath = "//a[normalize-space()='Register']")
	WebElement registerLink;
	@FindBy(css = "#FirstName")
	WebElement firstName;
	@FindBy(css = "#LastName")
	WebElement lastName;
	@FindBy(css = "#Email")
	WebElement email;
	@FindBy(css = "#Password")
	WebElement password;
	@FindBy(css = "#ConfirmPassword")
	WebElement confirmPassword;
	@FindBy(xpath = "//input[@id='register-button']")
	WebElement registerBtn;
	@FindBy(css = "input[value='Continue']")
	WebElement contiBtn;
	@FindBy(xpath = "//a[normalize-space()='Log out']")
	WebElement logoutLink;
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getConfirmPassword() {
		return confirmPassword;
	}
	public WebElement getRegisterBtn() {
		return registerBtn;
	}
	
	public WebElement getRegisterLink() {
		return registerLink;
	}
	
	public WebElement getContiBtn() {
		return contiBtn;
	}
	
	public WebElement getLogoutLink() {
		return logoutLink;
	}
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

}
