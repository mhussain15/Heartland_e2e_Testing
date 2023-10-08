package end2endtesting;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BillingPage {
	private WebDriver driver;
	private WebDriverWait wait;

	public BillingPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	public void enterBillingDetails() {

		WebElement Email = wait.until(
				ExpectedConditions.elementToBeClickable(By.cssSelector("#customer-email-fieldset>div>div>input")));
		Email.sendKeys("mhussain.ny@gmail.com");

		WebElement FirstName = wait.until(ExpectedConditions
				.elementToBeClickable(By.cssSelector("#shipping-new-address-form>div:nth-child(1)>div>input")));
		FirstName.sendKeys("Mohammed");

		WebElement LastName = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector("#shipping-new-address-form>div:nth-child(2)>div>input")));
		LastName.sendKeys("Hussain");

		WebElement StreetAddress = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[@name=\"shippingAddress.street.0\"]//input")));
		StreetAddress.sendKeys("123 abc street");

		WebElement CityName = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[@name=\"shippingAddress.city\"]//input")));
		CityName.sendKeys("Brooklyn");

		// Select State
		WebElement DropDownEle = driver.findElement(By.xpath("//div[@name=\"shippingAddress.region_id\"]//select"));
		Select dropdown = new Select(DropDownEle);
		dropdown.selectByVisibleText("New York");

		WebElement ZipCode = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[@name=\"shippingAddress.postcode\"]//input")));
		ZipCode.sendKeys("12345");

		WebElement PhoneNumber = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[@name=\"shippingAddress.telephone\"]//input")));
		PhoneNumber.sendKeys("347-456-7890");

		driver.findElement(By.cssSelector("input[name= \"ko_unique_1\"]")).click();
		driver.findElement(By.cssSelector(".button")).click();

	}

}
