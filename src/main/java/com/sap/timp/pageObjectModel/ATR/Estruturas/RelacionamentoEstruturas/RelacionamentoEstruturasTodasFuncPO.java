package com.sap.timp.pageObjectModel.ATR.Estruturas.RelacionamentoEstruturas;


import java.net.URL;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBase;
import com.sap.timp.base.TestBase;

public class RelacionamentoEstruturasTodasFuncPO extends TestBase{

					 
	@FindBy(xpath = "//span[text()=\"Relacionamentos de Estruturas\"]")
	public WebElement relacionamentoEstruturas;
	
	@FindBy(xpath = "//span[contains(text(),\"Nov\")]")
	public WebElement novo;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//div[@class=\"group1-select\"]/div/div/div[2]")
	public WebElement grupo1;
	
	@FindBy(xpath = "//li[text()=\"Ajustes Fiscais\"][1]")
	public WebElement grupo1O;
	
	@FindBy(xpath = "//div[@class=\"structure1-select\"]/div/div/div[2]")
	public WebElement estrutura1;
	
	@FindBy(xpath = "//li[text()=\"Ajustes Fiscais\"][1]")
	public WebElement estrutura1O;
	
	@FindBy(xpath = "//div[@class=\"field-wrapper field1\"]/div/div[2]")
	public WebElement campoEstrutura1;
	
	@FindBy(xpath = "//li[text()=\"Código da filial\"][1]")
	public WebElement campoEstrutura1O;
	
	
	
	//segunda
	
	@FindBy(xpath = "//button[text()=\"Gravar\"]")
	public WebElement gravar;

	@FindBy(xpath = "//div[@class=\"group2-select\"]/div/div/div[2]")
	public WebElement grupo2;

	@FindBy(xpath = "//li[text()=\"Empresa/Filial 1\"][1]")
	public WebElement grupo2OTQ1;
	
	@FindBy(xpath = "//li[text()=\"Empresa Filial\"][1]")
	public WebElement grupo2O;
	
	@FindBy(xpath = "//div[@class=\"structure2-select\"]/div/div/div[2]")
	public WebElement estrutura2;
	
	@FindBy(xpath = "//li[text()=\"Dados de Empresa/Filial\"][1]")
	public WebElement estrutura2O;
	
	@FindBy(xpath = "//div[@class=\"field-wrapper field2\"]/div/div[2]")
	public WebElement campoEstrutura2;
	
	@FindBy(xpath = "//li[text()=\"Código da filial\"][1]")
	public WebElement campoEstrutura2O;
	
	
	@FindBy(xpath = "//div[@class=\"fieldRow-wrapper\"][2]/div/div[1]/div/div[2]")
	public WebElement campoEstrutura3;
	
	@FindBy(xpath = "//li[text()=\"UF da filial\"][1]")
	public WebElement campoEstrutura3O;
	
	@FindBy(xpath = "//div[@class=\"fieldRow-wrapper\"][2]/div/div[2]/div/div[2]")
	public WebElement campoEstrutura4;
	
	@FindBy(xpath = "//li[text()=\"UF da filial\"][1]")
	public WebElement campoEstrutura4O;
	
	
	@FindBy(xpath = "//div[@id=\"add-icon\"]")
	public WebElement adicionar;
	
	@FindBy(xpath = "//div[@class=\"fieldRow-wrapper\"][2]/div/div[@id=\"add-icon\"]")
	public WebElement adicionar1;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Inicio\")]")
	public WebElement dataVigencia;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Fim\")]")
	public WebElement dataFim;
	
	// --- criar copia
	
	@FindBy(xpath = "//div[@class=\"fieldRow-wrapper\"][2]/div/div[@id=\"delete-icon\"]")
	public WebElement excluir;
	
	@FindBy(xpath = "//button[text()=\"Cancelar\"]")
	public WebElement cancelar;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	// ------ Editar
	
	@FindBy(xpath = "//div[@class=\"fieldRow-wrapper\"][3]/div/div[1]/div/div[2]")
	public WebElement campoEstruturaE;
	
	@FindBy(xpath = "//li[text()=\"Código da empresa\"]")
	public WebElement campoEstruturaO;
	
	@FindBy(xpath = "//div[@class=\"fieldRow-wrapper\"][3]/div/div[2]/div/div[2]")
	public WebElement campoEstruturaE2;
	
	@FindBy(xpath = "//div[@class=\"fieldRow-wrapper\"][3]/div/div[1]/div/div[1]/input")
	public WebElement campoEstruturaI1;
	
	@FindBy(xpath = "//div[@class=\"fieldRow-wrapper\"][3]/div/div[2]/div/div[1]/input")
	public WebElement campoEstruturaI2;
	
	// visualizar
	@FindBy(xpath = "//div[@class=\"fieldRow-wrapper\"][1]/div/div[1]/div/div[1]/input")
	public WebElement campoEstrutura11;

	

	@FindBy(xpath = "//div[@class=\"fieldRow-wrapper\"][1]/div/div[2]/div/div[1]/input")
	public WebElement campoEstrutura21;
	
	@FindBy(xpath = "//div[@class=\"fieldRow-wrapper\"][2]/div/div[2]/div/div[1]/input")
	public WebElement campoEstrutura22;
	
	@FindBy(xpath = "//div[@class=\"fieldRow-wrapper\"][3]/div/div[2]/div/div[1]/input")
	public WebElement campoEstrutura23;
	
	@FindBy(xpath = "//div[@class=\"fieldRow-wrapper\"][2]/div/div[1]/div/div[1]/input")
	public WebElement campoEstrutura12;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione Grupo 1\"]")
	public WebElement grupo11;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione Estrutura 1\"]")
	public WebElement estrutura11;
	
	
	//Excluir Massa
	@FindBy(xpath = "//span[contains(text(),\"Novo\")]")
	public WebElement btnNovo;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//button[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//div[@class=\"group1-select\"]/div/div/div[2]")
	public WebElement cboGrupo1;
	
	@FindBy(xpath = "//li[@tabindex=\"0\" and @class=\"list-item\" and @id and text()=\"Ajustes Fiscais\"][1]")
	public WebElement opcionGrupo1;
	
	@FindBy(xpath = "//div[@class=\"structure1-select\"]/div/div/div[2]")
	public WebElement cboEstrutura1;
	
	@FindBy(xpath = "//li[@tabindex=\"0\" and @class=\"list-item\" and @id and text()=\"Ajustes Fiscais\"][1]")
	public WebElement opcionEstrutura1;
	
	@FindBy(xpath = "//div[@class=\"field-wrapper field1\"]/div/div[2]")
	public WebElement cboCamposEstrutura1;
	
	@FindBy(xpath = "//li[@tabindex=\"0\" and contains(@class, \"list-item\") and @id and text()=\"Código da filial\"][1]")
	public WebElement opcionCamposEstruturas1;
	
	@FindBy(xpath = "//li[@tabindex=\"0\" and contains(@class, \"list-item\") and @id and text()=\"UF da filial\"][1]")
	public WebElement opcionCamposEstruturas12;
	
	@FindBy(xpath = "//div[@class=\"group2-select\"]/div/div/div[2]")
	public WebElement cboGrupo2;
	
	@FindBy(xpath = "//li[@tabindex=\"0\" and @class=\"list-item\" and @id and text()=\"Empresa/Filial 1\"][1]")
	public WebElement opcionGrupo2;
	
	@FindBy(xpath = "//div[@class=\"structure2-select\"]/div/div/div[2]")
	public WebElement cboEstrutura2;
	
	@FindBy(xpath = "//li[@tabindex=\"0\" and @class=\"list-item\" and @id and text()=\"Dados de Empresa/Filial\"][1]")
	public WebElement opcionEstrutura2;
	
	@FindBy(xpath = "//div[@class=\"field-wrapper field2\"]/div/div[2]")
	public WebElement cboCamposEstrutura2;
	
	@FindBy(xpath = "//li[@tabindex=\"0\" and contains(@class, \"list-item\") and @id and text()=\"Código da filial\"][1]")
	public WebElement opcionCamposEstruturas2;
	
	@FindBy(xpath = "//li[@tabindex=\"0\" and contains(@class, \"list-item\") and @id and text()=\"UF da filial\"][1]")
	public WebElement opcionCamposEstruturas22;
	
	@FindBy(xpath = "//div[contains(@class, \"from-date\")]/div/div/div/input")
	public WebElement inputDataInicioVigencia;
	
	@FindBy(xpath = "//div[contains(@class, \"to-date\")]/div/div/div/input")
	public WebElement inputDataFimVigencia;
	
	@FindBy(xpath = "//span[@class = \"button-icon icon-font-Sign-and-Symbols icon-persign\"]")
	public WebElement btnExcluirMassa;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement btnAceitar;
	
	String URL = driver.getCurrentUrl();
	String idPrimerRegistroCreado = "0";
	String idSegundoRegistroCreado = "0";
	
	
	public RelacionamentoEstruturasTodasFuncPO() {
		PageFactory.initElements(driver, this);
	}
	
	
	public ArrayList<Boolean> criar() {
		
		String url = driver.getCurrentUrl();
		
		boolean tq1 = false;
		
		if (url.contains("tq1")) {
			tq1 = true;
		}
		
		relacionamentoEstruturas.click();
		
		invisibilityOfElementOverlay();
		
		siguiente.click();
		
		invisibilityOfElementOverlay();
		
		int rows = rows("//div[@class=\"tr\" and @data-id]");
		
		String idAC = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[3]/div")).getText();
		System.out.println("Id antes da criação: " + idAC);
	
		
		novo.click();
		sleep(2000);
		invisibilityOfElementOverlay();
		sleep(2000);
		
		waitExpectedElement(grupo1);

		grupo1.click();
		sleep(1000);
		grupo1O.click();
		sleep(3000);
		
		estrutura1.click();
		sleep(1000);
		estrutura1O.click();
		sleep(6000);
		
		campoEstrutura1.click();
		sleep(1000);
		campoEstrutura1O.click();
		sleep(1000);
		
		
		grupo2.click();
		if (tq1==true) {
			grupo2OTQ1.click();
			
		}else {
			grupo2O.click();
		}
		
		sleep(1000);
		
		estrutura2.click();
		sleep(1000);
		estrutura2O.click();
		sleep(3000);
		
		campoEstrutura2.click();
		sleep(1000);
		campoEstrutura2O.click();
		sleep(1000);
		
		
		adicionar.click();
		sleep(2000);
		
		campoEstrutura3.click();
		sleep(1000);
		campoEstrutura3O.click();
		sleep(1000);
		
		campoEstrutura4.click();
		sleep(1000);
		campoEstrutura4O.click();
		sleep(1000);
		
		dataVigencia.sendKeys("02/01/1978");
		sleep(1000);
		
		dataFim.sendKeys("31/12/1979");
		sleep(1000);
		
		gravar.click();
		
		invisibilityOfElementOverlay();
		
		relacionamentoEstruturas.click();
		
		invisibilityOfElementOverlay();
		
		siguiente.click();
		
		invisibilityOfElementOverlay();
		
		rows = rows("//div[@class=\"tr\" and @data-id]");
		
		String idDC = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[3]/div")).getText();
		System.out.println("Id após da criação: " + idDC);
		idInserir("RelacionamentoEstruturasCriar",idDC);
		
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
		String estrutura2S =driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[5]/div")).getText();
		String dataVigenciaS =driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[6]/div")).getText();
		String dataFimS =driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[7]/div")).getText();
		
		System.out.println(estrutura1S);
		System.out.println(estrutura2S);
		System.out.println(dataVigenciaS);
		System.out.println(dataFimS);
		
		sucesso.add(estrutura1S.equals("Ajustes Fiscais"));
		sucesso.add(estrutura2S.equals("Dados de Empresa/Filial"));
		sucesso.add(dataVigenciaS.equals("02/01/1978"));
		sucesso.add(dataFimS.equals("31/12/1979"));
		
		
		System.out.println(sucesso);
		
		return sucesso;
		
		
	}
    public ArrayList<Boolean> criarCopia() {
		
		String idRegistro = idObter("RelacionamentoEstruturasCriar");
		
		String url = driver.getCurrentUrl();
		
		boolean tq1 = false;
		
		if (url.contains("tq1")) {
			tq1 = true;
		}
	
		
		siguiente.click();
		
		invisibilityOfElementOverlay();
		
		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idRegistro+"\"]/div/div"));
		WebElement acao = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idRegistro+"\"]/div/div/div/ul/li/span[text()=\"Cópia\"]"));
		
		
		menu.click();
		sleep(1000);
		acao.click();
		
		sleep(2000);
		invisibilityOfElementOverlay();
		sleep(2000);
		
		waitExpectedElement(grupo1);


		excluir.click();
		sleep(2000);
		
		dataVigencia.clear();
		dataVigencia.sendKeys("02/01/1976");
		sleep(1000);
		
		dataFim.clear();
		dataFim.sendKeys("01/01/1977");
		sleep(1000);
		
		gravar.click();
		
		sleep(9000);
		
		relacionamentoEstruturas.click();
		
		sleep(2000);
		invisibilityOfElementOverlay();
		sleep(2000);
		
		siguiente.click();
		
		sleep(4000);
		
        int rows = rows("//div[@class=\"tr\" and @data-id]");
		
		String idDC = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[3]/div")).getText();
		System.out.println("Id após da criação: " + idDC);
		idInserir("RelacionamentoEstruturasCriarCopia",idDC);
		
		int idACI = convertToInt(idObter("RelacionamentoEstruturasCriar"));
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
		String estrutura2S =driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[5]/div")).getText();
		String dataVigenciaS =driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[6]/div")).getText();
		String dataFimS =driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[7]/div")).getText();
		
		System.out.println(estrutura1S);
		System.out.println(estrutura2S);
		System.out.println(dataVigenciaS);
		System.out.println(dataFimS);
		
		sucesso.add(estrutura1S.equals("Ajustes Fiscais"));
		sucesso.add(estrutura2S.equals("Dados de Empresa/Filial"));
		sucesso.add(dataVigenciaS.equals("02/01/1976"));
		sucesso.add(dataFimS.equals("01/01/1977"));
		
		
		System.out.println(sucesso);
		
		return sucesso;
		
	}
	
	public ArrayList<Boolean> editarCopia() {
		
		String idRegistro = idObter("RelacionamentoEstruturasCriarCopia");
		
		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idRegistro+"\"]/div/div"));
		WebElement acao = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idRegistro+"\"]/div/div/div/ul/li/span[text()=\"Editar\"]"));
		
		
		menu.click();
		sleep(1000);
		acao.click();
		sleep(2000);
		invisibilityOfElementOverlay();
		sleep(2000);

		int linhaAdicionada = rows("//div[@class=\"fieldRow-wrapper\"][3]");
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (linhaAdicionada ==0) {
			
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		
		

		
		System.out.println("---------------------------Verificação das Informações-------------------------------------------");
		
		System.out.println("Linha excluida: " +sucesso.get(0));
		
		String dataVigenciaS = dataVigencia.getAttribute("value");
		String dataFimS = dataFim.getAttribute("value");
	
		System.out.println(dataVigenciaS);
		System.out.println(dataFimS);

		sucesso.add(dataVigenciaS.equals("02/01/1976"));
		sucesso.add(dataFimS.equals("01/01/1977"));
		
		sleep(2000);
		cancelar.click();
		
		System.out.println(sucesso);
		
		return sucesso;
		
	}
	
	public boolean excluirCopia() {
		
		String idRegistro = idObter("RelacionamentoEstruturasCriarCopia");
		
		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idRegistro+"\"]/div/div"));
		WebElement acao = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idRegistro+"\"]/div/div/div/ul/li/span[text()=\"Excluir\"]"));
		
		
		menu.click();
		sleep(1000);
		acao.click();
		
		System.out.println("---------------------------Exclução da Cópia-------------------------------------------");
		
		sleep(2000);
		waitExpectedElement(aceitar);
		sleep(1000);
		aceitar.click();
		invisibilityOfElementOverlay();

		relacionamentoEstruturas.click();
		
		invisibilityOfElementOverlay();
		
		siguiente.click();
		
		invisibilityOfElementOverlay();
		
        int rows = rows("//div[@class=\"tr\" and @data-id=\""+idRegistro+"\"]");
		System.out.println(rows);
		
		boolean sucesso = false;
		
		if (rows == 0) {
			sucesso = true;
		} else {
			sucesso = false;
		}
		
		System.out.println("Registro Eliminado Com Sucesso: "+sucesso);
		return sucesso;
		
	}
	
	public ArrayList<Boolean> editar() {
		
		String idRegistro = idObter("RelacionamentoEstruturasCriar");
		
		String url = driver.getCurrentUrl();
		
		boolean tq1 = false;
		
		if (url.contains("tq1")) {
			tq1 = true;
		}
		
	     relacionamentoEstruturas.click();
		
		invisibilityOfElementOverlay();
		
		siguiente.click();
		
		invisibilityOfElementOverlay();
		
		sleep(2000);
		
		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idRegistro+"\"]/div/div"));
	
		menu.click();
		sleep(2000);
		
		WebElement acao = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idRegistro+"\"]/div/div/div/ul/li/span[text()=\"Editar\"]"));
		acao.click();
		
		sleep(2000);
		invisibilityOfElementOverlay();
		sleep(2000);
		
		adicionar1.click();
		
		
		campoEstruturaE.click();
		sleep(1000);
		campoEstruturaO.click();
		sleep(1000);
		
		campoEstruturaE2.click();
		sleep(1000);
		campoEstruturaO.click();
		sleep(1000);
		
		dataVigencia.clear();
		dataVigencia.sendKeys("02/01/1977");
		sleep(1000);
		
		dataFim.clear();
		dataFim.sendKeys("31/12/1978");
		sleep(1000);
		
		gravar.click();
		
		sleep(7000);
		
		relacionamentoEstruturas.click();
		
		sleep(7000);
		
		siguiente.click();
		sleep(1000);
		invisibilityOfElementOverlay();
		sleep(1000);
		
		menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idRegistro+"\"]/div/div"));
		acao = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idRegistro+"\"]/div/div/div/ul/li/span[text()=\"Editar\"]"));
		
		
		menu.click();
		sleep(1000);
		acao.click();
		
		sleep(2000);
		invisibilityOfElementOverlay();
		sleep(2000);
		
		waitExpectedElement(grupo1);
		
		System.out.println("---------------------------Verificação das Informações-------------------------------------------");
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		String campoEstrutura1S = campoEstruturaI1.getAttribute("value");
		String campoEstrutura2S = campoEstruturaI2.getAttribute("value");
		String dataVigenciaS = dataVigencia.getAttribute("value");
		String dataFimS = dataFim.getAttribute("value");
		
		System.out.println(campoEstrutura1S);
		System.out.println(campoEstrutura2S);
		System.out.println(dataVigenciaS);
		System.out.println(dataFimS);
		
		sucesso.add(campoEstrutura1S.equals("Código da empresa"));
		sucesso.add(campoEstrutura2S.equals("Código da empresa"));
		sucesso.add(dataVigenciaS.equals("02/01/1977"));
		sucesso.add(dataFimS.equals("31/12/1978"));
		
		
		System.out.println(sucesso);
		cancelar.click();
		sleep(1000);
		invisibilityOfElementOverlay();
		sleep(1000);
		
		return sucesso;
		
		
	}
	
	public ArrayList<Boolean> visualizar() {
		
		String idRegistro = idObter("RelacionamentoEstruturasCriar");
		
		String url = driver.getCurrentUrl();
		
		boolean tq1 = false;
		
		if (url.contains("tq1")) {
			tq1 = true;
		}
		
		
		
		siguiente.click();
		
		invisibilityOfElementOverlay();
		
		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idRegistro+"\"]/div/div"));
		WebElement acao = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idRegistro+"\"]/div/div/div/ul/li/span[text()=\"Ver\"]"));
		
		
		menu.click();
		sleep(1000);
		acao.click();
		
		sleep(1000);
		invisibilityOfElementOverlay();
		sleep(1000);
		
		waitExpectedElement(grupo1);
	
		
		String grupo1V = grupo11.getAttribute("value");
		String estrutura1V = estrutura11.getAttribute("value");
		String campoEstrutura11V = campoEstrutura11.getAttribute("value");
	//	String campoEstrutura12V = campoEstrutura12.getAttribute("value");
	//	String campoEstrutura13V = campoEstrutura13.getAttribute("value");
		String campoEstrutura21V = campoEstrutura21.getAttribute("value");
		String campoEstrutura22V = campoEstrutura22.getAttribute("value");
	//	String campoEstrutura23V = campoEstrutura23.getAttribute("value");
		String dataVigencia1V = dataVigencia.getAttribute("value");
		String dataFim1V = dataFim.getAttribute("value");
		
		System.out.println("--------Datos da Visualização-----------");
		System.out.println(grupo1V);
		System.out.println(estrutura1V);
		System.out.println(campoEstrutura11V);
	//	System.out.println(campoEstrutura12V);
		//System.out.println(campoEstrutura13V);
		System.out.println(campoEstrutura21V);
		System.out.println(campoEstrutura22V);
	//	System.out.println(campoEstrutura23V);
		System.out.println(dataVigencia1V);
		System.out.println(dataFim1V);
		
		aceitar.click();
		
		invisibilityOfElementOverlay();
		
		
		
		menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idRegistro+"\"]/div/div"));
		acao = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idRegistro+"\"]/div/div/div/ul/li/span[text()=\"Editar\"]"));
		
		
		menu.click();
		sleep(1000);
		acao.click();
		
		sleep(1000);
		invisibilityOfElementOverlay();
		sleep(1000);
	
		waitExpectedElement(grupo1);

		
		System.out.println("---------------------------Datos Editar-------------------------------------------");
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		String grupo1E = grupo11.getAttribute("value");
		String estrutura1E = estrutura11.getAttribute("value");
		String campoEstrutura11E = campoEstrutura11.getAttribute("value");
		String campoEstrutura12E = campoEstrutura12.getAttribute("value");
	//	String campoEstrutura13E = campoEstrutura13.getAttribute("value");
		String campoEstrutura21E = campoEstrutura21.getAttribute("value");
		String campoEstrutura22E = campoEstrutura22.getAttribute("value");
	//	String campoEstrutura23E = campoEstrutura23.getAttribute("value");
		String dataVigencia1E = dataVigencia.getAttribute("value");
		String dataFim1E = dataFim.getAttribute("value");
		
		System.out.println("--------Datos da Visualização-----------");
		System.out.println(grupo1E);
		System.out.println(estrutura1E);
		System.out.println(campoEstrutura11E);
		System.out.println(campoEstrutura12E);
	//	System.out.println(campoEstrutura13E);
		System.out.println(campoEstrutura21E);
		System.out.println(campoEstrutura22E);
	//	System.out.println(campoEstrutura23E);
		System.out.println(dataVigencia1E);
		System.out.println(dataFim1E);
		
		
		sucesso.add(grupo1V.equals(grupo1E));
		sucesso.add(estrutura1V.equals(estrutura1E));
		sucesso.add(campoEstrutura11V.equals(campoEstrutura11E));
	//	sucesso.add(campoEstrutura12V.equals(campoEstrutura12E));
	//	sucesso.add(campoEstrutura13V.equals(campoEstrutura13E));
		sucesso.add(campoEstrutura21V.equals(campoEstrutura21E));
		sucesso.add(campoEstrutura22V.equals(campoEstrutura22E));
	//	sucesso.add(campoEstrutura23V.equals(campoEstrutura23E));
		sucesso.add(dataVigencia1V.equals(dataVigencia1E));
		sucesso.add(dataFim1V.equals(dataFim1E));

		
		System.out.println(sucesso);
		
		cancelar.click();
		sleep(1000);
		invisibilityOfElementOverlay();
		sleep(1000);
		return sucesso;

	}
	
	public boolean excluir() {
		
		String idRegistro = idObter("RelacionamentoEstruturasCriar");
		
		
		
		siguiente.click();
		
		invisibilityOfElementOverlay();
		
		
		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idRegistro+"\"]/div/div"));
		WebElement acao = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idRegistro+"\"]/div/div/div/ul/li/span[text()=\"Excluir\"]"));
		
		
		menu.click();
		sleep(1000);
		acao.click();
		
		System.out.println("---------------------------Exclução do Registro-------------------------------------------");
		
		sleep(2000);
		waitExpectedElement(aceitar);
		sleep(1000);
		aceitar.click();
		invisibilityOfElementOverlay();

		relacionamentoEstruturas.click();
		
		invisibilityOfElementOverlay();
		
		siguiente.click();
		
		invisibilityOfElementOverlay();
		
        int rows = rows("//div[@class=\"tr\" and @data-id=\""+idRegistro+"\"]");
		System.out.println(rows);
		
		boolean sucesso = false;
		
		if (rows == 0) {
			sucesso = true;
		} else {
			sucesso = false;
		}
		
		System.out.println("Registro Eliminado Com Sucesso: "+sucesso);
		return sucesso;
		
	}
	
	public boolean criarMassa() {
		invisibilityOfElementOverlay();
		relacionamentoEstruturas.click();
		invisibilityOfElementOverlay();
		
		btnUltimaPagina.click();
		invisibilityOfElementOverlay();
		
		int rows = driver.findElements(By.xpath("//div[contains(@class, \"tbody\")]/div[contains(@class, \"tr\") and @data-id and @tabindex=\"0\"]")).size();
		String idUltimoRegistro = driver.findElement(By.xpath("//div[@class=\"tr\" and @tabindex=\"0\" and @data-id]["+ rows +"]/div[3]/div")).getText();
		
		System.out.println("Id Ultimo Registro: " + idUltimoRegistro);
		System.out.println("");
		
		// Primer ingreso
		btnNovo.click();
		
		sleep(2000);
		invisibilityOfElementOverlay();
		sleep(2000);
		
		waitExpectedElement(cboGrupo1);
		cboGrupo1.click();
		sleep(3000);
		opcionGrupo1.click();
		sleep(3000);
		
		attributeToBe("//div[@class=\"structure1-select\"]/div", "class", "base-select ");
		cboEstrutura1.click();
		sleep(3000);
		opcionEstrutura1.click();
		sleep(6000);
		
		cboCamposEstrutura1.click();
		sleep(3000);
		opcionCamposEstruturas1.click();
		sleep(3000);
		
		cboGrupo2.click();
		sleep(3000);
		
		if(URL.contains("tp1") || URL.contains("tc2")) {
			opcionGrupo2 = driver.findElement(By.xpath("//li[@tabindex=\"0\" and @class=\"list-item\" and @id and text()=\"Empresa Filial\"][1]"));
		}
		opcionGrupo2.click();
		sleep(1000);
		
		attributeToBe("//div[@class=\"structure2-select\"]/div", "class", "base-select ");
		cboEstrutura2.click();
		sleep(3000);
		opcionEstrutura2.click();
		sleep(6000);
		
		cboCamposEstrutura2.click();
		sleep(3000);
		opcionCamposEstruturas2.click();
		sleep(3000);
		
		inputDataInicioVigencia.sendKeys("01/01/1974");
		sleep(3000);
		
		inputDataFimVigencia.sendKeys("01/01/1975");
		sleep(3000);
		
		btnGravar.click();
		invisibilityOfElementOverlay();
		
		btnUltimaPagina.click();
		invisibilityOfElementOverlay();
		
		rows = driver.findElements(By.xpath("//div[contains(@class, \"tbody\")]/div[contains(@class, \"tr\") and @data-id and @tabindex=\"0\"]")).size();
		this.idPrimerRegistroCreado = driver.findElement(By.xpath("//div[@class=\"tr\" and @tabindex=\"0\" and @data-id]["+ rows +"]/div[3]/div")).getText();
		
		System.out.println("Id Primer Registro Creado: " + this.idPrimerRegistroCreado);
		System.out.println("");
		
		boolean sucesso = false;
		
		int id1 = convertToInt(idUltimoRegistro);
		int id2 = convertToInt(this.idPrimerRegistroCreado);
		
		if(id2 > id1) {
			System.out.println("Primer registro creado...");
			System.out.println("");
			sucesso = true;
		}else {
			System.out.println("No se pudo crear el primer registro...");
			System.out.println("");
			return sucesso;
		}
		
		// Segundo registro
		btnNovo.click();
		sleep(2000);
		invisibilityOfElementOverlay();
		sleep(2000);
		
		
		cboGrupo1.click();
		sleep(3000);
		opcionGrupo1.click();
		sleep(3000);
		
		attributeToBe("//div[@class=\"structure1-select\"]/div", "class", "base-select ");
		cboEstrutura1.click();
		sleep(3000);
		opcionEstrutura1.click();
		sleep(6000);
		
		cboCamposEstrutura1.click();
		sleep(3000);
		opcionCamposEstruturas12.click();
		sleep(3000);
		
		cboGrupo2.click();
		sleep(3000);
		
		if(URL.contains("tp1") || URL.contains("tc2")) {
			opcionGrupo2 = driver.findElement(By.xpath("//li[@tabindex=\"0\" and @class=\"list-item\" and @id and text()=\"Empresa Filial\"][1]"));
		}
		opcionGrupo2.click();
		sleep(3000);
		
		attributeToBe("//div[@class=\"structure2-select\"]/div", "class", "base-select ");
		cboEstrutura2.click();
		sleep(3000);
		opcionEstrutura2.click();
		sleep(3000);
		
		cboCamposEstrutura2.click();
		sleep(3000);
		opcionCamposEstruturas22.click();
		sleep(3000);
		
		inputDataInicioVigencia.sendKeys("01/01/1972");
		sleep(3000);
		
		inputDataFimVigencia.sendKeys("01/01/1973");
		sleep(3000);
		
		btnGravar.click();
		invisibilityOfElementOverlay();
		
		btnUltimaPagina.click();
		invisibilityOfElementOverlay();
		
		rows = driver.findElements(By.xpath("//div[contains(@class, \"tbody\")]/div[contains(@class, \"tr\") and @data-id and @tabindex=\"0\"]")).size();
		this.idSegundoRegistroCreado = driver.findElement(By.xpath("//div[@class=\"tr\" and @tabindex=\"0\" and @data-id]["+ rows +"]/div[3]/div")).getText();
		
		System.out.println("Id Segundo Registro Creado: " + this.idSegundoRegistroCreado);
		System.out.println("");
		
		int id3 = convertToInt(this.idSegundoRegistroCreado);
		
		if(id3 > id2) {
			System.out.println("Segundo registro creado...");
			System.out.println("");
			sucesso = true;
		}else {
			System.out.println("No se pudo crear el primer registro...");
			System.out.println("");
		}
		
		return sucesso;
	}
	
	public boolean exluirMassa() {
		sleep(1000);
		if(!btnNovo.isDisplayed()) {
			return false;
		}
		sleep(2000);
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000); 
		
		int idUltimoRegistro = convertToInt(this.idSegundoRegistroCreado);
		WebElement marcarCheckbox = driver.findElement(By.xpath("//div[@data-id=\""+idUltimoRegistro+"\"]/div[2]/label/span"));
		System.out.println("Id Ultimo registro: " + idUltimoRegistro); // Ultimo registro que es el que se crea con la automatizacion
		
		sleep(5000);
		marcarCheckbox.click();
		sleep(5000);
		
		int idPenultimoUltimoRegistro = convertToInt(this.idPrimerRegistroCreado);
		marcarCheckbox = driver.findElement(By.xpath("//div[@data-id=\""+idPenultimoUltimoRegistro+"\"]/div[2]/label/span"));
		System.out.println("Id Penultimo registro: " + idPenultimoUltimoRegistro); // Penultimo registro que es el que se crea con la automatizacion
		
		sleep(2000);
		marcarCheckbox.click();
		sleep(2000);
		
		btnExcluirMassa.click();
		sleep(2000);
		waitExpectedElement(btnAceitar);
		btnAceitar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		relacionamentoEstruturas.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String idUltimoRegistroDespuesDeEliminar = "0";
		
		if(rows > 0) {
			idUltimoRegistroDespuesDeEliminar = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		}
		
		int id1 = convertToInt(idUltimoRegistroDespuesDeEliminar);
		int id2 = idUltimoRegistro;
		int id3 = idPenultimoUltimoRegistro;
		
		System.out.println("Ultimo registro al eliminar en massa: " + id1); // Ultimo registro despues de excluir el registro de la automatizacion y recargar
		System.out.println("Ultimo registro: " + id2);
		System.out.println("Penultimo registro:" + id3);
		
		boolean sucesso = false;
		
		if (id1 != id2 && id1 != id3) {
			sucesso= true;
		}
		System.out.println(sucesso);
		return sucesso;
	}
}
