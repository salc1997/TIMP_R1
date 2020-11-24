package com.sap.timp.pageObjectModel.DFG.Leiautes;

import java.rmi.server.Skeleton;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ParametrosGeraisCriarRaizIDPúblicoPrivadoEditarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Raiz\"]")
	public WebElement raiz;

	@FindBy(xpath = "//button/span[text()=\"Novo Leiaute\"]")
	public WebElement novo;

	@FindBy(xpath = "//input[contains(@placeholder,\"nome\")]")
	public WebElement nome;

	@FindBy(xpath = "//div[@id=\"inputSelectTypeFile\"]/div/div/div[2]")
	public WebElement tipo;

	@FindBy(xpath = "//div[@id=\"inputStructureParent\"]/div/div/div[2]")
	public WebElement grupoEstrutura;
	
	@FindBy(xpath = "//div[@id=\"inputStructureChild\"]/div/div/div[2]")
	public WebElement estrutura;

	@FindBy(xpath = "//input[contains(@placeholder,\"Inicio\")]")
	public WebElement dataVigencia;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Versão\")]")
	public WebElement versaoLeiaute;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-public-layout\"]")
	public WebElement leiautePublico;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id][1]")
	public WebElement opcao;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcao2;
	
	@FindBy(xpath = "//button[@id=\"advanced-filters-btn\"]")
	public WebElement filtrosAvanzados;
	
	@FindBy(xpath = "//div[@id=\"mes\"]/div/div/div[2]")
	public WebElement mes;
	@FindBy(xpath = "//*[@id=\"option-1\"]")
	public WebElement mesO;
	
	@FindBy(xpath = "//div[@id=\"recorrenciaFeriado\"]/div/div/div[2]")
	public WebElement recorrencia;
	@FindBy(xpath = "//*[@id=\"option-1\"]")
	public WebElement recorrenciaO;
	
	@FindBy(xpath = "//*[@id=\"vigencia1-activities\"]/div/div[1]/input")
	public WebElement data;
	/*
	@FindBy(xpath = "")
	public WebElement ;
	*/
	
	@FindBy(xpath = "//li[@tabindex=\"0\"]/div[@class=\"title\"]/span[text()=\"Atividades Fiscais\"]")
	public WebElement atividades;
	
	@FindBy(xpath = "//button[text()=\"Salvar\"]")
	public WebElement salvar;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;

	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicar;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;

	

	public ParametrosGeraisCriarRaizIDPúblicoPrivadoEditarPO() {

		PageFactory.initElements(driver, this);
	}
	
	
	public void editar() {
		
		leiautePublico.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		
		pesquisar.sendKeys(idObter1());
		pesquisar.sendKeys(Keys.ENTER);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
	}
	
	
}
