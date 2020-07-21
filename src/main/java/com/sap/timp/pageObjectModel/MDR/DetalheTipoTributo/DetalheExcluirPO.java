package com.sap.timp.pageObjectModel.MDR.DetalheTipoTributo;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBase;

public class DetalheExcluirPO extends TestBase{
	
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
	

	public DetalheExcluirPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean eliminar() {
		
		detalhe.click();
		sleep(2000);
		waitExpectXpath("//*[@id=\"list\"]/div/div[1]/div/div[1]/div");
		invisibilityOfElement("//*[@id=\"list\"]/div/div/div/div/img");
		siguiente.click();

		waitExpectXpath("//*[@id=\"list\"]/div/div/div[1]/div/div[1]/div");
		invisibilityOfElement("//*[@id=\"list\"]/div[2]/div/div/div/img");
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
		sleep(30000);
		
		pesquisar.sendKeys(id);
		pesquisar.sendKeys(Keys.ENTER);
		
		
		sleep(20000);
		sleep(5000);
		
		boolean sucesso = nenhumResult.isDisplayed();
		
		return sucesso;
		
		
	}
}
