package com.timp.test.TKM.Importacao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRB.BibliotecaBRBPO;
import com.sap.timp.pageObjectModel.BRB.ExecutePO;
import com.sap.timp.pageObjectModel.BRB.ExportarPO;
import com.sap.timp.pageObjectModel.TKM.AcessarTKMPO;
import com.sap.timp.pageObjectModel.TKM.conteudoDeTransporte.PacoteExportado.GerenciarConteudoParaAgruparPO;
import com.sap.timp.pageObjectModel.TKM.conteudoDeTransporte.PacoteImportado.BibliotecaPIPO;
import com.timp.test.TKM.Exportacao.ExportacaoRelatórioBRB;
import com.sap.timp.pageObjectModel.TKM.conteudoDeTransporte.PacoteExportado.BibliotecaPEPO;


import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;

public class ImportacaoRelatórioBRB extends TestBase {
	LoginTC loginTC;
	BibliotecaPIPO bibliotecaPIPO;
	ExecutePO executePO;
	BibliotecaBRBPO bibliotecaBRBPO;
	ExportacaoRelatórioBRB 	exportacaoRelatórioBRB;
	GerenciarConteudoParaAgruparPO gerenciarConteudoParaAgruparPO;
	BibliotecaPEPO bibliotecaPEPO;
	AcessarTKMPO acessarTKMPO;

	
	

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		bibliotecaPIPO = new BibliotecaPIPO();
		executePO = new ExecutePO();
		bibliotecaBRBPO = new BibliotecaBRBPO();
		exportacaoRelatórioBRB = new ExportacaoRelatórioBRB();
		gerenciarConteudoParaAgruparPO = new GerenciarConteudoParaAgruparPO();
		bibliotecaPEPO = new BibliotecaPEPO();
		acessarTKMPO = new AcessarTKMPO();
		
	}

	@AfterClass
	public void afterClass() {
	}

	@Test(priority = 0)
	public void CriarExportar() {
		

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
		sleep(10000);
		
		bibliotecaPEPO.clickbtnPacoteExportado();
		sleep(4000);
		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[2]/div")).getText();
		  System.out.println("Ultimo registro: " + id);
		
		bibliotecaPEPO.clickbtnNovo();
		sleep(2000);
		
		bibliotecaPEPO.fillOutTxtNome("BRB TA");
		sleep(2000);
		
		bibliotecaPEPO.fillOutTxtdescripcion("Ciclo TA ");
		sleep(2000);
		
		bibliotecaPEPO.clickbtnGravar();
		sleep(4000);
		
		String idultimo = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[2]/div")).getText();
		System.out.println(id);
		System.out.println("Id Creado: "+ idultimo);
		idInserir("relatorio",idultimo);
		 
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
	
	@Test(priority = 2)
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
		
		String idultimo = idObter("relatorio");
		
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
		
		gerenciarConteudoParaAgruparPO.clickbtnOpcComponente();
		sleep(3000);
		
		gerenciarConteudoParaAgruparPO.clickbtnModelo();
		sleep(2000);
		
		gerenciarConteudoParaAgruparPO.clickbtnOpcModelo();
		sleep(3000);
		
		
		gerenciarConteudoParaAgruparPO.clickbtnGravar();
		sleep(2000);
		
		String idBRB = "";
		if (tq1 == true) {

			idBRB="8004760";
		}else {
			idBRB="5307";
		}
		sleep(2000);
		
		gerenciarConteudoParaAgruparPO.fillOutTxtBusqueda(idBRB);
		sleep(2000);
		
		gerenciarConteudoParaAgruparPO.clickbtnBusqueda();
		sleep(2000);
		
		WebElement busqueda = driver.findElement(By.xpath("//div[@data-id=\""+idBRB+"\"]//span"));
		
		busqueda.click();
		sleep(1000);
		
		
		gerenciarConteudoParaAgruparPO.clickbtnGravar();
		sleep(5000);
		
		 String componente = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[3]/div")).getText();
		 System.out.println("Componente Agregado: " + componente);
		 
		 String modelo = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[4]/div")).getText();
		 System.out.println("Modelo Agregado: " + modelo);
		 
		 ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		 
		 sucesso.add(componente.contains("BRB"));
		 sucesso.add(modelo.contains("Report"));
		 
		 gerenciarConteudoParaAgruparPO.clickbtnBiblioteca();
		 sleep(2000);
		 
		 for (int i = 0; i < sucesso.size(); i++) {
				assertTrue(sucesso.get(i), visualizar);

			}

	}
	
	@Test(priority = 3)
	public void Exportar() {
		
		sleep(2000);
		
		String idultimo = idObter("relatorio");
		
		String fechaExportación = driver.findElement(By.xpath("//div[@data-id=\""+idultimo+"\"]/div[6]//div")).getText();
		System.out.println("Fecha Exportación sin realizar el proceso: " + fechaExportación);
		
		 ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(fechaExportación.equals(""));
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idultimo+"\"]/div[1]/div"));
		WebElement exportar = driver.findElement(By.xpath("//div[@data-id=\""+idultimo+"\"]/div[1]/div/div[2]//span[text()=\" Exportação\"]"));
		
		actionsMoveToElement(menu);
		sleep(2000);

		menu.click();
		sleep(1000);
		exportar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(12000);
		
		bibliotecaPEPO.clickbtnBaxiar();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(12000);
		
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
	@Test(priority = 4)
	public void Criar() {
		
		
		sleep(4000);
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
		
		sleep(3000);
		
		loginTC.login();
		sleep(3000);
		
		acessarTKMPO.acessarTKM();
		sleep(10000);
		
		bibliotecaPIPO.clickbtnPacoteImportado();
		sleep(2000);
		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[2]/div")).getText();
		System.out.println("Ultimo registro: " + id);
		
		bibliotecaPIPO.clickbtnImportar();
		sleep(6000);
		
		WebElement fileInput = driver.findElement(By.name("file"));
		String filePath = "C:\\Users\\user_ta\\Downloads\\BRB TA.bdl";
		fileInput.sendKeys(filePath);
		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		bibliotecaPIPO.clickbtnSubir();
		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idultimo = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[2]/div")).getText();
		System.out.println(id);
		System.out.println("Id Creado: "+ idultimo);
		idInserir("relatorioImportado",idultimo);
		 
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
	
	@Test(priority = 5)
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
		
		String idultimo = idObter("relatorioImportado");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idultimo+"\"]/div[1]/div"));	
		actionsMoveToElement(menu);
		sleep(2000);

		menu.click();
		sleep(1000);
		
		String idBRB = "";
		if (tq1 == true) {

			idBRB="5307";
		}else {
			idBRB="8004760";
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
		 
			idInserir("Id Destino",idDestino);
		 
		 ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		 
		 sucesso.add(componente.contains("BRB"));
		 sucesso.add(modelo.contains("Report"));
		 sucesso.add(idOrigem.equals(idBRB));
		 System.out.println( sucesso);

		 
		 
		 for (int i = 0; i < sucesso.size(); i++) {
				assertTrue(sucesso.get(i), visualizar);

			}
		
		 
			
	}

	@Test(priority = 6)
	public void Exportacion() {
		
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
		sleep(18000);

		
		bibliotecaBRBPO.clickOnBtncadastro();
		sleep(6000);
		
		String idDestino =idObter("Id Destino");
		
		bibliotecaBRBPO.fillOutSearchBox(idDestino);
		sleep(3000);
		
		bibliotecaBRBPO.clickOnSpMagnifyingGlass();
		sleep(6000);
		
		bibliotecaBRBPO.clickOnBtnActions();
		sleep(1000);
		
		bibliotecaBRBPO.clickOnBtnExecute();
		sleep(12000);
		
		executePO.clickOnBtnExecute();
		sleep(30000);
		
		WebElement  Info = driver.findElement(By.xpath("//span[text()=\"Biblioteca\"]"));
		
		if (tq1 == true) {

			waitExpectedElement("//div[@data-column=\"1\" and contains(@aria-label, \"Linha: 6-1.\")]//div[2]");
		    Info = driver.findElement(By.xpath("//div[@data-column=\"1\" and contains(@aria-label, \"Linha: 6-1.\")]//div[2]"));
			System.out.println("dato: " + Info);
			
			
		}else if (tp1==true ) {
			driver.navigate().to("http://as1-100-01-tp1:8000/timp/brb/#library");
			
		}else {
			
			waitExpectedElement("//div[@data-column=\"n0\" and contains(@aria-label, \"Linha: 1-n0.\")]//div[2]");
			 Info = driver.findElement(By.xpath("//div[@data-column=\"n0\" and contains(@aria-label, \"Linha: 1-n0.\")]//div[2]"));
			System.out.println("dato: " + Info);
		}
		
		
		boolean sucesso = Info.isDisplayed();
		assertTrue(sucesso, "The element is not present");
	}


}