package com.cucumberSteps;
import com.config.Configuration;
import com.keywords.KeyWord;
import com.pages.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	KeyWord key = new KeyWord();
	Configuration con = new Configuration();
	LoginPage page = new LoginPage();

	@Given("Launched application")
	public void openUrl() {
		key.launchUrl(con.getAppUrl("beta"));
	}
	@When("Username and password is Entered and click on login button")
	public void enterUserNameAndPassword() {
		page.enterUserNameAndPassWord();
	}
	@Then("verify successful login or not")
	public void checkSuccLoginOrNot() {
		page.checkSuccessfulLogin();
	}
	@Given("Launched application url")
	public void launchUrl() {
		key.launchUrl(con.getAppUrl("beta"));
	}
	@When("Invaild username and password is Entered and click on login button")
	public void invalidUserAndPass() {
		page.fillInvalidDetails();
	}
	@Then("verify get error message")
	public void getErrorMessage() {
		
	}
	@Given("Launched login account url")
	public void openAccountUrl() {
		key.launchUrl(con.getAppUrl("beta"));
		page.enterUserNameAndPassWord();
	}
	@When("Click on open ac button and choose ac type and select existing ac number")
	public void createNewAccount() {
		page.openNewAccount();
	}
	@Then("Should get a success message for ac creation")
	public void openAcMsg() {
		page.getSuccessMsg();

	}
	@And("validate new account number")
	public void getValidateAcNo() {
		page.validateAccountNumber();
	}
	@Given("Launched login url")
	public void launchedUrl() {
		key.launchUrl(con.getAppUrl("beta"));
		page.enterUserNameAndPassWord();
	}
	@When("click on transfer button and enter amount and select from account no to to account no")
	public void transferMoney() {
		page.transferMoneyToAnotherAc();
	}
	@Then("click on transfer button get transfer complete")
	public void clickTransferButton() {
		page.clickOnTranseferButton();
	}
}
