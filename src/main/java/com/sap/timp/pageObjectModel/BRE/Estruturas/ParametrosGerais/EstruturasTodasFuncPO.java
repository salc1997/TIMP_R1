package com.sap.timp.pageObjectModel.BRE.Estruturas.ParametrosGerais;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBase;

public class EstruturasTodasFuncPO extends TestBase{
	

	@FindBy(xpath = "//span[@class=\"baseTabs-title\"]/span[text()=\"Estruturas\"]")
	public WebElement estruturas;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	@FindBy(xpath = "//span[text()=\"Nova Estrutura\"]")
	public WebElement novaestrutura;
	
	
	@FindBy(xpath = "//div[@id=\"structure-group\"]/div/div/div[2]")
	public WebElement grupodeestrutura;
	
	@FindBy(xpath = "//li[@class=\"list-item\" and text()=\"Ajuste\"][1]")
	public WebElement opcaogrupodeestrutura;
	
	@FindBy(xpath = "//li[@id][text()=\"Ajustes\"][1]")
	public WebElement opcaogrupodeestruturatp1;
	
	@FindBy(xpath = "//div[@id=\"structure-validation\"]/div/div/div[2]")
	public WebElement estruturadevalidacao;
	
	@FindBy(xpath = "//li[@id][text()=\"Empresa / Filial\"]")
	public WebElement opcaoestruturadevalidacao;
	
	@FindBy(xpath = "//li[@id][text()=\"Empresa / Filial\"]")
	public WebElement opcaoestruturadevalidacaoTQ1;
	
	@FindBy(xpath = "//li[@id][text()=\"Ajustes Fiscais + Empresa/Filial\"]")
	public WebElement opcaoestruturadevalidacaotp1;
	
	@FindBy(xpath = "//li[@id][text()=\"Ajustes Fiscais\"]")
	public WebElement outraestruturadevalidacao;
		
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicar;
	
	@FindBy(xpath = "//span[text()=\"Adicionar Caminho\"]")
	public WebElement adicionarcaminho;
	
	@FindBy(xpath = "//div[@class=\"select-one\"]/div/div[2]")
	public WebElement Condicoes;
	
	@FindBy(xpath = "//li[@id][text()=\"Alíquota ICMS (ED)\"]")
	public WebElement opcaoCondicoes;
	
	@FindBy(xpath = "//div[@class=\"select-three\"]/div/div/div[2]/div/div[2]")
	public WebElement Operador;
	
	@FindBy(xpath = "//div[@id]/div[text()=\"<\"]")
	public WebElement opcaoOperador;
	
	@FindBy(xpath = "//div[@class=\"value-one\"]/div/div[2]")
	public WebElement NomeDoValor;
	
	@FindBy(xpath = "//li[@id][text()=\"BC ICMS (ED)\"]")
	public WebElement opcaoNomeDoValor;
	
	@FindBy(xpath = "//div[@class=\"action-section\"]/div/div/div/div/input")
	public WebElement acoes;
	
	@FindBy(xpath = "//span[text()=\"Justificativa\"]")
	public WebElement Justificactiva;
	
	@FindBy(xpath = "//div[@id=\"justification\"]/div/textarea")
	public WebElement justificativa;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	@FindBy(xpath = "//div[@id=\"graph\"]")
	public WebElement regla;
	
	@FindBy(xpath = "//button[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;

	@FindBy(xpath = "//span[@id=\"textLabel\"]")
	public WebElement mensagemdesalvo;
	
	@FindBy(xpath = "//div[@id=\"structure-group\"]/div/div/div/input")
	public WebElement grupoed;
	
	@FindBy(xpath = "//div[@id=\"structure-validation\"]/div/div/div/input")
	public WebElement estruturaed;
	
	@FindBy(xpath = "//div[@id=\"structure-group\"]/div/div/div/input")
	public WebElement grupovi;
	
	@FindBy(xpath = "//div[@id=\"structure-validation\"]/div/div/div/input")
	public WebElement estruturavi;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Voltar\"]")
	public WebElement voltar;
	
	@FindBy(xpath = "//div[@class=\"structure-select\"]/div/div/div[2]")
	public WebElement filtrosEstructura;
	
	@FindBy(xpath = "//li[text()=\"18 - Ajustes Fiscais\"]")
	public WebElement filtrosEstructuraopc;
	
	@FindBy(xpath = "//li[text()=\"18 - Ajustes Fiscais\"]")
	public WebElement filtrosEstructuraopc1;
	
	@FindBy(xpath = "//button/span[text()=\"Limpar Filtros\"]")
	public WebElement limpar;
	
	@FindBy(xpath = "//button/span[text()=\"Filtros Avançados\"]")
	public WebElement filtros;
	
	public EstruturasTodasFuncPO() {
		PageFactory.initElements(driver, this);
	}
	
	
	public ArrayList<Boolean> criar() {
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		estruturas.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		//String	id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		//System.out.println("Ultimo registro: " + id);
	
		
		novaestrutura.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String url = driver.getCurrentUrl();
		
		boolean tc2 = false;
		boolean td1 = false;
		boolean tp1 = false;
		boolean tq1 = false;
		boolean tq2 = false;
		if (url.contains("tc2")) {
			tc2 = true;
		}else if (url.contains("tp1")) {
			tp1 = true;
		}else if (url.contains("tq1")) {
			tq1 = true;
		}else  if (url.contains("tq2")) {
			tq2 = true;
		}else {
			td1 = true;
		}
		
		if(tp1 == true) {
			grupodeestrutura.click();
			sleep(1000);
			opcaogrupodeestruturatp1.click();
			sleep(1000);
		}else {
			grupodeestrutura.click();
			sleep(2000);
			actionsMoveToElement("//li[@class=\"list-item\" and text()=\"Ajuste\"][1]");
			opcaogrupodeestrutura.click();
			sleep(1000);
		}
		
		estruturadevalidacao.click();
		sleep(6000);
		if(tp1 == true) {
			opcaoestruturadevalidacaotp1.click();
			sleep(2000);
		}else if (tq1 == true) {
			opcaoestruturadevalidacaoTQ1.click();
			sleep(2000);
		}else if (tq2 == true) {
			opcaoestruturadevalidacaoTQ1.click();
			sleep(2000);
		}else {
			opcaoestruturadevalidacao.click();
			sleep(2000);
		}
		waitExpectedElement(gravar);
		sleep(2000);
		gravar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		boolean sucesso1=false;
		/*	if(mensagemdesalvo.isDisplayed())
		{
			sucesso1=true;
			sucesso.add(sucesso1);
		}else {
			sucesso1=false;
			sucesso.add(sucesso1);
		}*/
		
		sleep(2000);
		
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String idRegistro = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		idInserir("EstructurasParametrosGerais", idRegistro);
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"list-check_"+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\"list-check_"+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElement(menu);
		sleep(2000);

		menu.click();
		sleep(1000);
		editar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		attributeToBe("//div[@id=\"structure-validation\"]/div", "class", "base-select required");
		estruturadevalidacao.click();
		sleep(2000);
		outraestruturadevalidacao.click();
		sleep(2000);
		
		String grupoeditar = grupoed.getAttribute("value");
		String estruturaeditar = estruturaed.getAttribute("value");
		
		System.out.println(grupoeditar);
		System.out.println(estruturaeditar);
		
		aplicar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		boolean sucesso2=false;
		if(mensagemdesalvo.isDisplayed())
		{
			sucesso2=true;
			sucesso.add(sucesso2);
		}else {
			sucesso2=false;
			sucesso.add(sucesso2);
		}
		
	
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\"list-check_"+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\"list-check_"+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualização\"]"));
		
		actionsMoveToElement(menu1);
		sleep(2000);

		menu.click();
		sleep(1000);
		visualizar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(8000);
		
		String grupovisualizar = grupovi.getAttribute("value");
		String estruturavisualizar = estruturavi.getAttribute("value");
		
		System.out.println(grupovisualizar);
		System.out.println(estruturavisualizar);
		
		sucesso.add(grupovisualizar.contains(grupoeditar));
		sucesso.add(estruturavisualizar.contains(estruturaeditar));
		
		voltar.click();
		sleep(1000);
		
		System.out.println(sucesso);
		return sucesso;
	}
	
	public ArrayList<Boolean> excluir() {
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		estruturas.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String idRegistro = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"list-check_"+idRegistro+"\"]/div[1]/div"));
		WebElement excluir = driver.findElement(By.xpath("//div[@data-id=\"list-check_"+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));

		actionsMoveToElement(menu);
		sleep(2000);

		menu.click();
		sleep(1000);
		excluir.click();
		sleep(2000);
		waitExpectedElement(sim);
		sim.click();
		sleep(2000);


		driver.navigate().refresh();
		waitExpectedElement(ultimapagina);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		estruturas.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		double id1 = convertToInt(id);
		double id2 = convertToInt(idRegistro);
		System.out.println(id1);
		System.out.println(id2);
		
		
		if (id1 != id2) {
			boolean sucesso1=true;
			sucesso.add(sucesso1);
		}
	
		
		System.out.println(sucesso);
		return sucesso;
	}
	public ArrayList<Boolean> Estructura() {

		String url = driver.getCurrentUrl();
		
		sleep(2000);
		estruturas.click();
		sleep(2000);

		
		filtros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);

	//	waitExpectElement(filtrosEstructura);
		sleep(13000);
		
		 filtrosEstructura.click();
		 sleep(2000);
	
		 String estructuraText;
		 
		 if (url.contains("tc2")==true || url.contains("tp1")==true) {
				
			 estructuraText = filtrosEstructuraopc1.getText();
			 filtrosEstructuraopc1.click();
			 sleep(2000);	
			 
			}else {
				estructuraText = filtrosEstructuraopc.getText();
				filtrosEstructuraopc.click();
				sleep(2000);

			}
		 
		 
		 
		 	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

			ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
			
			
			int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
			int f = 1;
			for (int i = 0; i < rows; i++) {

				String textFiltroestructura = driver
						.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
								+ rows + "]/div[5]/div"))
						.getText();
				System.out.println(textFiltroestructura + " estructura Filtro");
				System.out.println(estructuraText);
				
				sucesso.add(( estructuraText).equals(textFiltroestructura));

				f = f + 1;
			}
			
			sleep(2000);
			limpar.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);	
			System.out.println(sucesso);

			return sucesso;
		
	}


}
