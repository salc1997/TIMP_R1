package com.sap.timp.pageObjectModel.BRE.RegrasdeAuditoriaN2.Edicao;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBase;

public class RegrasdeAuditoriaN2ValoresCalculadosPO extends TestBase {
	

	@FindBy(xpath = "//span[text()=\"Regras de Auditoria N2\"]")
	public WebElement AN2;
	
	@FindBy(xpath = "//span[text()=\"Valores Calculados\"]")
	public WebElement vCalculados;
	
	@FindBy(xpath = "//span[text()=\"Adicionar Caminho\"]")
	public WebElement camino;
	
	@FindBy(xpath = "//button[text()=\"Criar Valor Calculado\"]")
	public WebElement criarvCalculados;
	
	@FindBy(xpath = "//input[@placeholder=\"Nome\"]")
	public WebElement nomeVCalculado;
	
	@FindBy(xpath = "//textarea[@aria-label=\"Insira a f�rmula\"]")
	public WebElement formula;
	
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione uma tabela\"]")
	public WebElement inputSeleccionTabela;
	
	@FindBy(xpath = "//li[text()=\"Ajustes Fiscais\"]")
	public WebElement seleccionTabela;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione um campo \"]")
	public WebElement campo;
	
	@FindBy(xpath = "//*[@id=\"main-icon\"]")
	public WebElement estrutura;
	
	@FindBy(xpath = "//li[text()=\"Apresent. Treinamento 4\"]")
	public WebElement selectEstrutura;
	
	@FindBy(xpath = "//span[text()=\"Adicionar Caminho\"]")
	public WebElement adicionar;
	
	@FindBy(xpath = "//input[@placeholder=\"Descri��o\"]")
	public WebElement descripcionCondicoes;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[3]/div[2]/div[1]/div[2]/div/div[1]/div/div[1]/input")
	public WebElement condicoesNuevo;
	
	@FindBy(xpath = "//div[@class=\\\"conditions-section\\\"]/div/div/div/div/div/div/div[@id=\"main-icon\"][1]")
	public WebElement condicoes;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[3]/div[2]/div[1]/div/div/div[1]/div/div[1]/input")
	public WebElement condicoesInput;
	
	@FindBy(xpath = "//li[text()=\"TA-TESTE (VC)\"]")
	public WebElement opcCondicoes;
	
	@FindBy(xpath = "//li[text()=\"TA-TESTE (VC)\"]")
	public WebElement opcCondicoes2;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[3]/div[2]/div[1]/div[1]/div/div[3]/div/div/div[2]/div/div[1]/div[2]/input")
	public WebElement operador;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[3]/div[2]/div[1]/div[2]/div/div[3]/div/div/div[2]/div/div[1]/div[2]/input")
	public WebElement operador2;
	
	@FindBy(xpath = "//div[@id=\"option-1\"]")
	public WebElement opcOperador;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[3]/div[2]/div[1]/div/div/div[4]/div/div[1]/input")
	public WebElement condicoes2;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[3]/div[2]/div[1]/div[2]/div/div[4]/div/div[1]/input")
	public WebElement condicoes3;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[4]/div[2]/div[1]/div/div[1]/input")
	public WebElement acoes;
	
	@FindBy(xpath = "//div[@id=\"graph\"]//*[name()=\"g\"][10]")
	public WebElement CFOP;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Ok\"]")
	public WebElement ok;
	
	@FindBy(xpath = "//*[@id=\"add-icon\"]/span")
	public WebElement agregar;
	
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
	
	@FindBy(xpath = "//div[@class=\"object-list-field\"][2]/button[1]")
	public WebElement editVCalculado;
	
	@FindBy(xpath = "//div[@class=\"object-list-field\"][3]/button[@id=\"delete-button\"]")
	public WebElement excluirVCalculado;
	
	@FindBy(xpath = "//button[@id=\"delete-button\"]")
	public WebElement excluirTabela;
	
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//button[text()=\"Fechar\"]")
	public WebElement fechar;
	
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnAceitar;
	
	public RegrasdeAuditoriaN2ValoresCalculadosPO() {

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
	
	waitExpectedElement(vCalculados);
	vCalculados.click();
	sleep(4000);
	criarvCalculados.click();
	sleep(3000);
	//primer Valor Calculado
	nomeVCalculado.sendKeys("TA-TESTE");
	sleep(3000);
	
	formula.sendKeys("\"BC ICMS (ED)\"*(\"Al�quota ICMS (ED)\"/100)");
	sleep(3000);
	
	aplicar.click();
	sleep(4000);
	
	fechar.click();
	sleep(2000);
	
	waitExpectedElement(adicionar);
	sleep(2000);
	adicionar.click();
	sleep(3000);
	
	descripcionCondicoes.sendKeys("TA-TESTE");
	sleep(2000);
	condicoesInput.sendKeys("TA-TESTE (VC)");
	sleep(2000);
	condicoesInput.sendKeys(Keys.ESCAPE);
	sleep(3000);
	
	operador.click();
	sleep(2000);
	opcOperador.click();
	sleep(2000);
	
	condicoes2.sendKeys("0");
	sleep(2000);
	condicoes2.sendKeys(Keys.ESCAPE);
	sleep(2000);
	
	acoes.sendKeys("Apresenta valor nulo");
	sleep(2000);
	closeSelectTypeCheckbox(acoes);
	
	sleep(2000);
	aplicar.click();
	sleep(2000);
	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	
	
	//segundo Valor Calculado
	
	vCalculados.click();
	sleep(4000);
	criarvCalculados.click();
	sleep(7000);
	
	nomeVCalculado.sendKeys("TA-TESTE 2");
	sleep(4000);
	
	formula.sendKeys("MID(\"C�d. material (ED)\", 1, 2)");
	sleep(3000);
	
	aplicar.click();
	sleep(4000);
	
	fechar.click();
	sleep(2000);
	
	waitExpectedElement(adicionar);
	sleep(2000);
	adicionar.click();
	sleep(3000);
	
	descripcionCondicoes.sendKeys("TA-TESTE 2");
	sleep(2000);
	
	condicoesInput.sendKeys("TA-TESTE 2 (VC)");
	sleep(2000);
	condicoesInput.sendKeys(Keys.ENTER);
	sleep(3000);
	
	operador.click();
	sleep(2000);
	opcOperador.click();
	sleep(2000);
	
	condicoes2.sendKeys("H1");
	sleep(2000);
	condicoes2.sendKeys(Keys.ENTER);
	sleep(2000);
	condicoes2.sendKeys(Keys.ESCAPE);
	sleep(2000);
	
	agregar.click();
	sleep(3000);
	condicoesNuevo.sendKeys("CFOP legal (ED)");
	sleep(2000);
	condicoesNuevo.sendKeys(Keys.ENTER);
	sleep(3000);

	
	operador2.click();
	sleep(2000);
	opcOperador.click();
	sleep(2000);
	
	condicoes3.sendKeys("5102");
	sleep(2000);
	condicoes3.sendKeys(Keys.ENTER);
	sleep(2000);
	
	acoes.sendKeys("Teste  f�rmula MID");
	sleep(2000);
	closeSelectTypeCheckbox(acoes);
	
	sleep(2000);
	aplicar.click();
	sleep(2000);
	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	sleep(3000);
	String CFOPText1 = CFOP.getText();
	
	
	grabar.click();
	sleep(2000);
	
	sim.click();
	sleep(3000);
	
	aceitar.click();
	sleep(4000);
	
	biblioteca.click();
	sleep(3000);
	
	sim.click();
	sleep(3000);
	
	
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
	
	waitExpectedElement(vCalculados);
	vCalculados.click();
	sleep(4000);
	editVCalculado.click();
	sleep(2000);
	nomeVCalculado.clear();
	sleep(3000);
	nomeVCalculado.sendKeys("TA-TESTE 2 Editado");
	sleep(3000);
	
	aplicar.click();
	sleep(4000);
	
	fechar.click();
	sleep(2000);
	
	waitExpectedElement(vCalculados);
	
	String CFOPText2 = CFOP.getText();
	
	System.out.println("====================");
	System.out.println(CFOPText1);
	System.out.println("cambio");
	System.out.println(CFOPText2);
	System.out.println("++++++++++++++++++++");
	boolean sucesso = false;
	
	if (CFOPText2 != CFOPText1) {
		sucesso= true;
	}
	System.out.println(sucesso);
	return sucesso;
}

}
