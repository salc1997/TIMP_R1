package com.sap.timp.pageObjectModel.MDR.CadastroCondiçao;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseEliel;

public class CadastroCondicaoVisualizarPO extends TestBaseEliel {

	@FindBy(xpath = "//span[text()=\"Cadastro da Condição\"]")
	public WebElement cadastrocondicao;
		
		
	@FindBy(xpath = "//*[@id=\"list\"]/div/div/div[1]/div/div[2]/div/div[3]/div")
	public WebElement idC;
	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")
	public WebElement idR;
	

	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement setafinal;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement setafinaltc2;
	
	@FindBy(xpath = "//div[@class=\"tr first\" and @data-id][1]/div[2]/label/span")
	public WebElement opcao;
	
	
	public CadastroCondicaoVisualizarPO() {
		PageFactory.initElements(driver, this);
	}
	
public String visualizar() {
		
		
		//Actions action = new Actions(driver);

		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		cadastrocondicao.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		//Pega o ultimo id
		setafinal.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String idRegistro = idObter4();
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		actionsMoveToElementElement(menu);
		sleep(4000);
		
		menu.click();
		sleep(2000);
		visualizar.click();
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		String sucesso = driver.findElement(By.xpath("//table[@class=\"edit\"]")).getAttribute("class");
		//System.out.println(sucesso);	
		return sucesso;
	}
}
