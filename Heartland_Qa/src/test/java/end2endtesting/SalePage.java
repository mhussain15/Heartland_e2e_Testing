package end2endtesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SalePage {
	private WebDriver driver;
	private WebDriverWait wait;

	public SalePage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	public void clickOnTees() {
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//main[@id='maincontent']//ul[1]//li[3]//a[1]")));
		element.click();
	}

}
