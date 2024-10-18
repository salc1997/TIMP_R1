package com.sap.timp.base;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sap.timp.testUtil.TestUtil;

public class TestBase extends TestUtil{

	// TC2
	protected String tc2 = "http://as1-100-01-tc2:8000/timp/login/#/login";
	// TD1
	protected String td1 = "http://as1-100-01-td1:8000/timp/login/#/login";

	protected String tq1 = "http://as1-100-01-tq1:8000/timp/login/#/login";

	protected String tq2 = "http://as1-100-01-tq2:8000/timp/login/#/login";

	protected String tp1 = "http://as1-100-01-tp1:8000/timp/login/#/login";

	protected String td2 = "http://as1-100-01-td2:8000/timp/login/#/login";

	protected String cloud = "https://timp.authentication.eu10.hana.ondemand.com/login";
	
	protected String xsa = "https://as1-100-50.alltaxplatform.com:30032/uaa-security-oidc/login";

	public static WebDriver driver;
	public String usuarioL = "TESTEAUTOMATIZADO";
	public String senhaL = "Alltax2025#";

	public String usuarioLL = "kenssy.medina@agilesolutions.com";
	public String senhaLL = "Gorgojita12";

	public int menuT = 12000;

	public WebDriver initialization() {

		WebDriver driver;



		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver129.exe");



		// System.setProperty("webdriver.chrome.driver",
		// "./src/test/resources/chromedriver/chromedriverX86.exe");

		ChromeOptions options = new ChromeOptions();
		// options.setBinary("C:\\Program Files
		// (x86)\\Google\\Chrome\\Application\\chrome.exe");
		// driver = new ChromeDriver(options);
		// // options.addArguments("--headless");
		// para que las pesta�as no se habiliten
		// options.addArguments("start-maximized"); // open Browser in maximized mode
		// options.addArguments("disable-infobars"); // disabling infobars
		// options.addArguments("--disable-extensions"); // disabling extensions
		// options.addArguments("--disable-gpu"); // applicable to windows os only
		// options.addArguments("--disable-dev-shm-usage"); // overcome limited resource
		// problems
		// driver = new ChromeDriver(options);

		options.addArguments("disable-infobars");
		options.setExperimentalOption("useAutomationExtension", false);

		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);
		options.setExperimentalOption("prefs", prefs);

		options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		options.addArguments("--disable-dev-shm-usage");
		options.addArguments("--disable-extensions");

		driver = new ChromeDriver(options);
		driver.manage().window().maximize();

		driver.get(tc2);

		return driver;
	}
	

	public void refresh() {
		driver.navigate().refresh();
	}

	public String url() {
		return driver.getCurrentUrl();
	}

	public int rows(String element) {

		int rows = driver.findElements(By.xpath(element)).size();

		return rows;

	}
	public WebElement findElement(String xpath) {
		return driver.findElement(By.xpath(xpath));
	}
	
	public List<WebElement> findElements(String xpath) {
		return driver.findElements(By.xpath(xpath));
	}
	//Hacer Click
		public void click(WebElement element) {
			element.click();
			sleep(1000);
		}
		
		public void click(String xpath) {
			findElement(xpath).click();
			sleep(1000);
		}
		
		//Enviar Texto
		public void sendKeys(String xpath, String text) {
			findElement(xpath).sendKeys(text);
			sleep(1000);
		}
		
		public void sendKeys(WebElement element, String text) {
			element.sendKeys(text);
			sleep(1000);
		}
		
		public void sendKeys(WebElement element, Keys keys) {
			element.sendKeys(keys);
			sleep(1000);
		}
		
		public void sendKeys(String xpath, Keys keys) {
			findElement(xpath).sendKeys(keys);
			sleep(1000);
		}
		
	public void invisibilityOfElementOverlay() {

		WebDriverWait wait = new WebDriverWait(driver, 360);

		sleep(3000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class=\"overlay loader dark\"]")));
		sleep(2000);

	}

	
	public void waitExpectedElement(String locator) {
		WebDriverWait wait = new WebDriverWait(driver, 360);

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));

	}

	public void waitExpectedElement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 3600);

		wait.until(ExpectedConditions.elementToBeClickable(element));

	}

	public void actionsMoveToElement(String xpath) {
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath(xpath))).perform();

	}

	public void actionsMoveToElement(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
	}

	public void invisibilityOfElement(String xpath) {
		WebDriverWait wait = new WebDriverWait(driver, 360);

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpath)));

	}

	public void attributeToBe(String locator, String attribute, String value) {
		WebDriverWait wait = new WebDriverWait(driver, 360);

		wait.until(ExpectedConditions.attributeToBe(By.xpath(locator), attribute, value));
	}

	public void attributeToBe(WebElement element, String attribute, String value) {
		WebDriverWait wait = new WebDriverWait(driver, 360);

		wait.until(ExpectedConditions.attributeToBe(element, attribute, value));
	}

	public void dobleClick(String locator) {

		Actions actions = new Actions(driver);
		actions.doubleClick(driver.findElement(By.xpath(locator))).perform();

	}

	public void dobleClick(WebElement element) {

		Actions actions = new Actions(driver);
		actions.doubleClick(element).perform();

	}

	public void moveToElement(WebElement element, WebElement hacia) {
		Actions actions = new Actions(driver);

		actions.dragAndDrop(element, hacia).perform();

	}

	

	public String getText(WebElement element) {

		String texto = element.getText();

		if (texto.isEmpty() == true) {
			texto = "vazio";
		}

		return texto;

	}

	public String textContent(WebElement element) {

		String texto = element.getAttribute("textContent");

		return texto;

	}

	public String getValue(WebElement element) {

		String texto = element.getAttribute("value");

		if (texto.isEmpty() == true) {
			texto = "vazio";
		}

		return texto;

	}
	
	
//esperar que los combobox se ppueblen 
	public void attributoNotToBeEmpty(WebElement element, String attribute) {
		WebDriverWait wait = new WebDriverWait(driver, 360);

		wait.until(ExpectedConditions.attributeToBeNotEmpty(element, attribute));
	}

	public void attributoNotToBeEmpty(String xpath, String attribute) {
		WebDriverWait wait = new WebDriverWait(driver, 360);

		wait.until(ExpectedConditions.attributeToBeNotEmpty(driver.findElement(By.xpath(xpath)), attribute));
	}

	public void visibilityOfElement(String xpath) {

		boolean isPresent = driver.findElement(By.xpath(xpath)).isDisplayed();

		while (isPresent == false) {
			sleep(3000);
			isPresent = driver.findElement(By.xpath(xpath)).isDisplayed();
		}

	}
	
	public void quit() {
		driver.close();
	}

	

	public void closeSelectTypeCheckbox(WebElement element) {
		new Actions(driver).moveToElement(element).click().perform();
	}

	public void closeSelect(WebElement element) {
		new Actions(driver).moveToElement(element).click().perform();
	}
	
	public void fecharMensagens(String rows, String xpath) {
		int rowsR = driver.findElements(By.xpath(xpath)).size();

		if (rowsR > 0) {
			WebElement fechar = driver.findElement(By.xpath(xpath));
			fechar.click();
		}
		sleep(2000);

		rowsR = driver.findElements(By.xpath(xpath)).size();

		while (rowsR > 0) {

			WebElement fechar = driver.findElement(By.xpath(xpath));
			fechar.click();

			rowsR = driver.findElements(By.xpath(xpath)).size();
			sleep(2000);
		}

	}

	

	

}
