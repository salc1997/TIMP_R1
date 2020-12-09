package com.sap.timp.pageObjectModel.BRE.RegrasdeAuditoriaN2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseCristhian;

public class RegrasdeAuditoriaN2CorreçãoPO extends TestBaseCristhian {
	
	
	@FindBy(xpath = "//span[text()=\"Regras de Auditoria N2\"]")
	public WebElement AN2;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Hierarquia\"]")
	public WebElement hererarquia;
	
	@FindBy(xpath = "//div[text()=\"HCNF0053 - TA-1871 NÃO MEXER\"]")
	public WebElement seleccionHererarquia;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Cenário\"]")
	public WebElement cenario;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[2]/div/div[2]/div[2]/div/div[3]/div/div[2]/div[1]/div[2]/div[1]/div[2]/div/div[2]/div/div[1]/div[2]/input")
	public WebElement valor1;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[2]/div/div[2]/div[2]/div/div[3]/div/div[2]/div[2]/div[2]/div[1]/div[2]/div/div[2]/div/div[1]/div[2]/input")
	public WebElement valor2;
	
	@FindBy(xpath = "//button[@class=\"add-btn btn icon icon-font-Sign-and-Symbols icon-plussign\"]")
	public WebElement adicionarAcoes;
	
	@FindBy(xpath = "//button[@class=\"filter-btn btn trans icon icon-font-Sign-and-Symbols icon-plussign\"]")
	public WebElement adicionarCorrecoes;
	
	@FindBy(xpath = "//div[@class=\"graph\"]//*[name()=\"g\"]//*[name()=\"g\"][1]")
	public WebElement CFOP;
	
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
	
	@FindBy(xpath = "//button[text()=\"Modificar\"]")
	public WebElement modificar;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	@FindBy(xpath = "//button[@id=\"edit-button\"]")
	public WebElement editTabela;
	
	@FindBy(xpath = "//span[@class=\"icon-font-Sign-and-Symbols icon-persign\"]")
	public WebElement excluirCorrecoe;
	
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//button[text()=\"Fechar\"]")
	public WebElement fechar;
	
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnAceitar;
	
	public RegrasdeAuditoriaN2CorreçãoPO() {

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
	
	String idRegistro = idObter3();
	WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
	WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
	System.out.println(idRegistro); // Ultimo registro que es el que se crea con la automatizacion
	
	menu.click();
	sleep(1000);
	açao.click();
	sleep(3000);
	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	sleep(2000);
	
	waitExpectElement(CFOP);
	
	CFOP.click();
	sleep(2000);
	
	adicionarAcoes.click();
	sleep(3000);
	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	sleep(6000);
	
	
	adicionarCorrecoes.click();
	sleep(3000);
	
	hererarquia.sendKeys("HCNF0053 - TA-1871 NÃO MEXER");
	sleep(3000);
	seleccionHererarquia.click();
	sleep(4000);
	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	sleep(6000);
	
	cenario.sendKeys("CCNF0087 - TA-1871 - NÃO MEXER");
	sleep(3000);
	cenario.sendKeys(Keys.ENTER);
	sleep(3000);
	
	valor1.sendKeys("1");
	sleep(3000);
	
	valor2.sendKeys("1");
	sleep(3000);
	
	aplicar.click();
	sleep(3000);
	
	modificar.click();
	sleep(3000);
		
	grabar.click();
	sleep(2000);
	
	sim.click();
	sleep(3000);
	
	aceitar.click();
	sleep(4000);
	
	
	//----------------Entrando de nuevo a editar--------------------------
	
	CFOP.click();
	sleep(2000);
	
	adicionarAcoes.click();
	sleep(3000);
	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	sleep(6000);
	
	excluirCorrecoe.click();
	sleep(3000);
	
	aplicar.click();
	sleep(3000);
	
	modificar.click();
	sleep(3000);
	
	grabar.click();
	sleep(3000);
	
//	sim.click();
//	sleep(3000);
//	
//	aceitar.click();
//	sleep(3000);
	
	
	boolean sucesso = false;
	
	if (CFOP != null) {
		sucesso= true;
	}
	System.out.println(sucesso);
	return sucesso;
}

}
