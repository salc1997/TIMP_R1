package com.sap.timp.pageObjectModel.DFG.Leiautes;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class LeiautesExecucaoCamposEspeciais1y2PO extends TestBaseKenssy {

	@FindBy(xpath = "//span[text()=\"Raiz\"]")
	public WebElement raiz;
	@FindBy(xpath = "//button/span[text()=\"Novo Leiaute\"]")
	public WebElement novo;
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	@FindBy(xpath = "//input[contains(@placeholder,\"nome\")]")
	public WebElement nome;
	@FindBy(xpath = "//div[@id=\"inputSelectTypeFile\"]/div/div/div[2]")
	public WebElement tipo;
	@FindBy(xpath = "//li[contains(text(),\"ALTER E-SOCIAL S1200\")]")
	public WebElement opcTipo;
	@FindBy(xpath = "//li[contains(text(),\"DCTF\")]")
	public WebElement opcTipo2;
	@FindBy(xpath = "//div[@id=\"inputStructureParent\"]/div/div/div[2]")
	public WebElement grupoEstrutura;
	@FindBy(xpath = "//li[text()=\"Ajuste\"][1]")
	public WebElement opcGrupoEstructura;
	@FindBy(xpath = "//li[contains(text(),\"Ajuste\")][2]")
	public WebElement opcGrupoEstructura2;
	
	@FindBy(xpath = "//div[@id=\"inputStructureChild\"]/div/div/div[2]")
	public WebElement estrutura;
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcEstrutura;
	@FindBy(xpath = "//*[@id=\"inputValidFrom\"]/div/div[1]/input")
	public WebElement dataVigencia;
	@FindBy(xpath = "//*[@id=\"inputLayoutVersion\"]/div/div[1]/input")
	public WebElement versaoLeiaute;
	@FindBy(xpath = "//button[text()=\"Salvar\"]")
	public WebElement salvar;
	
	
	//SEPARADORES
	@FindBy(xpath = "//button/span[2][text()=\"Separadores\"]")
	public WebElement seperadores;
	@FindBy(xpath = "//*[@id=\"toolbarSecund\"]/div/ul/li[2]/button/span")
	public WebElement flecha;
	
	public LeiautesExecucaoCamposEspeciais1y2PO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> criarLeiaute() {
		boolean tc2 = false;
		boolean tq1 = false;
		boolean tp1 = false;
		String url = driver.getCurrentUrl();
		
		if (url.contains("tc2")) {
			tc2 = true;
		}else if (url.contains("tp1")) {
			tp1 = true;
		}else if (url.contains("tq1")) {
			tq1 = true;
		}
		
		raiz.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[@data-id and @class=\"tr\"]")).size();
		String idLeiaute = driver.findElement(By.xpath("//div[@data-id and @class=\"tr\"]["+rows+"]/div[5]/div")).getText();

		System.out.println(idLeiaute + "ultimo id Leiaute");
		
		
		System.out.println("");
		System.out.println("------------------------CRIAR LEIAUTE-------------------");
		System.out.println("");
		
		novo.click();
		sleep(3000);
		waitExpectElement(nome);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		nome.sendKeys("Teste Automatizado kenssy");
		sleep(1000);
		String nomeValor = nome.getAttribute("value");
		System.out.println("nombreInicial "+nomeValor);
		
		tipo.click();
		sleep(2000);
		
		if (tq1 == true) {
			opcTipo.click();
			sleep(1000);
//			String tipoT = opcTipo.getText();
//			System.out.println(tipoT);
		}else if (tc2 ==true) {
			opcTipo2.click();
			sleep(1000);
			String tipoT = opcTipo.getText();
			System.out.println(tipoT);
		}else {
			//CORREGIR AL EJECUTAR EN AMBIENTE
			opcTipo.click();
			sleep(1000);
//			String tipoT = opcTipo.getText();
//			System.out.println(tipoT);
		}
		
		
		
		sleep(1000);
		actionsMoveToElementElement(versaoLeiaute);
		sleep(1000);
		
		grupoEstrutura.click();
		sleep(1000);
		
		if (tq1 == true) {
			opcGrupoEstructura.click();
			sleep(1000);
		}else if (tc2 ==true) {
			opcGrupoEstructura.click();
			sleep(1000);
		}else {
			//CORREGIR AL EJECUTAR EN AMBIENTE
			opcGrupoEstructura2.click();
			sleep(1000);
		}
		
		estrutura.click();
		sleep(1000);
		opcEstrutura.click();
		sleep(1000);
		opcEstrutura.sendKeys(Keys.ESCAPE);
		sleep(1000);
		
		dataVigencia.sendKeys("01/01/2013");
		sleep(1000);
		
		versaoLeiaute.sendKeys("1");
		sleep(1000);
		
		salvar.click();
		sleep(3000);
		//waitExpectElement(gravar);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int mensaje = driver.findElements(By.xpath("//span[contains(text(),\"O leiaute foi criado com sucesso\")]")).size();
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (mensaje > 0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		return sucesso;
	}
	
	public void separadores() {
		while (!seperadores.isDisplayed()) {
			flecha.click();
		}
		sleep(1000);
		
		seperadores.click();
		sleep(1000);
		
		
	}
}
