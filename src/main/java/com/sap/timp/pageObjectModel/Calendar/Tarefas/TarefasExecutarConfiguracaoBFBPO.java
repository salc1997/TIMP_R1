package com.sap.timp.pageObjectModel.Calendar.Tarefas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBase;

public class TarefasExecutarConfiguracaoBFBPO extends TestBase{
	
	@FindBy(xpath = "//span[text()=\"Calend�rio de Usu�rios\"]")
	public WebElement calendario;

	@FindBy(xpath = "//span[@class=\"btn icon icon-font-Sign-and-Symbols icon-persign closeButton\"]")
	public WebElement fechar;

	@FindBy(xpath = "//span[text()=\"Abrir Calend�rio\"]")
	public WebElement abrirCalendario;

	@FindBy(xpath = "//div[@class=\"title\"]")
	public WebElement titulo;

	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;

	@FindBy(xpath = "//textarea[@placeholder=\"Descri��o\"]")
	public WebElement descricao;

	@FindBy(xpath = "//input[contains(@placeholder,\"in�cio\")]")
	public WebElement inicio;

	@FindBy(xpath = "//input[contains(@placeholder,\"vencimento\")]")
	public WebElement vencimento;

	@FindBy(xpath = "//button[text()=\"Gravar\"]")
	public WebElement gravar;

	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;

	@FindBy(xpath = "//button[text()=\"Excluir\"]")
	public WebElement excluir;
	
	@FindBy(xpath = "//button[@id=\"home-icon\"]")
	public WebElement home;

	@FindBy(xpath = "//button[text()=\"N�o\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//div[@class=\"title\"][text()=\"Fevereiro, 2021\"]")
	public WebElement febre;
	
	public TarefasExecutarConfiguracaoBFBPO() {

		PageFactory.initElements(driver, this);
	}

	public boolean abrirCalendario() {

		String url = driver.getCurrentUrl();

		boolean tc2 = false;
		boolean td1 = false;
		boolean tp1 = false;
		boolean tq1 = false;

		if (url.contains("tc2")) {
			tc2 = true;
		} else if (url.contains("tp1")) {
			tp1 = true;
		} else if (url.contains("tq1")) {
			tq1 = true;
		} else {
			td1 = true;
		}

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		fechar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		abrirCalendario.click();
		sleep(3000);
		waitExpectedElement("//div[@class=\"day\"][1]");
		sleep(2000);
		
		String tituloS = titulo.getText();
		// System.out.println("Titulo: " + tituloS);

		WebElement setaesquerda = driver
				.findElement(By.xpath("//div[@class=\"left-arrow icon icon-font-Sign-and-Symbols icon-leftmenu\"]"));

		
		boolean calendarMonthString = true;	
		
		while (calendarMonthString)  {
			if(titulo.getText().contentEquals("Fevereiro, 2021")  ) {
				calendarMonthString = false;
			}else {
				setaesquerda.click();
				sleep(2000);
				invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
				sleep(2000);
			}
		}

		WebElement dia18 = driver.findElement(By.xpath("//div[@month=\"1\" and @date=\"18\"]"));
		dia18.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		actionsMoveToElement(pesquisar);
		sleep(2000);
		
		if (tq1==true) {
			
			WebElement menu=driver.findElement(By.xpath("//div[contains(@aria-label,\"943367\")]/div[2]/div"));
			WebElement fazertarefa=driver.findElement(By.xpath("//div[contains(@aria-label,\"943367\")]/div[2]/div/div[2]/ul/li/span[text()=\"Fazer tarefa\"]"));
			actionsMoveToElement(menu);
			sleep(2000);
			menu.click();
			sleep(2000);
			fazertarefa.click();
			sleep(2000);
			
		}else if (tp1 ==true) {
			
			WebElement menu=driver.findElement(By.xpath("//div[contains(@aria-label,\"73064\")]/div[2]/div"));
			WebElement fazertarefa=driver.findElement(By.xpath("//div[contains(@aria-label,\"73064\")]/div[2]/div/div[2]/ul/li/span[text()=\"Fazer tarefa\"]"));
			actionsMoveToElement(menu);
			sleep(2000);
			menu.click();
			sleep(2000);
			fazertarefa.click();
			sleep(2000);
			
		}else {
			
			WebElement menu=driver.findElement(By.xpath("//div[contains(@aria-label,\"6470\")]/div[2]/div"));
			WebElement fazertarefa=driver.findElement(By.xpath("//div[contains(@aria-label,\"6470\")]/div[2]/div/div[2]/ul/li/span[text()=\"Fazer tarefa\"]"));
			actionsMoveToElement(menu);
			sleep(2000);
			menu.click();
			sleep(2000);
			fazertarefa.click();
			sleep(2000);
			
		}
		
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		waitExpectedElement(home);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int botaoNao = rows("//button[text()=\"N�o\"]");
		
		if (botaoNao > 0) {
			nao.click();
		}
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		boolean sucesso=false;
		waitExpectedElement("//div[@class=\"form-wrapper show\"]");
		sleep(2000);
		WebElement totalElement= driver.findElement(By.xpath("//div[@class=\"form-wrapper show\"]"));
		if(totalElement.isDisplayed()) {
			System.out.println("Executado com sucesso");
			sucesso=true;
		}else {
			System.out.println("N�o executado com sucesso");
			sucesso=false;
		}
		System.out.println(sucesso);

		return sucesso;

	}


}
