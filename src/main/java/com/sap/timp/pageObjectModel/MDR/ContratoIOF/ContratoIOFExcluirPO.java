package com.sap.timp.pageObjectModel.MDR.ContratoIOF;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseEliel;

public class ContratoIOFExcluirPO extends TestBaseEliel {
	
	
	
	@FindBy(xpath = "//span[text()=\"Contrato IOF \"]")
	public WebElement contratoiof;
		
	
	
	//@FindBy(xpath = "//*[@id=\"list\"]/div/div[1]/div/div[2]/div/div[3]/div/span[1]")
	@FindBy(xpath = "//span[text()=\"Id\"]")
	public WebElement idC;
	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")
	public WebElement idR;
	

	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement setafinal;
	
	@FindBy(xpath = "//button[@id=\"home-icon\"]")
	public WebElement mostrar;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//div[@class=\"overlay dark\"]/div/div[3]/button[2]")
	//@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[2]")
	public WebElement butaosim;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//span[text()=\"Adicionar\"]")
	public WebElement adicionar;
	
	@FindBy(xpath = "//div[@class=\"tr first\" and @data-id][1]/div[2]/label/span")
	public WebElement opcao;
	
	@FindBy(xpath = "//div[@class=\"tr first\" and @data-id][1]/div[1]/div")
	public WebElement engrenagem;
	
	@FindBy(xpath ="//*[@id=\"table\"]/div/div[1]/div/div[3]/div[3]/div[1]/div/div[2]/ul/li[4]/span[2]")
	public WebElement excluir;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisa;
	
	@FindBy(xpath = "//div[text()=\"Nenhum resultado\"]")
	public WebElement nenhumResult;
	
	public ContratoIOFExcluirPO() {
		PageFactory.initElements(driver, this);
	}	
	
	
public boolean excluir() {
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		contratoiof.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		setafinal.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		//pega o ultimo id
		idC.click();
		sleep(1000);
		dobleClickElement(idC);
		sleep(2000);
				
		String id = idR.getText();
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		opcao.click();
		
		engrenagem.click();
		
		sleep(2000);
		
		excluir.click();
		sleep(1000);
		waitExpectElement(butaosim);
		sleep(2000);
		butaosim.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		waitExpectElement(pesquisa);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		pesquisa.sendKeys(id);
		pesquisa.sendKeys(Keys.ENTER);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		boolean sucesso = nenhumResult.isDisplayed();
		System.out.println(sucesso);
		return sucesso;
	}	
	
	

}
