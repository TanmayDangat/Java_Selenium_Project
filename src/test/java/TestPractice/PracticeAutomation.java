package TestPractice;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticeAutomation {

	WebDriver driver;
	
//	Constructor
	
	PracticeAutomation(WebDriver driver){
		this.driver=driver;
	}
	
//	Locators
	
	By shopMenu_xpath = By.xpath("//li[@id='menu-item-40']/a");
	By HomeMenu_xpath = By.xpath("//nav[@class='woocommerce-breadcrumb']/a");
	By slider_xpath = By.xpath("//div[@class='n2-ss-slide-background']");
	By arrivals_xpath = By.xpath("//div[@class='woocommerce']");
	By arrivalsImg_xpath = By.xpath("//img[@alt='Selenium Ruby']");
	By descriptionBtn_xpath = By.xpath("//li[@class='description_tab active']/a");
	By description_xpath = By.xpath("//div[@id='tab-description']/h2");
	By reviewBtn_xpath = By.xpath("//li[@class='reviews_tab']/a");
	By review_xpath = By.xpath("//div[@id='comments']/h2");
	By basketBtn_xpath = By.xpath("//button[@type='submit']");
	By viewBasket_xpath = By.xpath("//div[@class='woocommerce-message']/a");
	By price_xpath = By.xpath("//th[@class='product-price']");
	By proceedCheckout_xpath = By.xpath("//div[@class='wc-proceed-to-checkout']/a");
	By couponLink_xpath = By.xpath("//a[contains(text(),'Click here to enter your code')]");
	By coupon_xpath = By.xpath("//input[@id='coupon_code']");
	By applyCoupon_xpath = By.xpath("//input[@value='Apply Coupon']");
	By arrivalsImg2_xpath = By.xpath("//img[@alt='Thinking in HTML']");
	By errorMsg_xpath = By.xpath("//li[starts-with(text(),'The minimum')]");
	By removeBtn_xpath = By.xpath("//td[@class='product-remove']/a");
	By addBtn_xpath = By.xpath("//input[@type='number']");
	By updateBtn_xpath = By.xpath("//input[@name='update_cart']");
	By totalPriceRow_xpath = By.xpath("//tr[@class='order-total']");
	By subTotalPrice_xpath = By.xpath("(//span[contains(text(),'500.00')])[3]");
	By finalPrice_xpath = By.xpath("//span[contains(text(),'510.00')]");
	By billingDetails_xpath = By.xpath("//div[@class='woocommerce-billing-fields']/h3");
	By orderDetails_xpath = By.xpath("//h3[@id='order_review_heading']");
	By addDetails_xpath = By.xpath("//div[@class='woocommerce-shipping-fields']/h3");
	By payDetails_xpath = By.xpath("//div[@class='payment_box payment_method_cod']/p");
	By firstName_xpath = By.xpath("//input[@id='billing_first_name']");
	By lastName_xpath = By.xpath("//input[@id='billing_last_name']");
	By companyName_xpath = By.xpath("//input[@id='billing_company']");
	By email_xpath = By.xpath("//input[@id='billing_email']");
	By phoneNumber_xpath = By.xpath("//input[@id='billing_phone']");
	By countryDropdown_xpath = By.xpath("//div[@id='s2id_billing_country']");
	By countryDropdownSearch_xpath = By.xpath("//input[@id='s2id_autogen1_search']");
	By countriesList_xpath = By.xpath("//ul[@id='select2-results-1']");
	By streetAdd_xpath = By.xpath("//input[@placeholder='Street address']");
	By aptAdd_xpath = By.xpath("//input[@id='billing_address_2']");
	By city_xpath = By.xpath("//input[@id='billing_city']");
	By stateDropdown_xpath = By.xpath("(//span[@class='select2-arrow'])[2]");
	By stateDropdownSearch_xpath = By.xpath("//input[@id='s2id_autogen2_search']");
	By stateList_xpath = By.xpath("//ul[@id='select2-results-2']");
	By pincode_xpath = By.xpath("//input[@id='billing_postcode']");
	By payment_xpath = By.xpath("//label[@for='payment_method_cod']");
	By placeOrder_xpath = By.xpath("//input[@id='place_order']");
	By finalOrderDetails_xpath = By.xpath("(//h2)[1]");
	By finalCustomerDetails_xpath = By.xpath("");
	By finalBillingDetails_xpath = By.xpath("//header[@class='title']/h3");
	
//  Actions
	
	public void setShopMenu() {
		driver.findElement(shopMenu_xpath).click();
	}
	
	public void setHomeMenu() {
		driver.findElement(HomeMenu_xpath).click();
	}
	
	public int setSlider() {
		List <WebElement> sliders = driver.findElements(slider_xpath);
		return sliders.size();
	}
	
	public int setArrivals() {
		List <WebElement> arrivals = driver.findElements(arrivals_xpath);
		return arrivals.size();
	}
	
	public void setArrivalsImg() {
		driver.findElement(arrivalsImg_xpath).click();
	}
	
	public void setDescriptionBtn() {
		driver.findElement(descriptionBtn_xpath).click();
	}
	
	public void setReviewBtn() {
		driver.findElement(reviewBtn_xpath).click();
	}
	
	public void setBasketBtn() {
		driver.findElement(basketBtn_xpath).click();
	}
	
	public void setViewBasket() {
		driver.findElement(viewBasket_xpath).click();
	}
	
	public void setProceedCheckout() {
		driver.findElement(proceedCheckout_xpath).click();
	}
	
	public void setEnterCouponLink() {
		driver.findElement(couponLink_xpath).click();
	}
	
	public void setEnterCoupon(String coupon) {
		driver.findElement(coupon_xpath).sendKeys(coupon);
	}
	
	public void setApplyCoupon() {
		driver.findElement(applyCoupon_xpath).click();
	}
	
	public void setArrivalsImg2() {
		driver.findElement(arrivalsImg2_xpath).click();
	}
	
	public void setRemoveBook() {
		driver.findElement(removeBtn_xpath).click();
	}
	
	public void setAddBtn(String moreBook) {
		driver.findElement(addBtn_xpath).clear();
		driver.findElement(addBtn_xpath).sendKeys(moreBook);
	}
	
	public void setUpdateBtn() {
		driver.findElement(updateBtn_xpath).click();
	}
	
	public void setFirstname(String firstName) {
		driver.findElement(firstName_xpath).clear();
		driver.findElement(firstName_xpath).sendKeys(firstName);
	}
	
	public void setLastname(String lastName) {
		driver.findElement(lastName_xpath).clear();
		driver.findElement(lastName_xpath).sendKeys(lastName);
	}
	
	public void setCompanyName(String companyName) {
		driver.findElement(companyName_xpath).clear();
		driver.findElement(companyName_xpath).sendKeys(companyName);
	}
	
	public void setEmail(String emailName) {
		driver.findElement(email_xpath).clear();
		driver.findElement(email_xpath).sendKeys(emailName);
	}
	
	public void setPhoneNumber(String phoneNumber) {
		driver.findElement(phoneNumber_xpath).clear();
		driver.findElement(phoneNumber_xpath).sendKeys(phoneNumber);
	}
	
	public void setCountryDropdown() {
		driver.findElement(countryDropdown_xpath).click();
	}
	
	public void setCountryDropdownSearch(String country) {
		WebElement countryDropdownSearch = driver.findElement(countryDropdownSearch_xpath);
		countryDropdownSearch.sendKeys(country);
		countryDropdownSearch.sendKeys(Keys.ENTER);
	}
	
	public void setAddress(String address) {
		driver.findElement(streetAdd_xpath).clear();
		driver.findElement(streetAdd_xpath).sendKeys(address);
	}
	
	public void setAptAddress(String aptAddress) {
		driver.findElement(aptAdd_xpath).clear();
		driver.findElement(aptAdd_xpath).sendKeys(aptAddress);
	}
	
	public void setCity(String city) {
		driver.findElement(city_xpath).clear();
		driver.findElement(city_xpath).sendKeys(city);
	}

	public void setStateDropdown() {
		driver.findElement(stateDropdown_xpath).click();
	}
	
	public void setStateDropdownSearch(String state) {
		WebElement stateDropdownSearch = driver.findElement(stateDropdownSearch_xpath);
		stateDropdownSearch.sendKeys(state);
		stateDropdownSearch.sendKeys(Keys.ENTER);
	}
	
	public void setPincode(String pincode) {
		driver.findElement(pincode_xpath).clear();
		driver.findElement(pincode_xpath).sendKeys(pincode);
	}
	
	public void setPayment() {
		driver.findElement(payment_xpath).click();
	}
	
	public void setPlaceOrder() {
		driver.findElement(placeOrder_xpath).click();
	}
	
}