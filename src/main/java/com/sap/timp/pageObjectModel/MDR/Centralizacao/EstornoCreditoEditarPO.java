package com.sap.timp.pageObjectModel.MDR.Centralizacao;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseEliel;

public class EstornoCreditoEditarPO extends TestBaseEliel {

	
	
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
	
	@FindBy(xpath ="//div[@class=\"tr\" and @ data-id][10]/div[2]/label/span")
	public WebElement registro;
	
	@FindBy(xpath = "//div[@class=\"tr\" and @data-id][10]/div[1]/div")
	public WebElement engrenagem;
	
	@FindBy(xpath = "//*[@id=\"list\"]/div/div/div[1]/div/div[3]/div[10]/div[1]/div/div[2]/ul/li[3]/span[2]")
	public WebElement editar;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	public EstornoCreditoEditarPO() {

		PageFactory.initElements(driver, this);
	}
	
	
	public void Editar() {
		//espera a página carregar
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		centralizacao.click();
		sleep(2000);
		estornocredito.click();
		
		waitExpectElement(pesquisa);
		
		registro.click();
	
		engrenagem.click();
		
		editar.click();
		//espera a página carregar
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		//System.out.println( sucesso);
		//return sucesso;
		
		
		
	}	
	
	
	
	
	
	
	
}
