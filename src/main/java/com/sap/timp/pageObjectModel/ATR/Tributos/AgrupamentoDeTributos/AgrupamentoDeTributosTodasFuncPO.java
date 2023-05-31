package com.sap.timp.pageObjectModel.ATR.Tributos.AgrupamentoDeTributos;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;

public class AgrupamentoDeTributosTodasFuncPO extends TestBase{
	
	@FindBy(xpath = "//span[@class=\"title-boxes \"][text()=\"Tributos\"]")
	public WebElement tributos;
	
	@FindBy(xpath = "//span[text()=\"Agrupamento de Tributos\"]")
	public WebElement agrupamentodetributos;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	@FindBy(xpath = "//span[text()=\"Novo Grupo de Tributos\"]")
	public WebElement novo;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher o nome do Grupo\"]")
	public WebElement nome;
	
	@FindBy(xpath = "//div[@class=\"fieldMap taxes\"]/div/div/div[2]")
	public WebElement tributo;
	
	@FindBy(xpath = "//div[@class=\"list-item-text\"][text()=\"COFINS\"]")
	public WebElement opcaotributoE;
	
	@FindBy(xpath = "//div[@class=\"list-item-text\"][text()=\"ICMS\"]")
	public WebElement opcaotributo;
	
	@FindBy(xpath = "//div[@class=\"list-item-text\"][text()=\"COFINS\"]")
	public WebElement opcaotributo1;
	
	
	@FindBy(xpath = "//div[@class=\"fieldMap taxSubset\"]/div/div/div[2]")
	public WebElement tributosaavaliar;
	
	@FindBy(xpath = "//div[@class=\"fieldMap taxSubset\"]/div/div/div/div[1]/div[1]/div[1]")
	public WebElement tributoaavaliar;
	
	@FindBy(xpath = "//div[@class=\"fieldMap taxes\"]/div/div/div/div[1]/div[1]/div[1]")
	public WebElement tributo1;
	
	@FindBy(xpath = "//button[text()=\"Gravar\"]")
	public WebElement gravar;
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement Gravar;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Cancelar\"]")
	public WebElement cancelar;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	@FindBy(xpath = "//div[@class=\"fieldMap taxes\"]/div/div/div/div/div[1]/div[2]")
	public WebElement excluiricms;
	
	@FindBy(xpath = "//div[@class=\"list-item-text\"][text()=\"COFINS\"]")
	public WebElement opcaotributoaavaliar;
	
	@FindBy(xpath = "//div[@class=\"fieldMap taxSubset\"]/div/div/div[2]")
	public WebElement tributosaavaliar2;
	
	// detalles
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[2]/div[2]")
	public WebElement nome1;
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[3]/div[2]/div[1]")
	public WebElement icms;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar; 
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher o nome do Grupo\"]")
	public WebElement nomevi;
	
	@FindBy(xpath = "//div[@class=\"fieldMap taxes\"]/div/div/div/div[1]/div[1]/div[1]")
	public WebElement icmsvi;
	
	@FindBy(xpath = "//div[@class=\"fieldMap taxes\"]/div/div/div/div[1]/div[1]/div[1]")
	public WebElement tributovi;
	@FindBy(xpath = "//div[@class=\"fieldMap taxSubset\"]/div/div/div/div[1]/div[1]/div[1]")
	public WebElement tributoaavaliarvi;
	
	// Editar
	
	@FindBy(xpath = "//div[@class=\"list-option selectAll\"]/div//span")
	public WebElement opcaotributosaavaliar;
	// Excluir em Massa
	
	@FindBy(xpath = "//div[@class=\"list-item-text\"][text()=\"COFINS\"]")
	public WebElement opcaotributo2;
	
	@FindBy(xpath = "//button/span[contains(@class,\"icon-persign\")]")
	public WebElement excluirMassa;
	
	public AgrupamentoDeTributosTodasFuncPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		tributos.click();
	
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		agrupamentodetributos.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(ultimapagina);
		sleep(2000);
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		System.out.println("Ultimo registro: " + id);
		
		novo.click();
		sleep(2000);
		waitExpectElement(nome);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	
		nome.sendKeys("Teste ATR Tributos");
		sleep(1000);
		tributo.click();
		sleep(2000);
		opcaotributo.click();
		sleep(2000);
		closeSelectTypeCheckbox(tributo);
		sleep(2000);
		tributosaavaliar.click();
		sleep(2000);
		opcaotributo.click();
		sleep(2000);
		closeSelectTypeCheckbox(tributosaavaliar);
		sleep(2000);
		gravar.click();

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		
		agrupamentodetributos.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(ultimapagina);
		sleep(2000);
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();	
	//	System.out.println("Rows:" +rows);
		
		String idultimo = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		idInserir("AgrupamentoDeTributosCriar",idultimo);

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
	public ArrayList<Boolean> criarcopia() {
		
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String idRegistro = idObter("AgrupamentoDeTributosCriar");

		System.out.println("Ultimo registro: " + idRegistro);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		WebElement copia = driver.findElement(
				By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Cópia\"]"));

		actionsMoveToElementElement(menu);
		sleep(2000);

		menu.click();
		sleep(1000);
		copia.click();
		sleep(2000);

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		nome.clear();
		sleep(2000);
		nome.sendKeys("Teste ATR Copia");
		sleep(5000);
		excluiricms.click();
		sleep(2000);
		
		tributo.click();
		sleep(2000);
		opcaotributo1.click();
		sleep(2000);
		closeSelectTypeCheckbox(tributo);
		sleep(2000);
		
		tributosaavaliar.click();
		sleep(2000);
		opcaotributoaavaliar.click();
		sleep(2000);
		closeSelectTypeCheckbox(tributosaavaliar);
		
		tributosaavaliar2.click();
		sleep(2000);
		opcaotributoaavaliar.click();
		sleep(2000);
		closeSelectTypeCheckbox(tributosaavaliar2);
		
		sleep(2000);
		gravar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		agrupamentodetributos.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(ultimapagina);
		sleep(2000);
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		int rows = driver
				.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]"))
				.size();

		String idultimo = driver.findElement(By.xpath(
				"//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][" + rows + "]/div[3]/div"))
				.getText();


		System.out.println(idRegistro);
		System.out.println(idultimo);
		double idD = convertToDouble(idRegistro);
		double idBD = convertToDouble(idultimo);

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		if (idBD > idD) {
			System.out.println("É o id que foi criado");
			sucesso.add(true);
		} else {
			System.out.println("Não é o id criado");
			sucesso.add(false);
		}
		menu = driver.findElement(By.xpath("//div[@data-id=\"" + idultimo + "\"]/div[1]/div"));
		WebElement editar = driver.findElement(
				By.xpath("//div[@data-id=\"" + idultimo + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));

		actionsMoveToElementElement(menu);
		sleep(2000);

		menu.click();
		sleep(1000);
		editar.click();

		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
		int icms = driver.findElements(By.xpath("//div[@class=\"fieldMap taxes\"]/div/div/div[1]/div[1]/div[1]/div[1][text()=\"ICMS\"]")).size();

		if (icms == 0) {
			System.out.println("ICMS não consta na edição");
			sucesso.add(true);
		} else {
			System.out.println("ICMS  consta na edição");
			sucesso.add(false);
		}
		
		cancelar.click();
		sleep(2000);
		
		sleep(2000);
		
		menu.click();
		sleep(1000);
		editar.click();

		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
		
		int cofins = driver.findElements(By.xpath("//div[@class=\"fieldMap taxSubset\"]/div/div/div/div/div/div[1]")).size();

		if (cofins > 0) {
			System.out.println("Cofins  consta na edição");
			sucesso.add(true);
		} else {
			System.out.println("Cofins não consta na edição");
			sucesso.add(false);
		}

		cancelar.click();
		sleep(2000);
		
		menu = driver.findElement(By.xpath("//div[@data-id=\"" + idultimo + "\"]/div[1]/div"));
		WebElement excluir = driver.findElement(
				By.xpath("//div[@data-id=\"" + idultimo + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));

		actionsMoveToElementElement(menu);
		sleep(2000);

		menu.click();
		sleep(1000);
		excluir.click();
		
		sleep(2000);
		waitExpectElement(aceitar);
		sleep(2000);
		aceitar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		agrupamentodetributos.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(ultimapagina);
		sleep(2000);
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		int exclusão = driver.findElements(By.xpath("//div[@data-id=\"" + idultimo + "\"]/div[3]/div")).size();

		if (exclusão == 0) {
			System.out.println("Registro não consta na biblioteca");
			sucesso.add(true);
		} else {
			System.out.println("Registo consta na biblioteca");
			sucesso.add(false);
		}
		System.out.println(sucesso);

		return sucesso;
	}
	public ArrayList<Boolean> detalhes() {
		
		sleep(2000);

		tributos.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		agrupamentodetributos.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(ultimapagina);
		sleep(2000);
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("AgrupamentoDeTributosCriar");
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement detalhes = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhes\"]"));
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(1000);
		
		detalhes.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	    sleep(2000);
	    
	  
	   
		String nomedetalhes = nome1.getText();
		String icmsdetalhes= icms.getText();
		//String cofinsdetalhes = cofins.getText();
		
		
		System.out.println(nomedetalhes);
		System.out.println(icmsdetalhes);
		//System.out.println(cofinsdetalhes);
		fechar.click();
		sleep(2000);
		waitExpectElement(ultimapagina);
		sleep(6000);
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro1 =  idObter("AgrupamentoDeTributosCriar");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement ver = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Ver\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		
		ver.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String nomevisualizar = nomevi.getAttribute("value");
		String icmsvisualizar= icmsvi.getText();
		
		System.out.println(nomevisualizar);
		System.out.println(icmsvisualizar);

		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		
		sucesso.add(nomevisualizar.contains(nomedetalhes));
		sucesso.add(icmsvisualizar.contains(icmsdetalhes));

		System.out.println(sucesso);
		aceitar.click();
		sleep(2000);
		
		return sucesso;
		
	}
	public ArrayList<Boolean> editar() {
		
	
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("AgrupamentoDeTributosCriar");
		
		System.out.println("Ultimo registro: " + idRegistro);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);

		menu.click();
		sleep(1000);
		editar.click();
		sleep(2000);
		
		sleep(8000);
		//waitExpectElement(nome);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		nome.clear();
		String enviar = "Teste ATR Editar";
		
		nome.sendKeys(enviar);
		sleep(1000);
		tributo.click();
		sleep(2000);
		opcaotributoE.click();
		sleep(2000);
		closeSelectTypeCheckbox(tributo);
		sleep(3000);
		tributosaavaliar.click();
		sleep(4000);
		opcaotributosaavaliar.click();
		sleep(4000);
		closeSelectTypeCheckbox(tributosaavaliar);
		sleep(2000);
		gravar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		agrupamentodetributos.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(ultimapagina);
		sleep(2000);
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		 menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		 editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);

		menu.click();
		sleep(1000);
		editar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(nome);
		sleep(2000);
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		String nomeregistro = nome.getAttribute("value");
		System.out.println(nomeregistro);
		sucesso.add(nomeregistro.equals(enviar));
		waitExpectElement(tributo);
		sleep(2000);
		tributo.click();
		sleep(2000);
		
		boolean Checkedcofinstributos;
		WebElement cofins=driver.findElement(By.xpath("//div[@id=\"05\"]/div/input"));
		Checkedcofinstributos = cofins.getAttribute("checked").equals("true");
		
		//actionsMoveToElementXpath("//div[@id=\"00\"]/div/label/span");
		
		boolean Checkedicmstributos;
		WebElement icms=driver.findElement(By.xpath("//div[@id=\"00\"]/div/input"));
		Checkedicmstributos = icms.getAttribute("checked").equals("true");
		
		/*
		if(cofins.isSelected() == true &&  icms.isSelected() == true)
		{
			sucesso.add(true);
		}else {
			sucesso.add(false);
		}*/
		
		if(Checkedcofinstributos == true &&  Checkedicmstributos == true)
		{
			sucesso.add(true);
		}else {
			sucesso.add(false);
		}
		
		closeSelectTypeCheckbox(tributo);
		sleep(2000);
		tributosaavaliar.click();
		sleep(2000);
		
		
		boolean Checkedcofinstributosaavaliar;
		WebElement cofinstributosaavaliar=driver.findElement(By.xpath("//div[@id=\"05\"]/div/input"));
		Checkedcofinstributosaavaliar = cofinstributosaavaliar.getAttribute("checked").equals("true");
		
		
		
		
		boolean Checkedicmstributosaavaliar;
		WebElement icmstributosaavaliar=driver.findElement(By.xpath("//div[@id=\"00\"]/div/input"));
		Checkedicmstributosaavaliar = icmstributosaavaliar.getAttribute("checked").equals("true");
		
		if(Checkedcofinstributosaavaliar == true &&  Checkedicmstributosaavaliar == true)
		{
			sucesso.add(true);
		}else {
			sucesso.add(false);
		}
		closeSelectTypeCheckbox(tributosaavaliar);
		
		System.out.println(sucesso);
		cancelar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		return sucesso;
	}
	
	public ArrayList<Boolean> visualizar() {
		
		
		sleep(2000);
		ultimapagina.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("AgrupamentoDeTributosCriar");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement ver = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Ver\"]"));
		
		actionsMoveToElementElement(menu);
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
		waitExpectElement(ultimapagina);
		sleep(2000);
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro1 =  idObter("AgrupamentoDeTributosCriar");
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(1000);
		
		editar.click();
		sleep(2000);
		waitExpectElement(nome);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	    sleep(2000);
	    
	  
	    String nomeeditar = nome.getAttribute("value");
		String tributoeditar = tributo1.getText();
		String tributoaavaliareditar = tributoaavaliar.getText();
		
		System.out.println(nomeeditar);
		System.out.println(tributoeditar);
		System.out.println(tributoaavaliareditar);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(nomeeditar.contains(nomevisualizar));
		sucesso.add(tributoeditar.contains(tributovisualizar));
		sucesso.add(tributoaavaliareditar.contains(tributoaavaliarvisualizar));
		
		System.out.println(sucesso);
		cancelar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		return sucesso;
	
			
	}

	public boolean excluir() {
	

	ultimapagina.click();

	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	sleep(2000);

	// pega o ultimo id que foi gerado no criar
	String idRegistro = idObter("AgrupamentoDeTributosCriar");

	WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
	WebElement excluir = driver.findElement(
			By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));

	actionsMoveToElementElement(menu);
	sleep(2000);
	menu.click();
	sleep(1000);
	excluir.click();
	sleep(2000);
	waitExpectElement(aceitar);
	sleep(2000);
	aceitar.click();
	sleep(2000);
	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	sleep(2000);
	
	agrupamentodetributos.click();
	sleep(2000);
	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	sleep(2000);
	waitExpectElement(ultimapagina);
	sleep(2000);
	ultimapagina.click();
	sleep(2000);
	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	sleep(2000);

	boolean sucesso = false;

	int exclusão = driver.findElements(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[3]/div")).size();

	if (exclusão == 0) {
		System.out.println("Registro não consta na biblioteca");
		sucesso = true;
	} else {
		System.out.println("Registo consta na biblioteca");
		sucesso = false;
	}
	System.out.println(sucesso);
	return sucesso;
	
}
	public boolean criarMassa() {
		

		waitExpectElement(ultimapagina);
		sleep(2000);
		
		ultimapagina.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		sleep(2000);
		System.out.println(id);
		
		novo.click();
		sleep(2000);
		waitExpectElement(nome);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//Primeiro Registro
		nome.sendKeys("Teste ATR Tributos 1");
		sleep(1000);
		tributo.click();
		sleep(2000);
		opcaotributo1.click();
		sleep(2000);
		closeSelectTypeCheckbox(tributo);
		sleep(2000);
		tributosaavaliar.click();
		sleep(2000);
		opcaotributo1.click();
		sleep(2000);
		closeSelectTypeCheckbox(tributosaavaliar);
	
		gravar.click();
		sleep(2000);
		agrupamentodetributos.click();
		sleep(2000);
		sleep(24000);
		novo.click();
		sleep(2000);
		waitExpectElement(nome);
		sleep(3000);
		//Segundo Registro
		
		nome.sendKeys("Teste ATR Tributos 2");
		sleep(1000);
		tributo.click();
		sleep(2000);
		opcaotributo2.click();
		sleep(2000);
		closeSelectTypeCheckbox(tributo);
		sleep(2000);
		tributosaavaliar.click();
		sleep(2000);
		opcaotributo2.click();
		sleep(2000);
		closeSelectTypeCheckbox(tributosaavaliar);
		sleep(2000);
		gravar.click();
		sleep(2000);
	
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		agrupamentodetributos.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(ultimapagina);
		sleep(2000);
		
		ultimapagina.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String idRegistro1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		rows = rows-1;
		
		String idRegistro2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		
		
	
		sleep(2000);
		System.out.println(id);
		System.out.println(idRegistro1);
		System.out.println(idRegistro2);
		
		double idD = convertToDouble(id);
		double idRegistroD1 = convertToDouble(idRegistro1);
		double idRegistroD2 = convertToDouble(idRegistro2);

		boolean sucesso = false;
		
		if (idRegistroD1 > idD && idRegistroD2 > idD) {
			sucesso = true;
		}else {
			sucesso = false;
		}
		System.out.println(sucesso);
		
		
		return sucesso;
		
		
	}	
	
	
	public boolean excluirMassa() {
		
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String idRegistro1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();

		
		WebElement check1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/label/span"));
		check1.click();
		sleep(1000);
		rows = rows-1;
		
		String idRegistro2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		WebElement check2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/label/span"));
		check2.click();
		
		sleep(1000);
		
		excluirMassa.click();
		sleep(1000);
		waitExpectElement(aceitar);
		sleep(1000);
		aceitar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
		/*agrupamentodetributos.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);*/
		waitExpectElement(ultimapagina);
		sleep(2000);
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		int id1 = convertToInt(id);
		int id2 = convertToInt(idRegistro1);
		int id3 = convertToInt(idRegistro2);
		
		System.out.println(" Id Ultimo Registro: "+ id1);
		System.out.println("Id Excluir Registro 1: " + id2);
		System.out.println("Id Excluir Registro 2: " + id3);
		
		boolean sucesso = false;
		
		if (id1 != id2 && id1!=id3) {
			sucesso = true;
		}else {
			sucesso=false;
		}
		
		System.out.println(sucesso);
		
		return sucesso;
	}
	
	

}
