package end2endtesting;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

public class ProductDetailsPage {
	private WebDriver driver;
	private WebDriverWait wait;

	public ProductDetailsPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	}

	public void selectTheSize() {
		WebElement element = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#option-label-size-143-item-166")));
		element.click();

	}

	public void selectTheColor() {
		WebElement element = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#option-label-color-93-item-56")));
		element.click();
	}

	public void clearTheQtyField() {
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#qty")));
		element.clear();
	}

	public void selectTheQty() {
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#qty")));
		element.sendKeys("2");
	}

	public void addToCart() {
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("product-addtocart-button")));
		element.click();
	}

	public void clickShoppingCart() {
		WebElement element = wait.until(ExpectedConditions
				.elementToBeClickable(By.cssSelector("#maincontent>div.page>div:nth-child(2)>div>div>div>a")));
		element.click();

	}

}
