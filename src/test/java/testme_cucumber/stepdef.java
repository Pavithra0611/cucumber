package testme_cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class stepdef {
	
	WebDriver driver;  
	@Given("I want to enter {string} as username")
	public void i_want_to_enter_as_username(String string) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.05.08\\Desktop\\Selium 3.0\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/");
		driver.manage().window().maximize(); 
		WebDriverWait wait=new WebDriverWait(driver,100);
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("SignIn")));
		driver.findElement(By.linkText("SignIn")).click();
		driver.findElement(By.name("userName")).sendKeys("Admin");
	}

	@Given("I want to enter {string} as password")
	public void i_want_to_enter_as_password(String string) {
		driver.findElement(By.id("password")).sendKeys("password456");
	}

	@Then("click on login and Add Product button")
	public void click_on_login_and_Add_Product_button() {
		 driver.findElement(By.name("Login")).submit();
		 driver.findElement(By.cssSelector("body > main > div > div > div > div:nth-child(1) > button")).click();
		 Actions b=new Actions(driver);
		   driver.findElement(By.cssSelector("#categorydropid")).click();
		   b.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		   driver.findElement(By.cssSelector("#subcategorydropid")).click();
		   b.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		   driver.findElement(By.xpath("//*[@id=\"prodid\"]")).sendKeys("Laptop");	
		   driver.findElement(By.xpath("//*[@id=\"priceid\"]")).sendKeys("$60000");
		   driver.findElement(By.cssSelector("#quantityid")).sendKeys("10");
		   driver.findElement(By.cssSelector("#brandid")).sendKeys("20005");
		   driver.findElement(By.cssSelector("#description")).sendKeys("Windows 10");
		   driver.findElement(By.name("Add Product")).click();
		   driver.findElement(By.linkText("SignOut")).click();
		   WebDriverWait wait=new WebDriverWait(driver,100);
		   wait.until(ExpectedConditions.presenceOfElementLocated((By.linkText("SignIn"))));
		   driver.findElement(By.linkText("SignIn")).click();
		   driver.findElement(By.name("userName")).sendKeys("Lalitha");
			 driver.findElement(By.name("password")).sendKeys("password123");
			 driver.findElement(By.name("Login")).submit();
			 WebElement search=driver.findElement(By.name("products"));
				search.sendKeys("HeadPhone");
				driver.findElement(By.cssSelector("body > div.col-md-12.col-sm-12.col-xs-12 > form > input[type=submit]")).click();
				driver.findElement(By.cssSelector("body > section > div > div > div.col-sm-9 > div > div > div > div:nth-child(3) > center > a")).click();
				driver.findElement(By.cssSelector("#header > div.header-middle > div > div > div.col-sm-8 > div > a:nth-child(2)")).click();
				driver.findElement(By.cssSelector("#cart > tfoot > tr:nth-child(2) > td:nth-child(5) > a")).click();
				driver.findElement(By.cssSelector("body > b > div > div > div.col-lg-6.col-md-6.col-sm-6.col-xs-12.col-md-push-6.col-sm-push-6 > div > div.panel-body > div:nth-child(4) > div > form:nth-child(2) > input")).click();
				  WebDriverWait wa=new WebDriverWait(driver,50);
					 wa.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#btn")));
					 driver.findElement(By.cssSelector("#swit > div:nth-child(2) > div > label > i")).click();
					 driver.findElement(By.id("btn")).click();
						driver.findElement(By.name("username")).sendKeys("Lalitha");
						 driver.findElement(By.name("password")).sendKeys("password123");
						 driver.findElement(By.cssSelector("input[type='submit']")).submit();
						 driver.close();
		
	}
	
	@Then("i enter product details")
	public void i_enter_product_details() {
	
		
	}

	@Then("click on Add Product button")
	public void click_on_Add_Product_button() {
		
	}

	@Then("click on signout")
	public void click_on_signout() {
	 
	}

	@Given("I want to enter {string} as username for login")
	public void i_want_to_enter_as_username_for_login(String string) {
		
	}

	@Then("i enter {string} as password")
	public void i_enter_as_password(String string) {
		
	}

	@Then("click on login button")
	public void click_on_login_button() {
		
	}

	@Given("i want to enter the product name and click add to cart")
	public void i_want_to_enter_the_product_name_and_click_add_to_cart() {
		
	}

	@Then("enter username and password for payment")
	public void enter_username_and_password_for_payment() {
	  
	}

	@Then("click on continue and signout by user")
	public void click_on_continue_and_signout_by_user() {
	  
	}

	@Given("enter admin details to login")
	public void enter_admin_details_to_login() {
	 
	}

	@Then("click on Add product button")
	public void click_on_Add_product_button() {
	 
	}

	@Given("Admin enters {string} as Category name")
	public void admin_enters_as_Category_name(String string) {
	  
	}

	@Then("i enter {string} as Sub category name")
	public void i_enter_as_Sub_category_name(String string) {
	  
	}

	@Then("i enter {string} as product name")
	public void i_enter_as_product_name(String string) {
	  
	}

	@Then("i enter {string} as price")
	public void i_enter_as_price(String string) {
	   
	}

	@Then("i enter {string} as quantity")
	public void i_enter_as_quantity(String string) {
	  
	}

	@Then("i enter {string} as brand")
	public void i_enter_as_brand(String string) {
	  
	}

	@Then("i enter {string} as description")
	public void i_enter_as_description(String string) {
	 
	}

	@Then("click on add")
	public void click_on_add() {
	  
	}

}
