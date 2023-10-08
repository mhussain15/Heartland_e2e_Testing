package end2endtesting;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrderConfirmationPage {
	private WebDriver driver;
	private WebDriverWait wait;

	public OrderConfirmationPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	public void placeTheOrder() {
//		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".checkout-success")));
//		element.isDisplayed();
		driver.findElement(By.cssSelector(".checkout-success")).isDisplayed();
	}

}