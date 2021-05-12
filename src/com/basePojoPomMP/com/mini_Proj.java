package com.basePojoPomMP.com;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.support.ui.Select;

public class mini_Proj extends bAseClass {
	public static void main(String[] args) throws InterruptedException, IOException {
							//System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\MiniProjectt\\Driver\\chromedriver.exe");
							//WebDriver driver = new ChromeDriver();
		browserLaunch("chrome");
		
							//driver.get("http://automationpractice.com/index.php");
		getUrl("http://automationpractice.com/index.php");
		
		implicitwait(30);
		
		POM_miniProj pm = new POM_miniProj(driver);
		
							//WebElement signbtn = driver.findElement(By.xpath("(//a[@rel='nofollow'])[1]"));
							//signbtn.click();
		clickOnElement(pm.getSignbtn());
		
							//WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
							//email.sendKeys("arun@gmail.com");
		sendInput(pm.getEmail(), "arunj@gmail.com");
		
							//WebElement createacc= driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
							//createacc.click();
		clickOnElement(pm.getCreateacc());
				
							//WebElement mr = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
							//mr.click();
		clickOnElement(pm.getMr());
		
							//WebElement firname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
							//firname.sendKeys("Arun");
		sendInput(pm.getFirname(), "Arunn");
		
							//WebElement lasname = driver.findElement(By.xpath("(//input[@data-validate='isName'])[2]"));
							//lasname.sendKeys("kumar");
		sendInput(pm.getLasname(), "Kumar");
		
							//WebElement pasword = driver.findElement(By.xpath("(//input[@class='is_required validate form-control'])[4]"));
							//pasword.sendKeys("768uy76");
		sendInput(pm.getPasword(), "12345ty");
		
							//WebElement day = driver.findElement(By.xpath("//select[@id='days']"));
							//Select s1 = new Select(day);
							//s1.selectByValue("6");
		dropdown(pm.getDay() , "value" , "6");
		
							//WebElement month = driver.findElement(By.xpath("//select[@id='months']"));
							//Select s2 = new Select(month);
							//s2.selectByVisibleText("April ");
		dropdown(pm.getMonth(), "text", "January ");

							//WebElement year = driver.findElement(By.xpath("//select[@id='years']"));
							//Select s3 = new Select(year);
							//s3.selectByValue("2021");
		dropdown(pm.getYear(), "value", "2021");
		
							//WebElement box = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
							//box.click();
		clickOnElement(pm.getBox());
		
							//WebElement company = driver.findElement(By.xpath("//input[@id='company']"));
							//company.sendKeys("chennai greens tech");
		sendInput(pm.getCompany(), "Chennai traders");
		
							//WebElement address1 = driver.findElement(By.xpath("(//input[@class='form-control'])[4]"));
							//address1.sendKeys("PORUR");
		sendInput(pm.getAddress1(), "Porur");
		
							//WebElement address2 = driver.findElement(By.xpath("(//input[@class='form-control'])[5]"));
							//address2.sendKeys("600124");
		sendInput(pm.getAddress2(), "600124");
		
							//WebElement city = driver.findElement(By.xpath("(//input[@class='form-control'])[6]"));
							//city.sendKeys("Chennai");
		sendInput(pm.getCity(), "Chennai");
		
							//WebElement state = driver.findElement(By.xpath("(//select[@class='form-control'])[4]"));
							//Select s4 = new Select(state);
							//s4.selectByVisibleText("California");
		dropdown(pm.getState(), "text", "California");
		
							//WebElement postcode = driver.findElement(By.xpath("//input[@name='postcode']"));
							//postcode.sendKeys("45678");
		sendInput(pm.getPostcode(), "98765");
		
							//WebElement country = driver.findElement(By.xpath("(//select[@class='form-control'])[5]"));
							//Select s5 = new Select(country);
							//s5.selectByVisibleText("United States");
		dropdown(pm.getCountry(), "text", "United States");
		
							//WebElement addinfo = driver.findElement(By.xpath("//textarea[@class='form-control']"));
							//addinfo.sendKeys("GOOD");
		sendInput(pm.getAddinfo(), "Good");
		
							//WebElement homephone = driver.findElement(By.xpath("(//input[@class='form-control'])[7]"));
							//homephone.sendKeys("9876543210");
		sendInput(pm.getHomephone(), "0123456789");
		
							//WebElement mobilephone = driver.findElement(By.xpath("(//input[@class='form-control'])[8]"));
							//mobilephone.sendKeys("1234567890");
		sendInput(pm.getMobilephone(), "4567898764");
		
							//WebElement aliasadd = driver.findElement(By.xpath("(//input[@class='form-control'])[9]"));
							//aliasadd.sendKeys("alias kumar");
		sendInput(pm.getAliasadd(), "alias karnan");
		
							//WebElement register = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
							//register.click();
		clickOnElement(pm.getRegister());
		
		
							//WebElement womenn = driver.findElement(By.xpath("//a[@title='Women']"));
							//Actions ac = new Actions(driver);
							//ac.moveToElement(womenn).build().perform();
		mouseOver(pm.getWomenn(), "move");
	
							//WebElement tshirts = driver.findElement(By.xpath("(//a[@title='T-shirts'])[1]"));
							//tshirts.click();
		clickOnElement(pm.getTshirts());
		
							//WebElement quickview = driver.findElement(By.xpath("//div[@class= 'product-image-container']")); //***select the outer frame***
							//Actions acs = new Actions(driver);
							//acs.moveToElement(quickview).build().perform();
		mouseOver(pm.getQuickview(), "move");
		
							//WebElement pressqv = driver.findElement(By.xpath("//div[@class= 'product-image-container']"));
							//pressqv.click();
		clickOnElement(pm.getPressqv());
		
							//WebElement frame = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
							//driver.switchTo().frame(frame);
		frames(pm.getFrame());
		
							//WebElement add = driver.findElement(By.xpath("(//a[@data-field-qty='qty'])[2]"));
							//add.click();
		clickOnElement(pm.getAdd());
		
							//WebElement size = driver.findElement(By.xpath("//select[@name='group_1']"));
							//Select s7 = new Select(size);
							//s7.selectByVisibleText("M");
		dropdown(pm.getSize(), "text", "M");
		
							//WebElement colour = driver.findElement(By.xpath("//a[@name='Blue']"));
							//colour.click();
		clickOnElement(pm.getColour());
		
							//WebElement addcart = driver.findElement(By.xpath("//button[@class='exclusive']"));
							//addcart.click();
		clickOnElement(pm.getAddcart());
		Thread.sleep(5000);
		
							//WebElement proceedtocheckout = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
							//proceedtocheckout.click();
		clickOnElement(pm.getProceedtocheckout());
		
							//WebElement proceedcheck = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
							//proceedcheck.click();
		clickOnElement(pm.getProceedcheck());
		
							//WebElement procheout = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
							//procheout.click();
		clickOnElement(pm.getProcheout());
		
							//WebElement iagree = driver.findElement(By.xpath("//input[@type='checkbox']"));
							//iagree.click();
		clickOnElement(pm.getIagree());
		
							//WebElement prceout = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
							//prceout.click();
		clickOnElement(pm.getPrceout());
		
							//WebElement bankpayment = driver.findElement(By.xpath("//a[@class='bankwire']"));
							//bankpayment.click();
		clickOnElement(pm.getBankpayment());
		
							//WebElement conforder = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
							//JavascriptExecutor js = (JavascriptExecutor) driver;
							//js.executeScript("arguments[0].scrollIntoView();", conforder);
		scroll(pm.getConforder(), "view");
	
							//TakesScreenshot ts = (TakesScreenshot) driver;
							//File source = ts.getScreenshotAs(OutputType.FILE);
							//File destination = new File("C:\\Users\\admin\\eclipse-workspace\\MiniProjectt\\ScreenShot\\ConfirmOrder.png");
							//FileUtils.copyFile(source, destination);
		takesScreenshot();
				
	}
	
}

