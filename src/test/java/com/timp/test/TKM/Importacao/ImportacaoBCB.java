package com.timp.test.TKM.Importacao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BCB.ParametrosGeraisConfiguracao.Configuracao.BibliotecaConfgBcbPO;
import com.sap.timp.pageObjectModel.BCB.ParametrosGeraisConfiguracao.Configuracao.ConfgEditarBCBPO;
import com.sap.timp.pageObjectModel.BRB.BibliotecaBRBPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeNegocio.ParametrosGerais.BibliotecaRegraNegocioPO;
import com.sap.timp.pageObjectModel.MDR.BibliotecaEditarMDRPO;
import com.sap.timp.pageObjectModel.TKM.AcessarTKMPO;
import com.sap.timp.pageObjectModel.TKM.conteudoDeTransporte.PacoteExportado.BibliotecaPEPO;
import com.sap.timp.pageObjectModel.TKM.conteudoDeTransporte.PacoteExportado.GerenciarConteudoParaAgruparPO;
import com.sap.timp.pageObjectModel.TKM.conteudoDeTransporte.PacoteImportado.BibliotecaPIPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;

public class ImportacaoBCB extends TestBase {
	LoginTC loginTC;
	AcessarTKMPO acessarTKMPO;
	BibliotecaPEPO bibliotecaPEPO;
	GerenciarConteudoParaAgruparPO gerenciarConteudoParaAgruparPO;
	BibliotecaPIPO bibliotecaPO;
	BibliotecaRegraNegocioPO bibliotecaRegraNegocioPO;
	BibliotecaConfgBcbPO bibliotecaConfgBCBPO;
	BibliotecaBRBPO bibliotecaBRBPO;
	ConfgEditarBCBPO  confgEditarBCBPO ;
	BibliotecaEditarMDRPO bibliotecaEditarMDRPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTKMPO = new AcessarTKMPO();
		bibliotecaPEPO = new BibliotecaPEPO();
		gerenciarConteudoParaAgruparPO = new GerenciarConteudoParaAgruparPO();
		bibliotecaPO = new BibliotecaPIPO();
		bibliotecaRegraNegocioPO = new BibliotecaRegraNegocioPO();
		bibliotecaConfgBCBPO = new BibliotecaConfgBcbPO();
		bibliotecaBRBPO = new BibliotecaBRBPO();
		confgEditarBCBPO = new ConfgEditarBCBPO();
		bibliotecaEditarMDRPO = new BibliotecaEditarMDRPO();
	}
	
	 String AssoAjuste = "0";
	 String codigoAjuste = "0";
	String codigoContabilização = "0";


	@AfterClass
	public void afterClass() {
	}

/*
	@Test(priority = 0)
	public void CriarExportacion() {
		
		
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
		
		
		if (tq1 == true) {


			driver.navigate().to("http://as1-100-01-tc2:8000/timp/login/#/login");

		}else if (tc2==true ) {
			
			driver.navigate().to("http://as1-100-01-tq1:8000/timp/login/#/login");
			
		}else {
			driver.navigate().to("http://as1-100-01-tp1:8000/timp/tkm/#library");
		}
		sleep(3000);
		
		loginTC.login();
		sleep(3000);
		
		acessarTKMPO.acessarTKM();
		sleep(11000);
		
		bibliotecaPEPO.clickbtnPacoteExportado();
		sleep(2000);
		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[2]/div")).getText();
		  System.out.println("Ultimo registro: " + id);
		
		bibliotecaPEPO.clickbtnNovo();
		sleep(2000);
		
		bibliotecaPEPO.fillOutTxtNome("Test TA BCB");
		sleep(2000);
		
		bibliotecaPEPO.fillOutTxtdescripcion("Ciclo TA ");
		sleep(2000);
		
		bibliotecaPEPO.clickbtnGravar();
		sleep(4000);
		
		String idultimo = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[2]/div")).getText();
		System.out.println(id);
		System.out.println("Id Creado: "+ idultimo);
		idInserir("expBCB",idultimo);
		 
		 double idD = convertToDouble(id);
		 double idBD = convertToDouble(idultimo);
		  sleep(5000);

		 ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
			
			if (idBD > idD  ){
				sucesso.add(true);
			}else {
				sucesso.add(false);
			}
			for (int i = 0; i < sucesso.size(); i++) {
				assertTrue(sucesso.get(i), filtros);
			}
		
	}
	@Test(priority = 1)
	public void AdicionarContenudo() {
		
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
		
	String idultimo = idObter("expBCB");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idultimo+"\"]/div[1]/div"));
		WebElement agrupar = driver.findElement(By.xpath("//div[@data-id=\""+idultimo+"\"]/div[1]/div/div[2]//span[text()=\"Gerenciar Conteúdo para Agrupar\"]"));
		
		actionsMoveToElement(menu);
		sleep(2000);

		menu.click();
		sleep(1000);
		agrupar.click();
		sleep(2000);
		
		gerenciarConteudoParaAgruparPO.clickbtnAdicionarContenudo();
		sleep(2000);
		
		gerenciarConteudoParaAgruparPO.clickbtnComponente();
		sleep(2000);
		
		gerenciarConteudoParaAgruparPO.clickbtnOpcComponenteBCB();
		sleep(3000);
		
		gerenciarConteudoParaAgruparPO.clickbtnModelo();
		sleep(2000);
		
		gerenciarConteudoParaAgruparPO.clickbtnOpcModeloBCB();
		sleep(3000);
		
		
		
		gerenciarConteudoParaAgruparPO.clickbtnGravar();
		sleep(2000);
	
		String idBCB = "";
		if (tq1 == true) {

			idBCB="4701";
		}else {
			idBCB="2942";
		}
		sleep(2000);
		
		gerenciarConteudoParaAgruparPO.fillOutTxtBusqueda(idBCB);
		sleep(2000);
		
		gerenciarConteudoParaAgruparPO.clickbtnBusqueda();
		sleep(2000);
		
		WebElement busqueda = driver.findElement(By.xpath("//div[@data-id=\""+idBCB+"\"]//span"));
		
		busqueda.click();
		sleep(1000);
		
		
		gerenciarConteudoParaAgruparPO.clickbtnGravar();
		sleep(7000);
		
		 String componente = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[3]/div")).getText();
		 System.out.println("Componente Agregado: " + componente);
		 
		 String modelo = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[4]/div")).getText();
		 System.out.println("Modelo Agregado: " + modelo);
		 
		 ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		 
		 sucesso.add(componente.contains("BCB"));
		 sucesso.add(modelo.contains("BuilderConfiguration"));
		 
		 gerenciarConteudoParaAgruparPO.clickbtnBiblioteca();
		 sleep(2000);
		 
		 for (int i = 0; i < sucesso.size(); i++) {
				assertTrue(sucesso.get(i), visualizar);

			}
		
		 
			
		 

	}
	@Test(priority = 2)
	public void Exportar() {
		
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
		
	
		
		 bibliotecaPEPO.clickbtnPacoteExportado();
		 sleep(6000);
		
		String idultimo = idObter("expBCB");
		
		String fechaExportación = driver.findElement(By.xpath("//div[@data-id=\""+idultimo+"\"]/div[6]//div")).getText();
		System.out.println("Fecha Exportación sin realizar el proceso: " + fechaExportación);
		
		 ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(fechaExportación.equals(""));
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idultimo+"\"]/div[1]/div"));
		WebElement exportar = driver.findElement(By.xpath("//div[@data-id=\""+idultimo+"\"]/div[1]/div/div[2]//span[text()=\"Iniciar Exportação em Background\"]"));
		
		actionsMoveToElement(menu);
		sleep(2000);

		menu.click();
		sleep(1000);
		exportar.click();
		sleep(11000);
		System.out.println("Test paso ");
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idultimo+"\"]/div[1]/div"));
		
		actionsMoveToElement(menu);
		sleep(2000);
		
		
		menu.click();
		sleep(1000);
		
		 String status = driver.findElement(By.xpath("//div[@data-id=\""+idultimo+"\"]/div[1]/div/div[2]//li[3]//span[2]")).getText();
		 System.out.println("Opcion: " + status);
		 sleep(6000);
		  
		  while (status.equals("Exportação") ) {
		 
			 driver.navigate().refresh();
			 sleep(10000);
			 invisibilityOfElementOverlay();
			 sleep(15000);
			  
			 bibliotecaPEPO.clickbtnPacoteExportado();
			 sleep(6000);
			
			 menu = driver.findElement(By.xpath("//div[@data-id=\""+idultimo+"\"]/div[1]/div"));
				
			actionsMoveToElement(menu);
			sleep(2000);
				
			menu.click();
			sleep(1000);
				
		    status = driver.findElement(By.xpath("//div[@data-id=\""+idultimo+"\"]/div[1]/div/div[2]//li[3]//span[2]")).getText();
	        System.out.println("Opcion Habilitada : " + status);
	        sleep(30000);
	        
			
		}
		  
		WebElement descargar = driver.findElement(By.xpath("//div[@data-id=\""+idultimo+"\"]/div[1]/div/div[2]//span[text()=\"Baixar Pacote Salvo em Background\"]"));
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idultimo+"\"]/div[1]/div"));
		
		actionsMoveToElement(menu);
		sleep(2000);

		
		descargar.click();
		sleep(2000);
		String fecha = fechaActual();
		System.out.println(fecha);
		
		String fechaExportación2 = driver.findElement(By.xpath("//div[@data-id=\""+idultimo+"\"]/div[6]//div")).getText();
		System.out.println("Fecha Exportación: " + fechaExportación2);
		
		sucesso.add(fechaExportación2.equals(fecha));
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), filtros);
		}
		
		
	}
	

	@Test(priority = 3)
	public void Criar() {
		
		
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
		
		if (tq1 == true) {


			driver.navigate().to("http://as1-100-01-tc2:8000/timp/login/#/login");

		}else if (tp1==true ) {
			driver.navigate().to("http://as1-100-01-tp1:8000/timp/tkm/#library");
			
		}else {
			driver.navigate().to("http://as1-100-01-tq1:8000/timp/login/#/login");
		}
	
		sleep(4000);
		
		loginTC.login();
		sleep(3000);
		

		acessarTKMPO.acessarTKM();
		sleep(10000);;
		
		bibliotecaPO.clickbtnPacoteImportado();
		sleep(2000);
		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[2]/div")).getText();
		System.out.println("Ultimo registro: " + id);
		
		bibliotecaPO.clickbtnImportarBG();
		sleep(7000);
		
		WebElement fileInput = driver.findElement(By.name("file"));
		String filePath = "C:\\Users\\user_ta\\Downloads\\Test TA BCB.bdl.crdownload";
		fileInput.sendKeys(filePath);
		
		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		bibliotecaPO.clickbtnSubir();
		sleep(4000);
		System.out.println("SUBIOO");
		sleep(12000);
		
		 String ID = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[2]/div")).getText();
		 System.out.println("Opcion: " + ID);
		
		 while (ID.equals(id) ) {
			 
			 driver.navigate().refresh();
			 sleep(10000);
			 invisibilityOfElementOverlay();
			 sleep(15000);
			  
			 bibliotecaPO.clickbtnPacoteImportado();
			 sleep(2000);
		
	
	        ID = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[2]/div")).getText();
			 System.out.println("Opcion Habilitada: " + ID);
	        sleep(30000);
	        
			
		}
		
		String idultimo = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[2]/div")).getText();
		System.out.println(id);
		System.out.println("Id Creado: "+ idultimo);
		idInserir("bcbImportado",idultimo);
		 
		 double idD = convertToDouble(id);
		 double idBD = convertToDouble(idultimo);
		  sleep(5000);

		 ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
			
			if (idBD > idD  ){
				sucesso.add(true);
			}else {
				sucesso.add(false);
			}
			for (int i = 0; i < sucesso.size(); i++) {
				assertTrue(sucesso.get(i), filtros);
			}
		
	}
	*/
	@Test(priority = 4)
	public void VerificarInf() {
		
		
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
		loginTC.login();
		sleep(3000);
		
		
		if (tq1 == true) {


			driver.navigate().to("http://as1-100-01-tq1:8000/timp/tkm/#library");

		}else if (tp1==true ) {
			driver.navigate().to("http://as1-100-01-tp1:8000/timp/tkm/#library");
			
		}else {
			driver.navigate().to("http://as1-100-01-tc2:8000/timp/tkm/#library");
		}
		sleep(10000);
		
		bibliotecaPO.clickbtnPacoteImportado();
		sleep(2000);
		
		String idultimo = idObter("bcbImportado");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idultimo+"\"]/div[1]/div"));	
		actionsMoveToElement(menu);
		sleep(2000);

		menu.click();
		sleep(1000);
		
		String id = "";
		if (tq1 == true) {

			id="2942";
		}else {
			id="4701";
		}
		sleep(2000);
		
		 String componente = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[3]/div")).getText();
		 System.out.println("Componente Agregado: " + componente);
		 
		 String modelo = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[4]/div")).getText();
		 System.out.println("Modelo Agregado: " + modelo);
		 
		 String idOrigem = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[6]/div")).getText();
		 System.out.println("Id Origem: " + idOrigem);
		 
		 String idDestino = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[7]/div")).getText();
		 System.out.println("Id Destino: " + idDestino);
		 
		 String nome = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[8]/div")).getText();
		 System.out.println("Nombre de Regra: " + nome);
		 
		 String descripcion = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[9]/div")).getText();
		 System.out.println("Descripcion de Regra: " + descripcion);
		 
		 

		 idInserir("BCB Destino",idDestino);
		
		 ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		 
		 sucesso.add(componente.contains("BCB"));
		 sucesso.add(modelo.contains("BuilderConfiguration"));
		 sucesso.add(idOrigem.equals(id));

	
		 for (int i = 0; i < sucesso.size(); i++) {
				assertTrue(sucesso.get(i), visualizar);

			}


	}


	@Test(priority = 6)
	public void ExportacionBCB() {
		
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

		
		if (tq1 == true) {


			driver.navigate().to("http://as1-100-01-tq1:8000/timp/bcb/#library");

		}else if (tp1==true ) {
			driver.navigate().to("http://as1-100-01-tp1:8000/timp/bcb/#library");
			
		}else {
			driver.navigate().to("http://as1-100-01-tc2:8000/timp/bcb/#library");
		}
		sleep(9000);

		
		bibliotecaConfgBCBPO.clickbtnBibliotecaConfig();
		sleep(12000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idDestino =idObter("BCB Destino");
		
		
		bibliotecaConfgBCBPO.sendKeysToSearchBox(idDestino);
		sleep(2000);
		
		bibliotecaConfgBCBPO.clickOnSpMagnifyingGlass();
		sleep(8000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(8000);
		
		bibliotecaConfgBCBPO.clickOnBtnActions();
		sleep(1000);
		
		bibliotecaConfgBCBPO.clickOnBtnEditar();
		sleep(6000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		System.out.println("---------------- DATOS DE EDITAR -----------");
		
		
		 String nombreConf = driver.findElement(By.xpath("//div[@id=\"main-title\"]")).getText();
		 System.out.println("Nombre Configuración: " + nombreConf);
		 
		 String tributo = driver.findElement(By.xpath("//div[@class=\"tab-tax\"]//input")).getAttribute("value");
		 System.out.println("Tributo: " + tributo);
		 
		 String campoLinha = driver.findElement(By.xpath("//div[@id=\"configuration\"]//input")).getAttribute("value");
		 System.out.println("Campo Linha: " + campoLinha);
		 
		 String relatorio = driver.findElement(By.xpath("//div[@id=\"report\"]//input")).getAttribute("value");
		 System.out.println("relatorio: " + relatorio);
		 
		 String valor = driver.findElement(By.xpath("//div[@id=\"value\"]//input")).getAttribute("value");
		 System.out.println("relatorio: " + valor);
		 
		
		 confgEditarBCBPO.clickbtnAjuste();
		 sleep(6000);
		
		  AssoAjuste = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][2]/div[4]//div")).getText();
		 System.out.println("ID Associação de Ajuste: " + AssoAjuste);
		 
		  codigoAjuste = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][2]/div[5]//div")).getText();
		 System.out.println("Código do Ajuste: " + codigoAjuste);
		
		 codigoContabilização = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][2]/div[7]//div")).getText();
		 System.out.println("Código Contabilização: " + codigoContabilização);
		 
		 
		 idInserir("AssoAjuste",AssoAjuste);
		 idInserir("codigoAjuste",codigoAjuste);
		 idInserir("codigoContabilização",codigoContabilização);
		 
		 WebElement menu = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][2]//div[@class=\"actions\"]"));
		 WebElement editar = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][2]//div[@class=\"actions\"]//span[text()=\"Editar\"]"));
				
		 menu.click();
		 sleep(1000);
		 
		 editar.click();
		 sleep(6000);
		
		 
		 String demais = driver.findElement(By.xpath("//div[@id=\"guia-pagamento\"]//input")).getAttribute("value");
		 System.out.println("Guia de pagamento: " + demais );
		 
		 demais = demais .replaceAll("-Determ. pagamento BCB 4701", "");
		 
		 idInserir("demais",demais);
		 
		 ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		 sucesso.add(nombreConf.contains("BCB IRPJ -Michele Teste contab"));
		 sucesso.add(tributo.contains("IRPJ_CSLL"));
		 sucesso.add(campoLinha.contains("Relatório"));
		 sucesso.add(relatorio.contains(" Relatório de Gastos Elegiveis/Patentes"));
		 sucesso.add(valor.contains("Valor do Dispêndio"));
		 System.out.println( sucesso);
		 
		 	relatorio = relatorio.replaceAll("[a-zA-Z]", "");
			relatorio = relatorio.replaceAll("-", "");
			relatorio = relatorio.replaceAll("ó", "");
			relatorio = relatorio.replaceAll("/", "");
			relatorio = relatorio.replaceAll("_", "");
			relatorio = relatorio.replaceAll("2", "");
			relatorio = relatorio.replaceAll(" ", "");
			
			 idInserir("relatorio",relatorio);
		 
		 for (int i = 0; i < sucesso.size(); i++) {
				assertTrue(sucesso.get(i), visualizar);

			}
		 
		
			
			
	}
/*
	@Test(priority = 7)
	public void ExportacionBRB() {
		
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

		 if (tq1 == true) {


				driver.navigate().to("http://as1-100-01-tq1:8000/timp/brb/#library");

			}else if (tp1==true ) {
				driver.navigate().to("http://as1-100-01-tp1:8000/timp/brb/#library");
				
			}else {
				driver.navigate().to("http://as1-100-01-tc2:8000/timp/brb/#library");
			}
			sleep(24000);

			
			bibliotecaBRBPO.clickOnBtncadastro();
			sleep(6000);
			
			String relatorio =idObter("relatorio");
			
			
			System.out.println("relatorio: " + relatorio);
			
			bibliotecaBRBPO.fillOutSearchBox(relatorio);
			sleep(3000);
			
			bibliotecaBRBPO.clickOnSpMagnifyingGlass();
			sleep(6000);
			
			bibliotecaBRBPO.clickOnBtnActions();
			sleep(1000);
			bibliotecaBRBPO.clickOnBtnEditar();
			sleep(15000);
			
		
			 
			System.out.println("---------------- DATOS DE BRB-----------");
			
			
			
			
			 String nombreConf = driver.findElement(By.xpath("//div[@id=\"main-title\"]")).getText();
			 System.out.println("Nombre Configuración: " + nombreConf);
			 
			 bibliotecaBRBPO.clickOnBtnConfiguraciones();
			 sleep(20000);
			 
			 String nome = driver.findElement(By.xpath("//div[@id=\"create-name\"]//input")).getAttribute("value");
			 System.out.println("Nome: " + nome);
			 
			 String tipoRela = driver.findElement(By.xpath("//div[@id=\"create-type\"]//input")).getAttribute("value");
			 System.out.println("Tipo Relatorio: " + tipoRela);
			 
			 String tributo = driver.findElement(By.xpath("//div[@id=\"create-tribute\"]//div[@class=\"componentName\"]")).getText();
			 System.out.println("Tributo: " + tributo);
			 
			 ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
			 
			 sucesso.add(nome .contains("Relatório de Gastos Elegiveis/Patentes"));
			 sucesso.add(tipoRela.contains("Relatório de Outputs"));
			 sucesso.add(tributo.contains("IRPJ_CSLL"));
			 System.out.println( sucesso);
			
			 for (int i = 0; i < sucesso.size(); i++) {
					assertTrue(sucesso.get(i), visualizar);

				}
			}
	
	
	@Test(priority = 9)
	public void ExportacionMDRCodigoAjuste() {
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

	 if (tq1 == true) {


			driver.navigate().to("http://as1-100-01-tq1:8000/timp/brb/#library");

		}else if (tp1==true ) {
			driver.navigate().to("http://as1-100-01-tp1:8000/timp/brb/#library");
			
		}else {
			driver.navigate().to("http://as1-100-01-tc2:8000/timp/mdr/#/library?cadastro=sysAdjusts");
		}
		sleep(24000);
		
		 System.out.println("ID Associação de Ajuste: " + AssoAjuste);
		 System.out.println("Código do Ajuste: " + codigoAjuste);
		 System.out.println("Código Contabilização: " + codigoContabilização);
		 
		 bibliotecaEditarMDRPO.sendKeysToSearchBox(codigoAjuste);
		 sleep(4000);
		
		 bibliotecaEditarMDRPO.clickOnSpMagnifyingGlass();
		 sleep(6000);
		 
		 bibliotecaEditarMDRPO.clickOnBtnActions();
		 sleep(4000);
		 
		 bibliotecaEditarMDRPO.clickOnBtnEditar();
		 sleep(30000);
		 
		  System.out.println("---- CodigoAjuste ----");
		 
		 String empresa = driver.findElement(By.xpath("//div[@id=\"companyCode\"]//div[@class=\"componentToSearch\"]")).getText();
		 System.out.println("Empresa: " + empresa);
		 
		 String tipoAjuste = driver.findElement(By.xpath("//div[@id=\"adjustmentType\"]//input")).getAttribute("value");
		 System.out.println("Tipo de Ajuste: " + tipoAjuste);
		 
		 String tipoLançamento = driver.findElement(By.xpath("//div[@id=\"releaseType\"]//input")).getAttribute("value");
		 System.out.println("Tipo de Lançamento: " + tipoLançamento);
		 
		 String codigoAjuste = driver.findElement(By.xpath("//div[@id=\"adjustmentCode\"]//input")).getAttribute("value");
		 System.out.println("Código de Ajuste: " + codigoAjuste);
		 
		 String descriçãoPadrão = driver.findElement(By.xpath("//div[@id=\"standarDescription\"]//textarea")).getAttribute("value");
		 System.out.println("Descrição Padrão: " + descriçãoPadrão);
		 
		 String tributo = driver.findElement(By.xpath("//div[@id=\"adjustmentTribute\"]//input")).getAttribute("value");
		 System.out.println("Tributo: " + tributo);
		 
		 String tipoTributo = driver.findElement(By.xpath("//div[@id=\"adjustmentTribute\"]//input")).getAttribute("value");
		 System.out.println("Tipo de Tributo: " + tipoTributo);
		 
		 String detalheTipoTributo = driver.findElement(By.xpath("//div[@id=\"tributeTypeDetail\"]//input")).getAttribute("value");
		 System.out.println("Detalhe Tipo Tributo: " + detalheTipoTributo);
		 
		 String utilização = driver.findElement(By.xpath("//div[@id=\"tributeTypeDetail\"]//input")).getAttribute("value");
		 System.out.println("Utilização: " + utilização);
		 
		 String linhaLivro = driver.findElement(By.xpath("//div[@id=\"bookOnline\"]//input")).getAttribute("value");
		 System.out.println("Linha do Livro: " + linhaLivro);
		 
		 String códigoContabilização = driver.findElement(By.xpath("//div[@id=\"accountingType\"]//input")).getAttribute("value");
		 System.out.println("Código Contabilização: " + códigoContabilização);
		 
		 String tipoTabela = driver.findElement(By.xpath("//div[@id=\"tableType\"]//input")).getAttribute("value");
		 System.out.println("Tipo de Tabela: " + tipoTabela );
		 
		 String validadeDe = driver.findElement(By.xpath("//div[@id=\"validFrom\"]//input")).getAttribute("value");
		 System.out.println("Validade De: " + validadeDe );
		 
		 ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		 
		 sucesso.add(empresa.contains("1000"));
		 sucesso.add(tipoAjuste.contains("Automatico"));
		 sucesso.add(tipoLançamento.contains("Pagamento"));
		 sucesso.add(codigoAjuste.contains("P0009770"));
		 sucesso.add(descriçãoPadrão.contains("Pagamento Michele Teste contab  "));
		 sucesso.add(tributo.contains("IRPJ_CSLL"));
		 sucesso.add(tipoTributo.contains("IRPJ/CSLL"));
		 sucesso.add(detalheTipoTributo.contains(""));
		 sucesso.add(utilização.contains(" "));
		 sucesso.add(linhaLivro.contains(" "));
		 sucesso.add(códigoContabilização.contains("CP8454 - Pagamento TQ1 - Michele"));
		 sucesso.add(tipoTabela.contains(" "));
		 sucesso.add(validadeDe.contains("31/12/2009"));
		 
		 System.out.println( sucesso);
		
		 for (int i = 0; i < sucesso.size(); i++) {
				assertTrue(sucesso.get(i), visualizar);

			}
	}
	
	@Test(priority = 9)
	public void ExportacionMdrAsociacionCodigoAjuste() {
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

	 if (tq1 == true) {


			driver.navigate().to("http://as1-100-01-tq1:8000/timp/brb/#library");

		}else if (tp1==true ) {
			driver.navigate().to("http://as1-100-01-tp1:8000/timp/brb/#library");
			
		}else {
			driver.navigate().to("http://as1-100-01-tc2:8000/timp/mdr/#/library?cadastro=codeAssoc");
		}
		sleep(24000);
		
		 System.out.println("ID Associação de Ajuste: " + AssoAjuste);
		 
		 bibliotecaEditarMDRPO.sendKeysToSearchBox(AssoAjuste);
		 sleep(4000);
		
		 bibliotecaEditarMDRPO.clickOnSpMagnifyingGlass();
		 sleep(6000);
		 
		 bibliotecaEditarMDRPO.clickOnBtnActions();
		 sleep(4000);
		 
		 bibliotecaEditarMDRPO.clickOnBtnEditar();
		 sleep(35000);
		 System.out.println(" " );
		 System.out.println("---- Associacion Codigo de Ajuste ----" );
		 System.out.println(" " );
		 
		 String empresa = driver.findElement(By.xpath("//div[@id=\"company\"]//div[@class=\"componentToSearch\"]")).getText();
		 System.out.println("Empresa: " + empresa);
		 
		 String descripcion   = driver.findElement(By.xpath("//div[@id=\"padrao\"]//textarea")).getAttribute("value");
		 System.out.println("Descrição Padrão: " + descripcion);
		 
		 String codiContabilizacion   = driver.findElement(By.xpath("//div[@id=\"accCode\"]//input")).getAttribute("value");
		 System.out.println("Códigos de Contabilização: " + codiContabilizacion);
		 
		 
		 String tipoAjuste   = driver.findElement(By.xpath("//div[@id=\"adjustType\"]//input")).getAttribute("value");
		 System.out.println("Tipo de Ajuste: " + tipoAjuste);
		 
		 
		 String tipoLanzamiento   = driver.findElement(By.xpath("//div[@id=\"release\"]//input")).getAttribute("value");
		 System.out.println("Tipo de Lançamento: " + tipoLanzamiento);
		 
		 String tributo   = driver.findElement(By.xpath("//div[@id=\"tribute\"]//input")).getAttribute("value");
		 System.out.println("Tributo: " + tributo);
		 
		 String tipoTributo   = driver.findElement(By.xpath("//div[@id=\"tributeType\"]//input")).getAttribute("value");
		 System.out.println("Tipo de Tributo: " + tipoTributo);
		 
		 String dataInicio   = driver.findElement(By.xpath("//div[@id=\"validity\"]//input")).getAttribute("value");
		 System.out.println("Data de Início de Vigência: " + dataInicio);
		 
		 ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		 
		 sucesso.add(empresa.contains("1000"));
		 sucesso.add(tipoAjuste.contains("Automático"));
		 sucesso.add(tipoLanzamiento.contains("Pagamento"));
		 sucesso.add(tributo.contains("IRPJ_CSLL"));
		 sucesso.add(tipoTributo.contains("IRPJ/CSLL"));
		 sucesso.add(dataInicio.contains("01/01/2010"));
		 
		 System.out.println( sucesso);
			
		 for (int i = 0; i < sucesso.size(); i++) {
				assertTrue(sucesso.get(i), visualizar);

			}
			
	}

	@Test(priority = 10)
	public void ExportacionMdrCodigoContabilizacion() {
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

	 if (tq1 == true) {


			driver.navigate().to("http://as1-100-01-tq1:8000/timp/brb/#library");

		}else if (tp1==true ) {
			driver.navigate().to("http://as1-100-01-tp1:8000/timp/brb/#library");
			
		}else {
			driver.navigate().to("http://as1-100-01-tc2:8000/timp/mdr/#/library?cadastro=accountingCode");
		}
		sleep(24000);
		
		 System.out.println("ID Códigos de Contabilização: " + codigoContabilização);
		 
		 bibliotecaEditarMDRPO.sendKeysToSearchBox(codigoContabilização);
		 sleep(4000);
		
		 bibliotecaEditarMDRPO.clickOnSpMagnifyingGlass();
		 sleep(6000);
		 
		 bibliotecaEditarMDRPO.clickOnBtnActions();
		 sleep(4000);
		 
		 bibliotecaEditarMDRPO.clickOnBtnEditar();
		 sleep(35000);
		 System.out.println(" " );
		 System.out.println("---- Códigos de Contabilização ----" );
		 System.out.println(" " );
		
	}*/
	
	@Test(priority = 11)
	public void ExportacionMdrDeterminacionAutomatica() {
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

	 if (tq1 == true) {


			driver.navigate().to("http://as1-100-01-tq1:8000/timp/brb/#library");

		}else if (tp1==true ) {
			driver.navigate().to("http://as1-100-01-tp1:8000/timp/brb/#library");
			
		}else {
			driver.navigate().to("http://as1-100-01-tc2:8000/timp/mdr/#/library?cadastro=paymentGuides");
		}
		sleep(24000);
		
		String idDeterGui = idObter("demais");
		
		 System.out.println("ID Códigos de Contabilização: " + idDeterGui);
		 
		 bibliotecaEditarMDRPO.sendKeysToSearchBox(idDeterGui);
		 sleep(3000);
		
		 bibliotecaEditarMDRPO.clickOnSpMagnifyingGlass();
		 sleep(15000);
		 
		 bibliotecaEditarMDRPO.clickOnBtnActions();
		 sleep(4000);
		 
		 bibliotecaEditarMDRPO.clickOnBtnEditar();
		 sleep(72000);
		 System.out.println(" " );
		 System.out.println("---- Determinação Automática de Guias ----" );
		 System.out.println(" " );
		 
		 String empresa = driver.findElement(By.xpath("//div[@id=\"company\"]//div[@class=\"componentToSearch\"]")).getText();
		 System.out.println("Empresa: " + empresa);
		 
		 String descripcion   = driver.findElement(By.xpath("//div[@id=\"description\"]//textarea")).getAttribute("value");
		 System.out.println("Descrição: " + descripcion);
		 
		 String tributo   = driver.findElement(By.xpath("//div[@id=\"tax\"]//input")).getAttribute("value");
		 System.out.println("Tributo: " + tributo);
		 
		 String tipoImposto   = driver.findElement(By.xpath("//div[@id=\"taxType\"]//input")).getAttribute("value");
		 System.out.println("Tipo de Imposto: " +  tipoImposto);
		 
		 String componente   = driver.findElement(By.xpath("//div[@id=\"componentOutput\"]//input")).getAttribute("value");
		 System.out.println("Componente: " + componente );
		
		 String codigoConfi = driver.findElement(By.xpath("//div[@id=\"componentConfiguration\"]//input")).getAttribute("value");
		 System.out.println("Código Configuraçã: " + codigoConfi );
		
		 String codigoOutput = driver.findElement(By.xpath("//div[@id=\"outputCodePR\"]//input")).getAttribute("value");
		 System.out.println("Código Output: " + codigoOutput );
		 
		 String layout = driver.findElement(By.xpath("//div[@id=\"idLayout\"]//input")).getAttribute("value");
		 System.out.println("Layout Guia " + layout);
		 
		 String ConfiLayout = driver.findElement(By.xpath("//div[@id=\"idLayoutConfiguration\"]//input")).getAttribute("value");
		 System.out.println("Configuração do Layout " + ConfiLayout);
		 
		 ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		 
		 sucesso.add(empresa.contains("1000"));
		 sucesso.add(descripcion.contains("Determ. pagamento BCB 4701"));
		 sucesso.add(tributo.contains("IRPJ_CSLL"));
		 sucesso.add(tipoImposto.contains("IRPJ/CSLL"));
		 sucesso.add(componente.contains("BCB - Gestor de Consolidação"));
		 sucesso.add(codigoConfi.contains("4701 - BCB IRPJ -Michele Teste contab"));
		 sucesso.add(codigoOutput.contains("codigoOutput"));
		 sucesso.add(layout.contains("Leiaute Michele IRPJ"));
		 sucesso.add(ConfiLayout.contains("Conf. Michele IRPJ v2"));
		 
		 System.out.println( sucesso);
			
		 for (int i = 0; i < sucesso.size(); i++) {
				assertTrue(sucesso.get(i), visualizar);

			}
	}


}