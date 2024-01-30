package com.sap.timp.pageObjectModel.BRE.TabelasExternas;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBase;

public class BibliotecaTabelaExternaPO extends TestBase {

	
	@FindBy(xpath = "//span[text()=\"Tabelas\"]")
	public WebElement btnTabelas;
	
	@FindBy(xpath = "//span[text()=\"Tabelas externas\"]")
	public WebElement btnTabelasExternas;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement txtBusqueda;
	
	@FindBy(xpath = "//span[text()=\"Filtros Avançados\"]")
	public WebElement btnFiltrosAvanzados;
	
	@FindBy(xpath = "//div[@id=\"search-input\"]//span[contains(@class,\"icon-magnifier\")]")
	public WebElement btnRegraBusqueda;
	
	@FindBy(xpath = "//div[@class=\"title-select\"]//input")
	public WebElement txtTituloRegras;
	
	@FindBy(xpath = "//span[text()=\"Aplicar filtros\"]")
	public WebElement btnAplicar;
	
	public BibliotecaTabelaExternaPO() {

		PageFactory.initElements(driver, this);
	}
	
	public void clickbtnTabelas() {
		click(btnTabelas);
	}
	
	public void clickbtnTabelasExternas() {
		click(btnTabelasExternas);
	}
	
	public void clickbtnFiltrosAvanzados() {
		click(btnFiltrosAvanzados);
	}
	
	public void fillOutTxtBusqueda(String string) {
		sendKeys(txtBusqueda, string);
	}
	
	public void clickbtnBusqueda() {
		click(btnRegraBusqueda);
	}
	
	public void fillOuttxtTituloRegras(String string) {
		sendKeys(txtTituloRegras, string);
	}
	
	public void clickbtnAplicar() {
		click(btnAplicar);
	}
	
	
	

}
