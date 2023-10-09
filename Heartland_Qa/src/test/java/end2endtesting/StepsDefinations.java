package end2endtesting;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class StepsDefinations {

	WebDriver driver = null;
	WebDriverWait wait;
	HomePage hp;
	SalePage sp;
	ProductPage pp;
	ProductDetailsPage pd;
	ShoppingCartPage sc;
	BillingPage blp;
	OrderPage op;
	OrderConfirmationPage oc;

	@Given("Open the Browser")
	public void openBrowser() {
		//System.setProperty("webdriver.chrome.driver",
		//		"C://Users//antim//Downloads//chromedriver-win32//chromedriver-win32//chromedriver.exe/");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@When("Navigate to the homepage")
	public void Homepage() {
		hp = new HomePage(driver);
		hp.nevigateToTheHomePage();
	}

	@And("Add an item to the cart")
	public void addProduct() {
		hp = new HomePage(driver);
		sp = new SalePage(driver);
		pp = new ProductPage(driver);
		pd = new ProductDetailsPage(driver);
		sp.clickOnTees();
		pp.clickTheProduct();
		pd.selectTheSize();
		pd.selectTheColor();
		pd.clearTheQtyField();
		pd.selectTheQty();
		pd.addToCart();
		pd.clickShoppingCart();
	}

	@And("Checkout successfully")
	public void Checkout() throws InterruptedException {
		sc = new ShoppingCartPage(driver);
		op = new OrderPage(driver);
		blp = new BillingPage(driver);
		sc.proceedsCheckout();
		blp.enterBillingDetails();
		op.placeTheOrder();
	}

	@Then("Order should be placed successfully")
	public void orderConfirmation() {
		oc = new OrderConfirmationPage(driver);
		oc.placeTheOrder();
	}

	@And("Close the browser")
	public void close_the_browser() {
	   driver.quit();
	}

}
