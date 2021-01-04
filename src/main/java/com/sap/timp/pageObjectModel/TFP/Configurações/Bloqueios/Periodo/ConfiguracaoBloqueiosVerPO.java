package com.sap.timp.pageObjectModel.TFP.Configurações.Bloqueios.Periodo;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class ConfiguracaoBloqueiosVerPO extends TestBaseFernando{
	@FindBy(xpath = "//div[contains(@class, \"baseTabs-box\")]/span/span[text()=\"Configurações\"]")
	public WebElement abaConfiguracoes;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-Bloqueios\"]")
	public WebElement bloqueios;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-PeriodUp\"]")
	public WebElement periodo;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca;
	
	public ConfiguracaoBloqueiosVerPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> ver() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		abaConfiguracoes.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		bloqueios.click();
		sleep(2000);
		
		periodo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter1();		
		System.out.println("ID REGISTRO: " + idRegistro);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Ver\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(2000);
		editar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		// Datos de Ver
		String statusString = driver.findElement(By.xpath("//div[@id=\"statusInput\"]/div/textarea")).getAttribute("value").trim();
		String empresaString = driver.findElement(By.xpath("//div[@id=\"companyInput\"]/div/textarea")).getAttribute("value").trim();
		String estadoString = driver.findElement(By.xpath("//div[@id=\"ufInput\"]/div/textarea")).getAttribute("value").trim();
		String filialString = driver.findElement(By.xpath("//div[@id=\"branchInput\"]/div/textarea")).getAttribute("value").trim();
		String validadeDeString = driver.findElement(By.xpath("//div[@id=\"validFrom\"]/div/textarea")).getAttribute("value").trim();
		String componenteBfbString = driver.findElement(By.xpath("//div[@class=\"app-name droppable-tile-name\"]")).getText().trim();
		
		System.out.println("Datos de menu Ver");
		System.out.println("-------------------------------------------------------");
		System.out.println("Status: " + statusString);
		System.out.println("Empresa: " + empresaString);
		System.out.println("Estado: " + estadoString);
		System.out.println("Filial: " + filialString);
		System.out.println("Validade De: " + validadeDeString);
		System.out.println("Componente: " + componenteBfbString);
		System.out.println("");
		
		btnBiblioteca.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(2000);
		editar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		// Datos de Editar
		String statusString1 = driver.findElement(By.xpath("//div[@id=\"statusInput\"]/div/div/div/div/div/div[1]")).getText().trim();
		String empresaString1 = driver.findElement(By.xpath("//div[@id=\"companyInput\"]/div/div/div/div/div/div[1]")).getText().trim();
		String estadoString1 = driver.findElement(By.xpath("//div[@id=\"ufInput\"]/div/div/div/div/div/div[1]")).getText().trim();
		String filialString1 = driver.findElement(By.xpath("//div[@id=\"branchInput\"]/div/div/div/div/div/div[1]")).getText().trim();
		String validadeDeString1 = driver.findElement(By.xpath("//div[@id=\"validFrom\"]/div/div/input")).getAttribute("value").trim();
		String componenteBfbString1 = driver.findElement(By.xpath("//div[@id=\"list-r-elements-wrapper\"]/div[1]/div/div[2]/div[1]")).getText().trim();

		System.out.println("Datos de menu Editar");
		System.out.println("-------------------------------------------------------");
		System.out.println("Status: " + statusString1);
		System.out.println("Empresa: " + empresaString1);
		System.out.println("Estado: " + estadoString1);
		System.out.println("Filial: " + filialString1);
		System.out.println("Validade De: " + validadeDeString1);
		System.out.println("Componente: " + componenteBfbString1);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(statusString1.contains(statusString));
		sucesso.add(empresaString1.equals(empresaString));
		sucesso.add(estadoString1.equals(estadoString));
		sucesso.add(filialString1.contains(filialString));
		sucesso.add(validadeDeString1.equals(validadeDeString));
		sucesso.add(componenteBfbString1.equals(componenteBfbString));
		
		System.out.println("");
		System.out.println(sucesso);
		
		return sucesso;
	}
}
