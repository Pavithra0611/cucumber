package CASE3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class test2 {
	WebDriver driver;
	@Given("I want to enter {string} as username")
	public void i_want_to_enter_as_username(String string) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.05.08\\Desktop\\Selium 3.0\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("http://10.232.237.143:443/TestMeApp/");
		 driver.manage().window().maximize();
		 driver.findElement(By.linkText("SignIn")).click();
		 driver.findElement(By.cssSelector("input#userName")).sendKeys("Admin");
	
	}

	@Given("I want to enter {string} as password")
	public void i_want_to_enter_as_password(String string) {
		 driver.findElement(By.cssSelector("input#password")).sendKeys("password456");
	}

	@Then("click on login")
	public void click_on_login() {
		driver.findElement(By.name("Login")).submit();
		 driver.findElement(By.xpath("/html/body/main/div/div/div/div[1]/button/h4")).click();
	}

	@Then("i want to enter category name")
	public void i_want_to_enter_category_name() {
		 Actions b=new Actions(driver);
		   driver.findElement(By.cssSelector("#categorydropid")).click();
		   b.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	    
	}

	@Then("i want to enter subcategory name")
	public void i_want_to_enter_subcategory_name() {
		 driver.findElement(By.cssSelector("#subcategorydropid")).click();
		 
	}

	@Then("enter <product name>")
	public void enter_product_name(io.cucumber.datatable.DataTable dt) {
		ArrayList<String> names=new ArrayList<String>();
		
		for(int i=0;i<names.size();i++)
		{
			System.out.println(names.get(i));
		
		}
		
	   
	}

	@Then("enter price as {string}")
	public void enter_price_as(String string) {
		driver.findElement(By.xpath("//*[@id=\"priceid\"]")).sendKeys(string);
	}

	@Then("enter quantity as {string}")
	public void enter_quantity_as(String string) {
		driver.findElement(By.xpath("//*[@id=\"quantityid\"]")).sendKeys(string);
	}

	@Then("enter brand as {string}")
	public void enter_brand_as(String string) {
		driver.findElement(By.xpath("//*[@id=\"brandid\"]")).sendKeys(string);
	}

	@Then("enter description as {string}")
	public void enter_description_as(String string) {
		driver.findElement(By.xpath("//*[@id=\"description\"]")).sendKeys(string);
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[10]/div/input[1]")).click();
	}

}
