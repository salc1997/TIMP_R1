package com.sap.timp.pageObjectModel.TAA.AtribuiçõesdeRegras.RegraDeAbas;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class RegradeAbasTodasAsFuncPO extends TestBaseSteven {
	
	@FindBy(xpath = "//span[text()=\"Atribuições de Regras\"]")
	public WebElement AtribuiçõesdeRegras;
	
	@FindBy(xpath = "//*[@id=\"baseTabs-wrapper\"]/div[2]/div/div[2]/div/ul/li[1]/div/span[2]")
	public WebElement ICMS;
	
	@FindBy(xpath = "//span[text()=\"Regras de Abas\"]")
	public WebElement RegrasdeAbas;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	@FindBy(xpath = "//button[text()=\"Cancelar\"]")
	public WebElement cancelar;
	
	@FindBy(xpath = "//span[text()=\"Nova Atribuição Regra\"]")
	public WebElement btnNovoRegra;
	
	@FindBy(xpath = "//input[@placeholder=\"SelecionarTributo\"]")
	public WebElement cboTributo;
	
	@FindBy(xpath = "//li[@tabindex=\"0\" and @id and @class=\"list-item\" and text()=\"ICMS\"]")
	public WebElement opcionTributo;
	
	@FindBy(xpath = "//div[@id=\"rule-company\"]/div/div/div[2]")
	public WebElement cboEmpresa;
	
	@FindBy(xpath = "//*[@id=\"1000\"]/div[1]/label/span")
	public WebElement opcionEmpresa;
	
	@FindBy(xpath = "//input[@placeholder=\"SelecionarUF Origem\"]")
	public WebElement cboUf;
	
	@FindBy(xpath = "//*[@id=\"SP\"]/div[1]/label/span")
	public WebElement opcionUf;
	
	@FindBy(xpath = "//*[@id=\"AL\"]/div[1]/label/span")
	public WebElement opcionUfTC2;
	
	@FindBy(xpath = "//input[@placeholder=\"SelecionarFilial\"]")
	public WebElement cboFilial;
	
	@FindBy(xpath = "//*[@id=\"1000 - 0805\"]/div[1]/label/span")
	public WebElement opcionFilial;
	
	@FindBy(xpath = "//div[@id=\"1000_AL_0805\"]/div[1]/label/span")
	public WebElement opcionFilialTC2;
	
	@FindBy(xpath = "//*[@id=\"main-icon\"]")
	public WebElement cboRegra;
	
	@FindBy(xpath = "//li[@id=\"1000\"]")
	public WebElement opcionRegra;
	
	@FindBy(xpath = "//li[@id=\"1008\"]")
	public WebElement opcionRegraTC2;
	
	@FindBy(xpath = "//*[@id=\"rule-valid-from\"]/div/div[1]/input")
	public WebElement validaDe;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[2]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnSim;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button")
	public WebElement btnFechar;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement btnAceitar;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement btnFecharD;
	
	public RegradeAbasTodasAsFuncPO() { 
		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		
		String url = driver.getCurrentUrl();

		boolean tp1  = false;
		boolean tc2  = false;
		boolean tq1  = false;
		boolean tq2  = false;

		if (url.contains("tq1")) {
			tq1 = true;
		}else if(url.contains("tc2")){
			tc2 = true;
		}else if(url.contains("tp1")){
			tp1 = true;
		}else if(url.contains("tq2")){
			tq2 = true;
		}
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		AtribuiçõesdeRegras.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ICMS.click();
		sleep(2000);
		
		RegrasdeAbas.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		
		String id = "0"; // Primer ID antes de crear un registro
		
		if(rows > 0) {
			id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")).getText();
			System.out.println("ID Primer Registro: " + id);
		}
		
		btnNovoRegra.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		cboTributo.click();
		sleep(1000);
		opcionTributo.click();
		sleep(1000);
		
		cboEmpresa.click();
		sleep(1000);
		opcionEmpresa.click();
		sleep(1000);
		closeSelectTypeCheckbox(cboEmpresa);
		sleep(1000);
		
		
		if (tq1 == true || tp1 == true || tq2 == true) {
			
			cboUf.click();
			sleep(1000);
			opcionUf.click();
			sleep(1000);
			opcionUf.sendKeys(Keys. ESCAPE);
			sleep(1000);
			
			cboFilial.click();
			sleep(1000);
			opcionFilial.click();
			sleep(1000);
			opcionFilial.sendKeys(Keys. ESCAPE);
			sleep(1000);
			
			cboRegra.click();
			sleep(1000);
			opcionRegra.click();
			sleep(1000);

		}else {
		
			cboUf.click();
			sleep(1000);
			opcionUfTC2.click();
			sleep(1000);
			opcionUfTC2.sendKeys(Keys. ESCAPE);
			sleep(1000);
			
			cboFilial.click();
			sleep(1000);
			opcionFilialTC2.click();
			sleep(1000);
			opcionFilialTC2.sendKeys(Keys. ESCAPE);
			sleep(1000);
			
			cboRegra.click();
			sleep(1000);
			opcionRegraTC2.click();
			sleep(1000);
			
		}
		
	
		validaDe.sendKeys("11/01/2021");
		sleep(1000);
	
		btnGravar.click();
		sleep(2000);

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimapagina.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000); 
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();	
		System.out.println("Rows:" +rows);
		
		String idultimo = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		idInserir("RegradeAbas",idultimo);

		System.out.println(id);
		System.out.println(idultimo);
		double idD = convertToDouble(id);
		double idBD = convertToDouble(idultimo);
		
		boolean sucesso = false;
		if (idBD > idD) {
			sucesso = true;
		}else {
			sucesso = false;
		}
		System.out.println(sucesso);
		return sucesso;
	}
	
	public boolean editar() {
 
		
		
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);	
		
		String idRegistro = idObter("RegradeAbas");
		System.out.println("ID Registro: " + idRegistro);
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
		String valorDescricao = "13/01/2021";
		System.out.println("Fecha Nueva: " + valorDescricao);
		
		validaDe.clear();
		validaDe.sendKeys(valorDescricao);
		sleep(3000);
		
		btnGravar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		driver.navigate().refresh();
		
		sleep(10000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(25000);
		
		AtribuiçõesdeRegras.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ICMS.click();
		sleep(2000);
		
		RegrasdeAbas.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);	
		
		WebElement menu2 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao2 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu2.click();
		sleep(1000);
		açao2.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		attributoNotToBeEmptyElement(validaDe, "value");
		String valorDescricaoGuardado = validaDe.getAttribute("value");
		System.out.println("");
		System.out.println("Descricao valor guardado: " + valorDescricaoGuardado);
		  
		boolean sucesso = false;
		
		if(valorDescricaoGuardado.equals(valorDescricao)) {
			System.out.println("");
			System.out.println("Valor editado satisfactoriamente...");
			sucesso = true;
		}else {
			System.out.println("");
			System.out.println("Error al prencher descricao...");
		}
		
		return sucesso;
	}
	public ArrayList<Boolean> Detalhes(){
		
		
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
	public ArrayList<Boolean> ver(){
		
		cancelar.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		
		ultimapagina.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);

		
		String idRegistro = idObter("RegradeAbas");
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Ver\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		
		// Datos de visualizar
		String empresaString = driver.findElement(By.xpath("//div[@id=\"rule-company\"]//div[@class=\"componentName\"]")).getText();
		String ufString = driver.findElement(By.xpath("//div[@id=\"rule-state\"]//div[@class=\"componentName\"]")).getText();
		String filialString = driver.findElement(By.xpath("//div[@id=\"rule-branch\"]//div/div[@class=\"componentName\"]")).getText();
		String tributoString = driver.findElement(By.xpath("//div[@id=\"rule-tax\"]//input")).getAttribute("value").trim();
		String reglaString = driver.findElement(By.xpath("//div[@id=\"rule-rule\"]//input")).getAttribute("value").trim();

		System.out.println("Datos de Ver");
		System.out.println("Empresa: " + empresaString);
		System.out.println("UF: " + ufString);
		System.out.println("Filial: " + filialString);
		System.out.println("Tributo: " + tributoString);
		System.out.println("Regla: " + reglaString);

		System.out.println("");
		
		sleep(2000);
		btnFechar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		

		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(12000);
		
		// Datos de Editar
		String empresaString1 = driver.findElement(By.xpath("//div[@id=\"rule-company\"]//div[@class=\"componentName\"]")).getText();
		String ufString1 = driver.findElement(By.xpath("//div[@id=\"rule-state\"]//div[@class=\"componentName\"]")).getText();
		String filialString1 = driver.findElement(By.xpath("//div[@id=\"rule-branch\"]//div[@class=\"componentName\"]")).getText();
		String tributoString1 = driver.findElement(By.xpath("//div[@id=\"rule-tax\"]//input")).getAttribute("value").trim();
		String reglaString1 = driver.findElement(By.xpath("//div[@id=\"rule-rule\"]//input")).getAttribute("value").trim();

		
		System.out.println("Datos de Editar");
		System.out.println("Empresa: " + empresaString1);
		System.out.println("UF: " + ufString1);
		System.out.println("Filial: " + filialString1);
		System.out.println("Tributo: " + tributoString1);
		System.out.println("Regla: " + reglaString1);
		System.out.println("");
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(empresaString1.equals(empresaString));
		sucesso.add(ufString1.equals(ufString));
		sucesso.add(filialString1.equals(filialString));
		sucesso.add(tributoString1.equals(tributoString));
		sucesso.add(reglaString1.equals(reglaString));

		
		System.out.println("");
		System.out.println(sucesso);
		
		return sucesso;
	}
	public boolean excluir() {

		cancelar.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);	
		
		String idRegistro = idObter("RegradeAbas");
		System.out.println("ID Registro: " + idRegistro);
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(btnAceitar);
		btnAceitar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();	
		System.out.println("Rows:" +rows);
		
		String idultimo = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		
	
		System.out.println("ID Primer Registro despues de eliminar: " + idultimo);
		
		int id1 = convertToInt(idRegistro);
		int id2 = convertToInt(idultimo);
		
		
		  
		boolean sucesso = false;
		
		if(id2 != id1) {
			System.out.println("");
			System.out.println("Valor eliminado satisfactoriamente...");
			sucesso = true;
		}else {
			System.out.println("");
			System.out.println("Error al eliminar registro...");
		}
		
		return sucesso;
	}
}


