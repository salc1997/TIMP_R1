package com.sap.timp.pageObjectModel.BRE.RegrasDeAuditoriaN3.ParametrosGerais;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBase;

public class RegrasDeAuditoriaN3ExcluirPO extends TestBase{
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-a_rules\"]/div/span[text()=\"Regras de Auditoria N3\"]")
	public WebElement regraAuditoriaN3;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	@FindBy(xpath = "//li[@class=\"base-accordion-li \"]/div/span[text()=\"Lixeira\"]")
	public WebElement lixeira;
	

	@FindBy(xpath = "//span[text()=\"Regras de Auditoria N2\"]")
	public WebElement regradeauditorian2;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//span[@id=\"textLabel\"]")
	public WebElement mensagem;
	
	@FindBy(xpath = "//li[@class=\"base-toast  toast-success   \"]/div")
	public WebElement mensagembloqueio;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-left\"]")
	public WebElement primeira;
	
	@FindBy(xpath = "//span[text()=\"Regras de Escritura��o\"]")
	public WebElement regras;
	public RegrasDeAuditoriaN3ExcluirPO() {
		PageFactory.initElements(driver, this);
	}
	
	
	public ArrayList<Boolean> excluir() {
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		regraAuditoriaN3.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//String idRegistro = idObter2();
		String idRegistro = idObter("An3");
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement lixeira1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Lixeira\"]"));
		
		actionsMoveToElement(menu);
		sleep(2000);

		menu.click();
		sleep(1000);
		lixeira1.click();
		sleep(2000);
		waitExpectedElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	//	waitExpectElement(mensagembloqueio);
		sleep(2000);
		
		lixeira.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String idregra2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		double id1 = convertToDouble(idregra2);
		double id2 = convertToDouble(idRegistro);
		System.out.println(id1);
		System.out.println(id2);
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		
		if(id1 == id2)
		{
			System.out.println("Sim, o ID � o mesmo que foi criado");
			boolean sucesso1=true;
			sucesso.add(sucesso1);
			
		}else {
			System.out.println("N�o � o mesmo ID");
			boolean sucesso1 = false;
			sucesso.add(sucesso1);
			
		}
		
		WebElement menu1= driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement excluir = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));
		
		actionsMoveToElement(menu1);
		sleep(2000);

		menu1.click();
		sleep(1000);
		excluir.click();
		sleep(2000);
		waitExpectedElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		driver.navigate().refresh();
		sleep(2000);
		waitExpectedElement("//div[@class=\"overlay loader dark\"]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		actionsMoveToElement(regras);
		sleep(2000);
		lixeira.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String idB = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		System.out.println(idRegistro);
		System.out.println(idB);
		double idD = convertToDouble(idRegistro);
		double idBD = convertToDouble(idB);
		
		boolean sucesso2 = false;
		if (idBD != idD) {
			sucesso2 = true;
			sucesso.add(sucesso2);
		}else {
			sucesso2 = false;
			sucesso.add(sucesso2);
		}
		
		System.out.println(sucesso);
		return sucesso;
	}


}
