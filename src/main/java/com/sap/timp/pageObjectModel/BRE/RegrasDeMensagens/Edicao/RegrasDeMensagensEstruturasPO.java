package com.sap.timp.pageObjectModel.BRE.RegrasDeMensagens.Edicao;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Factory;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.base.TestBaseSteven;

public class RegrasDeMensagensEstruturasPO extends TestBaseSteven {
	
	@FindBy(xpath = "//span[text()=\"Regras de Mensagens\"]")
	public WebElement regrasdemensagens;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	@FindBy(xpath = "//span[text()=\"Estruturas\"]")
	public WebElement estruturas;
	
	@FindBy(xpath = "//button[text()=\"Create estructuras associadas\"]")
	public WebElement crearEstruturas;

	@FindBy(xpath = "//span[text()=\"Adicionar Caminho\"]")
	public WebElement adicionarcaminho;
	
	//@FindBy(xpath = "//div[@class=\"select-one\"]/div/div[2]")
	@FindBy(xpath = "//span[text()=\"Simulação\"]")
	public WebElement simulacao;
	
	@FindBy(xpath = "//*[name()=\"g\"][@class=\"path-start\"]")
	public WebElement simulacaoR1;
	
	@FindBy(xpath = "//span[text()=\"Dados\"]")
	public WebElement dados;
	
	@FindBy(xpath = "//button[text()=\"Ok\"]")
	public WebElement ok;
	
	@FindBy(xpath = "//span[text()=\"Filtros\"]")
	public WebElement filtros;
	
	@FindBy(xpath = "//div[@id=\"field-select-container\"]/div/div/div[2]")
	public WebElement aliquota;
	
	@FindBy(xpath = "//li[contains(text(),\"Alíquota ICMS (ED)\")  and @id][1]")
	public WebElement aliquotaO;
	
	@FindBy(xpath = "//div[@class=\"filter-condition layout-row\"]/div[3]/div/div/input")
	public WebElement constante;
	
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicar;
	
	@FindBy(xpath = "//span[text()=\"Simular\"]")
	public WebElement simular;
	
	

	
	public RegrasDeMensagensEstruturasPO() {

		PageFactory.initElements(driver, this);
	}

	public void estrutura() {
		
		String url = driver.getCurrentUrl();
		
		boolean tq1 = false;
		boolean tc2 = false;
		
		if (url.contains("tq1")) {
			tq1 = true;
		}else if (url.contains("tc2")) {
			tc2 = true;
		}
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		regrasdemensagens.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		String idRegistro = idObter1();
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(4000);

		menu.click();
		sleep(1000);
		editar.click();
		sleep(2000);
		waitExpectElement(adicionarcaminho);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		estruturas.click();
		sleep(3000);
		crearEstruturas.click();
		sleep(3000);
		
		
		

		
		
	}


}
