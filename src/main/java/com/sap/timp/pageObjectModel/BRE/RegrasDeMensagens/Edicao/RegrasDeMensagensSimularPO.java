package com.sap.timp.pageObjectModel.BRE.RegrasDeMensagens.Edicao;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Factory;

import com.sap.timp.base.TestBaseEliel;

public class RegrasDeMensagensSimularPO extends TestBaseEliel {
	
	@FindBy(xpath = "//span[text()=\"Regras de Mensagens\"]")
	public WebElement regrasdemensagens;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	

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
	
	

	
	public RegrasDeMensagensSimularPO() {

		PageFactory.initElements(driver, this);
	}

	public void simular() {

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

		simulacao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		simulacaoR1.click();
		sleep(1000);
		dados.click();
		sleep(2000);
		ok.click();
		sleep(2000);
		
		filtros.click();
		sleep(2000);
		waitExpectElement(aliquota);
		sleep(2000);
		aliquota.click();
		sleep(1000);
		aliquotaO.click();
		sleep(1000);
		
		String constanteE = "10";
		constante.sendKeys(constanteE);
		sleep(1000);
		aplicar.click();
		sleep(2000);
		simular.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		boolean sucesso = false;
		int graficos = driver.findElements(By.xpath("//div[@class=\"charts\"]")).size();
		
		if (graficos > 0) {
			sucesso = true;
		}
		
		System.out.println(sucesso);
		
		
	}


}
