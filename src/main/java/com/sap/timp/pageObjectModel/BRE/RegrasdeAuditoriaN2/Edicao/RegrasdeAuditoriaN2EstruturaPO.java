package com.sap.timp.pageObjectModel.BRE.RegrasdeAuditoriaN2.Edicao;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBase;

public class RegrasdeAuditoriaN2EstruturaPO extends TestBase {
	
	@FindBy(xpath = "//span[text()=\"Regras de Auditoria N2\"]")
	public WebElement AN2;
	
	@FindBy(xpath = "//span[text()=\"Estruturas\"]")
	public WebElement estrutura;
	
	@FindBy(xpath = "//span[text()=\"Adicionar Caminho\"]")
	public WebElement camino;
	
	@FindBy(xpath = "//button[text()=\"Criar estruturas associadas\"]")
	public WebElement asociarEstrutura;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione uma tabela\"]")
	public WebElement inputSeleccionTabela;
	
	@FindBy(xpath = "//li[text()=\"Ajustes Fiscais\"]")
	public WebElement seleccionTabela;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione um campo \"]")
	public WebElement campo;
	
	@FindBy(xpath = "//li[text()=\"Apresent. Treinamento 4\"]")
	public WebElement selectEstrutura;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[3]/div[2]/div[1]/div/div/div[1]/div/div[1]/input")
	public WebElement condicoes;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Operador\"]")
	public WebElement operador;
	
	@FindBy(xpath = "//div[@id=\"option-1\"]")
	public WebElement opcOperador;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[3]/div[2]/div[1]/div/div/div[4]/div/div[1]/input")
	public WebElement condicoes2;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[4]/div[2]/div[1]/div/div[1]/input")
	public WebElement acoes;
	
	@FindBy(xpath = "//div[text()=\"Ajustes Fiscais\"]")
	public WebElement verificacion;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Ok\"]")
	public WebElement ok;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement grabar;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicar;
	
	@FindBy(xpath = "//button[text()=\"Remover\"]")
	public WebElement remover;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	@FindBy(xpath = "//button[@id=\"edit-button\"]")
	public WebElement editTabela;
	
	@FindBy(xpath = "//button[@id=\"delete-button\"]")
	public WebElement excluirTabela;
	
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//button[text()=\"Fechar\"]")
	public WebElement fechar;
	
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnAceitar;
	
	@FindBy(xpath = "//button[text()=\"N�o\"]")
	public WebElement nao;
	
	public RegrasdeAuditoriaN2EstruturaPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean editar() {
	
	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	sleep(2000);
	AN2.click();
	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	sleep(2000);

	btnUltimaPagina.click();
	sleep(2000);
	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	sleep(2000);
	
	//String idRegistro = idObter3();
	String idRegistro = idObter("An2");
	WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
	WebElement a�ao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
	System.out.println(idRegistro); // Ultimo registro que es el que se crea con la automatizacion
	
	menu.click();
	sleep(1000);
	a�ao.click();
	sleep(3000);
	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	sleep(2000);
	
	waitExpectedElement(estrutura);
	estrutura.click();
	sleep(4000);
	asociarEstrutura.click();
	sleep(6000);
	
	inputSeleccionTabela.click();
	sleep(4000);
	seleccionTabela.click();
	sleep(3000);
	sleep(3000);
	sleep(3000);
	
	waitExpectedElement(campo);
	campo.sendKeys("Al�quota COFINS (ED)");
	sleep(2000);
	campo.sendKeys(Keys.ENTER);
	sleep(2000);
	
	aplicar.click();
	sleep(4000);
	
	fechar.click();
	sleep(2000);
	
	
	grabar.click();
	sleep(9000);
	
	sim.click();
	sleep(3000);
	
	aceitar.click();
	sleep(34000);
	
	biblioteca.click();
	sleep(3000);
	
	int botaoNao = rows("//button[text()=\"N�o\"]");
	
	if (botaoNao > 0) {
		nao.click();
	}
	
	
	//----------------Entrando de nuevo a editar--------------------------
	
	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	sleep(8000);
	AN2.click();
	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	sleep(8000);

	btnUltimaPagina.click();
	sleep(2000);
	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	sleep(4000);
	
	String idRegistro1 = idObter("An2");
	WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div"));
	WebElement a�ao1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
	System.out.println(idRegistro); // Ultimo registro que es el que se crea con la automatizacion
	
	menu1.click();
	sleep(1000);
	a�ao1.click();
	sleep(3000);
	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	sleep(4000);
	
	
	waitExpectedElement(estrutura);
	estrutura.click();
	sleep(4000);
	
	editTabela.click();
	sleep(4000);
	
	campo.clear();
	sleep(2000);
	campo.sendKeys("Al�quota ICMS (ED)");
	sleep(2000);
	campo.sendKeys(Keys.ENTER);
	sleep(2000);
	
	aplicar.click();
	sleep(4000);
	
	fechar.click();
	sleep(4000);
	
	grabar.click();
	sleep(7000);
	
	sim.click();
	sleep(3000);
	
	aceitar.click();
	sleep(26000);
	
	biblioteca.click();
	sleep(3000);
	
	if (botaoNao > 0) {
		nao.click();
	}
	
	//----------------Entrando de nuevo a excluir--------------------------
	
	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	sleep(8000);
	AN2.click();
	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	sleep(8000);

	btnUltimaPagina.click();
	sleep(2000);
	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	sleep(4000);
	
	String idRegistro4 = idObter("An2");;
	WebElement menu4 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro4+"\"]/div[1]/div"));
	WebElement a�ao4 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro4+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
	System.out.println(idRegistro4); // Ultimo registro que es el que se crea con la automatizacion
	
	menu4.click();
	sleep(1000);
	a�ao4.click();
	sleep(3000);
	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	sleep(4000);
	
	waitExpectedElement(estrutura);	
	estrutura.click();
	sleep(4000);
	
	excluirTabela.click();
	sleep(3000);
	ok.click();
	sleep(3000);
	
	fechar.click();
	sleep(3000);
	
	grabar.click();
	sleep(2000);
	
	sim.click();
	sleep(3000);
	
	aceitar.click();
	sleep(24000);
	
	biblioteca.click();
	sleep(3000);
	
	
	if (botaoNao > 0) {
		nao.click();
	}
	
	//----------------------FINAL---------------------------------------
	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	sleep(8000);
	AN2.click();
	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	sleep(8000);
	
	btnUltimaPagina.click();
	sleep(2000);
	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	sleep(4000);
	
	String idRegistro2 = idObter("An2");
	WebElement menu2 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro2+"\"]/div[1]/div"));
	WebElement a�ao2 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro2+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
	System.out.println(idRegistro); // Ultimo registro que es el que se crea con la automatizacion
	
	menu2.click();
	sleep(1000);
	a�ao2.click();
	sleep(3000);
	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	sleep(4000);
	
	waitExpectedElement(estrutura);	
	estrutura.click();
	sleep(5000);
	
	
	boolean sucesso = false;
	
	if (verificacion != null) {
		sucesso= true;
	}
	System.out.println(sucesso);
	return sucesso;
}

}
