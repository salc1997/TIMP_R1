package com.sap.timp.pageObjectModel.ATR.Estruturas.GrupoDeEstruturas;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class GrupoDeEstruturasTodosFuncPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Grupo de Estruturas\"]")
	public WebElement grupodeestrutura;
	
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	@FindBy(xpath = "//span[text()=\"Novo Grupo de Estruturas\"]")
	public WebElement novo;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencha o nome do grupo\"]")
	public WebElement nomedogrupo;
	
	@FindBy(xpath = "//div[@class=\"select\"]/div/div[2]")
	public WebElement estruturadedados;
	
	@FindBy(xpath = "//li[@id][text()=\"Ajustes Fiscais\"]")
	public WebElement opcaoestrutura;
	
	@FindBy(xpath = "//li[@id][text()=\"4.2.2 - CFOP\"]")
	public WebElement opcaoestrutura2;
	
	@FindBy(xpath = "//div[@aria-label=\"Row; Nome: 4.2.2 - CFOP\"]/div/div/div/span")
	public WebElement exclusao;
	
	@FindBy(xpath = "//textarea[@placeholder=\"Preencher Comentários\"]")
	public WebElement comentario;
	
	@FindBy(xpath = "//button[text()=\"Gravar\"]")
	public WebElement gravar;
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement Gravar;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//div[@class=\"th sortable\"]//span[text()=\"ID\"]")
	public WebElement ordenar;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[2]/div/div")
	public WebElement ajustefiscais;
	
	@FindBy(xpath = "//div[@data-id=\"18\"]/div[2]/div")
	public WebElement ajustefiscaisE;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar; 
	
	@FindBy(xpath = "//div[@aria-label=\"Row; Nome: Ajustes Fiscais\"]/div/div")
	public WebElement ajustefiscaisvi;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencha o nome do grupo\"]")
	public WebElement nomedogrupovi;
	

	@FindBy(xpath = "//div[@aria-label=\"Row; Nome: 4.2.2 - CFOP\"]/div[2]/div")
	public WebElement cfop;
	
	@FindBy(xpath = "//button[text()=\"Cancelar\"]")
	public WebElement cancelar;
	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")
	public WebElement id;

	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//button/span[text()=\"Limpar Filtros\"]")
	public WebElement limpar;
	
	@FindBy(xpath = "//button/span[contains(@class,\"icon-persign\")]")
	public WebElement excluirMassa;
	
	
	public GrupoDeEstruturasTodosFuncPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		grupodeestrutura.click();
	
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
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectElement(nomedogrupo);
		sleep(2000);
	
		nomedogrupo.sendKeys("Teste ATR");
		sleep(2000);
		estruturadedados.click();
		sleep(2000);
		opcaoestrutura.click();
		sleep(2000);
		estruturadedados.click();;
		sleep(2000);
		opcaoestrutura2.click();
		
		sleep(2000);
		exclusao.click();
		sleep(2000);
		gravar.click();

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(12000);
		
		grupodeestrutura.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(ultimapagina);
		sleep(2000);
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ordenar.click();
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();	
	//	System.out.println("Rows:" +rows);
		
		String idultimo = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		idInserir("GrupoDeEstruturasCriar",idultimo);

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
	public ArrayList<Boolean> editar() {
	
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("GrupoDeEstruturasCriar");
		
		System.out.println("Ultimo registro: " + idRegistro);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);

		menu.click();
		sleep(1000);
		editar.click();
		sleep(2000);
		
		sleep(24000);
		waitExpectElement(nomedogrupo);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		estruturadedados.click();
		sleep(2000);
		opcaoestrutura2.click();
		sleep(2000);
		String enviar = "Teste ATR Editar";
		nomedogrupo.clear();
		sleep(2000);
		nomedogrupo.sendKeys(enviar);
		sleep(1000);
		
		gravar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		grupodeestrutura.click();
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
		
		sleep(2000);
		//invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(20000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		String nomedogrupo1 = nomedogrupo.getAttribute("value");
		System.out.println(nomedogrupo1);
		sucesso.add(nomedogrupo1.equals(enviar));
		
		int cfop = driver.findElements(By.xpath("//div[@aria-label=\"Row; Nome: 4.2.2 - CFOP\"]/div[2]/div")).size();

		if (cfop == 0) {
			System.out.println("4.2.2 - CFOP não consta na página de Edição");
			sucesso.add(false);
			
		} else {
			System.out.println("4.2.2 - CFOP consta na página de Edição");
			sucesso.add(true);
		}
		System.out.println(sucesso);
		
		cancelar.click();
		sleep(2000);
		
		return sucesso;
	}

	public ArrayList<Boolean> detalhes() {
		
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("GrupoDeEstruturasCriar");
		System.out.println("Ultimo registro: " + idRegistro);
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement detalhes = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhes\"]"));
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		
		detalhes.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	    sleep(2000);
	    
	  
	   System.out.println("detalhes");
		String ajustefiscaisdetalhes = ajustefiscais.getText();
		//String cfopdetalhes = cfop.getText();
		
		
		System.out.println(ajustefiscaisdetalhes);
		//System.out.println(cfopdetalhes);
		
		fechar.click();
		sleep(2000);
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement ver = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Ver\"]"));
		
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(1000);
		
		ver.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String ajustefiscaisvisualizar = ajustefiscaisvi.getText();
		//String cfopvisualizar = cfopvi.getText();
		
		 System.out.println("");
		 System.out.println("visualizar");
		System.out.println(ajustefiscaisvisualizar);
	//	System.out.println(cfopvisualizar);
		
		aceitar.click();
		sleep(2000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		//cfopvisualizar
		sucesso.add(ajustefiscaisdetalhes.contains(ajustefiscaisvisualizar));
		//sucesso.add(cfopdetalhes.contains(ajustefiscaisvisualizar));
		
		System.out.println(sucesso);
	
		return sucesso;	
	}
	
	public ArrayList<Boolean> visualizar() {
		
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("GrupoDeEstruturasCriar");
		
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
		String nomedogrupovisualizar = nomedogrupovi.getAttribute("value");
		String ajustefiscaisvisualizar = ajustefiscaisvi.getText();
		//String cfopvisualizar = cfopvi.getText();
		
		System.out.println(nomedogrupovisualizar);
		System.out.println(ajustefiscaisvisualizar);
		//System.out.println(cfopvisualizar);
		
		aceitar.click();
		sleep(2000);
		waitExpectElement(ultimapagina);
		sleep(2000);
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro1 = idObter("GrupoDeEstruturasCriar");
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(1000);
		
		editar.click();
		sleep(2000);
		waitExpectElement(nomedogrupo);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	    sleep(2000);
	    
	  
	    String nomedogrupoeditar = nomedogrupo.getAttribute("value");
		String ajustefiscaiseditar = ajustefiscaisE.getText();
		//String cfopeditar = cfop.getText();
		
		System.out.println(nomedogrupoeditar);
		System.out.println(ajustefiscaiseditar);
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(nomedogrupoeditar.contains(nomedogrupovisualizar));
		sucesso.add(ajustefiscaiseditar.contains(ajustefiscaisvisualizar));
	//	sucesso.add(cfopeditar.contains(cfopvisualizar));
		
		cancelar.click();
		sleep(2000);

		
		System.out.println(sucesso);
		
		
		return sucesso;
	
	}
	
	public ArrayList<Boolean> filtro() {

	
		

		String idRegistro = id.getText();
		System.out.println(idRegistro + " Id Registro");
		pesquisar.sendKeys(idRegistro);
		pesquisar.sendKeys(Keys.ENTER);
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String idBusqueda = id.getText();
		System.out.println(idBusqueda + " Id Busqueda");
		
		int rows1 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(idRegistro.equals(idBusqueda));
		
		limpar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows2 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		if (rows2 > rows1) {
			sucesso.add(true);
		}else {
			sucesso.add(false);
		}
		
		
		System.out.println(sucesso);

		return sucesso;

	}
	public boolean excluir() {
		

		ultimapagina.click();

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		// pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("GrupoDeEstruturasCriar");

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
		
		grupodeestrutura.click();
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
		
		

		ultimapagina.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		sleep(2000);
		System.out.println(id);
		
		novo.click();
		sleep(2000);
		waitExpectElement(nomedogrupo);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//Primeiro Registro
		nomedogrupo.sendKeys("Teste ATR 1");
		sleep(1000);
		estruturadedados.click();
		sleep(2000);
		opcaoestrutura2.click();
		sleep(2000);
	
		gravar.click();
		sleep(2000);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(7000);
		grupodeestrutura.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		novo.click();
		sleep(2000);
		waitExpectElement(nomedogrupo);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		//Segundo Registro
		
		nomedogrupo.sendKeys("Teste ATR 2");
		sleep(1000);
		estruturadedados.click();
		sleep(2000);
		opcaoestrutura2.click();
		sleep(2000);
		
		gravar.click();
		sleep(2000);
	
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(5000);
		grupodeestrutura.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(ultimapagina);
		sleep(2000);
		
		ultimapagina.click();
		
		sleep(3000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		
		ordenar.click();
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
		
		System.out.println("paso criar");
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
		sleep(2000);
		  
		driver.navigate().refresh(); 
		waitExpectElement(ultimapagina); 
		sleep(2000);
		  
		grupodeestrutura.click();
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
	  String id = "0";
	  
	  if(rows > 0) { 
		  id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText(); 
		  System.out.println(id); 
	  }
		
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
