package com.sap.timp.pageObjectModel.MDR.AtividadeFiscal;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class AtividadeEliminarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//div/div/span[text()=\"Id\"]")
	public WebElement idC;
	
	@FindBy(xpath = "//span[text()=\"Detalhes Do Tipo De Tributo\"]")
	public WebElement detalhe;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div/div")
	public WebElement menu;
	
	@FindBy(xpath = "//li/span[text()=\"Excluir\"]")
	public WebElement excluir;

	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")
	public WebElement idR;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//div[text()=\"Nenhum resultado\"]")
	public WebElement nenhumResult;
	
	@FindBy(xpath = "//*[@id=\"left-content\"]/div/ul/li[4]")
	public WebElement atividades1;

	@FindBy(xpath = "//*[@id=\"left-content\"]/div/ul/li[4]/ul/li[1]")
	public WebElement atividadesO1;

	@FindBy(xpath = "//*[@id=\"left-content\"]/div/ul/li[3]")
	public WebElement atividades2;

	@FindBy(xpath = "//*[@id=\"left-content\"]/div/ul/li[3]/ul/li[1]")
	public WebElement atividadesO2;
	
	

	public AtividadeEliminarPO() {

		PageFactory.initElements(driver, this);
	}
	
	
	public void eliminar() {
		
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
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");

		sleep(2000);
		
		siguiente.click();

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		waitExpectElement(menu);
		sleep(2000);

		idC.click();
		dobleClickElement(idC);
		sleep(2000);
		
		String id = idR.getText();
		menu.click();
		sleep(2000);
		System.out.println(id);
		
		excluir.click();
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		
		sleep(2000);
		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li[1]/div/span[3]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		pesquisar.sendKeys(id);
		pesquisar.sendKeys(Keys.ENTER);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		boolean sucesso = nenhumResult.isDisplayed();
		
		System.out.println(sucesso);
	
	}

}
