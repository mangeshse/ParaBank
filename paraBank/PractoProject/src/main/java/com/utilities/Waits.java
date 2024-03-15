package com.utilities;

import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import com.cucumberSteps.BaseClass;

public class Waits {
	private static FluentWait<WebDriver> wait;
	static {
		wait = new FluentWait<WebDriver>(BaseClass.getDriver());
		wait.pollingEvery(Duration.ofMillis(500));
		wait.ignoring(NoSuchElementException.class);
		wait.withTimeout(Duration.ofSeconds(60));

	}

	public static void staleElement(WebElement element) {
		wait.until(ExpectedConditions.stalenessOf(element));
	}

	public void waitImplicit() {
		BaseClass.getDriver().manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
	}

}
