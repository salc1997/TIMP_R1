package com.sap.timp.pageObjectModel.BRB;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBase;

public class BibliotecaBRBPO extends TestBase{
	
	@FindBy(xpath = "//div[@class=\"base-input has-icon isSearchBox\"]/input")
	public WebElement txtSearchBox;
	
	@FindBy(xpath = "//span[@class=\"main-icon icon icon-font-Sign-and-Symbols icon-magnifier\"]")
	public WebElement spMagnifyingGlass;
	
	@FindBy(xpath = "//div[@class=\"actions\"]")
	public WebElement btnActions;
	
	@FindBy(xpath = "//span[text()=\"Executar\"]")
	public WebElement btnExecute;
	
	@FindBy(xpath = "//span[text()=\"Relatórios de Outputs\"]")
	public WebElement Btncadastro;
	
	
	public BibliotecaBRBPO() {

		PageFactory.initElements(driver, this);
	}
	
	public void fillOutSearchBox(String text) {
		sendKeys(txtSearchBox, text);
	}
	
	public void sendKeysToSearchBox(Keys keys) {
		sendKeys(txtSearchBox, keys);
	}
	
	public void clickOnSpMagnifyingGlass() {
		click(spMagnifyingGlass);
	}
	
	public void clickOnBtnActions() {
		click(btnActions);		
	}
	
	public void clickOnBtnExecute() {
		click(btnExecute);		
	}
	public void clickOnBtncadastro() {
		click(Btncadastro);		
	}
	
	
	
	
	
	
	

}
