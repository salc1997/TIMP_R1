package com.sap.timp.pageObjectModel.BRE.RegrasdeAuditoriaN2.ParametrosGerais;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBase;

public class RegrasdeAuditoriaN2DetalhesPO extends TestBase{

	@FindBy(xpath = "//span[text()=\"Regras de Auditoria N2\"]")
	public WebElement AN2;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	
	//DATOS DEL DETALLE
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[4]/div/div")
	public WebElement estructura;
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[6]/div/div")
	public WebElement regulamento;
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[7]/div/div[1]/span[2]")
	public WebElement campo1;
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[7]/div/div[2]/span[2]")
	public WebElement campo2;
	@FindBy(xpath = "//div[@id=\"detail-name\"]")
	public WebElement nome;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;
	
	//DATOS DEL VISUALIZAR
	@FindBy(xpath = "//*[name()='g' and contains(@class,\"path-start\")][1]/*[name()='text'][1]")
	public WebElement camposV1;
	@FindBy(xpath = "//*[name()='g' and contains(@class,\"path-start\")][1]/*[name()='text'][1]")
	public WebElement camposV2;
//	@FindBy(xpath = "//*[name()='g' and contains(@class,\"path-start\")][3]/*[name()='text'][1]/*[name()='tspan'][1]")
//	public WebElement camposV3;
	
	
	public RegrasdeAuditoriaN2DetalhesPO() {
		PageFactory.initElements(driver, this);
	}
	
	
	public ArrayList<Boolean>  detalhes() {
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		AN2.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
 
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("An2");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement detalhes = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhe\"]"));
		
		actionsMoveToElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		detalhes.click();
		sleep(2000);	
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//detalhes
		String Nome = nome.getText();
		String estructuraValor = estructura.getText();
		String regulamentoValor = regulamento.getText();
		String campo1Valor = campo1.getText();
		String campo2Valor = campo2.getText();
		//String campo3Valor = campo3.getText();
		
		System.out.println("*********Detalhe********");
		System.out.println("Nombre: "+Nome);
		System.out.println("Estructura: "+estructuraValor);
		System.out.println("Regulamento: "+regulamentoValor);
		System.out.println("Campos 1: "+campo1Valor);
		System.out.println("Campos 2:"+campo2Valor);
		System.out.println("*************************");
		
		fechar.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualização\"]"));
		actionsMoveToElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		
		visualizar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(10000);
		
		
		//VISUALIZAR
		String campos1Valor1 = camposV1.getText();
		String campos2Valor2 = camposV2.getText();

		
		System.out.println("*********VISUALIZAR********");
		System.out.println("Campos 1 V: "+campos1Valor1);
		System.out.println("Campos 2 V: "+campos2Valor2);

		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(campos1Valor1.contains(campo1Valor));
		sucesso.add(campos1Valor1.contains(campo2Valor));
		
		return sucesso;
	}
	
}
