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

public class OPPropiasRessarcimentosVisualizarPO extends TestBaseSteven{
	
	
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
	
	@FindBy(xpath = "//span[@id=\"annexe\"]")
	public WebElement anexoV;
	
	@FindBy(xpath = "//span[@id=\"report\"]")
	public WebElement modeloRelatórioV;
	
	@FindBy(xpath = "//span[@id=\"iniVIgencia\"]")
	public WebElement dataInicioVigenciaV;
	
	@FindBy(xpath = "//div[@id=\"company-repayments\"]//child::input")
	public WebElement empresaE;
	
	@FindBy(xpath = "//div[@id=\"ufbranch-repayments\"]//child::div[@id=\"multipleControlerId-AL\"]")
	public WebElement ufE;
	
	@FindBy(xpath = "//div[@id=\"annexe-repayments\"]//child::input")
	public WebElement anexoE;
	
	@FindBy(xpath = "//div[@id=\"report-repayments\"]//child::input")
	public WebElement modeloRelatórioE;
	
	@FindBy(xpath = "//div[@id=\"validity-start-repayments\"]//child::input")
	public WebElement dataInicioVigenciaE;
	
	
	public OPPropiasRessarcimentosVisualizarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> Visualizar() {
		
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
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(12000);
		
		String txtEmpresaV = empresaV.getText();
		String txtUfV = ufV.getText();
		String txtActivoV = activoV.getText();
		String txtanexoV = anexoV.getText();
		String txtmodeloRelatórioV = modeloRelatórioV.getText();
		String txtdataInicioVigenciaV = dataInicioVigenciaV.getText();
		
		
		
		System.out.println("-------------------------------------------");
		System.out.println("Empresa: " + txtEmpresaV);
		System.out.println("UF Origem: " + txtUfV);
		System.out.println("Activo: " + txtActivoV);
		System.out.println("Anexo: " + txtanexoV);
		System.out.println("Modelo Relatório: " + txtmodeloRelatórioV);
		System.out.println("Data Inicio Vigencia: " + txtdataInicioVigenciaV);
		
		
	
		
		biblioteca.click();
		sleep(26000);
		
		 menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		 açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		 menu.click();
		 sleep(1000);
		 açao.click();
		 sleep(38000);
		 
		 String txtEmpresaE = empresaE.getAttribute("value");
		 String txtUfE= ufE.getText();
		 String txtanexoE = anexoE.getAttribute("value");
		 String txtmodeloRelatórioE = modeloRelatórioE.getAttribute("value");
		 String txtdataInicioVigenciaE = dataInicioVigenciaE.getAttribute("value");
		 
		 System.out.println("-------------------------------------------");
		 System.out.println("Empresa: " + txtEmpresaE);
		 System.out.println("UF Origem: " + txtUfE);
		 System.out.println("Anexo: " + txtanexoE);
		 System.out.println("Modelo Relatório: " + txtmodeloRelatórioE);
		 System.out.println("Data Inicio Vigencia: " + txtdataInicioVigenciaE);
		 
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
			
		sucesso.add(txtEmpresaV.equals(txtEmpresaE));
		sucesso.add(txtUfV.equals( txtUfE));
		sucesso.add(txtanexoV.equals(txtanexoE));
		sucesso.add(txtmodeloRelatórioV.equals(txtmodeloRelatórioE));
		sucesso.add(txtdataInicioVigenciaV.equals(txtdataInicioVigenciaE));
			
		System.out.println(sucesso);
		
		return sucesso;
	}		
	
	
	

}
