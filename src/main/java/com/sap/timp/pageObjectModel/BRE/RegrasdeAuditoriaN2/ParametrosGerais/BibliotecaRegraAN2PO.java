package com.sap.timp.pageObjectModel.BRE.RegrasdeAuditoriaN2.ParametrosGerais;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBase;

public class BibliotecaRegraAN2PO extends TestBase {

	
	@FindBy(xpath = "//span[text()=\"Regras de Auditoria N2\"]")
	public WebElement btnRegraAn2;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement txtBusqueda;
	
	@FindBy(xpath = "//div[@id=\"search-input\"]//span[contains(@class,\"icon-magnifier\")]")
	public WebElement btnRegraBusqueda;
	
	public BibliotecaRegraAN2PO() {

		PageFactory.initElements(driver, this);
	}
	
	public void clickbtnRegraAN2() {
		click(btnRegraAn2);
	}
	
	public void fillOutTxtBusqueda(String string) {
		sendKeys(txtBusqueda, string);
	}
	
	public void clickbtnBusqueda() {
		click(btnRegraBusqueda);
	}
	

}
