package com.stepdefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStep {
	WebDriver driver ;
	@Given("user is on the home page")
	public void a() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}
	@When("user should enter {string},{string}")
	public void user_should_enter(String username, String password) {
		WebElement txtUserName = driver.findElement(By.id("username"));
		txtUserName.sendKeys(username);
		WebElement txtPassword = driver.findElement(By.id("password"));
		txtPassword.sendKeys(password);
	}
	@When("user should click login botton")
	public void c() {
		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();
	}
	@Then("user verify login success page")
	public void d() {
		Assert.assertTrue("Verify login msz", true);
	}
	@When("user should slelct the {string},{string},{string},{string}")
	public void user_should_slelct_the(String location, String Hotels, String Room_Type, String No_Of_Rooms) {
		WebElement ddnLoc = driver.findElement(By.name("location"));
		Select s = new Select(ddnLoc);
		s.selectByVisibleText(location);
		WebElement ddnHotels = driver.findElement(By.id("hotels"));
		Select s1 = new Select(ddnHotels);
		s1.selectByVisibleText(Hotels);
		WebElement ddnRoomtype = driver.findElement(By.id("room_type"));
		Select s2 = new Select(ddnRoomtype);
		s2.selectByVisibleText(Room_Type);
		WebElement ddnRoomNos = driver.findElement(By.id("room_nos"));
		Select s3 = new Select(ddnRoomNos);
		s3.selectByVisibleText(No_Of_Rooms);	
	}

	@When("user should enter and select the {string},{string}{string},{string}")
	public void user_should_enter_and_select_the(String check_in_date, String check_out_date, String adult_per_room, String child_per_room) {
		WebElement txtCheckin = driver.findElement(By.id("datepick_in"));
		txtCheckin.sendKeys(check_in_date);
		WebElement txtCkeckOut = driver.findElement(By.id("datepick_out"));
		txtCkeckOut.sendKeys(check_out_date);
		WebElement adultPerRoom = driver.findElement(By.id("adult_room"));
		Select s4 = new Select(adultPerRoom);
		s4.selectByVisibleText(adult_per_room);
		WebElement ddnchildpr = driver.findElement(By.id("child_room"));
		Select s5 = new Select(ddnchildpr);
		s5.selectByVisibleText(child_per_room);
	}
	@When("user should click the search botton")
	public void user_should_click_the_search_botton() {
		WebElement clkSearch = driver.findElement(By.id("Submit"));
		clkSearch.click();	
	}
	@When("user enter select hotel page they should click radio botton")
	public void user_enter_select_hotel_page_they_should_click_radio_botton() {
		WebElement radioBtn = driver.findElement(By.id("radiobutton_0"));
		radioBtn.click();
	}
	@When("user should click continue botton")
	public void user_should_click_continue_botton() {
		WebElement btnContinue = driver.findElement(By.id("continue"));
		btnContinue.click();
	}

	@When("user should enter {string},{string},{string},{string}")
	public void user_should_enter(String First_Name, String Last_Name, String Billing_Address, String Credit_Card_NO) {
		WebElement txtFirstName = driver.findElement(By.id("first_name"));
		txtFirstName.sendKeys(First_Name);
		WebElement txtLastName = driver.findElement(By.id("last_name"));
		txtLastName.sendKeys(Last_Name);
		WebElement txtAdd = driver.findElement(By.id("address"));
		txtAdd.sendKeys(Billing_Address);
		WebElement txtCvvNo = driver.findElement(By.id("cc_num"));
		txtCvvNo.sendKeys(Credit_Card_NO);
	}
	@When("user should select the {string},{string},{string},{string}")
	public void user_should_select_the(String Credit_Card_Type, String Expiey_month, String Expiry_year, String ccv_no) {
		WebElement ddnCardtype = driver.findElement(By.id("cc_type"));
		Select s6 = new Select(ddnCardtype);
		s6.selectByVisibleText(Credit_Card_Type);
		WebElement ddnMonth = driver.findElement(By.id("cc_exp_month"));
		Select s7 = new Select(ddnMonth);
		s7.selectByVisibleText(Expiey_month);
		WebElement ddnYear = driver.findElement(By.id("cc_exp_year"));
		Select s8 = new Select(ddnYear);
		s8.selectByVisibleText(Expiry_year);
		WebElement txtCvv = driver.findElement(By.id("cc_cvv"));
		txtCvv.sendKeys(ccv_no);
	}
	@When("user should click book noe botton")
	public void user_should_click_book_noe_botton() {
		WebElement clkBookNow = driver.findElement(By.id("book_now"));
		clkBookNow.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement attribute = driver.findElement(By.id("order_no"));
		String string = attribute.getAttribute("value");
		System.out.println(string);
		
	}
















}
