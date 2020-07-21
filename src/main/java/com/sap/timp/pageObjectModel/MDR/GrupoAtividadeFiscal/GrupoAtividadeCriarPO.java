package com.sap.timp.pageObjectModel.MDR.GrupoAtividadeFiscal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBase;

public class GrupoAtividadeCriarPO extends TestBase{
	
	@FindBy(xpath = "//*[@id=\"left-content\"]/div/ul/li[4]")
	public WebElement atividades1;

	@FindBy(xpath = "//*[@id=\"left-content\"]/div/ul/li[4]/ul/li[3]")
	public WebElement atividadesO1;

	@FindBy(xpath = "//*[@id=\"left-content\"]/div/ul/li[3]")
	public WebElement atividades2;

	@FindBy(xpath = "//*[@id=\"left-content\"]/div/ul/li[3]/ul/li[3]")
	public WebElement atividadesO2;
	
	@FindBy(xpath = "//div/div/span[text()=\"Id\"]")
	public WebElement idC;
	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")
	public WebElement idR;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//button/span[text()=\"Novo Grupo de Atividade Fiscal\"]")
	public WebElement novo;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Descrição\")]")
	public WebElement descricao;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Validade De\")]")
	public WebElement validade;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	/*
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	*/
	
	
	public GrupoAtividadeCriarPO() {

		PageFactory.initElements(driver, this);
	}
	
	
	public boolean criar() {
		
		String url = driver.getCurrentUrl();

		if (url.contains("tc2") || url.contains("tp1")) {
			atividades2.click();
			sleep(2000);
			atividadesO2.click();
			sleep(2000);
		} else {

			atividades1.click();
			sleep(2000);
			atividadesO1.click();
			sleep(2000);
		}
		waitExpectXpath("//*[@id=\"list\"]/div/div[1]/div/div[1]/div");
		invisibilityOfElement("//*[@id=\"list\"]/div/div/div/div/img");

		sleep(2000);
		
		siguiente.click();

		waitExpectXpath("//*[@id=\"list\"]/div/div[1]/div/div[1]/div");
		invisibilityOfElement("//*[@id=\"list\"]/div/div/div/div/img");
	
		idC.click();
		dobleClickElement(idC);
		sleep(2000);
		
		String id = idR.getText();
		sleep(2000);
		
		novo.click();
		sleep(2000);
		
		waitExpectElement(descricao);
		sleep(2000);
		
		descricao.sendKeys("Grupo Atividade Fiscal de Teste");
		
		String data = fechaActual();
		
		validade.sendKeys(data);
		
		sleep(2000);
		
		gravar.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);

		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		biblioteca.click();
		
		waitExpectXpath("//*[@id=\"list\"]/div/div[1]/div/div[1]/div");
		invisibilityOfElement("//*[@id=\"list\"]/div/div/div/div/img");

		siguiente.click();
		waitExpectXpath("//*[@id=\"list\"]/div/div[1]/div/div[1]/div");
		invisibilityOfElement("//*[@id=\"list\"]/div/div/div/div/img");
		sleep(2000);
		
		idC.click();
		dobleClickElement(idC);
		sleep(2000);
		
		String idB = idR.getText();
		sleep(2000);
		System.out.println(id);
		System.out.println(idB);
		
		double idD = convertToDouble(id);
		double idBD = convertToDouble(idB);
		
		boolean sucesso = false;
		
		if (idBD > idD) {
			sucesso = true;
		}else {
			sucesso = false;
		}

		System.out.println( sucesso);
		return sucesso;
		
	}
	
	

}
