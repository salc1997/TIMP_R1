package com.sap.timp.pageObjectModel.TCC.BancoDeCreditoExtemporaneo.Executados;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBase;

public class ExecutadosExcluirPO extends TestBase {
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-bce\"]")
	public WebElement bancoCreditoExtemporaneo;

	@FindBy(xpath = "//span[text()=\"Painel BCE\"]")
	public WebElement painelbce;
	
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement ultimaPagina;
	
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement Gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;

	@FindBy(xpath = "//li[@identifier=\"accordion-item-bceExecuted\"]")
	public WebElement executados;

	String URL = driver.getCurrentUrl();
	
	public ExecutadosExcluirPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> excluir() {
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		bancoCreditoExtemporaneo.click();
		sleep(2000);
		
		executados.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//String idRegistro = idObter4();
		String idRegistro = idObter("idResultadoDeExecucaco");
		System.out.println("ID Registro: " + idRegistro);
		
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		//ultimo id
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/div")).getText();
		System.out.println("ID Ultimo Registro: " + id);
		
		int id1 = convertToInt(id);
		int id2 = convertToInt(idRegistro);
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		if(id2 == id1) {
			System.out.println("Sim, s�o iguais");
			sucesso.add(true);
		}else {
			System.out.println("N�o s�o iguais");
			sucesso.add(false);
		}
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement excluir = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));
		actionsMoveToElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		excluir.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectedElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
		ultimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		 rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		//ultimo id
		String idultimo = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/div")).getText();
		System.out.println("ID Ultimo Registro: " + id);
		
		int idc = convertToInt(idultimo);
		int idb = convertToInt(idRegistro);
			if(idc!= idb) {
			System.out.println("Sim s�o diferente");
			sucesso.add(true);
		}else {
			System.out.println("N�o, s�o iguais");
			sucesso.add(false);
		}
		System.out.println(sucesso);
		return sucesso;
		}

}
