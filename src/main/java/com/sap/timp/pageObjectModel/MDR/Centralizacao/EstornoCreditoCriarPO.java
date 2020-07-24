package com.sap.timp.pageObjectModel.MDR.Centralizacao;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.base.TestBaseKathy;
import com.sap.timp.base.TestBaseSteven;

public class EstornoCreditoCriarPO extends TestBaseEliel{
	
	@FindBy(xpath = "//span[text()=\"Centralização\"]")
	public WebElement centralizacao;
	
	@FindBy(xpath = "//span[text()=\"Estorno de Crédito de Insumos\"]")
	public WebElement estornocredito;
	
	@FindBy (xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisa;

	@FindBy(xpath = "//button[@id=\"home-icon\"]")
	public WebElement mostrar;
	
	@FindBy(xpath = "//span[text()=\"Novo Estorno de Crédito de Insumos\"]")
	public WebElement novoestorno;
	
	@FindBy(xpath = "//*[@id=\"company\"]/div/div[1]/div[1]")
	public WebElement empresa;
	
	@FindBy(xpath = "//*[@id=\"1000\"]/div[1]/label/span")
	public WebElement opcaoempresa;
	
	@FindBy(xpath = "//*[@id=\"toolbar\"]/div/div/ul/li[1]/button/span[2]")
	public WebElement gravar;
	public EstornoCreditoCriarPO() {

		PageFactory.initElements(driver, this);
	}
	
	
	public void CriarEstornoCredito() {
		
		
		centralizacao.click();

		estornocredito.click();
		
		waitExpectElement(pesquisa);
		
		novoestorno.click();
		
		empresa.sendKeys(Keys.ENTER);
		waitExpectElement(empresa);
		
		
		//verificar se o resultado mostrado é o correto
		//String texto = id.getText();
		//boolean text= texto.contains(id.getText());
		//return text;
		//System.out.println(id.getText());
		
	}
}
