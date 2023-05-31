package com.sap.timp.pageObjectModel.TFB;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class AccesarTFBPO extends TestBaseSteven{
	@FindBy(xpath = "//div[text()=\"TFB\"]")
	public WebElement tfb;
	
	@FindBy(xpath = "//div[@class=\"dragger-pagination-right\"]")
	public WebElement flecha;

	
	@FindBy(xpath = "//*[@id=\"acc-reports\"]/ul/li[3]/div/span[2]")
	public WebElement cadastro;
	
	@FindBy(xpath = "//div[@class=\"name-wrapper\"]/span")
	public WebElement mostrar;
	
	public  AccesarTFBPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean acessarTFB() {

		waitExpectXpath("//*[@id=\"home-icon\"]");
		sleep(1000);
		
		while (!tfb.isDisplayed()) {
			flecha.click();
		}
		sleep(1000);
		
		tfb.click();
		
		waitExpectElement(mostrar);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		boolean sucesso = mostrar.isDisplayed();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		return sucesso;		
	}
}
