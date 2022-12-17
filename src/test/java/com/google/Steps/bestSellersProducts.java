package com.google.Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.google.Common.TestBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class bestSellersProducts extends TestBase{
	
	
	@Given("I am in the home page")
	public void i_am_in_the_home_page() {
			
		LaunchBrowser();
	
	}

	@When("I click on the all button")
	public void i_click_on_the_all_button() {
		
		WebElement allbutton= driver.findElement(By.id("nav-hamburger-menu"));
	    allbutton.click();
		
		
	}

	@When("I click on the best seller button")
	public void i_click_on_the_best_seller_button() {
		
		WebElement bestSeller = driver.findElement(By.xpath("(//a[@class='hmenu-item' and  contains (text(), 'Best Sellers')])[1]"));
		bestSeller.click();
	}

	@Then("I can see the lists of all the best selling products successfully")
	public void i_can_see_the_lists_of_all_the_best_selling_products_successfully() {
	   
	}
	

}
