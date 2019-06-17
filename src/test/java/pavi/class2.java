package pavi;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class class2 {
	WebDriver driver;
	@Given("I want to login as admin")
	public void i_want_to_login_as_admin() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.05.08\\Desktop\\Selium 3.0\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("http://10.232.237.143:443/TestMeApp/");
		 driver.manage().window().maximize();
		 driver.findElement(By.linkText("SignIn")).click();
		 driver.findElement(By.cssSelector("input#userName")).sendKeys("Admin");
		 driver.findElement(By.cssSelector("input#password")).sendKeys("password456");
	}

	@And("i want to enter category name")
	public void i_want_to_enter_category_name() {
		 driver.findElement(By.name("Login")).submit();
		 driver.findElement(By.xpath("/html/body/main/div/div/div/div[1]/button/h4")).click();
	}

	@And("i want to enter subcategory name")
	public void i_want_to_enter_subcategory_name() {
		Actions b=new Actions(driver);
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[1]/div")).click();
		b.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		  driver.findElement(By.cssSelector("#subcategorydropid")).click();
		   b.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
	}

	@And("enter product name as {string}")
	public void enter_product_name_as(String string) {
		driver.findElement(By.xpath("//*[@id=\"prodid\"]")).sendKeys(string);
	}

	@And("enter price as {string}")
	public void enter_price_as(String string) {
		driver.findElement(By.xpath("//*[@id=\"priceid\"]")).sendKeys(string);
	}

	@And("enter quantity as {string}")
	public void enter_quantity_as(String string) {
		driver.findElement(By.xpath("//*[@id=\"quantityid\"]")).sendKeys(string);
	}

	@And("enter brand as {string}")
	public void enter_brand_as(String string) {
		driver.findElement(By.xpath("//*[@id=\"brandid\"]")).sendKeys(string);
	}

	@And("enter description as {string}")
	public void enter_description_as(String string) {
		driver.findElement(By.xpath("//*[@id=\"description\"]")).sendKeys(string);
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[10]/div/input[1]")).click();
	}


}