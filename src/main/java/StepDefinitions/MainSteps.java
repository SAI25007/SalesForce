package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {
	WebDriver driver = new ChromeDriver();
	
	
	@Given("SalesForce page need to displayed")
	public void sales_force_login_page_need_to_displayed() throws InterruptedException {
       System.setProperty("WebDriver.chrome.driver","C:\\Users\\2000078054\\eclipse-workspace\\WebAutomation\\drivers\\chromedriver.exe");
		//driver is the object of WebDriver class integrated with chromeDriver methods
		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		Thread.sleep(2000);
		driver.manage().window().maximize();
//		driver.
		driver.findElement(By.id("username")).sendKeys("Sai@sfdc2024.com");
		driver.findElement(By.id("password")).sendKeys("Testing2024");
		driver.findElement(By.id("Login")).click();
//		Thread.sleep(4000);
//		System.out.println(driver.findElement(By.xpath("//span[@class='sellerHomeSubtitle slds-text-body_regular slds-m-left_large']")).getText());
//		Assert.assertEquals(driver.findElement(By.xpath("//span[@class='sellerHomeSubtitle slds-text-body_regular slds-m-left_large']")).getText(),"Good afternoon, Naga Sai. Let's get selling!");
		System.out.println("User reached Salesforce page");
	}
	
	@When("User entered the username and password")
	public void user_entered_the_username_and_password() throws InterruptedException {
//		Sales App steps
//		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
//		WebElement searchBox = driver.findElement(By.className("slds-input"));
//        searchBox.sendKeys("Sales");
//        Thread.sleep(2000);
//        driver.findElement(By.className("slds-dropdown__item")).click();
//        System.out.println("User entered sales application");
		System.out.println("User enterd username and password");
	}
	
	@When("Navigate to sales application")
	public void enter_sales_app_in_application() throws InterruptedException {
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		Thread.sleep(2000);
//		driver.findElement(By.className("slds-input")).sendKeys("Sales");
		driver.findElement(By.xpath("//input[@placeholder='Search apps and items...']")).sendKeys("Sales");
// Press Enter key to trigger search
//        searchBox.sendKeys(Keys.ENTER);
//        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@id='07pdL00000042OOQAY']//b[contains(text(),'Sales')]")).click();
//        Thread.sleep(4000);
        System.out.println("User entered sales application");
        
	}
	
	@Then("^Create new account with name (.+) and contact (.+)$")
	public void create_new_account(String name, String contact) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		Thread.sleep(4000);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.findElement(By.xpath("//a[@href='/lightning/o/Account/home']")).click();
//		driver.findElement(By.xpath("//a[title='Accounts']")).click();
		driver.findElement(By.xpath("//button[@aria-label='Search']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search...']")).sendKeys("My Accounts");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//mark[@class='data-match' and text()='My Accounts']")).click();
		driver.findElement(By.xpath("//span[@title='My Accounts']")).click();
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='New']")).click();
//	    WebDriverWait wait = new WebDriverWait(driver, 10);
//	        WebElement addAccountOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Add Account')]")));

	        // Click on the "Add Account" option
//	        addAccountOption.click();
//        driver.findElement(By.xpath("//div[@title='New']")).click();
//        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(name);
        driver.findElement(By.xpath("//input[@name='Phone']")).sendKeys(contact);
        driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		System.out.println("User created a new account");
	}
	
	@And("Enter name Contact and Mail")
	public void enter_name_test3_contact_and_mail_sai_gmail_com() {
	    System.out.println("User entered the details");
	}
	
	
	@Then("SalesForce web page is loged in")
	public void sales_force_web_page_is_loged_in() {
		driver.close();
         System.out.println("Uesr Succeully loged in to SalesForce website");
	}
	
	
//	Create an Sales user account
	
	@Then("Account is created")
	public void account_is_created() {
	    System.out.println("User Account is created");
	}

}
