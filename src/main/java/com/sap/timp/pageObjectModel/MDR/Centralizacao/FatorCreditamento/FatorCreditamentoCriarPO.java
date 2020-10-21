package com.sap.timp.pageObjectModel.MDR.Centralizacao.FatorCreditamento;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKathy;

public class FatorCreditamentoCriarPO extends TestBaseKathy{
	@FindBy(xpath = "//li/div/span[text()=\"Centralização\"]")
	public WebElement centralização;
	
	@FindBy(xpath = "//li/div/span[text()=\"Fator de Creditamento do CIAP\"]")
	public WebElement fatorCrecimento;
	
	@FindBy(xpath = "//button/span[text()=\"Novo Fator de Creditamento do CIAP\"]")
	public WebElement novo;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione uma empresa\"]")
	public WebElement empresa;
	
	@FindBy(xpath = "//li[@class=\"list-item\" and @id][1]")
	public WebElement opcEmpresa;
	
	@FindBy(xpath = "//*[@id=\"list\"]/div/div/div[1]/div/div[2]/div/div[3]")
	public WebElement idC;
		
	@FindBy(xpath = "//input[@placeholder=\"Selecionar UF Filial\"]")
	public WebElement ufFilial;
	
	@FindBy(xpath = "//div[contains(@class,\"overlay-multipleSelect3\")]")
	public WebElement claseOpcFiliais;
	
	@FindBy(xpath = "//li[@class=\"list-item\" and @id][1]")
	public WebElement opcUfFilial;
	
	//@FindBy(xpath = "//div/div[@id=\"branches\"]/div/div/div/input")
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Filiais\"]")
	public WebElement filiais;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcFiliais;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][2]/div/div/label/span")
	public WebElement opcFiliais2;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcFiliaisTC2;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcFiliaisTC2opc1;
	
	//@FindBy(xpath = "//div/div[@id=\"centralizedBranch\"]/div/div/div/input")
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Filial Centralizadora\"]")
	public WebElement filialCentralizadora;
	
	@FindBy(xpath = "//li[@class=\"list-item\" and @id][1]")
	public WebElement opcFilialCentralizadora;
	
	@FindBy(xpath = "//*[@id=\"validity\"]/div/div[1]/input")
	public WebElement dataVigenciaInicio;
	
	@FindBy(xpath = "//*[@id=\"toolbar\"]/div/div/ul/li[1]/button")
	public WebElement btnGravar;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[2]")
	public WebElement confirmacionGravar;
		
	@FindBy(xpath = "//*[@id=\"toolbar\"]/div/ul/li[3]/button")
	public WebElement btnRegresar;
	
	@FindBy(xpath = "/html/body/div[3]")
	public WebElement cuerpo;
	
	public FatorCreditamentoCriarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean fatorCreditamentoCriar() {
		String url = driver.getCurrentUrl();
		
		boolean tc2 = false;
		boolean td1 = false;
		boolean tp1 = false;
		boolean tq1 = false;
		
		if (url.contains("tc2")) {
			tc2 = true;
		}else if (url.contains("tp1")) {
			tp1 = true;
		}else if (url.contains("tq1")) {
			tq1 = true;
		}else {
			td1 = true;
		}
		
		centralização.click();
		sleep(1000);
		fatorCrecimento.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		

		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		System.out.println(id);
		novo.click();
		
		waitExpectElement(btnGravar);
		waitExpectElement(empresa);
		empresa.sendKeys(Keys.ENTER);
		opcEmpresa.click();
		sleep(3000);
		
		ufFilial.sendKeys(Keys.ENTER);
		opcUfFilial.click();
		
		sleep(4000);
		filiais.sendKeys(Keys.ENTER);
		if(tc2==true) {
			opcFiliaisTC2.click();
			opcFiliaisTC2opc1.click();
		}else {
			opcFiliais.click();
			opcFiliais2.click();
		}
		claseOpcFiliais.click();
		
		filialCentralizadora.click();
		opcFilialCentralizadora.click();
		
		dataVigenciaInicio.sendKeys(fechaActual());
		sleep(2000);

		
		btnGravar.click();
		waitExpectElement(confirmacionGravar);
		confirmacionGravar.click();
		
		sleep(3000);
		
		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//waitExpectElement(btnRegresar);
		btnRegresar.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);

			
		String id2 = driver.findElement(By.xpath("//*[@id=\"list\"]/div/div/div[1]/div/div[3]/div[3]/div[3]/div")).getText();
		
		int idD = Integer.valueOf(id);
		int id2D = Integer.valueOf(id2);
		
		System.out.println(idD);
		System.out.println(id2D);
		
		boolean sucesso = false;
		if (idD < id2D) {
			sucesso = true;
		}
	
		return sucesso;
	}
}
