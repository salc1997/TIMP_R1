package com.sap.timp.pageObjectModel.MDR.Tributos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKathy;

public class TributosEditarPO extends TestBaseKathy{
	
	@FindBy(xpath = "//li/div/span[text()=\"Centraliza��o\"]")
	public WebElement centraliza��o;
	
	@FindBy(xpath = "//li/div/span[text()=\"Tributos\"]")
	public WebElement tributos;
	
	public TributosEditarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public void tributosEditar() {
		centraliza��o.click();
		sleep(1000);
		tributos.click();
		attributeToBeXpath("//div[contains(@class,\"tbody\")]", "class", "tbody hasShowHide");
		sleep(2000);
		
	}
}
