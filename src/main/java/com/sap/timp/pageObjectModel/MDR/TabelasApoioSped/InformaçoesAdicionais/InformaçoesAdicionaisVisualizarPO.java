package com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.Informa�oesAdicionais;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseEliel;

public class Informa�oesAdicionaisVisualizarPO extends TestBaseEliel {
	
	@FindBy(xpath = "//span[text()=\"Tabelas Complementares para Obriga��es Acess�rias\"]")
	public WebElement obrigacoes;
	
	@FindBy(xpath = "//span[text()=\"Tabela de Outros D�bitos\"]")
	public WebElement outrosDebitos;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//span[@id=\"obrigation\"]")
	public WebElement obrigacaoV;
	@FindBy(xpath = "//span[@id=\"otherDebtsCode\"]")
	public WebElement codigoV;
	@FindBy(xpath = "//span[@id=\"otherDebtsDescription\"]")
	public WebElement descricaoV;
	@FindBy(xpath = "//span[@id=\"validityFrom\"]")
	public WebElement dataVigenciaV;
	
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Obriga��o\")]")
	public WebElement obrigacaoE;
	@FindBy(xpath = "//input[contains(@placeholder,\"C�digo\")]")
	public WebElement codigoE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Descri��o\")]")
	public WebElement descricaoE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Vig�ncia de\")]")
	public WebElement dataVigenciaE;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	public Informa�oesAdicionaisVisualizarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> visualizar() {

		sleep(2000);
		obrigacoes.click();
		sleep(2000);
		outrosDebitos.click();
		sleep(2000);
		
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter1();
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement a�ao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		sleep(20);
		sleep(2000);
		menu.click();
		sleep(1000);
		
		a�ao.click();
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String obrigacaoV1 = obrigacaoV.getText();
		String codigoV1 = codigoV.getText();
		String descricaoV1 = descricaoV.getText();
		String dataVigenciaV1 = dataVigenciaV.getText();
		
		
		System.out.println(obrigacaoV1);
		System.out.println(codigoV1);
		System.out.println(descricaoV1);
		System.out.println(dataVigenciaV1);
		
		biblioteca.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		siguiente.click();
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
		attributoNotToBeEmptyElement(codigoE, "value");
		
		
		String obrigacaoE1 = obrigacaoE.getAttribute("value");
		String codigoE1 = codigoE.getAttribute("value");
		String descricaoE1 = descricaoE.getAttribute("value");
		String dataVigenciaE1 = dataVigenciaE.getAttribute("value");
		
		
		System.out.println(codigoE1);
		System.out.println(obrigacaoE1);
		System.out.println(descricaoE1);
		System.out.println(dataVigenciaE1);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(obrigacaoV1.contains(obrigacaoE1));
		sucesso.add(codigoV1.contains(codigoE1));
		sucesso.add(descricaoV1.contains(descricaoE1));
		sucesso.add(dataVigenciaV1.contains(dataVigenciaE1));
		System.out.println(sucesso);


		return sucesso;
			
	}

	

}
