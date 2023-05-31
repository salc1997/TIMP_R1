package com.sap.timp.pageObjectModel.ADM.Configuracao.ConfiguracaoDeTributos.ConfiguracaoDeTipoTributo;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBase;

public class ConfiguracaoDeTipoTributoTodasFuncPO extends TestBase{
	
	@FindBy(xpath = "//div[@class=\"baseTabs-bar boxes\"]/div/div[2]")
	public WebElement Configuração;
	
	@FindBy(xpath = "//span[text()=\"Configuração de Tributos\"]")
	public WebElement configuracaotributos;
	

	@FindBy(xpath = "//span[text()=\"Configuração de Tipo Tributo \"]")
	public WebElement configuracaotipotributo;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-left\"]")
	public WebElement primeira;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;

	@FindBy(xpath = "//div[@class=\"tr\" and @data-id][1]/div[2]/div")
	public WebElement id;
	
	@FindBy(xpath = "//div[@class=\"tr\" and @data-id][1]/div[3]/div")
	public WebElement idP;

	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//span[text()=\"Novo Configuração de Tipo Tributo \"]")
	public WebElement novo;
	

	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Código tributo tipo\"]")
	public WebElement codigotributotipo;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Código tributo grupo\"]")
	public WebElement codigotributogrupo;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcao;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Gravar\"]")
	public WebElement gravar2;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicar;
	
	@FindBy(xpath = "//button[text()=\"Fechar\"]")
	public WebElement fechar;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao; 
	
	@FindBy(xpath = "//span[@id=\"cod-tax-type\"]")
	public WebElement codigotributotipovi;
	
	@FindBy(xpath = "//span[@id=\"cod-tax-group\"]")
	public WebElement codigotributogrupovi;
	
	@FindBy(xpath = "//button[text()=\"Sair\"]")
	public WebElement sair;
	
	public ConfiguracaoDeTipoTributoTodasFuncPO() {

		PageFactory.initElements(driver, this);
	}

	public boolean criar() {

		String url = driver.getCurrentUrl();
		
		boolean tc2 = false;
		
		if (url.contains("tc2")) {
			tc2 = true;
		}
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		Configuração.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		configuracaotributos.click();
		sleep(2000);
		configuracaotipotributo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		primeira.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = rows("//div[@class=\"tr\" and @data-id]");
		String idRegistro="0";
		
		if(rows>0) {
		idRegistro = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id][1]/div[3]/div")).getText();
		System.out.println("Id ultimo registro: " +idRegistro);
		}else {
			//idRegistro = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[3]/div")).getText();
			System.out.println("Id ultimo registro: " +idRegistro);
		}
		
		novo.click();
		sleep(2000);
		waitExpectElement(codigotributogrupo);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
	
		
		codigotributotipo.sendKeys("R7");;
		sleep(1000);
		codigotributogrupo.sendKeys("1");
		sleep(1000);
		
	
		gravar.click();
		sleep(2000);
		waitExpectElement(sim);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(biblioteca);
		sleep(2000);
		biblioteca.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
				
		waitExpectElement(primeira);
		sleep(2000);
		primeira.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")).getText();

		idInserir("ConfiguracaoDeTipoTributo",id2);
		
		int idD = convertToInt(idRegistro);
		int id2D = convertToInt(id2);
		
		System.out.println(idD);
		System.out.println(id2D);
		
		boolean sucesso = false;
		if (idD < id2D) {
			sucesso = true;
		}else {
			sucesso=false;
		}
		
		System.out.println(sucesso);
		
		return sucesso;
		}
	
	public boolean editar() {

		String url = driver.getCurrentUrl();

		boolean tc2 = false;
		boolean tp1 = false;
		boolean tq1 = false; 
		if (url.contains("tc2")) {
			tc2 = true;
		} else if (url.contains("tp1")) {
			tp1 = true;
		} else {
			tq1 = true;
		}

		

		primeira.click();

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String idRegistro = idObter("ConfiguracaoDeTipoTributo");
		System.out.println("ID Registro: " + idRegistro);

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		WebElement editar = driver.findElement(
				By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		editar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		codigotributotipo.clear();
		codigotributotipo.sendKeys("R8");
		
		String codigotributotipotexto= codigotributotipo.getAttribute("value");
		
		
		gravar.click();
		sleep(2000);
		waitExpectElement(sim);
		sim.click();
		sleep(2000);
		waitExpectElement(biblioteca);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		biblioteca.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String coddigotributotipoString = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id][1]/div[4]/div")).getText();
		
		boolean sucesso = false;
		sucesso= codigotributotipotexto.contains(coddigotributotipoString);
		System.out.println(sucesso);

		return sucesso;

	}
	public ArrayList<Boolean> filtro() {

		
		primeira.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//Filtrar pelo id
		String idregistro= idP.getText();
		System.out.println("IdP:"+idregistro);
		pesquisar.sendKeys(idregistro);
		pesquisar.sendKeys(Keys.ENTER);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int j = 1;
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		for (int i = 0; i < rows; i++) {

			String idfiltrado = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+j+"]/div[3]/div")).getText();
			System.out.println("Id Filtrado:"+idfiltrado);
			sucesso.add(idregistro.contains(idfiltrado));
			j = j + 1;
		}
		pesquisar.clear();
		sleep(2000);
		pesquisar.sendKeys(Keys.ENTER);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		int rows1 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		if (rows1 > rows) {
			sucesso.add(true);
		}else {
			sucesso.add(false);
		}
		
		//Filtro codigo de tributo tipo
		
		String codigotributotipo = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[4]/div")).getText();
		
		System.out.println("Codigo tributo tipo:"+codigotributotipo);
		pesquisar.sendKeys(codigotributotipo);
		pesquisar.sendKeys(Keys.ENTER);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows2 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int k = 1;
		
		for (int i = 0; i < rows2; i++) {

			String codigotributotipofiltrado = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+k+"]/div[4]/div")).getText();
			System.out.println("Id:"+codigotributotipofiltrado);
			sucesso.add(codigotributotipofiltrado.contains(codigotributotipo));
			k = k + 1;
		}
		pesquisar.clear();
		sleep(2000);
		pesquisar.sendKeys(Keys.ENTER);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		int rows3 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		if (rows3 > rows2) {
			sucesso.add(true);
		}else {
			sucesso.add(false);
		}
		System.out.println(sucesso);
		
		

		return sucesso;

	}

	
	public ArrayList<Boolean> visualizar() {
		
		
		
		primeira.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("ConfiguracaoDeTipoTributo");
		System.out.println("ID Registro: " + idRegistro);

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(
				By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		visualizar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String codigotributotipovisualizar = codigotributotipovi.getText();
		String codigotributogrupovisualizar = codigotributogrupovi.getText();
		
		
		System.out.println(codigotributotipovisualizar);
		System.out.println(codigotributogrupovisualizar);
		
		biblioteca.click();

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(primeira);
		sleep(2000);

		primeira.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		WebElement editar = driver.findElement(
				By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(1000);
		editar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String codigotributotipoeditar = codigotributotipo.getAttribute("value");
		String codigotributogrupoeditar = codigotributogrupo.getAttribute("value");
		
		System.out.println(codigotributotipoeditar);
		System.out.println(codigotributogrupoeditar);
		

		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(codigotributotipoeditar.equals(codigotributotipovisualizar));
		sucesso.add(codigotributogrupoeditar.equals(codigotributogrupovisualizar));
		
		
		System.out.println(sucesso);
		
		biblioteca.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sair.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		return sucesso;

	}
	public Boolean excluir() {

		

		primeira.click();

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String idRegistro = idObter("ConfiguracaoDeTipoTributo");

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		WebElement excluir = driver.findElement(
				By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));

		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);

		excluir.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String id = driver
				.findElement(By.xpath(
						"//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div"))
				.getText();

		int id1 = convertToInt(id);
		int id2 = convertToInt(idRegistro);
		System.out.println(id1);
		System.out.println(id2);

		boolean sucesso = false;

		if (id1 != id2) {
			sucesso = true;
		}
		System.out.println(sucesso);
		return sucesso;

	}

}
