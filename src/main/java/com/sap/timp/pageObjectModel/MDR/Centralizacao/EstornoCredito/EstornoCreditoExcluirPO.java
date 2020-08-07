package com.sap.timp.pageObjectModel.MDR.Centralizacao.EstornoCredito;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseEliel;

public class EstornoCreditoExcluirPO extends TestBaseEliel {
	
	
	@FindBy(xpath = "//span[text()=\"Centralização\"]")
	public WebElement centralizacao;
	
	@FindBy(xpath = "//span[text()=\"Estorno de Crédito de Insumos\"]")
	public WebElement estornocredito;
	
	
	@FindBy(xpath = "//span[text()=\"Cadastro da Condição\"]")
	public WebElement cadastrocondicao;
		
		
	@FindBy(xpath = "//*[@id=\"list\"]/div/div/div[1]/div/div[2]/div/div[3]/div")
	public WebElement idC;
	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")
	public WebElement idR;
	

	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement setafinal;
	
	@FindBy(xpath = "//div[@class=\"tr first\" and @data-id][1]/div[2]/label/span")
	public WebElement opcao;
	
	@FindBy(xpath = "//div[@class=\"tr first\" and @data-id][1]/div[1]/div")
	public WebElement engrenagem;

	
	@FindBy(xpath = "//*[@id=\"list\"]/div/div/div[1]/div/div[3]/div[3]/div[1]/div/div[2]/ul/li[4]")
	public WebElement excluir;
	//@FindBy(xpath = "//div[@class=\"tr\" and @data-id][4]/div/div/div[2]/ul/li[4]/span[2]")
	
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[2]")
	public WebElement butaosim;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisa;
	
	@FindBy(xpath = "//div[text()=\"Nenhum resultado\"]")
	public WebElement nenhumResult;
	
	public EstornoCreditoExcluirPO() {
		PageFactory.initElements(driver, this);
	}
	
public boolean excluir() {
		
		
		//Actions action = new Actions(driver);

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		centralizacao.click();
		sleep(2000);
		estornocredito.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	
		
		setafinal.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		idC.click();
		dobleClickElement(idC);
		sleep(2000);
		
		//pega o id do ultimo relatório
		String id = idR.getText();
		sleep(2000);
		//System.out.println(id);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			
		opcao.click();
		
		engrenagem.click();
		sleep(1000);
		excluir.click();
		sleep(1000);
		waitExpectElement(butaosim);
		sleep(2000);
		butaosim.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//recarrega a pagina
		driver.navigate().refresh();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
	
		waitExpectElement(pesquisa);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		pesquisa.sendKeys(id);
		pesquisa.sendKeys(Keys.ENTER);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		boolean sucesso = nenhumResult.isDisplayed();
		System.out.println(sucesso);
		return sucesso;
	}

}
