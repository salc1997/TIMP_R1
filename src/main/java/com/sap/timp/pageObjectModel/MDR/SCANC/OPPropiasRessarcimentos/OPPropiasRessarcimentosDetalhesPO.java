package com.sap.timp.pageObjectModel.MDR.SCANC.OPPropiasRessarcimentos;

import java.util.ArrayList;

import javax.swing.text.AbstractDocument.LeafElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.errorprone.annotations.FormatMethod;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseSteven;

public class OPPropiasRessarcimentosDetalhesPO extends TestBaseSteven{
	
	
	@FindBy(xpath = "//span[text()=\"SCANC\"]")
	public WebElement scanc;
	
	@FindBy(xpath = "//span[text()=\"Op. Próprias e Ressarcimentos\"]")
	public WebElement opProprias;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][1]/div[2]")
	public WebElement empresaD;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][2]/div[2]")
	public WebElement ufD;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][9]/div[2]")
	public WebElement activoD;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement btnCerrarDetalhe;
	
	@FindBy(xpath = "//span[@id=\"company\"]")
	public WebElement empresaV;
	
	@FindBy(xpath = "//span[@id=\"ufFilial\"]")
	public WebElement ufV;
	
	@FindBy(xpath = "//span[@id=\"active\"]")
	public WebElement activoV;
	
	
	public OPPropiasRessarcimentosDetalhesPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> Detalhes() {
		
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
		
		String idRegistro = idObter("OPPropiasRessarcimentos");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhes\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(9000);
	

		String txtEmpresaD = empresaD.getText();
		String txtUfD = ufD.getText();
		String txtActivoD = activoD.getText();
		
		System.out.println("Empresa: " + txtEmpresaD);
		System.out.println("UF Origem: " + txtUfD);
		System.out.println("Activo: " + txtActivoD);
		
		sleep(2000);
		btnCerrarDetalhe.click();
		sleep(1000);
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String txtEmpresaV = empresaV.getText();
		String txtUfV = ufV.getText();
		String txtActivoV = activoV.getText();
		
		System.out.println("-------------------------------------------");
		System.out.println("Empresa: " + txtEmpresaV);
		System.out.println("UF Origem: " + txtUfV);
		System.out.println("Activo: " + txtActivoV);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(txtEmpresaV.equals(txtEmpresaD));
		sucesso.add(txtUfV.equals( txtUfD));
		sucesso.add(txtActivoV.contains(txtActivoD));
		
		
		System.out.println(sucesso);
		
		return sucesso;
	}		
	
	
	

}
