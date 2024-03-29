package com.sap.timp.pageObjectModel.LOG;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBase;

public class AcessarLOGPO extends TestBase{
	
	@FindBy(xpath = "//div[text()=\"LOG\"]")
	public WebElement log;
	
	@FindBy(xpath = "//div[@class=\"dragger-pagination-right\"]")
	public WebElement flecha;
	
	@FindBy(xpath = "//div[@class=\"left-content\"]/div[2]/ul/li[1]")
	public WebElement mostrar;

	public AcessarLOGPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean acessarLOG() {
		
		waitExpectedElement("//*[@id=\"home-icon\"]");
		sleep(1000);
		
		while (!log.isDisplayed()) {
			flecha.click();
		}
		sleep(1000);
		
		log.click();
		waitExpectedElement(mostrar);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		boolean sucesso = mostrar.isDisplayed();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		return sucesso;
	}
}
