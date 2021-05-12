package com.basePojoPomMP.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class bAseClass {
public static WebDriver driver;
public static WebDriver browserLaunch(String browsername) {
//Browser_Launch
	try {
		if (browsername.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		else if (browsername.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		}
		else if (browsername.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\Driver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
	} catch (Exception e) {
		e.printStackTrace();
	}
	return driver;
	}
//getUrl
	public static void getUrl(String Url) {
		try {
			driver.get(Url);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
//navigateTo
	public static void navigateTo(String url) {
		try {
			driver.navigate().to(url);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
//currentUrl
	public static void currentUrl() {
		try {
			String currentUrl = driver.getCurrentUrl();
			System.out.println(currentUrl);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
//back
	public static void back() {
		try {
			driver.navigate().back();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
//forward
	public static void forward() {
		try {
			driver.navigate().forward();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
//refresh
	public static void refresh() {
		try {
			driver.navigate().refresh();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
//close
	public static void close() {
		try {
			driver.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
//quit
	public static void quit() {
		try {
			driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
//getTitle
	public static void getTitle() {
		try {
			String title2 = driver.getTitle();
			System.out.println(title2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
//getText
	public static void getText(WebElement element) {
		try {
			String text = element.getText();
			System.out.println(text);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
//checkBox
	public static void checkBox(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
//is Enabled
	public static void isEnabled(WebElement element) {
		try {
			boolean enabled = element.isEnabled();
			System.out.println(enabled);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
//isDisplayed
	public static void isDisplayed(WebElement element) {
		try {
			boolean displayed = element.isDisplayed();
			System.out.println(displayed);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
//is Selected
	public static void isSelected(WebElement element) {
		try {
			boolean selected = element.isSelected();
			System.out.println(selected);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
//sendKeys
	public static void sendInput(WebElement element,String value) {
		try {
			element.sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
//click
	public static void clickOnElement(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
//clear
	public static void clear(WebElement element) {
		try {
			element.clear();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
//getAttributes
	public static void getAttributes(WebElement element,String value,String options) {
	if (value.equalsIgnoreCase("value")) {
		String attribute = element.getAttribute(options);
		System.out.println(attribute);
		}
	else if (value.equalsIgnoreCase("dom")) {
		String attribute = element.getAttribute(options);
		System.out.println(attribute);
		}
	}
	
//wait - implicit wait
	public static void implicitwait(int w) {
		try {
			driver.manage().timeouts().implicitlyWait(w, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
//wait - Explicit wait	
	public static void explicitWait(WebElement element,int w) {
		try {
			WebDriverWait wait=new WebDriverWait(driver, w);
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
//fluentWait


//singleDropDown
	public static void dropdown(WebElement element,String option, String input) {
	Select s=new Select(element);
		if (option.equals("index")) {
			int parseint =  Integer.parseInt(input);
			s.selectByIndex(parseint);
		} else if (option.equals("value")) {
			s.selectByValue(input);
		}else if (option.equals("text")) {
			s.selectByVisibleText(input);
		}
	}	
	
//is Multiple
	public static void isMultiple(WebElement element) {
		try {
			Select s=new Select(element);
			boolean multiple = s.isMultiple();
			System.out.println(multiple);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//getAllOptions
	public static List<WebElement> getAllOptions(WebElement element,String size) {
	Select s=new Select(element);
	List<WebElement> options = s.getOptions();
	for (WebElement geto : options) {
	String text = geto.getText();
	System.out.println( text);
	}
	int size1 = options.size();
	System.out.println(size1);
	return options;
	}	
	public static void getAllSelected(WebElement element,String options,String value) {
	Select s=new Select(element);
	if (options.equalsIgnoreCase("index")) {
		int parseInt = Integer.parseInt(value);
		s.selectByIndex(parseInt);
	}
	List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
	for (WebElement selected : allSelectedOptions) {
		String text1 = selected.getText();
		System.out.println(text1);
	}
	}
	
//getfirstselected 
	public static void getFirstSelected(WebElement element) {
	Select s=new Select(element);
	WebElement firstSelectedOption = s.getFirstSelectedOption();
	System.out.println(firstSelectedOption.getText());
	}

	public static void dropDown(WebElement element,String options,String value) {
		try {
			Select s=new Select(element);
			if (options.equalsIgnoreCase("value")) {
				s.selectByValue(value);
			}
			else if (options.equalsIgnoreCase("text")) {
				s.selectByVisibleText(value);
			}
			else if (options.equalsIgnoreCase("index")) {
				int parseInt = Integer.parseInt(value);
				s.selectByIndex(parseInt);
	
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
//screenshot
	public static void takesScreenshot() throws IOException {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\admin\\eclipse-workspace\\MiniProject_base_POJO_POM\\Screenshot_POM\\pnr.png");
		FileUtils.copyFile(source, destination);
	}
	
//Actions
	public static void mouseOver(WebElement element,String act) {
		try {
			Actions a=new Actions(driver);
			if (act.equalsIgnoreCase("move")) {
				a.moveToElement(element).build().perform();
			} 
			else if (act.equalsIgnoreCase("click")) {
				a.click(element).build().perform();
			
			}
			else if (act.equalsIgnoreCase("rightclick")) {
				a.contextClick().build().perform();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
//Alert
	public static void alert(String alt) {
		try {
			Alert alert = driver.switchTo().alert();
		if (alt.equalsIgnoreCase("accept")) {
			alert.accept();
			}
		else if (alt.equalsIgnoreCase("dismiss")) {
			alert.dismiss();
		}
		else if (alt.equalsIgnoreCase("text")) {
			String text = alert.getText();
			System.out.println(text);
		}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
//robot
	public static void robot(WebElement element,String key) throws AWTException {
		Robot r=new Robot();
		if (key.equalsIgnoreCase("down")) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		else if (key.equalsIgnoreCase("enter")) {
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyPress(KeyEvent.VK_ENTER);
		}

	}
	
//windowsHandles
	public static void windowsHandles(String type,String destination ) {
	if (type.equalsIgnoreCase("singlewindow")) {
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
	}
	else if (type.equalsIgnoreCase("multiplewindows")) {
		Set<String> windowHandles = driver.getWindowHandles();
		for (String all : windowHandles) {
			System.out.println(all);
			String title1 = driver.switchTo().window(all).getTitle();
			System.out.println(title1);
		} 
		String actualTitle = destination;
          for (String all : windowHandles) {
			if (driver.switchTo().window(all).getTitle().equals(actualTitle)) {
				break;	
			}
		}
	}
}


//frames
	public static void frames(WebElement element) {
		try {
			driver.switchTo().frame(element);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
//mainframe
	public static void mainFrame() {	
		try {
			driver.switchTo().defaultContent();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//scroll
	public static void scroll(WebElement element,String option) {

	JavascriptExecutor js=(JavascriptExecutor) driver;
		if (option.equalsIgnoreCase("view")) {
			js.executeScript("arguments[0].scrollIntoView()", element);
		}
		else if (option.equalsIgnoreCase("pixel")) {
			js.executeScript("window.scrollBy(0,1000)");
		}

	}
}

