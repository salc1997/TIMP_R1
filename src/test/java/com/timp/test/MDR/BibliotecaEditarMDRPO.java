package com.timp.test.MDR;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBase;

public class BibliotecaEditarMDRPO extends TestBase{

	@FindBy(xpath = "//div[@class=\"base-input has-icon isSearchBox\"]/input")
	public WebElement txtSearchBox;
	
	@FindBy(xpath = "//span[@class=\"main-icon icon icon-font-Sign-and-Symbols icon-magnifier\"]")
	public WebElement spMagnifyingGlass;
	
	@FindBy(xpath = "//div[@class=\"actions\"]")
	public WebElement btnActions;
	
	@FindBy(xpath = "//span[text()=\"Editar\"]")
	public WebElement btnEditar;
	
	public BibliotecaEditarMDRPO() {

		PageFactory.initElements(driver, this);
	}
	
	
	public void sendKeysToSearchBox(String idDestino) {
		sendKeys(txtSearchBox, idDestino);
	}
	
	public void clickOnSpMagnifyingGlass() {
		click(spMagnifyingGlass);
	}
	
	public void clickOnBtnActions() {
		click(btnActions);		
	}
	
	public void clickOnBtnEditar() {
		click(btnEditar);		
	}
	
}
