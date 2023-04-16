package Stepdefinitions;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

	@Given("^User launch chrome browser$")
	public void user_launch_chrome_browser() throws Throwable {
		System.out.println("launch chrome browser");
	}

	@When("User opens URL{String}")
	public void user_opens_URL(String arg1) throws Throwable {
		System.out.println("User opens URL");
	}

	@When("^User enters Email as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
	public void user_enters_Email_as_and_Password_as(String arg1, String arg2) throws Throwable {
		System.out.println("User enters Email and Password ");
	}

	@When("^click on login$")
	public void click_on_login() throws Throwable {
		System.out.println("click on login");
	}

	@Then("^page title should be \"([^\"]*)\"$")
	public void page_title_should_be(String arg1) throws Throwable {
		System.out.println("page title");
	}

	@When("^User click on logout link$")
	public void user_click_on_logout_link() throws Throwable {
		System.out.println("User click on logout link");
	}

	@Then("^close browser$")
	public void close_browser() throws Throwable {
		System.out.println("close browser");
	}

}
