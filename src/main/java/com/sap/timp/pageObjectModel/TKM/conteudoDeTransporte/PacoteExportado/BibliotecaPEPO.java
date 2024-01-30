package com.sap.timp.pageObjectModel.TKM.conteudoDeTransporte.PacoteExportado;


import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBase;
import com.sap.timp.base.TestBase;

public class BibliotecaPEPO extends TestBase{

					 
	@FindBy(xpath = "//span[text()=\"Pacotes Exportados\"]")
	public WebElement btnPacoteExportar;
	
	@FindBy(xpath = "//button//span[text()=\"Novo\"]")
	public WebElement btnNovo;
	
	@FindBy(xpath = "//div[@id=\"name\"]//input")
	public WebElement txtNome;
	
	@FindBy(xpath = "//div[@id=\"description\"]//input")
	public WebElement txtdescripcion;
	
	@FindBy(xpath = "//button[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//button[text()=\"Baixar\"]")
	public WebElement btnBaxiar;
	
	
	
	
	public BibliotecaPEPO() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickbtnPacoteExportado() {
		click(btnPacoteExportar);
	}
	
	public void clickbtnNovo() {
		click(btnNovo);
	}

	public void fillOutTxtNome(String string) {
		sendKeys(txtNome, string);
	}
	
	public void fillOutTxtdescripcion(String keys) {
		sendKeys(txtdescripcion, keys);
	}
	
	public void clickbtnGravar() {
		click(btnGravar);
	}
	public void clickbtnBaxiar() {
		click(btnBaxiar);
	}
}
