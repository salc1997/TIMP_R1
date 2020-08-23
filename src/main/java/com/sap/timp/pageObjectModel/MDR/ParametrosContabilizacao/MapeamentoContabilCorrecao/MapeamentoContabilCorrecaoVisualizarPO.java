package com.sap.timp.pageObjectModel.MDR.ParametrosContabilizacao.MapeamentoContabilCorrecao;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class MapeamentoContabilCorrecaoVisualizarPO extends TestBaseSteven {

	@FindBy(xpath = "//span[text()=\"Parâmetros de Contabilização\"]")
	public WebElement parametro;
	
	@FindBy(xpath = "//span[text()=\"Mapeamento Contábil por Correção\"]")
	public WebElement contabil;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;

	public MapeamentoContabilCorrecaoVisualizarPO() {

		PageFactory.initElements(driver, this);
	}

	public String visualizar() {

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		parametro.click();
		sleep(1000);
		contabil.click();
		//invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		//sleep(2000);

		//siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter2();

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		
		visualizar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);

		String sucesso = driver.findElement(By.xpath("//table[@class=\"edit\"]")).getAttribute("class");

		return sucesso;

	}

}
