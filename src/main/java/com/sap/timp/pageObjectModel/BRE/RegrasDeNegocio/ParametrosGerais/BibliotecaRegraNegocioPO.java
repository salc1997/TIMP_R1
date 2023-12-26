package com.sap.timp.pageObjectModel.BRE.RegrasDeNegocio.ParametrosGerais;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBase;

public class BibliotecaRegraNegocioPO extends TestBase {

	
	@FindBy(xpath = "//span[text()=\"Regras de Negócio\"]")
	public WebElement btnRegraNegocio;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement txtBusqueda;
	
	@FindBy(xpath = "//div[@id=\"search-input\"]//span[contains(@class,\"icon-magnifier\")]")
	public WebElement btnRegraBusqueda;
	
	public BibliotecaRegraNegocioPO() {

		PageFactory.initElements(driver, this);
	}
	
	public void clickbtnRegraNegocio() {
		click(btnRegraNegocio);
	}
	
	public void fillOutTxtBusqueda(String string) {
		sendKeys(txtBusqueda, string);
	}
	
	public void clickbtnBusqueda() {
		click(btnRegraBusqueda);
	}
	

}
