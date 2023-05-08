package com.sap.timp.pageObjectModel.TAA.AtribuiçõesdeRegras.RegraDeAbas;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class RegradeAbasDetalhesPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Atribuições de Regras\"]")
	public WebElement AtribuiçõesdeRegras;
	
	@FindBy(xpath = "//*[@id=\"baseTabs-wrapper\"]/div[2]/div/div[2]/div/ul/li[1]/div/span[2]")
	public WebElement ICMS;
	
	@FindBy(xpath = "//span[text()=\"Regras de Abas\"]")
	public WebElement RegrasdeAbas;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button")
	public WebElement btnFechar;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement btnFecharD;
	
	
	public RegradeAbasDetalhesPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> Detalhes(){
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		
		AtribuiçõesdeRegras.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		
		ICMS.click();
		sleep(1000);
		
		RegrasdeAbas.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		
		ultimapagina.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);

		
		String idRegistro = idObter("RegradeAbas");
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhes\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		
		// Datos de visualizar
		String empresaD = driver.findElement(By.xpath("//div[@id=\"detail-description\"][2]//div[2]")).getText();
		String ufD = driver.findElement(By.xpath("//div[@id=\"detail-description\"][3]//div[2]")).getText();
		String filialD = driver.findElement(By.xpath("//div[@id=\"detail-description\"][4]//div[2]")).getText();
		String reglaD = driver.findElement(By.xpath("//div[@id=\"detail-description\"][1]//div[2]")).getText();

		System.out.println("Datos de Detalles");
		System.out.println("Empresa: " + empresaD);
		System.out.println("UF: " + ufD);
		System.out.println("Filial: " + filialD);
		System.out.println("Regla: " + reglaD);
		System.out.println("");
		
		sleep(2000);
		btnFecharD.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		

		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Ver\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		
		// Datos de visualizar
		String empresaV = driver.findElement(By.xpath("//div[@id=\"rule-company\"]//div[@class=\"componentName\"]")).getText();
		String ufV = driver.findElement(By.xpath("//div[@id=\"rule-state\"]//div[@class=\"componentName\"]")).getText();
		String filialV = driver.findElement(By.xpath("//div[@id=\"rule-branch\"]//div[@class=\"componentName\"]")).getText();
		String tributoV = driver.findElement(By.xpath("//div[@id=\"rule-tax\"]//input")).getAttribute("value").trim();
		String reglaV = driver.findElement(By.xpath("//div[@id=\"rule-rule\"]//input")).getAttribute("value").trim();

		System.out.println("Datos de Ver");
		System.out.println("Empresa: " + empresaV);
		System.out.println("UF: " + ufV);
		System.out.println("Filial: " + filialV);
		System.out.println("Tributo: " + tributoV);
		System.out.println("Regla: " + reglaV);
		System.out.println("");
		
		sleep(2000);
		btnFechar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		System.out.println("");
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(empresaD.equals(empresaV));
		sucesso.add(ufD.equals(ufV));
		sucesso.add(filialD.equals(filialV));
		sucesso.add(reglaD.equals(reglaV));

		
		System.out.println("");
		System.out.println(sucesso);
		
		return sucesso;
	}

}
