package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDefinition {
	WebDriver driver=new ChromeDriver();
	
	@Given("User launch Amazon website")
	public void user_launch_amazon_website() {
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
	}

	@Given("user click on sign in option")
	public void user_click_on_sign_in_option() {
		WebElement hovertoSignIn = driver.findElement(By.id("nav-link-accountList"));
		hovertoSignIn.click();
	}

	@When("User gives correct Email id")
	public void user_gives_correct_email_id() {
		driver.findElement(By.id("ap_email")).sendKeys("tswarna+muffin1@amazon.com");
	}

	@When("Clicks on Continue")
	public void clicks_on_continue() {
driver.findElement(By.id("continue")).click();
	}

	@When("User gives password")
	public void user_gives_password() {
	driver.findElement(By.id("ap_password")).sendKeys("lab126");
	}

	@Then("user clicks on Sigin option")
	public void user_clicks_on_sigin_option() {
	    
		driver.findElement(By.id("signInSubmit")).click();
	


}
}


