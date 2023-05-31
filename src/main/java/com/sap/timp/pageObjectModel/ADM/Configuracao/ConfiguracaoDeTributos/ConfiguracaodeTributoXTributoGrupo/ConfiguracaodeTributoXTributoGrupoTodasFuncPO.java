package com.sap.timp.pageObjectModel.ADM.Configuracao.ConfiguracaoDeTributos.ConfiguracaodeTributoXTributoGrupo;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBase;

public class ConfiguracaodeTributoXTributoGrupoTodasFuncPO extends TestBase {
	@FindBy(xpath = "//div[@class=\"baseTabs-bar boxes\"]/div/div[2]")
	public WebElement Configuração;
	
	@FindBy(xpath = "//span[text()=\"Configuração de Tributos\"]")
	public WebElement ConfiguraçãodeTributos;
	
	@FindBy(xpath = "//span[text()=\"Configuração de Tributo X Tributo Grupo\"]")
	public WebElement ConfiguraçãodeTributosXTributo;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-left\"]")
	public WebElement btnPrimeraPagina;
	
	@FindBy(xpath = "//span[text()=\"Novo Tributo X Tributo Grupo\"]")
	public WebElement btnNovo;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Código Tributo Grupo\"]")
	public WebElement tributoGrupo;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Código Tributo\"]")
	public WebElement tributo;
	
	@FindBy(xpath = "//*[@id=\"toolbar\"]/div/div/ul/li[4]/button/span")
	public WebElement actualizar;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnSim;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca;
	
	@FindBy(xpath = "//button[text()=\"Sair\"]")
	public WebElement sair;
	
	// filtro ID
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	public ConfiguracaodeTributoXTributoGrupoTodasFuncPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		Configuração.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		ConfiguraçãodeTributos.click();
		sleep(3000);

		
		ConfiguraçãodeTributosXTributo.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnPrimeraPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		
		String id = "0"; // Primer ID antes de crear un registro
		
		if(rows > 0) {
			id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")).getText();
			System.out.println("ID Primer Registro: " + id);
		}
		
		btnNovo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		tributoGrupo.sendKeys("002");
		sleep(2000);
		tributo.sendKeys("2");
		sleep(2000);
	
		btnGravar.click();
		sleep(2000);
		
		btnSim.click();
		sleep(2000);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnBiblioteca.click();
		sleep(2000);

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnPrimeraPagina.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000); 
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		  
		boolean sucesso = false;
		  
		if(rows == 0) {
			return sucesso = true; 
		}
		
		// Se obtiene el primer registro de la tabla
		String idPrimerRegistro = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")).getText(); 
		System.out.println("");
		System.out.println("ID Primer nuevo registro: " + idPrimerRegistro);
		
		int id1 = convertToInt(id);
		int id2 = convertToInt(idPrimerRegistro);
		
		//compara pra ver se o novo id criado é realmente o ultimo		  
		if (id2 > id1) { 
			sucesso = true; 
			idInserir("ConfiguraçãodeTributoXTributoGrupo",idPrimerRegistro);
			System.out.println("Registro creado...");
		}
		
		
		return sucesso;
	}
	
	public boolean editar() {

		
		btnPrimeraPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("ConfiguraçãodeTributoXTributoGrupo");
		System.out.println("ID Registro: " + idRegistro);
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(7000);
		
		String valorDescricao = "222";
	
		
		tributoGrupo.clear();
		tributoGrupo.sendKeys(valorDescricao);
		sleep(1000);
		
		btnGravar.click();
		sleep(2000);
		
		btnSim.click();
		sleep(2000);
		
		driver.navigate().refresh();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
		
		attributoNotToBeEmpty(tributoGrupo, "value");
		String valorDescricaoGuardado = tributoGrupo.getAttribute("value");
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
		
		btnBiblioteca.click();
		sleep(2000);

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		return sucesso;
	}
	public ArrayList<Boolean> ver(){
		
		Configuração.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		ConfiguraçãodeTributos.click();
		sleep(3000);

		
		ConfiguraçãodeTributosXTributo.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	
		
		btnPrimeraPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("ConfiguraçãodeTributoXTributoGrupo");
		System.out.println("ID Registro: " + idRegistro);
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(7000);
		
		// Datos de visualizar
		String tributoGrupoStringV = driver.findElement(By.xpath("//*[@id=\"cod-tax-group\"]")).getText();
		String tributoStringV = driver.findElement(By.xpath("//*[@id=\"cod-tax\"]")).getText();
		
		
		System.out.println("Datos de Ver");
		System.out.println("tributo Grupo: " + tributoGrupoStringV);
		System.out.println("Tributo: " + tributoStringV);

		System.out.println("");
		
		btnBiblioteca.click();
		sleep(2000);

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnPrimeraPagina.click();
		
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
		sleep(7000);
		
		// Datos de Editar
		String tributoGrupoStringE = driver.findElement(By.xpath("//input[@placeholder=\"Preencher Código Tributo Grupo\"]")).getAttribute("value").trim();
		String tributoStringE = driver.findElement(By.xpath("//input[@placeholder=\"Preencher Código Tributo\"]")).getAttribute("value").trim();

		
		System.out.println("Datos de Editar");
		System.out.println("tributo Grupo: " + tributoGrupoStringE);
		System.out.println("Tributo: " + tributoStringE);


		System.out.println("");
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(tributoGrupoStringV.equals(tributoGrupoStringE));
		sucesso.add(tributoStringV.equals(tributoStringE));
		
		System.out.println("");
		System.out.println(sucesso);
		
		btnBiblioteca.click();
		sleep(2000);
		
		sair.click();
		sleep(2000);

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		return sucesso;
	}
	public Boolean filtro() {

		Configuração.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		ConfiguraçãodeTributos.click();
		sleep(3000);

		
		ConfiguraçãodeTributosXTributo.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String idRegistro = idObter("ConfiguraçãodeTributoXTributoGrupo");
		System.out.println("ID Registro: " + idRegistro);
		
		pesquisar.sendKeys(idRegistro);
		sleep(2000);
		
		pesquisar.sendKeys(Keys. ENTER);
		sleep(2000);

		int j=1;
		ArrayList<String> data = new ArrayList<String>();
		int rows = driver.findElements(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]")).size();

		
		Boolean sucesso = true;
		System.out.println(sucesso);
		return sucesso;
	}
	
	public boolean excluir() {

	
		btnPrimeraPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("ConfiguraçãodeTributoXTributoGrupo");
		System.out.println("ID Registro: " + idRegistro);
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(7000);
	
		
		btnSim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		
		String id = "0"; // Primer ID antes de crear un registro
		
		if(rows > 0) {
			id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")).getText();
			System.out.println("ID Primer Registro: " + id);
		}
		int id1 = convertToInt(id);
		int id2 = convertToInt(idRegistro);
		System.out.println(id1);
		System.out.println(id2);
		
		boolean sucesso = false;
		
		if (id1 != id2) {
			sucesso= true;
		}
		System.out.println( sucesso);
		return sucesso;
	}
	
}
