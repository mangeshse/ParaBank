package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.cucumberSteps.BaseClass;

public class HomePage {
	public HomePage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

	
	

}


