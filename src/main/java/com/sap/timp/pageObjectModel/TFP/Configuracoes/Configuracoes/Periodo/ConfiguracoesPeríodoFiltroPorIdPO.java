package com.sap.timp.pageObjectModel.TFP.Configuracoes.Configuracoes.Periodo;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;



public class ConfiguracoesPer�odoFiltroPorIdPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Configura��es\"]")
	public WebElement configuracoe;
	@FindBy(xpath = "//span[text()=\"Per�odo\"]")
	public WebElement periodo;
	@FindBy(xpath = "//div[contains(@class,\"icon-left\")][2]")
	public WebElement primeira;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	@FindBy(xpath = "//div[@id=\"search-container\"]/div/div/input")
	public WebElement pesquisarID;
	@FindBy(xpath = "//span[text()=\"Limpar Filtros\"]")
	public WebElement limpiar;
	
	
	String textId = "";
	public ConfiguracoesPer�odoFiltroPorIdPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> filtro() {
		configuracoe.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		periodo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")).getText();
		
		System.out.println("Id a buscar: "+id);
		
		pesquisar.sendKeys(id);
		sleep(1000);
		pesquisar.sendKeys(Keys.ENTER);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
		
		this.textId = driver
				.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id=\""+id+"\"]/div[3]/div"))
				.getText();

		System.out.println("ID obtenido: "+this.textId);
		
		
		limpiar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
			sucesso.add(id.contains(textId));
		System.out.println(sucesso);
		
		return sucesso;
		
	}
}
