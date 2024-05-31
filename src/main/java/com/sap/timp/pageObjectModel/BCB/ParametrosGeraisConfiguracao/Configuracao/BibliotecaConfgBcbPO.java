package com.sap.timp.pageObjectModel.BCB.ParametrosGeraisConfiguracao.Configuracao;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBase;

public class BibliotecaConfgBcbPO extends TestBase{

	
	@FindBy(xpath = "//span[text()=\"Configurações\"]")
	public WebElement btnBibliotecaConfig;
	
	@FindBy(xpath = "//div[@class=\"base-input has-icon isSearchBox\"]/input")
	public WebElement txtSearchBox;
	
	@FindBy(xpath = "//span[@class=\"main-icon icon icon-font-Sign-and-Symbols icon-magnifier\"]")
	public WebElement spMagnifyingGlass;
	
	@FindBy(xpath = "//div[@class=\"actions\"]")
	public WebElement btnActions;
	
	@FindBy(xpath = "//span[text()=\"Editar\"]")
	public WebElement btnEditar;
	
	public BibliotecaConfgBcbPO() {

		PageFactory.initElements(driver, this);
	}
	
	public void clickbtnBibliotecaConfig() {
		click(btnBibliotecaConfig);		
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
