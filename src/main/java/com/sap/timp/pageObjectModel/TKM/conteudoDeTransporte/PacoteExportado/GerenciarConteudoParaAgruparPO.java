package com.sap.timp.pageObjectModel.TKM.conteudoDeTransporte.PacoteExportado;


import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBase;
import com.sap.timp.base.TestBase;

public class GerenciarConteudoParaAgruparPO extends TestBase{

					 
	
	@FindBy(xpath = "//button//span[text()=\"Adicionar conteúdo\"]")
	public WebElement btnAdicionarContenudo;
	
	@FindBy(xpath = "//div[@id=\"component\"]//div[2]")
	public WebElement btnComponente;
	
	@FindBy(xpath = "//li[text()=\"BRB\"]")
	public WebElement btnOpcComponente;
	
	@FindBy(xpath = "//div[@id=\"model\"]//div[2]")
	public WebElement btnModelo;
	
	@FindBy(xpath = "//li[text()=\"Report BRB\"]")
	public WebElement btnOpcModelo;
	
	@FindBy(xpath = "//button[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//div[@id=\"search-box\"]//input")
	public WebElement txtBusqueda;
	
	@FindBy(xpath = "//div[@id=\"search-box\"]//div[contains(@class,\"isSearchBox \")]/span[1]")
	public WebElement btnBusqueda;
	
	
	@FindBy(xpath = "//button//span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca;
	
	
	@FindBy(xpath = "//li[text()=\"BRE\"]")
	public WebElement btnOpcComponenteBRE;
	
	@FindBy(xpath = "//li[text()=\"Rule\"]")
	public WebElement btnOpcModeloBRE;
	
	@FindBy(xpath = "//li[text()=\"BCB\"]")
	public WebElement btnOpcComponenteBCB;
	
	@FindBy(xpath = "//li[text()=\"BuilderConfiguration\"]")
	public WebElement btnOpcModeloBCB;
	
	@FindBy(xpath = "//li[text()=\"BPMA\"]")
	public WebElement btnOpcComponenteBPMA;
	
	@FindBy(xpath = "//li[text()=\"Processes\"]")
	public WebElement btnOpcModeloBPMA;
	
	public GerenciarConteudoParaAgruparPO() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickbtnAdicionarContenudo() {
		click(btnAdicionarContenudo);
	}
	
	public void clickbtnComponente() {
		click(btnComponente);
	}
	
	public void clickbtnOpcComponente() {
		click(btnOpcComponente);
	}
	
	public void clickbtnModelo() {
		click(btnModelo);
	}
	
	public void clickbtnOpcModelo() {
		click(btnOpcModelo);
	}
	
	
	public void clickbtnGravar() {
		click(btnGravar);
	}
	
	public void fillOutTxtBusqueda(String string) {
		sendKeys(txtBusqueda, string);
	}
	
	public void clickbtnBusqueda() {
		click(btnBusqueda);
	}

	public void clickbtnBiblioteca() {
		click(btnBiblioteca);
	}
	
	public void clickbtnOpcComponenteBRE() {
		click(btnOpcComponenteBRE);
	}
	
	
	public void clickbtnOpcModeloBRE() {
		click(btnOpcModeloBRE);
	}
	
	public void clickbtnOpcComponenteBCB() {
		click(btnOpcComponenteBCB);
	}
	
	
	public void clickbtnOpcModeloBCB() {
		click(btnOpcModeloBCB);
	}
	
	public void clickbtnOpcComponenteBPMA() {
		click(btnOpcComponenteBPMA);
	}
	
	
	public void clickbtnOpcModeloBPMA() {
		click(btnOpcModeloBPMA);
	}
	
}
