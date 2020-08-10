package com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela26;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class MotivosCesBeneficiosVisualizarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//span[text()=\"Tabelas de Apoio e-Social\"]")
	public WebElement tabelaApoio;
	
	@FindBy(xpath = "//span[text()=\"Tabela 26 - Motivos de Ces. Benefícios\"]")
	public WebElement tabela26;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	
	public MotivosCesBeneficiosVisualizarPO() {

		PageFactory.initElements(driver, this);
	}
	
	
	public String visualizar() {
		
		sleep(2000);
		tabelaApoio.click();
		sleep(2000);
		tabela26.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter4();

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		
		visualizar.click();
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String sucesso = driver.findElement(By.xpath("//table[@class=\"edit\"]")).getAttribute("class");
		System.out.println(sucesso);
		
		return sucesso;
		
	}
}
