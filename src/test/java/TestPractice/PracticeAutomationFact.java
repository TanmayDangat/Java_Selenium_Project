package TestPractice;

import java.util.List;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticeAutomationFact {
	WebDriver driver;
	
//	Constructor
	PracticeAutomationFact(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	
//  Locators
	@FindBy(xpath= "//li[@id='menu-item-40']/a")
	WebElement shop_xpath;
	
	@FindBy(xpath="//nav[@class='woocommerce-breadcrumb']/a")
	WebElement home_xpath;
	
	@FindBy(xpath="//div[@class='n2-ss-slide-background']")
	List <WebElement> slider_xpath;
	
	@FindBy(xpath="//div[@class='woocommerce']")
	List <WebElement> arrivals_xpath;
	
	@FindBy(xpath="//img[@alt='Selenium Ruby']")
	WebElement arrivalsImg_xpath;
	
	@FindBy(xpath="//li[@class='description_tab active']/a")
	WebElement descriptionBtn_xpath;
	
	@FindBy(xpath="//div[@id='tab-description']/h2")
	WebElement description_xpath;
	
	@FindBy(xpath="//li[@class='reviews_tab active']/a")
	WebElement reviewBtn_xpath;
	
	@FindBy(xpath="//div[@id='comments']/h2")
	WebElement review_xpath;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement basketBtn_xpath;
	
	@FindBy(xpath="//div[@class='woocommerce-message']/a")
	WebElement viewBasket_xpath;
	
	@FindBy(xpath="//th[@class='product-price']")
	WebElement price_xpath;
	
	@FindBy(xpath="//div[@class='wc-proceed-to-checkout']/a")
	WebElement proceedCheckout_xpath;
	
	@FindBy(xpath="//a[contains(text(),'Click here to enter your code')]")
	WebElement couponLink_xpath;
	
	@FindBy(xpath="//input[@id='coupon_code']")
	WebElement coupon_xpath;
	
	@FindBy(xpath="//input[@value='Apply Coupon']")
	WebElement applyCoupon_xpath;
	
	@FindBy(xpath="//img[@alt='Thinking in HTML']")
	WebElement arrivalsImg2_xpath;
	
	@FindBy(xpath="//li[starts-with(text(),'The minimum')]")
	WebElement errorMsg_xpath;
	
	@FindBy(xpath="//td[@class='product-remove']/a")
	WebElement removeBtn_xpath;
	
	@FindBy(xpath="//input[@type='number']")
	WebElement addBtn_xpath;
	
	@FindBy(xpath="//input[@name='update_cart']")
	WebElement updateBtn_xpath;
	
	@FindBy(xpath="//tr[@class='order-total']")
	WebElement totalPriceRow_xpath;
	
	@FindBy(xpath="(//span[contains(text(),'500.00')])[3]")
	WebElement subTotalPrice_xpath;
	
	@FindBy(xpath="//span[contains(text(),'510.00')]")
	WebElement finalPrice_xpath;
	
	@FindBy(xpath="//div[@class='woocommerce-billing-fields']/h3")
	WebElement billingDetails_xpath;
	
	@FindBy(xpath="//h3[@id='order_review_heading']")
	WebElement orderDetails_xpath;
	
	@FindBy(xpath="//div[@class='woocommerce-shipping-fields']/h3")
	WebElement addDetails_xpath;
	
	@FindBy(xpath="//div[@class='payment_box payment_method_cod']/p")
	WebElement payDetails_xpath;
	
	@FindBy(xpath="//input[@id='billing_first_name']")
	WebElement firstName_xpath;
	
	@FindBy(xpath="//input[@id='billing_last_name']")
	WebElement lastName_xpath;
	
	@FindBy(xpath="//input[@id='billing_company']")
	WebElement companyName_xpath;
	
	@FindBy(xpath="//input[@id='billing_email']")
	WebElement email_xpath;
	
	@FindBy(xpath="//input[@id='billing_phone']")
	WebElement phoneNumber_xpath;
	
	@FindBy(xpath="//div[@id='s2id_billing_country']")
	WebElement countryDropdown_xpath;
	
	@FindBy(xpath="//input[@id='s2id_autogen1_search']")
	WebElement countryDropdownSearch_xpath;
	
	@FindBy(xpath="//ul[@id='select2-results-1']")
	WebElement countriesList_xpath;
	
	@FindBy(xpath="//input[@placeholder='Street address']")
	WebElement streetAdd_xpath;
	
	@FindBy(xpath="//input[@id='billing_address_2']")
	WebElement aptAdd_xpath;
	
	@FindBy(xpath="//input[@id='billing_city']")
	WebElement city_xpath;
	
	@FindBy(xpath="(//span[@class='select2-arrow'])[2]")
	WebElement stateDropdown_xpath;
	
	@FindBy(xpath="//input[@id='s2id_autogen2_search']")
	WebElement stateDropdownSearch_xpath;
	
	@FindBy(xpath="//ul[@id='select2-results-2']")
	WebElement stateList_xpath;
	
	@FindBy(xpath="//input[@id='billing_postcode']")
	WebElement pincode_xpath;

	@FindBy(xpath="//label[@for='payment_method_cod']")
	WebElement payment_xpath;
	
	@FindBy(xpath="//input[@id='place_order']")
	WebElement placeOrder_xpath;
	
	@FindBy(xpath="(//h2)[1]")
	WebElement finalOrderDetails_xpath;
	
	@FindBy(xpath="")
	WebElement finalCustomerDetails_xpath;
	
	@FindBy(xpath="//header[@class='title']/h3")
	WebElement finalBillingDetails_xpath;
	
	

	
//	Actions
	public void setShopMenu() {
		shop_xpath.click();
	}
	
	public void setHomeMenu() {
		home_xpath.click();
	}
	
	public int setSlider() {
		return slider_xpath.size();
	}
	
	public int setArrivals() {
		return arrivals_xpath.size();
	}
	
	public void setArrivalsImg() {
		arrivalsImg_xpath.click();
	}
	
	public void setDescriptionBtn() {
		descriptionBtn_xpath.click();
	}
	
	public void setReviewBtn() {
		reviewBtn_xpath.click();
	}
	
	public void setBasketBtn() {
		basketBtn_xpath.click();
	}
	
	public void setViewBasket() {
		viewBasket_xpath.click();
	}
	
	public void setProceedCheckout() {
		proceedCheckout_xpath.click();
	}
	
	public void setEnterCouponLink() {
		couponLink_xpath.click();
	}
	
	public void setEnterCoupon(String coupon) {
		coupon_xpath.sendKeys(coupon);
	}
	
	public void setApplyCoupon() {
		applyCoupon_xpath.click();
	}
	
	public void setArrivalsImg2() {
		arrivalsImg2_xpath.click();
	}
	
	public void setRemoveBook() {
		removeBtn_xpath.click();
	}
	
	public void setAddBtn(String moreBook) {
		addBtn_xpath.clear();
		addBtn_xpath.sendKeys(moreBook);
	}
	
	public void setUpdateBtn() {
		updateBtn_xpath.click();
	}
	
	public void setFirstname(String firstName) {
		firstName_xpath.clear();
		firstName_xpath.sendKeys(firstName);
	}
	
	public void setLastname(String lastName) {
		lastName_xpath.clear();
		lastName_xpath.sendKeys(lastName);
	}
	
	public void setCompanyName(String companyName) {
		companyName_xpath.clear();
		companyName_xpath.sendKeys(companyName);
	}
	
	public void setEmail(String emailName) {
		email_xpath.clear();
		email_xpath.sendKeys(emailName);
	}
	
	public void setPhoneNumber(String phoneNumber) {
		phoneNumber_xpath.clear();
		phoneNumber_xpath.sendKeys(phoneNumber);
	}
	
	public void setCountryDropdown() {
		countryDropdown_xpath.click();
	}
	
	public void setCountryDropdownSearch(String country) {
		WebElement countryDropdownSearch = countryDropdownSearch_xpath;
		countryDropdownSearch.sendKeys(country);
		countryDropdownSearch.sendKeys(Keys.ENTER);
	}
	
	public void setAddress(String address) {
		streetAdd_xpath.clear();
		streetAdd_xpath.sendKeys(address);
	}
	
	public void setAptAddress(String aptAddress) {
		aptAdd_xpath.clear();
		aptAdd_xpath.sendKeys(aptAddress);
	}
	
	public void setCity(String city) {
		city_xpath.clear();
		city_xpath.sendKeys(city);
	}

	public void setStateDropdown() {
		stateDropdown_xpath.click();
	}
	
	public void setStateDropdownSearch(String state) {
		WebElement stateDropdownSearch = stateDropdownSearch_xpath;
		stateDropdownSearch.sendKeys(state);
		stateDropdownSearch.sendKeys(Keys.ENTER);
	}
	
	public void setPincode(String pincode) {
		pincode_xpath.clear();
		pincode_xpath.sendKeys(pincode);
	}
	
	public void setPayment() {
		payment_xpath.click();
	}
	
	public void setPlaceOrder() {
		placeOrder_xpath.click();
	}
	
}
