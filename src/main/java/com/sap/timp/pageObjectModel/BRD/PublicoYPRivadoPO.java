package com.sap.timp.pageObjectModel.BRD;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBase;

import net.bytebuddy.asm.Advice.Return;

public class PublicoYPRivadoPO extends TestBase{
	
	@FindBy(xpath = "//*[@id=\"searchbox\"]/div/div/input")
	public WebElement ferramenta;
	
	@FindBy(xpath = "//*[@id=\"right\"]/div/div[4]/div/div[1]/div/div[3]/div[1]/div[1]/div")
	public WebElement menu;
	
	@FindBy(xpath = "//*[@id=\"right\"]/div/div[4]/div/div[1]/div/div[3]/div[1]/div[1]/div/div[2]/ul/li[3]")
	public WebElement opcao;
	
	@FindBy(xpath = "//*[@id=\"editor-toolbar\"]/div/div/ul/li[3]/button")
	public WebElement compartirB;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[2]")
	public WebElement aceptar;
	
	@FindBy(xpath = "//*[@id=\"editor-toolbar\"]/div/div/ul/li[1]/button")
	public WebElement gravar;
	
	@FindBy(xpath = "//*[@id=\"editor-toolbar\"]/div/ul/li[4]/button")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//*[@id=\"right\"]/div/div[4]/div/div[1]/div/div[3]/div[1]/div[4]/span")
	public WebElement publico;
	
	
		
	
	
	public PublicoYPRivadoPO() {
		//PageFactory.initElements(driver, this);
		PageFactory.initElements(driver, this);
	}
	
	
	
	public boolean publicoEditor() {
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		ferramenta.sendKeys("Prueba Automatizada");
		ferramenta.sendKeys(Keys.ENTER);

		waitExpectElement(menu);
		sleep(menuT);
		
		menu.click();

		opcao.click();
		
		
		

		
		waitExpectXpath("//*[@id=\"accordion\"]/ul/li");
		
		compartirB.click();
		
		aceptar.click();
		
		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		sleep(5000);
		
		gravar.click();
		
		sleep(5000);
		
		waitExpectXpath(("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]"));

		biblioteca.click();
		
		//waitExpectXpath("//*[@id=\"right\"]/div/div[4]/div/div[2]/div/div[5]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectXpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]/div[2]/label/span");
		sleep(3000);
		
		actionsMoveToElementElement(publico);

		String publicoT = publico.getAttribute("aria-label");
		System.out.println(publicoT);
		
		boolean sucesso = publicoT.contains("Relatório Público");
		System.out.println(sucesso);
		sleep(4000);

		return sucesso;
		
		
		
		
	}
	
	public boolean privadoEditor() {
		
		sleep(1000);
		
		waitExpectXpath("//*[@id=\"right\"]/div/div[4]/div/div[1]/div/div[1]/div");
		
		menu.click();
		opcao.click();
		

		
		waitExpectXpath("//*[@id=\"accordion\"]/ul/li");
		
		compartirB.click();
		sleep(3000);
		aceptar.click();
		

		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		sleep(5000);
		
		gravar.click();
		
		sleep(5000);
		
		waitExpectXpath(("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]"));

		biblioteca.click();
		
		//waitExpectXpath("//*[@id=\"right\"]/div/div[4]/div/div[2]/div/div[5]");
		waitExpectXpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]/div[2]/label/span");
		sleep(3000);
		
		actionsMoveToElementElement(publico);

		String privadoT = publico.getAttribute("aria-label");
		System.out.println(privadoT);
		boolean sucesso = privadoT.contains("Relatório Privado");
		System.out.println(sucesso);
		sleep(4000);
		
		return sucesso;
		
		
		
		
	}		

	
	public boolean publicoBiblioteca() {

		publico.click();
		sleep(2000);
		aceptar.click();
		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		sleep(menuT);
		sleep(3000);
		actionsMoveToElementElement(publico);
		String publicoT = publico.getAttribute("aria-label");
		System.out.println(publicoT);
		
		boolean sucesso = publicoT.contains("Relatório Público");
		
		return sucesso;

	}		
	
	public boolean privadoBiblioteca() {
		publico.click();
		sleep(2000);
		aceptar.click();
		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		sleep(menuT);

		actionsMoveToElementElement(publico);
		String privadoT = publico.getAttribute("aria-label");
		System.out.println(privadoT);
		
		boolean sucesso = privadoT.contains("Relatório Privado");

		return sucesso;

	}
	
	
	
	
	
	
	
}
