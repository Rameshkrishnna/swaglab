package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
	private By usernameField = By.xpath("//input[@id='user-name']");
	private By passwordField = By.xpath("//input[@id='password']");
	private By loginButton = By.xpath("//input[@id='login-button']");
	
	public void clickLogin(WebDriver driver) {
		driver.findElement(loginButton).click();
	}
	
	public void login(WebDriver driver,String username,String password) {
		driver.findElement(usernameField).sendKeys(username);
		driver.findElement(passwordField).sendKeys(password);
		clickLogin(driver);
	}
}
