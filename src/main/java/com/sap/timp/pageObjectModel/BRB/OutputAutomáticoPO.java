package com.sap.timp.pageObjectModel.BRB;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sap.timp.base.TestBaseSteven;

public class OutputAutomáticoPO extends TestBaseSteven {
	
	@FindBy(xpath = "//*[@id=\"draggable-28\"]")				
	public WebElement mover;
	
	@FindBy(xpath = "//*[@id=\"editor-toolbar\"]/div/div/ul/li[1]/button")				
	public WebElement gravar;
	
	@FindBy(xpath = "//*[@id=\"toolbar\"]/div/div/ul/li[6]/button/span")				
	public WebElement btnDuplicidade;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[1]")				
	public WebElement btnCancelar;
	
	@FindBy(xpath = "//input[@placeholder=\" selecionar Campo de Período\"]")				
	public WebElement inputPerido;
	
	@FindBy(xpath = "//*[@id=\"option-1\"]")				
	public WebElement opcPeriodo;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[1]/div[2]/div/div/label/span")				
	public WebElement flag;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[1]/div[3]/div[2]/div/div[1]/span")				
	public WebElement calendario;
	
	@FindBy(xpath = "/html/body/div[5]/div[2]/div[2]/div[2]/div[1]/div[3]/div[13]")				
	public WebElement seleccionCalendario;
	
	@FindBy(xpath = "/html/body/div[5]/div[2]/div[3]/div[2]/button[2]")				
	public WebElement aplicar;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[2]")				
	public WebElement aplicar2;
	
	@FindBy(xpath = "//input[@placeholder=\" selecionar Coluna do relatório\"]")				
	public WebElement campos;
	
	@FindBy(xpath = "//*[@id=\"COD_NAT\"]/div[1]/label/span")				
	public WebElement opcCampos;
	
	@FindBy(xpath = "//*[@id=\"editor-toolbar\"]/div/ul/li[3]/button/span[2]")				
	public WebElement btnExecucao;
	
	@FindBy(xpath = "//*[@id=\"right\"]/div[2]/div[1]/div/div/ul/li[1]/button/span[2]")				
	public WebElement btnExecutar;
	
	@FindBy(xpath = "//*[@id=\"right\"]/div[2]/div[1]/div/ul/li[3]/button/span[2]")				
	public WebElement btnEdicao;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[3]/div/label/span")				
	public WebElement flagExcluir;
	
	
	@FindBy(xpath = "//*[@id=\"searchbox\"]/div/div/input")
	public WebElement ferramenta;
	
	@FindBy(xpath = "//*[@id=\"right\"]/div/div[4]/div/div[1]/div/div[3]/div[1]/div[1]/div")
	public WebElement menu;
	
	@FindBy(xpath = "//*[@id=\"right\"]/div/div[4]/div/div[1]/div/div[3]/div[1]/div[1]/div/div[2]/ul/li[3]")
	public WebElement opcao;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//li[contains(@class,\"add-column\")]/div/div/div")
	public WebElement agregar;
	
	@FindBy(xpath = "//li[contains(@column-name, \"Nova Coluna\")]/div/div/div")
	public WebElement regraC;
	
	@FindBy(xpath = "//*[@id=\"basePopover-wrapper\"]/div/div/div/ul/li[5]")
	public WebElement atribuirRegra;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div/div/div/div[2]/div[1]/div[1]/label/span")
	public WebElement selecionRegra;

	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[2]")
	public WebElement proximo;
	
	@FindBy(xpath = "//*[@id=\"editor-toolbar\"]/div/ul/li[3]/button")
	public WebElement execucao;
	
	@FindBy(xpath = "//*[@id=\"right\"]/div[2]/div[1]/div/div/ul/li[1]/button")
	public WebElement executar;
	
	@FindBy(xpath = "//span[text()=\"Edição\"]")
	public WebElement edicao;
	
	@FindBy(xpath = "//li[@column-id=\"n0\"]/div/div/div/span[@class=\"dropdown-arrow icon icon-font-Sign-and-Symbols icon-down\"]")
	public WebElement seleccionarRegla;
	
	@FindBy(xpath = "//span[text()=\"Remover Coluna\"]")
	public WebElement removerRegla;
	
	public OutputAutomáticoPO() {

		PageFactory.initElements(driver, this);
	}
	
	
	public boolean editar() {
		WebDriverWait wait = new WebDriverWait(driver, 7000);
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
		
		if (tc2==true) {
			waitExpectXpath("//*[@id=\"acc-reports\"]/ul/li[3]");
			ferramenta.sendKeys("2278");
			ferramenta.sendKeys(Keys.ENTER);
			
		}else if (tq1==true) {
			waitExpectXpath("//*[@id=\"acc-reports\"]/ul/li[3]");
			ferramenta.sendKeys("8005134");
			ferramenta.sendKeys(Keys.ENTER);
			
		}else {
			waitExpectXpath("//*[@id=\"acc-reports\"]/ul/li[3]");
			ferramenta.sendKeys("1745");
			ferramenta.sendKeys(Keys.ENTER);
			
		}
		
		
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//waitExpectElement(menu);
		//sleep(menuT);

		menu.click();

		opcao.click();

		waitExpectXpath("//*[@id=\"accordion\"]/ul/li");
		
		agregar.click();
		sleep(1000);
		regraC.click();
		sleep(1000);
		atribuirRegra.click();
		
		waitExpectXpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div/div/div[2]/div[1]/div[1]/label/span");
		sleep(1000);
		selecionRegra.click();
		sleep(1000);
		
		String reglaT = driver.findElement(By.xpath("//div[@class=\"tbody\"]/div[@class=\"tr\"]/div[3]/div")).getText();
		
		
		proximo.click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/textarea")));
		sleep(2000);
		proximo.click();
		
		waitExpectXpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/div/div/div/div/div[2]/div[1]/div[1]/label/span");
		sleep(1000);
		proximo.click();
		
		sleep(5000);
		
		gravar.click();
		waitExpectElement(nao);
		sleep(3000);
		nao.click();
		sleep(2000);
		sleep(3000);
		execucao.click();
		
		waitExpectXpath("//*[@id=\"variant-toolbar\"]/div/ul/li[6]/button");
		executar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		edicao.click();
		sleep(3000);
		
		nao.click();
		sleep(2000);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		seleccionarRegla.click();
		sleep(2000);
		
		removerRegla.click();
		sleep(2000);
		
		gravar.click();
		sleep(2000);
		
		nao.click();
		sleep(2000);
		
		boolean sucesso = true;
		
		return sucesso;
		
	}
	
}
