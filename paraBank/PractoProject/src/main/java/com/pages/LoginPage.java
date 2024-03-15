package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.cucumberSteps.BaseClass;

public class LoginPage {
	public LoginPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	@FindBy(css="#loginPanel > form > div:nth-child(2) > input")
	WebElement userName;
	@FindBy(css="#loginPanel > form > div:nth-child(4) > input")
	WebElement PassWord;
	@FindBy(css="#loginPanel > form > div:nth-child(5) > input")
	WebElement loginButton;
	
	public void enterUserNameAndPassWord() {
		userName.sendKeys("mangeshekshinge07@gmail.com");
		PassWord.sendKeys("Pass@123");
		loginButton.click();

	}
	@FindBy(css="#rightPanel > div > div > h1")
	WebElement text;
	public void checkSuccessfulLogin() {
		String actualResult = text.getText();
		String expectedResult = "Accounts Overview";
		Assert.assertEquals(actualResult, expectedResult);
	
	}
	public void fillInvalidDetails() {
		userName.sendKeys("shfndbudud");
		PassWord.sendKeys("123445");
		loginButton.click();
	}
	@FindBy(css="#leftPanel > ul > li:nth-child(1) > a")
	WebElement openNewAc;
	@FindBy(css="@FindBy(css=\"#leftPanel > ul > li:nth-child(1) > a\")")
	WebElement saving;
	@FindBy(css="#fromAccountId > option")
	WebElement existingAcNo;
	@FindBy(css="#rightPanel > div > div > form > div > input")
	WebElement openNewAccount;
	public void openNewAccount() {
		openNewAc.click();
		saving.click();
		existingAcNo.click();
		openNewAccount.click();
	}
	
	@FindBy(css="@FindBy(css=\"#rightPanel > div > div > form > div > input\")\r\n"
			+ "	WebElement openNewAccount;")
	WebElement getmsg;
	public void getSuccessMsg() {
		String actualResult = getmsg.getText();
		String expectedResult = "Account Opened!";
		Assert.assertEquals(actualResult, expectedResult);
	}
	@FindBy(css="#newAccountId")
	WebElement newAcNo;
	public void validateAccountNumber() {
		String actualResult = newAcNo.getText();
		//String expectedResult = 
		//Assert.assertEquals(actualResult, expectedResult);
	
	}
	@FindBy(css="#leftPanel > ul > li:nth-child(3) > a")
	WebElement transferFunds;
	@FindBy(css="#amount")
	WebElement enterAmount;
	@FindBy(css="#fromAccountId > option")
	WebElement fromAc;
	@FindBy(css="#toAccountId > option:nth-child(4)")
	WebElement ToAccount;
	public void transferMoneyToAnotherAc() {
		transferFunds.click();
		enterAmount.sendKeys("10000");
		fromAc.click();
		ToAccount.click();
	}
	@FindBy(css="#rightPanel > div > div > form > div:nth-child(4) > input")
	WebElement transfer;
	public void clickOnTranseferButton() {
		transfer.click();

	}
}
