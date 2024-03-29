package com.sap.timp.pageObjectModel.TAA;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.sap.timp.base.TestBase;

public class AcessarTAAPO extends TestBase{
	@FindBy(xpath = "//div[text()=\"TAA\"]")
	public WebElement taa;
	
	@FindBy(xpath = "//div[@class=\"dragger-pagination-right\"]")
	public WebElement flecha;

	
	@FindBy(xpath = "//*[@id=\"acc-reports\"]/ul/li[3]/div/span[2]")
	public WebElement cadastro;
	
	@FindBy(xpath = "//div[@id=\"baseTabs-wrapper\"]")
	public WebElement mostrar;
	
	
	
	public AcessarTAAPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean acessarTAA() {

		waitExpectedElement("//*[@id=\"home-icon\"]");
		sleep(1000);
		
		while (!taa.isDisplayed()) {
			flecha.click();
		}
		sleep(1000);
		
		taa.click();
		
		waitExpectedElement(mostrar);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		boolean sucesso = mostrar.isDisplayed();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		return sucesso;		
	}
}
