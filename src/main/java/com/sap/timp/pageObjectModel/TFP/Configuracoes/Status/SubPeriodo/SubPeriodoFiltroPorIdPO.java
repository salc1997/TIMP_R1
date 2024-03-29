package com.sap.timp.pageObjectModel.TFP.Configuracoes.Status.SubPeriodo;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.sap.timp.base.TestBase;

public class SubPeriodoFiltroPorIdPO extends TestBase{
	
	@FindBy(xpath = "//span[@class=\"title-boxes \" and text()=\"Configurações\"]")
	public WebElement configuracoes;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-Status\"]")
	public WebElement status;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-SubPeriodStatusList\"]")
	public WebElement subperiodo;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-left\")][2]")
	public WebElement primeira;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	@FindBy(xpath = "//div[@id=\"search-container\"]/div/div/input")
	public WebElement pesquisarID;
	@FindBy(xpath = "//span[text()=\"Limpar Filtros\"]")
	public WebElement limpiar;
	
	

	public SubPeriodoFiltroPorIdPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> filtro() {
		configuracoes.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		status.click();
		sleep(1000);
		subperiodo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = rows("//div[contains(@class,\"tr\") and @data-id]");
		int rowsAF = rows;
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/div")).getText();
		
		System.out.println("Id a procurar: "+id);
		
		pesquisar.sendKeys(id);
		sleep(1000);
		pesquisar.sendKeys(Keys.ENTER);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows2 = rows("//div[contains(@class,\"tr\") and @data-id]/div[2]/div");
		
		String textId = driver.findElement(By.xpath("//div[contains(@class,\"tr\") and @data-id]/div[2]/div")).getText();
		
		
		System.out.println("ID obtenido: "+textId);
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		
		if (id.equals(textId) && rows2 ==1) {
			sucesso.add(true);
		}else {
			sucesso.add(false);
		}
		

		limpiar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = rows("//div[contains(@class,\"tr\") and @data-id]");
		
		if (rowsAF == rows) {
			sucesso.add(true);
		}else {
			sucesso.add(false);
		
		}
		
	
		System.out.println(sucesso);
		
		return sucesso;
		
	}
}
