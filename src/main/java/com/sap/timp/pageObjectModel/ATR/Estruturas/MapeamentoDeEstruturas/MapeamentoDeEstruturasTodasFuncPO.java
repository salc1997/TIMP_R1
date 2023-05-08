package com.sap.timp.pageObjectModel.ATR.Estruturas.MapeamentoDeEstruturas;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class MapeamentoDeEstruturasTodasFuncPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Mapeamento de Estruturas\"]")
	public WebElement mapeamentodeestruturas;
	
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	@FindBy(xpath = "//span[text()=\"Novo Mapeamento\"]")
	public WebElement novo;
	
	@FindBy(xpath = "//div[@class=\"input structureMap\"]/div/div[2]")
	public WebElement estruturadedados;
	
	@FindBy(xpath = "//li[@id][text()=\"Ajustes Fiscais\"]")
	public WebElement opcaoestrutura;
	
	@FindBy(xpath = "//div[@class=\"input companyMap\"]/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//li[@id][text()=\"Código da empresa\"]")
	public WebElement opcaoempresa;
	
	@FindBy(xpath = "//div[@class=\"input ufMap\"]/div/div[2]")
	public WebElement ufdafilial;
	
	@FindBy(xpath = "//li[@id][text()=\"UF da filial\"]")
	public WebElement opcaoufdafilial;
	
	
	@FindBy(xpath = "//div[@class=\"input branchMap\"]/div/div[2]")
	public WebElement filial;
	
	@FindBy(xpath = "//li[@id][text()=\"Código da filial\"]")
	public WebElement opcaofilial;
	
	@FindBy(xpath = "//div[@class=\"input dataMap\"]/div/div/div[2]")
	public WebElement data;
	
	@FindBy(xpath = "//div[@class=\"list-item-text\"][text()=\"Data de lançamento de Ajuste\"]")
	public WebElement opcaodata;
	
	@FindBy(xpath = "//div[@class=\"input taxMap\"]/div/div/div[2]")
	public WebElement tributo;
	
	@FindBy(xpath = "//div[@class=\"list-item-text\"][text()=\"ICMS\"]")
	public WebElement opcaotributo;
	
	@FindBy(xpath = "//div[@class=\"list-item-text\"][text()=\"COFINS\"]")
	public WebElement opcaotributo1;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a Data de Inicio de Vigência\"]")
	public WebElement datainicio;

	@FindBy(xpath = "//input[@placeholder=\"Selecione a Data de Fim de Vigência\"]")
	public WebElement datafim;
	@FindBy(xpath = "//button[text()=\"Gravar\"]")
	public WebElement gravar;
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement Gravar;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Cancelar\"]")
	public WebElement cancelar;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	@FindBy(xpath = "//div[@id=\"multipleControlerId-05\"]")
	public WebElement cofins;
	
	@FindBy(xpath = "//div[@class=\"input structureMap\"]/div/div/div/input")
	public WebElement estruturadedadosvi;
	
	@FindBy(xpath = "//div[@class=\"input companyMap\"]/div/div/input")
	public WebElement empresavi;
	@FindBy(xpath = "//div[@class=\"input ufMap\"]/div/div/input")
	public WebElement uffiliavi;
	
	@FindBy(xpath = "//div[@class=\"input branchMap\"]/div/div/input")
	public WebElement filialvi;
	
	@FindBy(xpath = "//div[@id=\"multipleControlerId-DT_LANC\"]")
	public WebElement datavi;
	
	@FindBy(xpath = "//div[@id=\"multipleControlerId-00\"]")
	public WebElement tributoicmsvi;
	

	@FindBy(xpath = "//div[contains(@class,\"taxMap\")]/div/div/div/div/div/div[@class=\"componentName\"]")

	public WebElement tributocofinsvi;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a Data de Inicio de Vigência\"]")
	public WebElement datainiciovi;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a Data de Fim de Vigência\"]")
	public WebElement datafimvi;
	
	@FindBy(xpath = "//div[@class=\"input ufMap\"]/div/div/input")
	public WebElement uffilia;
	
	@FindBy(xpath = "//div[@id=\"multipleControlerId-00\"]")
	public WebElement tributoicms;
	
	//filtro ID
	

	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")
	public WebElement id;

	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//button/span[text()=\"Limpar Filtros\"]")
	public WebElement limpar;
	
	// Excluir em Massa
	

	@FindBy(xpath = "//div[@class=\"input structureMap\"]//div//div[@id=\"main-icon\"]")
	public WebElement estruturaDados;
	
	@FindBy(xpath = "//li[text()=\"Ajustes Fiscais\"][1]")
	public WebElement opcEstruturaDados;
	
	@FindBy(xpath = "//li[text()=\"Código da empresa\"][1]")
	public WebElement opcEmpresa;
	
	@FindBy(xpath = "//div[@class=\"input ufMap\"]//div//div[@id=\"main-icon\"]")
	public WebElement UF;
	
	@FindBy(xpath = "//li[text()=\"UF da filial\"][1]")
	public WebElement opcUF;
	
	@FindBy(xpath = "//li[text()=\"Código da filial\"][1]")
	public WebElement opcFilial;
	
	@FindBy(xpath = "//*[@id=\"DT_LANC\"]/div[1]/label/span")
	public WebElement opcData;
	
	@FindBy(xpath = "//*[@id=\"30\"]/div[1]/label/span")
	public WebElement opctributo;
	
	@FindBy(xpath = "//*[@id=\"createMapping\"]/div/div[2]/div[14]/div[2]/div/div[1]/input")
	public WebElement dataInicio;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a Data de Fim de Vigência\"]")
	public WebElement dataFim;
	
	@FindBy(xpath = "//*[@id=\"23\"]/div[1]/label/span")
	public WebElement opctributodos;
	
	@FindBy(xpath = "//*[@id=\"05\"]/div[1]/label/span")
	public WebElement opctributodosTC2;
	
	@FindBy(xpath = "//button/span[contains(@class,\"icon-persign\")]")
	public WebElement excluirMassa;
	
	@FindBy(xpath = "//div[@class=\"input companyMap\"]/div/div/input")
	public WebElement empresaE;
	@FindBy(xpath = "//div[@class=\"input ufMap\"]/div/div/input")
	public WebElement uffiliaE;
	
	@FindBy(xpath = "//div[@class=\"input branchMap\"]/div/div/input")
	public WebElement filialE;
	
	@FindBy(xpath = "//div[@id=\"multipleControlerId-DT_LANC\"]")
	public WebElement dataE;
	
	@FindBy(xpath = "//div[@id=\"multipleControlerId-00\"]")
	public WebElement tributoicmsE;
	
	@FindBy(xpath = "//div[contains(@class,\"taxMap\")]/div/div/div/div/div/div[@class=\"componentName\"]")
	public WebElement tributocofins;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a Data de Inicio de Vigência\"]")
	public WebElement datainicioE;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a Data de Fim de Vigência\"]")
	public WebElement datafimE;
	
	@FindBy(xpath = "//div[@class=\"input structureMap\"]/div/div/div/input")
	public WebElement estruturadedadosE;
	
	public MapeamentoDeEstruturasTodasFuncPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		mapeamentodeestruturas.click();
	
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(ultimapagina);
		sleep(2000);
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		System.out.println("Ultimo registro: " + id);
		
		novo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	
		estruturadedados.click();
		sleep(2000);
		opcaoestrutura.click();
		sleep(6000);
		
		empresa.click();
		sleep(2000);
		opcaoempresa.click();
		sleep(2000);
		ufdafilial.click();
		sleep(2000);
		opcaoufdafilial.click();
		sleep(2000);
		filial.click();
		sleep(2000);
		opcaofilial.click();
		sleep(2000);
		data.click();
		sleep(2000);
		opcaodata.click();
		closeSelectTypeCheckbox(data);
		sleep(2000);
		actionsMoveToElementXpath("//input[@placeholder=\"Selecione a Data de Inicio de Vigência\"]");
		tributo.click();
		sleep(2000);
		opcaotributo.click();
		closeSelectTypeCheckbox(tributo);
		sleep(2000);
		datainicio.sendKeys("02/01/1978");
		datafim.sendKeys("01/01/1979");
		gravar.click();

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		
		mapeamentodeestruturas.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(ultimapagina);
		sleep(2000);
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();	

		String idultimo = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		idInserir("MapeamentoDeEstruturasCriar",idultimo);

		System.out.println(id);
		System.out.println(idultimo);
		double idD = convertToDouble(id);
		double idBD = convertToDouble(idultimo);
		
		boolean sucesso = false;
		if (idBD > idD) {
			sucesso = true;
		}else {
			sucesso = false;
		}
		System.out.println(sucesso);
		return sucesso;
	}
	public ArrayList<Boolean> criarcopia() {
		
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String idRegistro = idObter("MapeamentoDeEstruturasCriar");

		System.out.println("Ultimo registro: " + idRegistro);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		WebElement copia = driver.findElement(
				By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Cópia\"]"));

		actionsMoveToElementElement(menu);
		sleep(2000);

		menu.click();
		sleep(1000);
		copia.click();
		sleep(5000);

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		actionsMoveToElementXpath("//input[@placeholder=\"Selecione a Data de Inicio de Vigência\"]");

		datainicio.clear();
		sleep(2000);
		String enviar ="02/01/1976";
		String enviar1 = "01/01/1977";
		datainicio.sendKeys(enviar);
		sleep(1000);
		datafim.clear();
		sleep(2000);
		datafim.sendKeys(enviar1);
		sleep(2000);
		gravar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(9000);

		mapeamentodeestruturas.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(ultimapagina);
		sleep(2000);
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		int rows = driver
				.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]"))
				.size();

		String idultimo = driver.findElement(By.xpath(
				"//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][" + rows + "]/div[3]/div"))
				.getText();


		System.out.println(idRegistro);
		System.out.println(idultimo);
		double idD = convertToDouble(idRegistro);
		double idBD = convertToDouble(idultimo);

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		if (idBD > idD) {
			System.out.println("É o id que foi criado");
			sucesso.add(true);
		} else {
			System.out.println("Não é o id criado");
			sucesso.add(false);
		}
		menu = driver.findElement(By.xpath("//div[@data-id=\"" + idultimo + "\"]/div[1]/div"));
		WebElement editar = driver.findElement(
				By.xpath("//div[@data-id=\"" + idultimo + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));

		actionsMoveToElementElement(menu);
		sleep(2000);

		menu.click();
		sleep(1000);
		editar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");

		sleep(6000);


		String data  = datainicio.getAttribute("value");
		String data1 = datafim.getAttribute("value");
		
		
		System.out.println(data);
		System.out.println(data1);

		sucesso.add(data.equals(enviar));
		sucesso.add(data1.contains(enviar1));
		

		sleep(5000);
		
		int cofins = driver.findElements(By.xpath("//div[@id=\"multipleControlerId-05\"]")).size();

		if (cofins == 0) {
			System.out.println("Cofins não consta na edição");
			sucesso.add(true);
		} else {
			System.out.println("Cofins  consta na edição");
			sucesso.add(false);
		}


		cancelar.click();
		sleep(2000);
		
		menu = driver.findElement(By.xpath("//div[@data-id=\"" + idultimo + "\"]/div[1]/div"));
		WebElement excluir = driver.findElement(
				By.xpath("//div[@data-id=\"" + idultimo + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));

		actionsMoveToElementElement(menu);
		sleep(2000);

		menu.click();
		sleep(1000);
		excluir.click();
		
		sleep(2000);
		waitExpectElement(aceitar);
		sleep(2000);
		aceitar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		mapeamentodeestruturas.click();
		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(ultimapagina);
		sleep(2000);
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		int exclusão = driver.findElements(By.xpath("//div[@data-id=\"" + idultimo + "\"]/div[2]/div")).size();

		if (exclusão == 0) {
			System.out.println("Registro não consta na biblioteca");
			sucesso.add(true);
		} else {
			System.out.println("Registo consta na biblioteca");
			sucesso.add(false);
		}
		System.out.println(sucesso);

		return sucesso;
	}
	
	public ArrayList<Boolean> editar() {
		
		
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("MapeamentoDeEstruturasCriar");
		
		System.out.println("Ultimo registro: " + idRegistro);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);

		menu.click();
		sleep(1000);
		editar.click();
		sleep(2000);
		
	
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		actionsMoveToElementXpath("//input[@placeholder=\"Selecione a Data de Inicio de Vigência\"]");
		sleep(8000);
		
		tributo.click();
		sleep(2000);
		opcaotributo1.click();
		closeSelectTypeCheckbox(tributo);
		sleep(6000);
		String enviar = "02/01/1977";
		datainicio.clear();
		sleep(2000);
		datainicio.sendKeys(enviar);
		sleep(1000);
		
		gravar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
		
		mapeamentodeestruturas.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(ultimapagina);
		sleep(2000);
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		 menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		 editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);

		menu.click();
		sleep(1000);
		editar.click();
		
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		String data = datainicio.getAttribute("value");
		String tributocofins = cofins.getText();
		String enviar1 = "COFINS";
		
		System.out.println(data);
		System.out.println(tributocofins);
		
		sucesso.add(data.equals(enviar));
		sucesso.add(tributocofins.contains(enviar1));
		
		System.out.println(sucesso);
		
		cancelar.click();
		sleep(2000);
		return sucesso;
	}
	public ArrayList<Boolean> visualizar() {
		
		System.out.println("-----Visualizar----");
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(5000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("MapeamentoDeEstruturasCriar");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement ver = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Ver\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		
		ver.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(8000);
		
		String estruturadadosvisualizar = estruturadedadosvi.getAttribute("value");
		String empresavisualizar = empresavi.getAttribute("value");
		String uffilialvisualizar = uffiliavi.getAttribute("value");
		String filialvisualizar = filialvi.getAttribute("value");
		String datavisualizar = datavi.getText();
		String tributoicmsvisualizar = tributoicmsvi.getText();
		String tributocofinsvisualizar = tributocofinsvi.getText();
		String datainiciovisualizar = datainiciovi.getAttribute("value");
		String datafimvisualizar = datafimvi.getAttribute("value");
		
		System.out.println(estruturadadosvisualizar);
		System.out.println(empresavisualizar);
		System.out.println(uffilialvisualizar);
		System.out.println(filialvisualizar);
		System.out.println(datavisualizar);
		System.out.println(tributoicmsvisualizar);
		System.out.println(tributocofinsvisualizar);
		System.out.println(datainiciovisualizar);
		System.out.println(datafimvisualizar);
		
		aceitar.click();
		sleep(2000);
		waitExpectElement(ultimapagina);
		sleep(2000);
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro1 = idObter("MapeamentoDeEstruturasCriar");
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(1000);
		
		editar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");

	    sleep(12000);

	    
	    String estruturadadoseditar = estruturadedadosE.getAttribute("value");
		String empresaeditar = empresaE.getAttribute("value");
		String uffilialeditar = uffiliaE.getAttribute("value");
		String filialeditar = filialE.getAttribute("value");
		String dataeditar = dataE.getText();
		String tributoicmseditar = tributoicmsE.getText();
		//String tributocofinseditar = tributocofins.getText();
		String datainicioeditar = datainicioE.getAttribute("value");
		String datafimeditar = datafimE.getAttribute("value");
		
		System.out.println(estruturadadoseditar);
		System.out.println(empresaeditar);
		System.out.println(uffilialeditar);
		System.out.println(filialeditar);
		System.out.println(dataeditar);
		System.out.println(tributoicmseditar);
	//	System.out.println(tributocofinseditar);
		System.out.println(datainicioeditar);
		System.out.println(datafimeditar);
	  
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(estruturadadoseditar.contains(estruturadadosvisualizar));
		sucesso.add(empresaeditar.contains(empresavisualizar));
		sucesso.add(uffilialeditar.contains(uffilialvisualizar));
		sucesso.add(filialeditar.contains(filialvisualizar));
		sucesso.add(dataeditar.contains(datavisualizar));
		sucesso.add(tributoicmseditar.contains(tributoicmsvisualizar));
		//sucesso.add(tributocofinseditar.contains(tributocofinsvisualizar));
		sucesso.add(datainicioeditar.contains(datainiciovisualizar));
		sucesso.add(datafimeditar.contains(datafimvisualizar));

		
		System.out.println(sucesso);
		
		cancelar.click();
		sleep(2000);
		return sucesso;
	
	}
	public ArrayList<Boolean> filtro() {

		String idRegistro = id.getText();
		System.out.println(idRegistro + " Id Registro");
		pesquisar.sendKeys(idRegistro);
		pesquisar.sendKeys(Keys.ENTER);
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String idBusqueda = id.getText();
		System.out.println(idBusqueda + " Id Busqueda");
		
		int rows1 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(idRegistro.equals(idBusqueda));
		
		limpar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows2 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		if (rows2 > rows1) {
			sucesso.add(true);
		}else {
			sucesso.add(false);
		}
		
		
		System.out.println(sucesso);

		return sucesso;

	}
	public boolean excluir() {

		sleep(2000);
		ultimapagina.click();

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		// pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("MapeamentoDeEstruturasCriar");

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		WebElement excluir = driver.findElement(
				By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));

		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		excluir.click();
		sleep(2000);
		waitExpectElement(aceitar);
		sleep(2000);
		aceitar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		mapeamentodeestruturas.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(ultimapagina);
		sleep(2000);
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		boolean sucesso = false;

		int exclusão = driver.findElements(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[2]/div")).size();

		if (exclusão == 0) {
			System.out.println("Registro não consta na biblioteca");
			sucesso = true;
		} else {
			System.out.println("Registo consta na biblioteca");
			sucesso = false;
		}
		System.out.println(sucesso);
		return sucesso;
		
	}
	
	public ArrayList<Boolean> criarMassa() {	
		
		mapeamentodeestruturas.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(ultimapagina);
		sleep(2000);
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = rows("//div[@class=\"tr\" and @data-id]");
		
		String idAC = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[3]/div")).getText();
		System.out.println("Id antes da criação: " + idAC);
	
		
		novo.click();
		sleep(3000);
		waitExpectElement(estruturaDados);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		estruturaDados.click();
		sleep(1000);
		opcEstruturaDados.click();
		sleep(6000);

		
		empresa.click();
		sleep(1000);
		opcEmpresa.click();
		sleep(1000);
		
		UF.click();
		sleep(1000);
		opcUF.click();
		sleep(1000);
		
		filial.click();
		sleep(1000);
		opcFilial.click();
		sleep(1000);

		
		data.click();
		sleep(1000);
		opcData.click();
		sleep(1000);
		closeSelectTypeCheckbox(data);
		sleep(1000);
		
		tributo.click();
		sleep(2000);
		opctributo.click();

		sleep(5000);
		closeSelectTypeCheckbox(tributo);
		sleep(2000);

		dataInicio.sendKeys("02/01/1978");
		sleep(2000);
		
		dataFim.sendKeys("31/12/1979");
		sleep(5000);
		
		gravar.click();
		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
		novo.click();
		sleep(2000);
		waitExpectElement(estruturaDados);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		estruturaDados.click();
		sleep(1000);
		opcEstruturaDados.click();
		sleep(3000);

		
		empresa.click();
		sleep(1000);
		opcEmpresa.click();
		sleep(1000);
		
		UF.click();
		sleep(1000);
		opcUF.click();
		sleep(1000);
		
		filial.click();
		sleep(1000);
		opcFilial.click();
		sleep(1000);

		
		data.click();
		sleep(1000);
		opcData.click();
		sleep(1000);
		closeSelectTypeCheckbox(data);
		sleep(1000);
		
		tributo.click();
		sleep(4000);
		
		String url = driver.getCurrentUrl();
		
		boolean tc2 = false;
		
		if (url.contains("tc2")) {
			tc2 = true;
		}
		
		if (tc2==true) {
			opctributodosTC2.click();
			closeSelectTypeCheckbox(tributo);
			sleep(1000);
			
		}else {
			opctributodos.click();
			closeSelectTypeCheckbox(tributo);
			sleep(1000);
		}
		

	
		
		dataInicio.sendKeys("02/01/1978");
		sleep(1000);
		
		dataFim.sendKeys("31/12/1979");
		sleep(5000);
		
		gravar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		ultimapagina.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		rows = rows("//div[@class=\"tr\" and @data-id]");
		
		String idDC = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[3]/div")).getText();
		System.out.println("Id após da criação: " + idDC);
		idInserir1(idDC);
		
		int idACI = convertToInt(idAC);
		int idADI = convertToInt(idDC);
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (idACI < idADI) {
			sucesso.add(true);
		} else {
			sucesso.add(false);
		}
		
		System.out.println("Id criado com sucesso: " +sucesso.get(0));
		
		System.out.println("---------------------------Verificação das Informações-------------------------------------------");
		
		String estrutura1S =driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[4]/div")).getText();
	
		System.out.println(estrutura1S);

		sucesso.add(estrutura1S.equals("Ajustes Fiscais"));

		System.out.println(sucesso);
		
		return sucesso;
	}
	
	
	  public boolean excluirMassa() {
	  
	  int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
	  
	  String idRegistro1 = driver.findElement(By.	  xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
	  WebElement check1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/label/span")); 
	  
	  check1.click();
	  sleep(1000);
	  rows = rows-1;
	  
	  String idRegistro2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
	  WebElement check2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/label/span"));
	  
	  check2.click();
	  
	  sleep(1000);
	  
	  excluirMassa.click();
	  sleep(1000);
	  waitExpectElement(aceitar);
	  sleep(1000);
	  aceitar.click();
	  sleep(3000);
	  invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	  sleep(3000);
	  
	  driver.navigate().refresh(); 
	  sleep(3000);
	  invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	  waitExpectElement(ultimapagina); 
	  sleep(2000);
	  
	  mapeamentodeestruturas.click();
	  sleep(2000);
	  invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	  sleep(2000);
	  
	  ultimapagina.click(); 
	  sleep(2000);
	  invisibilityOfElement("//div[@class=\"overlay loader dark\"]"); 
	  sleep(2000);
	  
	  rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size(); 
	  String id = "0";
	  
	  if(rows > 0) { 
		  id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText(); 
		  System.out.println(id); 
	  }
	  
//	  rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();  
//	  String id4 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][" +rows+"]/div[3]/div")).getText();
	  
	  int id1 = convertToInt(id); 
	  int id2 = convertToInt(idRegistro1); 
	  int id3 = convertToInt(idRegistro2);
	  
	  System.out.println(" Id Ultimo Registro: "+ id1);
	  System.out.println("Id Excluir Registro 1: " + id2);
	  System.out.println("Id Excluir Registro 2: " + id3);
	  
	  boolean sucesso = false;
	  
	  if (id1 != id2 && id1!=id3) { sucesso = true; }else { sucesso=false; }
	  
	  return sucesso;
	  
	  }
}
