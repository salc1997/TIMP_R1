package com.sap.timp.pageObjectModel.TFB;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBase;

public class AccesarTFBPO extends TestBase{
	@FindBy(xpath = "//div[text()=\"TFB\"]")
	public WebElement tfb;
	
	@FindBy(xpath = "//div[@class=\"dragger-pagination-right\"]")
	public WebElement flecha;

	
	@FindBy(xpath = "//*[@id=\"acc-reports\"]/ul/li[3]/div/span[2]")
	public WebElement cadastro;
	
	@FindBy(xpath = "//span[text()=\"Leiautes P�blicos\"]")
	public WebElement mostrar;
	
	public  AccesarTFBPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean acessarTFB() {

		waitExpectedElement("//*[@id=\"home-icon\"]");
		sleep(1000);
		
		while (!tfb.isDisplayed()) {
			flecha.click();
		}
		sleep(1000);
		
		tfb.click();
		
		waitExpectedElement(mostrar);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		boolean sucesso = mostrar.isDisplayed();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		return sucesso;		
	}
}
