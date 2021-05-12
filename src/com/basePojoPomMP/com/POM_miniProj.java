package com.basePojoPomMP.com;

import java.nio.file.WatchEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_miniProj {
	public static WebDriver driver;

	@FindBy(xpath = "(//a[@rel='nofollow'])[1]")
	private WebElement signbtn;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement email;

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement createacc;

	@FindBy(xpath = "(//input[@type='radio'])[1]")
	private WebElement mr;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement firname;

	@FindBy(xpath = "(//input[@data-validate='isName'])[2]")
	private WebElement lasname;

	@FindBy(xpath = "(//input[@class='is_required validate form-control'])[4]")
	private WebElement pasword;

	@FindBy(xpath = "//select[@id='days']")
	private WebElement day;

	@FindBy(xpath = "//select[@id='months']")
	private WebElement month;

	@FindBy(xpath = "//select[@id='years']")
	private WebElement year;

	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	private WebElement box;

	@FindBy(xpath = "//input[@id='company']")
	private WebElement company;

	@FindBy(xpath = "(//input[@class='form-control'])[4]")
	private WebElement address1;

	@FindBy(xpath = "(//input[@class='form-control'])[5]")
	private WebElement address2;

	@FindBy(xpath = "(//input[@class='form-control'])[6]")
	private WebElement city;

	@FindBy(xpath = "(//select[@class='form-control'])[4]")
	private WebElement state;

	@FindBy(xpath = "//input[@name='postcode']")
	private WebElement postcode;

	@FindBy(xpath = "(//select[@class='form-control'])[5]")
	private WebElement country;

	@FindBy(xpath = "//textarea[@class='form-control']")
	private WebElement addinfo;

	@FindBy(xpath = "(//input[@class='form-control'])[7]")
	private WebElement homephone;

	@FindBy(xpath = "(//input[@class='form-control'])[8]")
	private WebElement mobilephone;

	@FindBy(xpath = "(//input[@class='form-control'])[9]")
	private WebElement aliasadd;

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement register;

	@FindBy(xpath = "//a[@title='Women']")
	private WebElement womenn;

	@FindBy(xpath = "(//a[@title='T-shirts'])[1]")
	private WebElement tshirts;

	@FindBy(xpath = "//div[@class= 'product-image-container']")
	private WebElement quickview;

	@FindBy(xpath = "//div[@class= 'product-image-container']")
	private WebElement pressqv;

	@FindBy(xpath = "//iframe[@class='fancybox-iframe']")
	private WebElement frame;

	@FindBy(xpath = "(//a[@data-field-qty='qty'])[2]")
	private WebElement add;

	@FindBy(xpath = "//select[@name='group_1']")
	private WebElement size;

	@FindBy(xpath = "//a[@name='Blue']")
	private WebElement colour;

	@FindBy(xpath = "//button[@class='exclusive']")
	private WebElement addcart;

	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	private WebElement proceedtocheckout;

	@FindBy(xpath = "(//a[@title='Proceed to checkout'])[2]")
	private WebElement proceedcheck;

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement procheout;

	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement iagree;

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement prceout;

	@FindBy(xpath = "//a[@class='bankwire']")
	private WebElement bankpayment;

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement conforder;

	public WebElement getSignbtn() {
		return signbtn;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getCreateacc() {
		return createacc;
	}

	public WebElement getMr() {
		return mr;
	}

	public WebElement getFirname() {
		return firname;
	}

	public WebElement getLasname() {
		return lasname;
	}

	public WebElement getPasword() {
		return pasword;
	}

	public WebElement getDay() {
		return day;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getBox() {
		return box;
	}

	public WebElement getCompany() {
		return company;
	}

	public WebElement getAddress1() {
		return address1;
	}

	public WebElement getAddress2() {
		return address2;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getPostcode() {
		return postcode;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getAddinfo() {
		return addinfo;
	}

	public WebElement getHomephone() {
		return homephone;
	}

	public WebElement getMobilephone() {
		return mobilephone;
	}

	public WebElement getAliasadd() {
		return aliasadd;
	}

	public WebElement getRegister() {
		return register;
	}

	public WebElement getWomenn() {
		return womenn;
	}

	public WebElement getTshirts() {
		return tshirts;
	}

	public WebElement getQuickview() {
		return quickview;
	}

	public WebElement getPressqv() {
		return pressqv;
	}

	public WebElement getFrame() {
		return frame;
	}

	public WebElement getAdd() {
		return add;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getColour() {
		return colour;
	}

	public WebElement getAddcart() {
		return addcart;
	}

	public WebElement getProceedtocheckout() {
		return proceedtocheckout;
	}

	public WebElement getProceedcheck() {
		return proceedcheck;
	}

	public WebElement getProcheout() {
		return procheout;
	}

	public WebElement getIagree() {
		return iagree;
	}

	public WebElement getPrceout() {
		return prceout;
	}

	public WebElement getBankpayment() {
		return bankpayment;
	}

	public WebElement getConforder() {
		return conforder;
	}

	public POM_miniProj(WebDriver driverr) {
		// TODO Auto-generated constructoDr stub
		this.driver = driverr;
		PageFactory.initElements(driverr, this);
	}

}
