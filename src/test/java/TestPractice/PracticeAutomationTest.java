package TestPractice;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PracticeAutomationTest {

	WebDriver driver;
	PracticeAutomationFact pa;
	
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		pa = new PracticeAutomationFact(driver);
	}
	
	@Test(priority=1)
	void  home_Page_with_three_Sliders_only() {
		driver.get("http://practice.automationtesting.in/");
		pa.setShopMenu();
		pa.setHomeMenu();
		int sliderLen = pa.setSlider();
		Assert.assertEquals(sliderLen, 3, "There are total " + sliderLen + " sliders");
	}
	
	@Test(priority=2)
	void  home_page_with_three_Arrivals_only() {
		driver.get("http://practice.automationtesting.in/");
		pa.setShopMenu();
		pa.setHomeMenu();
		int arrivalsLen = pa.setArrivals();
		Assert.assertEquals(arrivalsLen, 3,"There are total " + arrivalsLen + " arrivals");
	}
	
	@Test(priority=3)
	void home_page_Images_in_Arrivals_should_navigate() {
		driver.get("http://practice.automationtesting.in/");
		pa.setShopMenu();
		pa.setHomeMenu();
		int arrivalsLen = pa.setArrivals();
		Assert.assertEquals(arrivalsLen, 3,"There are total " + arrivalsLen + " arrivals");
		WebElement arrivalsImage = pa.arrivalsImg_xpath;
		Assert.assertTrue(arrivalsImage.isEnabled() && arrivalsImage.isDisplayed());
		pa.setArrivalsImg();
		Assert.assertEquals(driver.getTitle(), "Selenium Ruby – Automation Practice Site");
	}
	
	@Test(priority=4)
	void home_page_Arrivals_Images_Description() {
		driver.get("http://practice.automationtesting.in/");
		pa.setShopMenu();
		pa.setHomeMenu();
		int arrivalsLen = pa.setArrivals();
		Assert.assertEquals(arrivalsLen, 3,"There are total " + arrivalsLen + " arrivals");
		WebElement arrivalsImage = pa.arrivalsImg_xpath;
		Assert.assertTrue(arrivalsImage.isEnabled() && arrivalsImage.isDisplayed());
		pa.setArrivalsImg();
		Assert.assertEquals(driver.getTitle(), "Selenium Ruby – Automation Practice Site");
		pa.setDescriptionBtn();
		String desc = pa.description_xpath.getText();
		Assert.assertEquals(desc, "Product Description");
	}
	
	@Test(priority=5)
	void home_page_Arrivals_Images_Reviews() throws InterruptedException {
		driver.get("http://practice.automationtesting.in/");
		pa.setShopMenu();
		pa.setHomeMenu();
		int arrivalsLen = pa.setArrivals();
		Assert.assertEquals(arrivalsLen, 3,"There are total " + arrivalsLen + " arrivals");
		WebElement arrivalsImage = pa.arrivalsImg_xpath;
		Assert.assertTrue(arrivalsImage.isEnabled() && arrivalsImage.isDisplayed());
		pa.setArrivalsImg();
		Assert.assertEquals(driver.getTitle(), "Selenium Ruby – Automation Practice Site");
		pa.setReviewBtn();
		Thread.sleep(5000);
		String rev = pa.review_xpath.getText();
		Assert.assertEquals(rev,"Reviews");
	}
	
	@Test(priority=6)
	void homepage_Arrivals_Images_Add_to_Basket() {
		driver.get("http://practice.automationtesting.in/");
		pa.setShopMenu();
		pa.setHomeMenu();
		int arrivalsLen = pa.setArrivals();
		Assert.assertEquals(arrivalsLen, 3,"There are total " + arrivalsLen + " arrivals");
		WebElement arrivalsImage = pa.arrivalsImg_xpath;
		Assert.assertTrue(arrivalsImage.isEnabled() && arrivalsImage.isDisplayed());
		pa.setArrivalsImg();
		Assert.assertEquals(driver.getTitle(), "Selenium Ruby – Automation Practice Site");
		pa.setBasketBtn();
		pa.setViewBasket();
		String price = pa.price_xpath.getText();
		Assert.assertEquals(price, "Price");
	}
	
	@Test(priority=7)
	void home_Arrivals_Add_to_Basket_Items() {
		driver.get("http://practice.automationtesting.in/");
		pa.setShopMenu();
		pa.setHomeMenu();
		int arrivalsLen = pa.setArrivals();
		Assert.assertEquals(arrivalsLen, 3,"There are total " + arrivalsLen + " arrivals");
		WebElement arrivalsImage = pa.arrivalsImg_xpath;
		Assert.assertTrue(arrivalsImage.isEnabled() && arrivalsImage.isDisplayed());
		pa.setArrivalsImg();
		Assert.assertEquals(driver.getTitle(), "Selenium Ruby – Automation Practice Site");
		pa.setBasketBtn();
		pa.setViewBasket();
		String price = pa.price_xpath.getText();
		Assert.assertEquals(price, "Price");
		WebElement proceedBtn = pa.proceedCheckout_xpath;
		Assert.assertTrue(proceedBtn.isEnabled() && proceedBtn.isDisplayed());
		pa.setProceedCheckout();
	}
	
	@Test(priority=8)
	void home_Arrivals_Add_to_Basket_Items_Coupon() {
		driver.get("http://practice.automationtesting.in/");
		pa.setShopMenu();
		pa.setHomeMenu();
		int arrivalsLen = pa.setArrivals();
		Assert.assertEquals(arrivalsLen, 3,"There are total " + arrivalsLen + " arrivals");
		WebElement arrivalsImage = pa.arrivalsImg_xpath;
		Assert.assertTrue(arrivalsImage.isEnabled() && arrivalsImage.isDisplayed());
		pa.setArrivalsImg();
		Assert.assertEquals(driver.getTitle(), "Selenium Ruby – Automation Practice Site");
		pa.setBasketBtn();
		pa.setViewBasket();
		String price = pa.price_xpath.getText();
		Assert.assertEquals(price, "Price");
		WebElement proceedBtn = pa.proceedCheckout_xpath;
		Assert.assertTrue(proceedBtn.isEnabled() && proceedBtn.isDisplayed());
		pa.setProceedCheckout();
		pa.setEnterCouponLink();
		pa.setEnterCoupon("krishnasakinala");
		pa.setApplyCoupon();
	}
	
	@Test(priority=9)
	void home_Arrivals_Add_to_Basket_Items_Coupon_value_less_than_450() {
		driver.get("http://practice.automationtesting.in/");
		pa.setShopMenu();
		pa.setHomeMenu();
		int arrivalsLen = pa.setArrivals();
		Assert.assertEquals(arrivalsLen, 3,"There are total " + arrivalsLen + " arrivals");
		WebElement arrivalsImage = pa.arrivalsImg_xpath;
		Assert.assertTrue(arrivalsImage.isEnabled() && arrivalsImage.isDisplayed());
		pa.setArrivalsImg2();
		Assert.assertEquals(driver.getTitle(), "Thinking in HTML – Automation Practice Site");
		pa.setBasketBtn();
		pa.setViewBasket();
		String price = pa.price_xpath.getText();
		Assert.assertEquals(price, "Price");
		WebElement proceedBtn = pa.proceedCheckout_xpath;
		Assert.assertTrue(proceedBtn.isEnabled() && proceedBtn.isDisplayed());
		pa.setProceedCheckout();
		pa.setEnterCouponLink();
		pa.setEnterCoupon("krishnasakinala");
		pa.setApplyCoupon();
		String errorMsg = pa.errorMsg_xpath.getText();
		String actualErrMsg = "The minimum spend for this coupon is ₹450.00.\r\n"
				+ "";
		Assert.assertEquals(errorMsg.replaceAll("\\p{C}", "").trim(), actualErrMsg.replaceAll("\\p{C}", "").trim());
	}
	
	@Test(priority=10)
	void home_Arrivals_Add_to_Basket_Items_Remove_book() {
		driver.get("http://practice.automationtesting.in/");
		pa.setShopMenu();
		pa.setHomeMenu();
		int arrivalsLen = pa.setArrivals();
		Assert.assertEquals(arrivalsLen, 3,"There are total " + arrivalsLen + " arrivals");
		WebElement arrivalsImage = pa.arrivalsImg_xpath;
		Assert.assertTrue(arrivalsImage.isEnabled() && arrivalsImage.isDisplayed());
		pa.setArrivalsImg();
		Assert.assertEquals(driver.getTitle(), "Selenium Ruby – Automation Practice Site");
		pa.setBasketBtn();
		pa.setViewBasket();
		String price = pa.price_xpath.getText();
		Assert.assertEquals(price, "Price");
		pa.setRemoveBook();
	}
	
	@Test(priority=11)
	void home_Arrivals_Add_to_Basket_Items_Add_book() {
		driver.get("http://practice.automationtesting.in/");
		pa.setShopMenu();
		pa.setHomeMenu();
		int arrivalsLen = pa.setArrivals();
		Assert.assertEquals(arrivalsLen, 3,"There are total " + arrivalsLen + " arrivals");
		WebElement arrivalsImage = pa.arrivalsImg_xpath;
		Assert.assertTrue(arrivalsImage.isEnabled() && arrivalsImage.isDisplayed());
		pa.setArrivalsImg();
		Assert.assertEquals(driver.getTitle(), "Selenium Ruby – Automation Practice Site");
		pa.setBasketBtn();
		pa.setViewBasket();
		String price = pa.price_xpath.getText();
		Assert.assertEquals(price, "Price");
		pa.setAddBtn("4");
		WebElement updateBtn = pa.updateBtn_xpath;
		Assert.assertTrue(updateBtn.isEnabled() && updateBtn.isDisplayed());
		pa.setUpdateBtn();
	}
	
	@Test(priority=12)
	void home_Arrivals_Add_to_Basket_Items_Check_out_Book_Final_price() {
		driver.get("http://practice.automationtesting.in/");
		pa.setShopMenu();
		pa.setHomeMenu();
		int arrivalsLen = pa.setArrivals();
		Assert.assertEquals(arrivalsLen, 3,"There are total " + arrivalsLen + " arrivals");
		WebElement arrivalsImage = pa.arrivalsImg_xpath;
		Assert.assertTrue(arrivalsImage.isEnabled() && arrivalsImage.isDisplayed());
		pa.setArrivalsImg();
		Assert.assertEquals(driver.getTitle(), "Selenium Ruby – Automation Practice Site");
		pa.setBasketBtn();
		pa.setViewBasket();
		String price = pa.price_xpath.getText();
		Assert.assertEquals(price, "Price");
		WebElement proceedBtn = pa.proceedCheckout_xpath;
		Assert.assertTrue(proceedBtn.isEnabled() && proceedBtn.isDisplayed());
		pa.setProceedCheckout();
		WebElement finalPrice = pa.totalPriceRow_xpath;
		Assert.assertTrue(finalPrice.isDisplayed());
	}
	
	@Test(priority=13)
	void home_Arrivals_Add_to_Basket_Items_Check_out_Update_Basket() {
		driver.get("http://practice.automationtesting.in/");
		pa.setShopMenu();
		pa.setHomeMenu();
		int arrivalsLen = pa.setArrivals();
		Assert.assertEquals(arrivalsLen, 3,"There are total " + arrivalsLen + " arrivals");
		WebElement arrivalsImage = pa.arrivalsImg_xpath;
		Assert.assertTrue(arrivalsImage.isEnabled() && arrivalsImage.isDisplayed());
		pa.setArrivalsImg();
		Assert.assertEquals(driver.getTitle(), "Selenium Ruby – Automation Practice Site");
		pa.setBasketBtn();
		pa.setViewBasket();
		String price = pa.price_xpath.getText();
		Assert.assertEquals(price, "Price");
		pa.setAddBtn("4");
		WebElement updateBtn = pa.updateBtn_xpath;
		Assert.assertTrue(updateBtn.isEnabled() && updateBtn.isDisplayed());
		pa.setUpdateBtn();
	}
	
	@Test(priority=14)
	void home_Arrivals_Add_to_Basket_Items_Check_out_Total_and_Sub_total_condition() {
		driver.get("http://practice.automationtesting.in/");
		pa.setShopMenu();
		pa.setHomeMenu();
		int arrivalsLen = pa.setArrivals();
		Assert.assertEquals(arrivalsLen, 3,"There are total " + arrivalsLen + " arrivals");
		WebElement arrivalsImage = pa.arrivalsImg_xpath;
		Assert.assertTrue(arrivalsImage.isEnabled() && arrivalsImage.isDisplayed());
		pa.setArrivalsImg();
		Assert.assertEquals(driver.getTitle(), "Selenium Ruby – Automation Practice Site");
		pa.setBasketBtn();
		pa.setViewBasket();
		String price = pa.price_xpath.getText();
		Assert.assertEquals(price, "Price");
		String subTotalPrice = pa.subTotalPrice_xpath.getText();
		String finalPrice = pa.finalPrice_xpath.getText();
		String newSubTotalPrice = subTotalPrice.replaceAll("[^\\d.]","");
		String newFinalPrice = finalPrice.replaceAll("[^\\d.]","");
		double subTotalPriceInt = Double.parseDouble(newSubTotalPrice);
		double finalPriceInt = Double.parseDouble(newFinalPrice);
		Assert.assertTrue(subTotalPriceInt < finalPriceInt);
	}
	
	@Test(priority=15)
	void home_Arrivals_Add_to_Basket_Items_Check_out_functionality() {
		driver.get("http://practice.automationtesting.in/");
		pa.setShopMenu();
		pa.setHomeMenu();
		int arrivalsLen = pa.setArrivals();
		Assert.assertEquals(arrivalsLen, 3,"There are total " + arrivalsLen + " arrivals");
		WebElement arrivalsImage = pa.arrivalsImg_xpath;
		Assert.assertTrue(arrivalsImage.isEnabled() && arrivalsImage.isDisplayed());
		pa.setArrivalsImg();
		Assert.assertEquals(driver.getTitle(), "Selenium Ruby – Automation Practice Site");
		pa.setBasketBtn();
		pa.setViewBasket();
		String price = pa.price_xpath.getText();
		Assert.assertEquals(price, "Price");
		String subTotalPrice = pa.subTotalPrice_xpath.getText();
		String finalPrice = pa.finalPrice_xpath.getText();
		String newSubTotalPrice = subTotalPrice.replaceAll("[^\\d.]","");
		String newFinalPrice = finalPrice.replaceAll("[^\\d.]","");
		double subTotalPriceInt = Double.parseDouble(newSubTotalPrice);
		double finalPriceInt = Double.parseDouble(newFinalPrice);
		Assert.assertTrue(subTotalPriceInt < finalPriceInt);
		pa.setProceedCheckout();
		Assert.assertEquals(driver.getTitle(), "Checkout – Automation Practice Site");
	}
	
	@Test(priority=16)
	void home_Arrivals_Add_to_Basket_Items_Check_out_Payment_Gateway() throws InterruptedException {
		driver.get("http://practice.automationtesting.in/");
		pa.setShopMenu();
		pa.setHomeMenu();
		int arrivalsLen = pa.setArrivals();
		Assert.assertEquals(arrivalsLen, 3,"There are total " + arrivalsLen + " arrivals");
		WebElement arrivalsImage = pa.arrivalsImg_xpath;
		Assert.assertTrue(arrivalsImage.isEnabled() && arrivalsImage.isDisplayed());
		pa.setArrivalsImg();
		Assert.assertEquals(driver.getTitle(), "Selenium Ruby – Automation Practice Site");
		pa.setBasketBtn();
		pa.setViewBasket();
		String price = pa.price_xpath.getText();
		Assert.assertEquals(price, "Price");
		String subTotalPrice = pa.subTotalPrice_xpath.getText();
		String finalPrice = pa.finalPrice_xpath.getText();
		String newSubTotalPrice = subTotalPrice.replaceAll("[^\\d.]","");
		String newFinalPrice = finalPrice.replaceAll("[^\\d.]","");
		double subTotalPriceInt = Double.parseDouble(newSubTotalPrice);
		double finalPriceInt = Double.parseDouble(newFinalPrice);
		Assert.assertTrue(subTotalPriceInt < finalPriceInt);
		pa.setProceedCheckout();
		pa.setEnterCouponLink();
		pa.setEnterCoupon("krishnasakinala");
		pa.setApplyCoupon();
		String billingDetails = pa.billingDetails_xpath.getText();
		Assert.assertEquals(billingDetails, "Billing Details");
		String orderDetails = pa.orderDetails_xpath.getText();
		Assert.assertEquals(orderDetails, "Your order");
		String addDetails = pa.addDetails_xpath.getText();
		Assert.assertEquals(addDetails, "Additional Information");
		pa.setFirstname("rahul");
		pa.setLastname("patil");
		pa.setCompanyName("Amazon");
		pa.setEmail("rahul@demo.com");
		pa.setPhoneNumber("1234567890");
		pa.setCountryDropdown();
		pa.setCountryDropdownSearch("United States (US)");
		pa.setAddress("West Road");
		pa.setAptAddress("A10");
		pa.setCity("Pune");
		pa.setStateDropdown();
		pa.setStateDropdownSearch("Alabama");
		pa.setPincode("35000");
		Thread.sleep(5000);
		pa.setPayment();
	}
	
	@Test(priority=17)
	void home_Arrivals_Add_to_Basket_Items_Check_out_Payment_Gateway_Place_order() throws InterruptedException {
		driver.get("http://practice.automationtesting.in/");
		pa.setShopMenu();
		pa.setHomeMenu();
		int arrivalsLen = pa.setArrivals();
		Assert.assertEquals(arrivalsLen, 3,"There are total " + arrivalsLen + " arrivals");
		WebElement arrivalsImage = pa.arrivalsImg_xpath;
		Assert.assertTrue(arrivalsImage.isEnabled() && arrivalsImage.isDisplayed());
		pa.setArrivalsImg();
		Assert.assertEquals(driver.getTitle(), "Selenium Ruby – Automation Practice Site");
		pa.setBasketBtn();
		pa.setViewBasket();
		String price = pa.price_xpath.getText();
		Assert.assertEquals(price, "Price");
		String subTotalPrice = pa.subTotalPrice_xpath.getText();
		String finalPrice = pa.finalPrice_xpath.getText();
		String newSubTotalPrice = subTotalPrice.replaceAll("[^\\d.]","");
		String newFinalPrice = finalPrice.replaceAll("[^\\d.]","");
		double subTotalPriceInt = Double.parseDouble(newSubTotalPrice);
		double finalPriceInt = Double.parseDouble(newFinalPrice);
		Assert.assertTrue(subTotalPriceInt < finalPriceInt);
		pa.setProceedCheckout();
		String billingDetails = pa.billingDetails_xpath.getText();
		Assert.assertEquals(billingDetails, "Billing Details");
		String orderDetails = pa.orderDetails_xpath.getText();
		Assert.assertEquals(orderDetails, "Your order");
		String addDetails = pa.addDetails_xpath.getText();
		Assert.assertEquals(addDetails, "Additional Information");
		pa.setFirstname("rahul");
		pa.setLastname("patil");
		pa.setCompanyName("Amazon");
		pa.setEmail("rahul@demo.com");
		pa.setPhoneNumber("1234567890");
		pa.setCountryDropdown();
		pa.setCountryDropdownSearch("United States (US)");
		pa.setAddress("West Road");
		pa.setAptAddress("A10");
		pa.setCity("Pune");
		pa.setStateDropdown();
		pa.setStateDropdownSearch("Alabama");
		pa.setPincode("35000");
		Thread.sleep(5000);
		pa.setPayment();
		Thread.sleep(5000);
		pa.setPlaceOrder();
		Thread.sleep(5000);
		String finalOrderDetails = pa.finalOrderDetails_xpath.getText();
		Assert.assertEquals(finalOrderDetails, "Order Details");
		Thread.sleep(5000);
	}
	
	@AfterMethod
	void tearDown() {
		driver.quit();
	}
}
