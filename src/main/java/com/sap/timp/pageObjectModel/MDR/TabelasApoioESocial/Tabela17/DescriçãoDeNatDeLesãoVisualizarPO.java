package com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela17;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.sap.timp.base.TestBase;

public class Descri��oDeNatDeLes�oVisualizarPO extends TestBase{
	@FindBy(xpath = "//span[text()=\"Tabelas de Apoio e-Social\"]")
	public WebElement tabelaApoioESocial;
	
	@FindBy(xpath = "//span[text()=\"Tabela 17 - Descri��o de Nat. de Les�o\"]")
	public WebElement submenudescricaoNatLesao;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	// Datos visualizar
	@FindBy(xpath = "//td[@id=\"code\"]/span")
	public WebElement codigo;
	
	@FindBy(xpath = "//td[@id=\"description\"]/span")
	public WebElement descricao;
	
	@FindBy(xpath = "//td[@id=\"effectiveDateFrom\"]/span")
	public WebElement validadeDe;
	
	@FindBy(xpath = "//td[@id=\"effectiveDateTo\"]/span")
	public WebElement validadeAte;
	
	// Datos editar
	@FindBy(xpath = "//div[contains(@class, \"code_0_0\")]/div/div/div/div/div[2]/input")
	public WebElement codigo1;
	
	@FindBy(xpath = "//div[contains(@class, \"description_0_1\")]/div/textarea")
	public WebElement descricao1;
	
	@FindBy(xpath = "//div[contains(@class, \"effectiveDateFrom_0_2\")]/div/div/input")
	public WebElement validadeDe1;
	
	@FindBy(xpath = "//div[contains(@class, \"effectiveDateTo_0_3\")]/div/div/input")
	public WebElement validadeAte1;
	
	public Descri��oDeNatDeLes�oVisualizarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> visualizar() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		tabelaApoioESocial.click();
		sleep(1000);
		
		submenudescricaoNatLesao.click();		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro =idObter("Descri��oDeNatDeLes�o");
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement a�ao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		System.out.println(idRegistro); // Ultimo registro que es el que se crea con la automatizacion
		
		menu.click();
		sleep(1000);
		a�ao.click();;
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String codigoString = codigo.getText();
		String descricaoString = descricao.getText();
		String validadeDeString = validadeDe.getText();
		String validadeAteString = validadeAte.getText();
		
		System.out.println("Codigo: " + codigoString);
		System.out.println("Descricao: " + descricaoString);
		System.out.println("Validade De: " + validadeDeString);
		System.out.println("Validade Ate: " + validadeAteString);
		
		sleep(2000);
		biblioteca.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		a�ao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(2000);
		a�ao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String codigoString1 = codigo1.getAttribute("value");
		String descricaoString1 = descricao1.getAttribute("value");
		String validadeDeString1= validadeDe1.getAttribute("value");
		String validadeAteString1 = validadeAte1.getAttribute("value");
		
		System.out.println("");
		System.out.println("Codigo 1: " + codigoString1);
		System.out.println("Descricao 1: " + descricaoString1);
		System.out.println("Validade De 1: " + validadeDeString1);
		System.out.println("Validade Ate 1: " + validadeAteString1);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(codigoString1.equals(codigoString1));
		sucesso.add(descricaoString1.equals(descricaoString));
		sucesso.add(validadeDeString1.equals(validadeDeString));
		sucesso.add(validadeAteString1.equals(validadeAteString));
		System.out.println(sucesso);
		
		return sucesso;
	}
}
