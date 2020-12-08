package com.sap.timp.pageObjectModel.DFG.SPED.EFDICMSIPI;

import java.rmi.server.Skeleton;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class EFDICMSIPICriarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Raiz\"]")
	public WebElement raiz;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;

	@FindBy(xpath = "//span[contains(text(),\"Novo\")]")
	public WebElement novo;

	@FindBy(xpath = "//span[text()=\"Editar\"]")
	public WebElement editar;

	@FindBy(xpath = "//span[text()=\"Adicionar bloco\"]")
	public WebElement bloco;

	@FindBy(xpath = "//input[contains(@placeholder,\"nome\")]")
	public WebElement nome;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-public-layout\"]")
	public WebElement leiautePublico;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;

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

	

	public EFDICMSIPICriarPO() {

		PageFactory.initElements(driver, this);
	}
	
	
	public void criar() {
		
		raiz.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[@class=\"tr\" and @data-id]")).size();
		
		String ultimoIdAC = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[5]/div")).getText();
		System.out.println("Último Id antes da criação do registro: " + ultimoIdAC);
		idInserir1(ultimoIdAC);
		
		novo.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		
		
		
		
	}
	
	
}
