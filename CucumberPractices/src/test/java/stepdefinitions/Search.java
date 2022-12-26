package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;



public class Search {
	WebDriver driver;
	@Given("^I am searching product in amazon\\.$")
	public void i_am_searching_product_in_amazon() throws Throwable {
		WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver();
       driver.get("https://brave-mud-06121e90f.1.azurestaticapps.net/");
	    
	}

	@When("^I search product \"([^\"]*)\" and Price \"([^\"]*)\"$")
	public void i_search_product_and_Price(String arg1, String arg2) throws Throwable {
	       System.out.println("Step 2: ");
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       driver.findElement(By.xpath("//div[@role='button']")).click();
	       driver.findElement(By.xpath("//input[@id='email']")).sendKeys(arg1);
	       driver.findElement(By.xpath("//input[@id='password']")).sendKeys(arg2);
	       driver.quit();
	}

	@Then("^Result will display with name \"([^\"]*)\"$")
	public void result_will_display_with_name(String arg1) throws Throwable {
	       System.out.println("Step 3: ");
	}
}
