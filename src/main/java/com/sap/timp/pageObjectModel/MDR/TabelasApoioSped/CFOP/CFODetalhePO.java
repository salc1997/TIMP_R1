package com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.CFOP;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBase;

public class CFODetalhePO extends TestBase{
	@FindBy(xpath = "//span[text()=\"Tabelas de Apoio - SPED\"]")
	public WebElement tabelaSPED;
	
	@FindBy(xpath = "//span[text()=\"4.2.2 CFOP\"]")
	public WebElement opcionCFOP;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnSim;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement btnCerrarDetalhe;
	
	// Datos detalhe
	@FindBy(xpath = "//div[@id=\"detail-description\"][1]/div[2]/div[1]")
	public WebElement codigoCFOP;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][1]/div[2]/div[2]")
	public WebElement descricao;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][2]/div[2]/div[1]")
	public WebElement grupo;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][3]/div[2]/div[1]")
	public WebElement cfop;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][4]/div[2]/div[1]")
	public WebElement compl;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][5]/div[2]/div[1]")
	public WebElement activo;
	
	// Datos de visualizar
	@FindBy(xpath = "//span[@id=\"taxCodCode\"]")
	public WebElement codigoCFOP1;
	
	@FindBy(xpath = "//span[@id=\"taxCodGroup\"]")
	public WebElement grupo1;
	
	@FindBy(xpath = "//span[@id=\"taxCodCFOP\"]")
	public WebElement cfop1;
	
	@FindBy(xpath = "//span[@id=\"taxCodComp\"]")
	public WebElement compl1;
	
	@FindBy(xpath = "//span[@id=\"taxCodDescription\"]")
	public WebElement descricao1;
	
	@FindBy(xpath = "//span[@id=\"taxCodInativo\"]")
	public WebElement activo1;
	
	public CFODetalhePO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> detalhe() {
		sleep(2000);
		tabelaSPED.click();
		
		sleep(2000);
		actionsMoveToElement(opcionCFOP);
		opcionCFOP.click();
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		String idRegistro = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/div")).getText();
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement a�ao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhes\"]"));	
		System.out.println(idRegistro);
		
		menu.click();
		sleep(1000);
		a�ao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String textoCodigoCFOPString = codigoCFOP.getText();
		String textoDescricaoString = descricao.getText();
		String textoGrupoString = grupo.getText();
		String textoCFOPString = cfop.getText();
		String textoComplString = compl.getText();
		String textoActivoString = activo.getText();
		
		System.out.println("Codigo CFOP: " + textoCodigoCFOPString);
		System.out.println("Descricao: " + textoDescricaoString);
		System.out.println("Grupo: " + textoGrupoString);
		System.out.println("CFOP: " + textoCFOPString);
		System.out.println("Compl: " + textoComplString);
		System.out.println("Activo: " + textoActivoString);
		
		sleep(2000);
		btnCerrarDetalhe.click();
		sleep(1000);
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		a�ao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		menu.click();
		sleep(1000);
		a�ao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String textoCodigoCFOPString1 = codigoCFOP1.getText();
		String textoGrupoString1 = grupo1.getText();
		String textoCFOPString1 = cfop1.getText();
		String textoComplString1 = compl1.getText();
		String textoDescricaoString1 = descricao1.getText();
		String textoActivoString1 = activo1.isSelected() ? "Sim" : "N�o";
		
		System.out.println("");
		System.out.println("------------------------------------------------");
		System.out.println("Codigo CFOP: " + textoCodigoCFOPString1);
		System.out.println("Descricao: " + textoDescricaoString1);
		System.out.println("Grupo: " + textoGrupoString1);
		System.out.println("CFOP: " + textoCFOPString1);
		System.out.println("Compl: " + textoComplString1);
		System.out.println("Activo: " + textoActivoString1);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(textoCodigoCFOPString1.equals(textoCodigoCFOPString));
		sucesso.add(textoDescricaoString1.equals(textoDescricaoString));
		sucesso.add(textoGrupoString1.equals(textoGrupoString));
		sucesso.add(textoCFOPString1.equals(textoCFOPString));
		sucesso.add(textoComplString1.equals(textoComplString));
		sucesso.add(textoActivoString1.equals(textoActivoString));
		System.out.println(sucesso);
		
		return sucesso;
	}
}
