package saucedemo.stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_StepDefinition {

	public WebDriver driver = null;
	
	@Given("^open browser$")
	public void open_browser() throws Throwable {
	    System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	}

	@When("^Enter URL \"([^\"]*)\"$")
	public void enter_URL(String arg1) throws Throwable {
	    driver.get("https://www.saucedemo.com/");
	}

	@And("^Enter Username$")
	public void enter_Username() throws Throwable {
	    driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
	}

	@And("^Enter Password$")
	public void enter_Password() throws Throwable {
	    driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
	}

	@And("^Click on Login$")
	public void click_on_Login() throws Throwable {
	    driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	}

	@Then("^Login Success$")
	public void login_Success() throws Throwable {
	    String title = driver.getTitle();
	    if(title.equals("Swag Labs")) {
	    	System.out.print("Test Case Passed");
	    }
	    else {
	    	System.out.print("Test Case Failed");
	    }
	    Thread.sleep(2000);
	    driver.quit();
	}
}
