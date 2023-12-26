package com.sap.timp.pageObjectModel.TKM.conteudoDeTransporte.PacoteImportado;


import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBase;
import com.sap.timp.base.TestBase;

public class BibliotecaPO extends TestBase{

					 
	@FindBy(xpath = "//span[text()=\"Pacotes Importados\"]")
	public WebElement btnPacoteImportado;
	
	@FindBy(xpath = "//button//span[text()=\" Importar\"]")
	public WebElement btnImportar;
	
	@FindBy(xpath = "//div[@id=\"name\"]//input")
	public WebElement txtNome;
	
	@FindBy(xpath = "//div[@id=\"description\"]//input")
	public WebElement txtdescripcion;
	
	@FindBy(xpath = "//button[text()=\"Subir\"]")
	public WebElement btnSubir;
	
	@FindBy(xpath = "//button[text()=\"Baixar\"]")
	public WebElement btnBaxiar;
	
	@FindBy(xpath = "//button//span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca;
	
	
	
	
	public BibliotecaPO() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickbtnPacoteImportado() {
		click(btnPacoteImportado);
	}
	
	public void clickbtnImportar() {
		click(btnImportar);
	}

	
	public void clickbtnSubir() {
		click(btnSubir);
	}
	public void clickbtnBaxiar() {
		click(btnBaxiar);
	}
	
	public void clickbtnBiblioteca() {
		click(btnBiblioteca);
	}
}
