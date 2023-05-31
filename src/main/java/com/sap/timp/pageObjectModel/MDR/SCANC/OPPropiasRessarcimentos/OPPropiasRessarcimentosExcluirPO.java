package com.sap.timp.pageObjectModel.MDR.SCANC.OPPropiasRessarcimentos;

import javax.swing.text.AbstractDocument.LeafElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.errorprone.annotations.FormatMethod;
import com.sap.timp.base.TestBase;
import com.sap.timp.base.TestBase;

public class OPPropiasRessarcimentosExcluirPO extends TestBase{
	
	
	@FindBy(xpath = "//span[text()=\"SCANC\"]")
	public WebElement scanc;
	
	@FindBy(xpath = "//span[text()=\"Op. Próprias e Ressarcimentos\"]")
	public WebElement opProprias;
	
	@FindBy(xpath = "//span[contains(text(),\"Novo\")]")
	public WebElement novo;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	@FindBy(xpath = "//li[@class=\"list-item\" and @id][1]")
	public WebElement opcao;
	
	@FindBy(xpath = "//div[contains(@id,\"start\")]/div/div/input")
	public WebElement dataInicioVigencia;
	
	public OPPropiasRessarcimentosExcluirPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean Excluir() {
		
		sleep(2000);
		scanc.click();
		sleep(2000);
		
		opProprias.click();
		
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		
		String idRegistro = 	idObter("OPPropiasRessarcimentos");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		
		waitExpectedElement(sim);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay dark\"]");
		sleep(2000);	
		
		driver.navigate().refresh();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(34000);
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");	
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String idUltimo = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		int id1 = convertToInt(idUltimo);
		int id2 = convertToInt(idRegistro);
		System.out.println(id1);
		System.out.println(id2);
		
		System.out.println(idUltimo); // Ultimo registro despues de excluir el registro de la automatizacion y recargar
		
		boolean sucesso = false;
		
		if (id1 != id2) {
			sucesso= true;
		}
		System.out.println(sucesso);
		return sucesso;
	}		
	
	
	

}
