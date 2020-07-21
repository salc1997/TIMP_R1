package com.sap.timp.pageObjectModel.MDR.Antecipacao;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBase;

public class AntecipacaoVisualizarPO extends TestBase{
	
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
	
	public AntecipacaoVisualizarPO() {

		PageFactory.initElements(driver, this);
	}
	
	
	public String visualizar() {
		
		
		antecipacao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");

		idC.click();
		dobleClickElement(idC);
		sleep(2000);
		menu.click();
		sleep(2000);
		visualizar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String sucesso = driver.findElement(By.xpath("//table[@class=\"edit\"]")).getAttribute("class");
		
		return sucesso;
		
		
		
		
	}
}
