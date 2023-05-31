package com.sap.timp.pageObjectModel.TAA.AtribuiçõesdeRegras.RegraDeCampos;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBase;

public class RegraDeCamposDetalhePO extends TestBase{
	@FindBy(xpath = "//span[text()=\"Atribuições de Regras\"]")
	public WebElement abaAtribucoesDeRegras;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-00\"]")
	public WebElement icms;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-rulesLvl2_00\"]")
	public WebElement regrasDeCampos;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//button[text()=\"Fechar\"]")
	public WebElement btnFechar;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement btnFecharD;
	
	public RegraDeCamposDetalhePO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> Detalhes() {
		invisibilityOfElementOverlay();
		abaAtribucoesDeRegras.click(); 
		invisibilityOfElementOverlay();
		
		icms.click();
		sleep(2000);
		
		regrasDeCampos.click();
		invisibilityOfElementOverlay();
		
		btnUltimaPagina.click();
		invisibilityOfElementOverlay();
		
		String idRegistro = idObter("RegraDeCampos");
		System.out.println("ID Registro: " + idRegistro);
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhes\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		
		// Datos de Detalles
		String empresaString = driver.findElement(By.xpath("//div[@id=\"detail-description\"][2]//div[2]")).getText();
		String ufString = driver.findElement(By.xpath("//div[@id=\"detail-description\"][3]//div[2]")).getText();
		String filialD = driver.findElement(By.xpath("//div[@id=\"detail-description\"][4]//div[2]")).getText();
		String reglaD = driver.findElement(By.xpath("//div[@id=\"detail-description\"][1]//div[2]")).getText();
		
		
		System.out.println("Datos de Detalle");
		System.out.println("Empresa: " + empresaString);
		System.out.println("UF: " + ufString);
		System.out.println("Filial: " + filialD);
		System.out.println("Regra: " + reglaD);
		
		sleep(1000);
		
		
		btnFecharD.click();
		sleep(2000);
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Ver\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(5000);
		
		String URL = driver.getCurrentUrl();
		
		// Datoss de Ver
		waitExpectXpath("//div[@id=\"rule-type\"]/div/div/div/input");
		attributoNotToBeEmptyXpath("//div[@id=\"rule-type\"]/div/div/div/input", "value");
		String empresaString1 = driver.findElement(By.xpath("//div[@id=\"rule-company\"]//div[1]")).getText().trim();
		String ufString1 = driver.findElement(By.xpath("//div[@id=\"rule-state\"]//div[1]")).getText().trim();
		String filialString = driver.findElement(By.xpath("//div[@id=\"rule-branch\"]//div[1]")).getText().trim();
		String regraString = driver.findElement(By.xpath("//div[@id=\"rule-rule\"]//input")).getAttribute("value").trim();
		

		System.out.println("");
		System.out.println("Datos de Editar");
		System.out.println("Empresa: " + empresaString1);
		System.out.println("UF: " + ufString1);
		System.out.println("Filial: " + filialString);
		System.out.println("Regra: " + regraString );
		
		sleep(3000);
		btnFechar.click();
		sleep(2000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(empresaString1.equals(empresaString));
		sucesso.add(ufString1.equals(ufString));
		sucesso.add(filialD.equals(filialString));
		sucesso.add(reglaD.equals(regraString));
		
		System.out.println("");
		System.out.println(sucesso);
		
		return sucesso;
	}
}
