package com.sap.timp.pageObjectModel.MDR.Antecipacao;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBase;

public class AntecipacaoEliminarPO extends TestBase{
	
	@FindBy(xpath = "//span[text()=\" Antecipação\"]")
	public WebElement antecipacao;

	@FindBy(xpath = "//*[@id=\"list\"]/div/div/div[1]/div/div[3]/div[3]/div[1]/div")
	public WebElement menu;

	@FindBy(xpath = "//*[@id=\"list\"]/div/div/div[1]/div/div[3]/div[3]/div[1]/div/div[2]/ul/li[3]")
	public WebElement editar;

	@FindBy(xpath = "//*[@id=\"list\"]/div/div/div[1]/div/div[2]/div/div[3]")
	public WebElement idC;

	@FindBy(xpath = "//*[@id=\"list\"]/div/div/div[2]/div/div[5]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//li/span[text()=\"Visualizar\"]")
	public WebElement visualizar;
	
	@FindBy(xpath = "//li/span[text()=\"Excluir\"]")
	public WebElement excluir;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//*[@id=\"list\"]/div/div/div[1]/div/div[3]/div[3]/div[3]/div")
	public WebElement id;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//div[text()=\"Nenhum resultado\"]")
	public WebElement nenhumResult;
	
	public AntecipacaoEliminarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean eliminar() {
		
		antecipacao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");

		idC.click();
		dobleClickElement(idC);
		sleep(2000);
		String idR = id.getText();
		
		menu.click();
		sleep(2000);
		System.out.println(idR);
		
		excluir.click();
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		pesquisar.sendKeys(idR);
		pesquisar.sendKeys(Keys.ENTER);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);

		
		boolean sucesso = nenhumResult.isDisplayed();
		return sucesso;
	}
}
