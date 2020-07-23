package com.sap.timp.pageObjectModel.MDR.Centralizacao;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.base.TestBaseKathy;
import com.sap.timp.base.TestBaseSteven;

public class EstornoCreditoFiltrosPO extends TestBaseEliel{
	
	@FindBy(xpath = "//span[text()=\"Centralização\"]")
	public WebElement centralizacao;
	
	@FindBy(xpath = "//span[text()=\"Estorno de Crédito de Insumos\"]")
	public WebElement estornocredito;
	
	@FindBy (xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisa;

	@FindBy(xpath = "//button[@id=\"home-icon\"]")
	public WebElement mostrar;
	
	@FindBy(xpath = "//*[@id=\"list\"]/div/div/div[1]/div/div[3]/div[1]/div[3]/div")
	public WebElement id;
	
	@FindBy(xpath = "//*[@id=\"list\"]/div/div/div[1]/div/div[3]/div[1]/div[1]/div/div[1]")
	public WebElement engrenagem;
	
	
	public EstornoCreditoFiltrosPO() {

		PageFactory.initElements(driver, this);
	}
	
	
	public boolean filtroEstornoCredito() {
		
		
		centralizacao.click();

		estornocredito.click();
		
		waitExpectElement(pesquisa);
		
		waitExpectElement(engrenagem);
		
		pesquisa.sendKeys(id.getText());
		pesquisa.sendKeys(Keys.ENTER);
		
		//verificar se o resultado mostrado é o correto
		String texto = id.getText();
		boolean text= texto.contains(id.getText());
		return text;
		//System.out.println(id.getText());
		
	}
}
