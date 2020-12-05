package com.sap.timp.pageObjectModel.BSC;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class CorrecaoDeNFAprovarEmMassaCJOBPO extends TestBaseMassiel{
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;

	@FindBy(xpath = "//div[@id=\"right\"]/div[2]/div[1]/div/div/ul/li[1]/button/span[2]")
	public WebElement executar2;

	@FindBy(xpath = "//div[@id=\"table-fixed-wrapper\"]/div[2]/div[1]/span[1]/label/span")
	public WebElement check1;

	@FindBy(xpath = "//div[@id=\"table-data-wrapper\"]/div[2]/div[5]/div[2]/a")
	public WebElement docNum;

	@FindBy(xpath = "//button[@id=\"home-icon\"]")
	public WebElement home;

	@FindBy(xpath = "//div[@class=\"dragger-pagination-right\"]")
	public WebElement flecha;

	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;

	@FindBy(xpath = "//span[text()=\"Nota Fiscal\"]")
	public WebElement notaFiscal;

	@FindBy(xpath = "//div[@class=\"accordion-main-wrapper\"]/div[3]/ul/li[1]/div[2]/ul/li[1]/div[1]/div[2]/span")
	public WebElement pendente;

	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;

	@FindBy(xpath = "//span[contains(@class,\"send\")]")
	public WebElement enviar;
	
	@FindBy(xpath = "//div[@class=\"row visible\"][1]/div/span/label/span")
	public WebElement flagRegistro;
	
	@FindBy(xpath = "//div[@class=\"row visible\"][2]/div/span/label/span")
	public WebElement flagRegistro2;
	
	@FindBy(xpath = "//span[text()=\"Em Progresso\"]")
	public WebElement progresso;
	
	@FindBy(xpath = "//span[text()=\"Corrigido\"]")
	public WebElement Corrigido;
	
	public CorrecaoDeNFAprovarEmMassaCJOBPO() {

		PageFactory.initElements(driver, this);
	}
	
	public void enviar() {
		
		AcessarBSCPO acessarBSC;
		acessarBSC = new AcessarBSCPO();
		
		String url = driver.getCurrentUrl();
		
		boolean tq1 = false;
		boolean tp1 = false;
		boolean tc2 = false;
		
		if (url.contains("tq1")) {
			tq1 = true;
		}else if (url.contains("tc2")) {
			tc2 = true;
		}else {
			tp1 = true;
		}
		String id = "";
		
		waitExpectXpath("//*[@id=\"acc-reports\"]/ul/li[3]");
		
		if (tq1 == true) {
			id = "8004876";
			pesquisar.sendKeys(id);
		}else if (tc2 == true) {
			id = "2131";
			pesquisar.sendKeys(id);
		}else {
			
			id = "1773";
			pesquisar.sendKeys(id);
		}
		
		
		pesquisar.sendKeys(Keys.ENTER);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+id+"\"]/div[1]/div"));
		WebElement executarB = driver.findElement(By.xpath("//div[@data-id=\""+id+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Executar\"]"));
		
		menu.click();
		sleep(1000);
		executarB.click();
		sleep(3000);
		waitExpectXpath("//span[contains(@class,\"setting\")]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		executar2.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		
		flagRegistro.click();
		sleep(1000);
		flagRegistro2.click();
		sleep(2000);
		
		enviar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		home.click();
		sleep(3000);
		waitExpectElement(nao);
		nao.click();
		sleep(3000);
		waitExpectElement(flecha);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		acessarBSC.acessarBSC();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		notaFiscal.click();
		sleep(2000);
		progresso.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		sleep(3000);
		sleep(3000);
		sleep(3000);
		

		Corrigido.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(5000);
		
		
		int rows = driver.findElements(By.xpath("//div[@class=\"tr\" and @data-id]")).size();
		
		String idBSC = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[3]/div")).getText();
		
		String cenario = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[15]/div")).getText();
		String hierarquia = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[15]/div")).getText();
		
		System.out.println(idBSC);
		System.out.println(cenario);
		System.out.println(hierarquia);
		
	}

}
