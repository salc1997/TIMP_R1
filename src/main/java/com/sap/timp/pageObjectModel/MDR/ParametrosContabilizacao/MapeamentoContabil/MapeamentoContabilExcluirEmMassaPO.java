package com.sap.timp.pageObjectModel.MDR.ParametrosContabilizacao.MapeamentoContabil;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBase;

public class MapeamentoContabilExcluirEmMassaPO extends TestBase {
	
	@FindBy(xpath = "//span[text()=\"Parâmetros de Contabilização\"]")
	public WebElement parametro;
	
	@FindBy(xpath = "//span[text()=\"Mapeamento Contábil\"]")
	public WebElement contabil;
	
	
	
	@FindBy(xpath = "//span[contains(text(),\"Novo\")]")
	public WebElement novo;
	
	@FindBy(xpath = "//div[@id=\"company\"]/div/div/div[2]")
	public WebElement empresa;
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement empresaO;
	

	@FindBy(xpath = "//div[@id=\"branch\"]/div/div/div[2]")
	public WebElement filial;
	@FindBy(xpath = "//div[@class=\"list-option\"][2]/div/div/label/span")
	public WebElement filialO;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][3]/div/div/label/span")
	public WebElement filialO1;
	
	@FindBy(xpath = "//*[@id=\"adjustCode-button\"]")
	public WebElement ajuste;
	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[1]/label/span")
	public WebElement codigo;
	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][2]/div[1]/label/span")
	public WebElement codigo1;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//div[@class=\"tr\" and @data-id]/div[4]/div")
	public WebElement motivo;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//button/span[contains(@class,\"icon-persign\")]")
	public WebElement excluirMassa;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;

	@FindBy(xpath = "//div[@class=\" toast-inner\"]")
	public WebElement mensagem;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-left\")][1]")
	public WebElement primero;
	
	@FindBy(xpath = "//div[contains(@class,\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-left\")][1]")
	public WebElement primeira;
	
	public MapeamentoContabilExcluirEmMassaPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		
		System.out.println("---------- Id Anterior --------- " );
		String url = driver.getCurrentUrl();

		boolean tp1  = false;
		boolean tc2  = false;
		boolean tq1  = false;

		if (url.contains("tq1")) {
			tq1 = true;
		}else if(url.contains("tc2")){
			tc2 = true;
		}else if(url.contains("tp1")){
			tp1 = true;
		}
		sleep(2000);
		parametro.click();
		sleep(1000);
		contabil.click();
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		primeira.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")).getText();
		sleep(2000);
		System.out.println(id);
		
		novo.click();
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//Primeiro Registro
		empresa.click();
		sleep(1000);
		empresaO.click();
		empresaO.sendKeys(Keys.ESCAPE);
		attributeToBe("//div[@id=\"branch\"]/div", "class", "base-MultipleSelect3 required");
		sleep(2000);
		
		filial.click();
		sleep(1000);
		filialO.click();
		filialO.sendKeys(Keys.ESCAPE);
		
		sleep(1000);
		ajuste.click();
		sleep(6000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		if (tp1 == true) {


			WebElement codi = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][4]/div[1]/label/span"));

			codi  .click();
			sleep(2000);

		}else {
			WebElement codi = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][2]/div[1]/label/span"));

			codi  .click();
			sleep(2000);

			
		}
		
		aceitar.click();
		
		sleep(1000);

		novo.click();
		sleep(2000);
		waitExpectedElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		//Segundo Registro
		
		empresa.click();
		sleep(1000);
		empresaO.click();
		empresaO.sendKeys(Keys.ESCAPE);
		attributeToBe("//div[@id=\"branch\"]/div", "class", "base-MultipleSelect3 required");
		sleep(2000);
		
		filial.click();
		sleep(1000);
		filialO1.click();
		filialO1.sendKeys(Keys.ESCAPE);
		
		sleep(1000);
		ajuste.click();
		sleep(6000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		if (tp1 == true) {


			WebElement codi = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][4]/div[1]/label/span"));

			codi  .click();
			sleep(2000);

		}else {
			WebElement codi = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][3]/div[1]/label/span"));

			codi  .click();
			sleep(2000);

			
		}
		sleep(2000);
		aceitar.click();
		
		sleep(2000);
		novo.click();
		sleep(2000);
		waitExpectedElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
	
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		biblioteca.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		primeira.click();
		
		sleep(3000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String idRegistro1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")).getText();
		
		
		String idRegistro2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][2]/div[3]/div")).getText();
		
		
		
	
		sleep(2000);
		System.out.println(id);
		System.out.println(idRegistro1);
		System.out.println(idRegistro2);
		
		double idD = convertToDouble(id);
		double idRegistroD1 = convertToDouble(idRegistro1);
		double idRegistroD2 = convertToDouble(idRegistro2);

		boolean sucesso = false;
		
		if (idRegistroD1 > idD && idRegistroD2 > idD) {
			sucesso = true;
		}else {
			sucesso = false;
		}
		System.out.println(sucesso);
		
		
		return sucesso;
		
		
	}	
	
	
	public boolean excluir() {
		
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String idRegistro1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")).getText();

		
		WebElement check1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[2]/label/span"));
		check1.click();
		sleep(1000);
		
		
		String idRegistro2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][2]/div[3]/div")).getText();
		
		WebElement check2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][2]/div[2]/label/span"));
		check2.click();
		
		sleep(1000);
		
		excluirMassa.click();
		sleep(1000);
		waitExpectedElement(sim);
		sleep(1000);
		sim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		
		driver.navigate().refresh();
		waitExpectedElement(primeira);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		primeira.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")).getText();
		
		int id1 = convertToInt(id);
		int id2 = convertToInt(idRegistro1);
		int id3 = convertToInt(idRegistro2);
		
		System.out.println(" Id Ultimo Registro: "+ id1);
		System.out.println("Id Excluir Registro 1: " + id2);
		System.out.println("Id Excluir Registro 2: " + id3);
		
		boolean sucesso = false;
		
		if (id1 != id2 && id1!=id3) {
			sucesso = true;
		}else {
			sucesso=false;
		}
		
		
		
		return sucesso;
	}



}
