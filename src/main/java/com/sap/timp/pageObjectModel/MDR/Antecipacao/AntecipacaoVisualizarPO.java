package com.sap.timp.pageObjectModel.MDR.Antecipacao;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class AntecipacaoVisualizarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\" Antecipação\"]")
	public WebElement antecipacao;

	@FindBy(xpath = "//*[@id=\"list\"]/div/div/div[2]/div/div[5]")
	public WebElement siguiente;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
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
		sleep(2000);
		
		String idRegistro = idObter1();
		
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(4000);
		
		
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
