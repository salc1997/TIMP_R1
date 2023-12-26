package com.sap.timp.pageObjectModel.ATR.Tributos.AgrupamentoDeTributos;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBase;

public class AgrupamentoDeTributosVerPO extends TestBase{
	
	protected String estruc = "http://as1-100-01-tc2:8000/timp/atr/#/structures";
	
	@FindBy(xpath = "//span[@class=\"title-boxes \"][text()=\"Tributos\"]")
	public WebElement tributos;
	
	@FindBy(xpath = "//span[text()=\"Agrupamento de Tributos\"]")
	public WebElement agrupamentodetributos;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a data de início de vigência\"]")
	public WebElement datavigencia;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher o nome do Grupo\"]")
	public WebElement nomevi;
	
	@FindBy(xpath = "//div[@class=\"fieldMap taxes\"]/div/div/div/div[1]/div[1]/div[1]")
	public WebElement tributovi;
	@FindBy(xpath = "//div[@class=\"fieldMap taxSubset\"]/div/div/div/div[1]/div[1]/div[1]")
	public WebElement tributoaavaliarvi;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher o nome do Grupo\"]")
	public WebElement nome;
	
	@FindBy(xpath = "//div[@class=\"fieldMap taxes\"]/div/div/div/div[1]/div[1]/div[1]")
	public WebElement tributo;
	@FindBy(xpath = "//div[@class=\"fieldMap taxSubset\"]/div/div/div/div[1]/div[1]/div[1]")
	public WebElement tributoaavaliar;

	@FindBy(xpath = "//button[text()=\"Cancelar\"]")
	public WebElement cancelar;
	
	public AgrupamentoDeTributosVerPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> visualizar() {
		
		sleep(2000);
		driver.get(estruc);
		sleep(8000);

		tributos.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		agrupamentodetributos.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectedElement(siguiente);
		sleep(2000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("AgrupamentoDeTributosCriar");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement ver = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Ver\"]"));
		
		actionsMoveToElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		
		ver.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String nomevisualizar = nomevi.getAttribute("value");
		String tributovisualizar = tributovi.getText();
		String tributoaavaliarvisualizar = tributoaavaliarvi.getText();
		
		System.out.println(nomevisualizar);
		System.out.println(tributovisualizar);
		System.out.println(tributoaavaliarvisualizar);
		
		aceitar.click();
		sleep(2000);
		waitExpectedElement(siguiente);
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro1 =  idObter("AgrupamentoDeTributosCriar");
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		actionsMoveToElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(1000);
		
		editar.click();
		sleep(2000);
		waitExpectedElement(nome);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	    sleep(2000);
	    
	  
	    String nomeeditar = nome.getAttribute("value");
		String tributoeditar = tributo.getText();
		String tributoaavaliareditar = tributoaavaliar.getText();
		
		System.out.println(nomeeditar);
		System.out.println(tributoeditar);
		System.out.println(tributoaavaliareditar);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(nomeeditar.contains(nomevisualizar));
		sucesso.add(tributoeditar.contains(tributovisualizar));
		sucesso.add(tributoaavaliareditar.contains(tributoaavaliarvisualizar));
		
		cancelar.click();
		sleep(2000);

		
		System.out.println(sucesso);
		
		
		return sucesso;
	
			
	}


}
