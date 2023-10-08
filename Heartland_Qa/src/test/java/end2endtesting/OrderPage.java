package end2endtesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrderPage {
	private WebDriver driver;
	private WebDriverWait wait;

	public OrderPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	public void placeTheOrder() throws InterruptedException {
		Thread.sleep(5000);
		
		WebElement elementToClick = driver.findElement(By.xpath("//input[@name=\"billing-address-same-as-shipping\"]"));
		if(!elementToClick.isSelected()){
				elementToClick.click();
		}
		driver.findElement(By.cssSelector(".action.primary.checkout span")).click();
		
		
	}

}
