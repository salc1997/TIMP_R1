package com.sap.timp.pageObjectModel.MDR.EventosESocial.S1250AquisicaoDeProducaoRural;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBase;

public class S1250AquisicaoDeProducaoRuralEditarPO extends TestBase{
	
	

	@FindBy(xpath = "//span[text()=\"S1250 - Aquisi��o de Produ��o Rural\"]")
	public WebElement s1250;
	
	@FindBy(xpath = "//span[text()=\"Eventos e-Social\"]")
	public WebElement eventosesocial;
	
	@FindBy(xpath = "//span[text()=\"Novo Dados B�sicos\"]")
	public WebElement novo;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-left\"]")
	public WebElement primeira;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"N�o\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	@FindBy(xpath = "//div[@id=\"companyOption\"]/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcao;
	
	@FindBy(xpath = "//li[@id][2]")
	public WebElement opcao1;
	
	@FindBy(xpath = "//div[@id=\"eventTypeOption\"]/div/div/div[2]")
	public WebElement tipodeevento;
	
	@FindBy(xpath = "//div[@id=\"versionOption\"]/div/div/div[2]")
	public WebElement versao;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencha o Status\"]")
	public WebElement status;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencha o Logsys\"]")
	public WebElement log;
	
		
	@FindBy(xpath = "//div[@id=\"environmentType\"]/div/div/div[2]")
	public WebElement tipodeambiente;
	
	@FindBy(xpath = "//input[@placeholder=\"Vers�o do processo de preenchimento\"]")
	public WebElement versaodoprocesso;
	
	@FindBy(xpath = "//div[@id=\"eventRegistrationType\"]/div/div/div[2]")
	public WebElement tipoderegisto;
	
	@FindBy(xpath = "//div[@id=\"eventRegistrationNumber\"]/div/div/div[2]")
	public WebElement numeroderegistro;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher o N�mero do Recibo\"]")
	public WebElement numeroderecibo;
	
	@FindBy(xpath = "//div[@id=\"indApur\"]/div/div/div[2]")
	public WebElement indicativodeperiodo;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher per�odo de contagem\"]")
	public WebElement periododeapuracao;
	
	@FindBy(xpath = "//div[@id=\"issuingProcess\"]/div/div/div[2]")
	public WebElement processodeemissao;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	public S1250AquisicaoDeProducaoRuralEditarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean editar() {
		sleep(2000);
		eventosesocial.click();
		sleep(2000);
		
		s1250.click();
		
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		primeira.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("S1250AquisicaoDeProducaoRural");
		
		WebElement menu = driver.findElement(By.xpath("//div[contains(@aria-label,\""+idRegistro+"\")]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[contains(@aria-label,\""+idRegistro+"\")]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElement(menu);
		sleep(2000);
		menu.click();
		sleep(2000);
		editar.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String valor = numeroderecibo.getAttribute("value");

		String enviar = "888";

		numeroderecibo.clear();
		sleep(2000);
		numeroderecibo.sendKeys(enviar);
		sleep(2000);
		aceitar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		WebElement menu1 = driver.findElement(By.xpath("//div[contains(@aria-label,\""+idRegistro+"\")]/div[1]/div"));
		WebElement editar1 = driver.findElement(By.xpath("//div[contains(@aria-label,\""+idRegistro+"\")]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		actionsMoveToElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(2000);
		editar1.click();
		sleep(2000);	
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectedElement(numeroderecibo);
		sleep(2000);
		String novoTexto=numeroderecibo.getAttribute("value");
		
		System.out.println(valor);
		System.out.println(novoTexto);
		boolean sucesso = novoTexto.equals(enviar);
		System.out.println(sucesso);
		
		
		
		return sucesso;
	}	

}
