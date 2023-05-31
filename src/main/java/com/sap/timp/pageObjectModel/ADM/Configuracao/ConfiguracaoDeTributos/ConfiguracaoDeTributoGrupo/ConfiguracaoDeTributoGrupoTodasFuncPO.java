package com.sap.timp.pageObjectModel.ADM.Configuracao.ConfiguracaoDeTributos.ConfiguracaoDeTributoGrupo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBase;

public class ConfiguracaoDeTributoGrupoTodasFuncPO extends TestBase{
	
	@FindBy(xpath = "//div[@class=\"baseTabs-bar boxes\"]/div/div[2]")
	public WebElement Configuração;
	
	@FindBy(xpath = "//span[text()=\"Configuração de Tributos\"]")
	public WebElement configuracaotributos;
	

	@FindBy(xpath = "//span[text()=\"Configuração de Tributo Grupo\"]")
	public WebElement configuracaotributogrupo;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-left\"]")
	public WebElement primeira;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;

	@FindBy(xpath = "//div[@class=\"tr\" and @data-id][1]/div[2]/div")
	public WebElement id;

	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//span[text()=\"Novo Tributo Grupo\"]")
	public WebElement novo;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Código grupo\"]")
	public WebElement codigogrupo;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Descrição Grupo\"]")
	public WebElement descricaogrupo;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Descrição Grupo Label\"]")
	public WebElement descricaogrupolabel;
	
	@FindBy(xpath = "//div[@id=\"active\"]/div/label/span")
	public WebElement ativo;
	
	@FindBy(xpath = "//div[@id=\"classification\"]/div/div[2]")
	public WebElement classificacao;
	
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
	
	public ConfiguracaoDeTributoGrupoTodasFuncPO() {

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
		configuracaotributogrupo.click();
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
		waitExpectedElement(codigogrupo);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		
		codigogrupo.sendKeys("R7");;
		sleep(1000);
		descricaogrupo.sendKeys("Teste");
		sleep(1000);
		
		descricaogrupolabel.sendKeys("Teste label");
		sleep(1000);
		
		gravar.click();
		sleep(2000);
		waitExpectedElement(sim);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectedElement(biblioteca);
		sleep(2000);
		biblioteca.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
				
		waitExpectedElement(primeira);
		sleep(2000);
		primeira.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")).getText();
		
		idInserir1(id2);
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

		String idRegistro = idObter1();
		System.out.println("ID Registro: " + idRegistro);

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		WebElement editar = driver.findElement(
				By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		actionsMoveToElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		editar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		codigogrupo.clear();
		codigogrupo.sendKeys("R8");
		
		String codigogrupootexto= codigogrupo.getAttribute("value");
		
		
		gravar.click();
		sleep(2000);
		waitExpectedElement(sim);
		sim.click();
		sleep(2000);
		waitExpectedElement(biblioteca);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		biblioteca.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String codigogrupoString = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id][1]/div[4]/div")).getText();
		
		boolean sucesso = false;
		sucesso= codigogrupootexto.contains(codigogrupoString);
		System.out.println(sucesso);

		return sucesso;

	}

}
