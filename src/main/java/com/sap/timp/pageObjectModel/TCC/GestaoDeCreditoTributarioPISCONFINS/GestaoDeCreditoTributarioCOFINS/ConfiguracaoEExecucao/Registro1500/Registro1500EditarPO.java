package com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioPISCONFINS.GestaoDeCreditoTributarioCOFINS.ConfiguracaoEExecucao.Registro1500;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBase;

public class Registro1500EditarPO extends TestBase {
	
	@FindBy(xpath = "//span[text()=\"Gest�o de Cr�dito Tribut�rio PIS/COFINS\"]")
	public WebElement gestaoCredito;

	@FindBy(xpath = "//span[text()=\"Gest�o de Cr�dito Tribut�rio COFINS\"]")
	public WebElement gestaocreditocofins;
	

	@FindBy(xpath = "//div[@class=\"left\"]/div/div[2]/ul/li[6]/ul/li[2]/ul/li[1]/div/span[2]")
	public WebElement configuracaoEExecucao;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-register1500\"]")
	public WebElement registro1500;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Origem do Cr�dito\"]")
	public WebElement origem1;
	

	@FindBy(xpath = "//div[@id=\"origCred\"]/div/div[1]/div[2]")
	public WebElement origem;

	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;

	

	@FindBy(xpath = "//li[@id][2]")
	public WebElement opcao;

	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcao1;

	@FindBy(xpath = "//li[@id][3]")
	public WebElement opcaotp1;

	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;

	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;

	@FindBy(xpath = "//button[text()=\"Gravar\"]")
	public WebElement gravar2;

	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;

	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicar;

	@FindBy(xpath = "//button[text()=\"Fechar\"]")
	public WebElement fechar;

	@FindBy(xpath = "//button[text()=\"N�o\"]")
	public WebElement nao;

	@FindBy(xpath = "//div[@id=\"multipleControlerId-SP\"]")
	public WebElement uf1;

	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div[2]")
	public WebElement uftp1;

	@FindBy(xpath = "//div[@id=\"multipleControlerId-BA\"]")
	public WebElement uftp12;

	@FindBy(xpath = "//div[@id=\"multipleControlerId-3000_BA_0031\"]")
	public WebElement filialtp1;
	
	@FindBy(xpath = "//div[@id=\"multipleControlerId-RJ\"]")
	public WebElement uftc2;

	

	@FindBy(xpath = "//div[@id=\"multipleControlerId-1000_SP_0001\"]")
	public WebElement filial1;
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Empresa\"]")
	public WebElement empresa1;

	@FindBy(xpath = "//div[@id=\"multipleControlerId-1010_SP_0003\"]")
	public WebElement filial2;

	@FindBy(xpath = "//div[@id=\"componentToSearchId-1000_SP_0014\"]")
	public WebElement filialtc2;

	@FindBy(xpath = "//div[@id=\"multipleControlerId-1100_RJ_0001\"]")
	public WebElement filialtc21;
	public Registro1500EditarPO() {

		PageFactory.initElements(driver, this);
	}

	public boolean editar() {

		String url = driver.getCurrentUrl();

		boolean tc2 = false;
		boolean tp1 = false;
		boolean tq1 = false;
		if (url.contains("tc2")) {
			tc2 = true;
		} else if (url.contains("tp1")) {
			tp1 = true;
		} else {
			tq1 = true;
		}

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		gestaoCredito.click();
		sleep(2000);
		gestaocreditocofins.click();
		sleep(2000);
		configuracaoEExecucao.click();
		sleep(2000);
		registro1500.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String idRegistro = idObter("GestaoCr�ditoTribut�rioCOFINSRegistro1500");
		System.out.println("ID Registro: " + idRegistro);

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		WebElement editar = driver.findElement(
				By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		actionsMoveToElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		editar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		sleep(2000);
		if (tp1 == true || tq1 == true) {

			waitExpectedElement(uf1);
			sleep(2000);
			waitExpectedElement(filial1);
			origem.click();
			sleep(1000);
			opcao.click();
			sleep(1000);

			String origemtexto = origem1.getAttribute("value");
			System.out.println("Origem antes de atualizar:" + origemtexto);


			gravar.click();
			sleep(2000);
			waitExpectedElement(sim);
			sim.click();
			sleep(2000);
			waitExpectedElement(biblioteca);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

			driver.navigate().refresh();

			sleep(2000);
			waitExpectedElement(biblioteca);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			waitExpectedElement(uf1);
			sleep(2000);
			waitExpectedElement(filial1);
			sleep(2000);

			String origematualizada = origem1.getAttribute("value");
			System.out.println("Indicador p�s atualizar:" + origematualizada);
			boolean sucesso = false;
			sucesso = origemtexto.contains(origematualizada);
			
			System.out.println(sucesso);

			return sucesso;

		} else {
			
				waitExpectedElement(uf1);
				sleep(2000);
				waitExpectedElement(filialtc2);
				origem.click();
				sleep(1000);
				opcao.click();
				sleep(1000);

				String origemtexto = origem1.getAttribute("value");
				System.out.println("Origem antes de atualizar:" + origemtexto);

				
				gravar.click();
				sleep(2000);
				waitExpectedElement(sim);
				sim.click();
				sleep(2000);
				waitExpectedElement(biblioteca);
				invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
				sleep(2000);

				driver.navigate().refresh();

				sleep(2000);
				waitExpectedElement(biblioteca);
				invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
				sleep(2000);
				waitExpectedElement(uf1);
				sleep(2000);
				waitExpectedElement(filialtc2);
				sleep(2000);
				
				String origematualizada = origem1.getAttribute("value");
				System.out.println("Indicador p�s atualizar:" + origematualizada);
				boolean sucesso = false;
				sucesso = origemtexto.contains(origematualizada);
			
				System.out.println(sucesso);

				return sucesso;
			
		}
	}

}
