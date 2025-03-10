package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(css=".ico-login")
	WebElement loginLink;
	@FindBy(css = "#Email")
	WebElement email;
	@FindBy(css ="#Password" )
	WebElement password;
	@FindBy(css="#RememberMe")
	WebElement rememberMeCeck;
	@FindBy(css = "a[href='/passwordrecovery']")
	WebElement forgotPassLink;
	@FindBy(css = "input[value='Log in']")
	WebElement loginBtn;
	@FindBy(css=".ico-logout")
	WebElement logoutLink;
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getRememberMeCeck() {
		return rememberMeCeck;
	}
	public WebElement getForgotPassLink() {
		return forgotPassLink;
	}
	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	public WebElement getLoginLink() {
		return loginLink;
	}
	
	public WebElement getLogoutLink() {
		return logoutLink;
	}
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
