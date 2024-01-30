package com.timp.test.TKM.Importacao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.RegrasDeNegocio.ParametrosGerais.BibliotecaRegraNegocioPO;
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

public class ImportacaoRegraNegocio extends TestBase {
	LoginTC loginTC;
	AcessarTKMPO acessarTKMPO;
	BibliotecaPEPO bibliotecaPEPO;
	GerenciarConteudoParaAgruparPO gerenciarConteudoParaAgruparPO;
	BibliotecaPIPO bibliotecaPO;
	BibliotecaRegraNegocioPO bibliotecaRegraNegocioPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTKMPO = new AcessarTKMPO();
		bibliotecaPEPO = new BibliotecaPEPO();
		gerenciarConteudoParaAgruparPO = new GerenciarConteudoParaAgruparPO();
		bibliotecaPO = new BibliotecaPIPO();
		bibliotecaRegraNegocioPO = new BibliotecaRegraNegocioPO();
	}

	@AfterClass
	public void afterClass() {
	}


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
		sleep(10000);
		
		bibliotecaPEPO.clickbtnPacoteExportado();
		sleep(2000);
		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[2]/div")).getText();
		  System.out.println("Ultimo registro: " + id);
		
		bibliotecaPEPO.clickbtnNovo();
		sleep(2000);
		
		bibliotecaPEPO.fillOutTxtNome("Test TA Regra Negocio");
		sleep(2000);
		
		bibliotecaPEPO.fillOutTxtdescripcion("Ciclo TA ");
		sleep(2000);
		
		bibliotecaPEPO.clickbtnGravar();
		sleep(4000);
		
		String idultimo = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[2]/div")).getText();
		System.out.println(id);
		System.out.println("Id Creado: "+ idultimo);
		idInserir("regraNegocio",idultimo);
		 
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
		
		String idultimo = idObter("regraNegocio");
		
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
		
		gerenciarConteudoParaAgruparPO.clickbtnOpcComponenteBRE();
		sleep(3000);
		
		gerenciarConteudoParaAgruparPO.clickbtnModelo();
		sleep(2000);
		
		gerenciarConteudoParaAgruparPO.clickbtnOpcModeloBRE();
		sleep(3000);
		
		
		
		gerenciarConteudoParaAgruparPO.clickbtnGravar();
		sleep(2000);
	
		String idBRB = "";
		if (tq1 == true) {

			idBRB="5067";
		}else {
			idBRB="5188";
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
		 
		 sucesso.add(componente.contains("BRE"));
		 sucesso.add(modelo.contains("Rule"));
		 
		 gerenciarConteudoParaAgruparPO.clickbtnBiblioteca();
		 sleep(2000);
		 
		 for (int i = 0; i < sucesso.size(); i++) {
				assertTrue(sucesso.get(i), visualizar);

			}
		
		 
			
		 

	}
	@Test(priority = 2)
	public void Exportar() {
		
		sleep(2000);
		
		String idultimo = idObter("regraNegocio");
		
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
		sleep(4000);

		acessarTKMPO.acessarTKM();
		sleep(10000);;
		
		bibliotecaPO.clickbtnPacoteImportado();
		sleep(2000);
		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[2]/div")).getText();
		System.out.println("Ultimo registro: " + id);
		
		bibliotecaPO.clickbtnImportar();
		sleep(5000);
		
		WebElement fileInput = driver.findElement(By.name("file"));
		String filePath = "C:\\Users\\user_ta\\Downloads\\Test TA Regra Negocio.bdl";
		fileInput.sendKeys(filePath);
		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		bibliotecaPO.clickbtnSubir();
		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idultimo = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[2]/div")).getText();
		System.out.println(id);
		System.out.println("Id Creado: "+ idultimo);
		idInserir("regraNegocioImportado",idultimo);
		 
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
	
	@Test(priority = 4)
	public void VerificarInf() {
		
		loginTC.login();
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


			driver.navigate().to("http://as1-100-01-tq1:8000/timp/tkm/#library");

		}else if (tp1==true ) {
			driver.navigate().to("http://as1-100-01-tp1:8000/timp/tkm/#library");
			
		}else {
			driver.navigate().to("http://as1-100-01-tc2:8000/timp/tkm/#library");
		}
		sleep(10000);
		
		bibliotecaPO.clickbtnPacoteImportado();
		sleep(2000);
		
		String idultimo = idObter("regraNegocioImportado");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idultimo+"\"]/div[1]/div"));	
		actionsMoveToElement(menu);
		sleep(2000);

		menu.click();
		sleep(1000);
		
		String id = "";
		if (tq1 == true) {

			id="5188";
		}else {
			id="5067";
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
		 

		 idInserir("regra Destino",idDestino);
		
		 ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		 
		 sucesso.add(componente.contains("BRE"));
		 sucesso.add(modelo.contains("Rule"));
		 sucesso.add(idOrigem.equals(id));

	
		 for (int i = 0; i < sucesso.size(); i++) {
				assertTrue(sucesso.get(i), visualizar);

			}
		
		 
			
		 

	}

	@Test(priority = 5)
	public void VerificarRegraImportado() {
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		String idDestino = idObter("regra Destino");
		 System.out.println("-------------------------------------------------"); 
		 System.out.println("Verificar Regra ");
		
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


			driver.navigate().to("http://as1-100-01-tq1:8000/timp/bre/#/library");

		}else if (tp1==true ) {
			driver.navigate().to("http://as1-100-01-tp1:8000/timp/bre/#/library");
			
		}else {
			driver.navigate().to("http://as1-100-01-tc2:8000/timp/bre/#/library");
		}
		sleep(10000);
		
		bibliotecaRegraNegocioPO.clickbtnRegraNegocio();
		sleep(4000);
		
		bibliotecaRegraNegocioPO.fillOutTxtBusqueda(idDestino);
		sleep(2000);
		
		bibliotecaRegraNegocioPO.clickbtnBusqueda();
		sleep(6000);
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idDestino+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idDestino+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		actionsMoveToElement(menu);
		sleep(2000);
		
		menu.click();
		sleep(1000);
		
		editar.click();
		sleep(6000);
		
		String   camino1 = "";
		String   camino2 = "";
		String  camino1tq1 = "";
		String  camino2tq1 = "";
		
		
		
		
		
		if (tq1 == true) {

			waitExpectedElement("//span[text()=\"Adicionar Caminho\"]");
			camino1 = driver.findElement(By.xpath("//div[@id=\"graph\"]/*/*/*[1]")).getText();
			System.out.println("primer campo del camino: " + camino1);
			
			camino2 = driver.findElement(By.xpath("//div[@id=\"graph\"]/*/*/*[2]")).getText();
			System.out.println("segundo campo del camino: " + camino2);
			 
			 
			
			
			camino1tq1 = "Código da conta contábil Pertence[ = '11309001' , = '11309002' , ='21401005' , = '21401002' ]";
			camino2tq1  = "Total Movimento (SUM(Valor dodocumento contábil (em moedainterna))) = 0";
	
		
			
			
		}else if (tp1==true ) {
			driver.navigate().to("http://as1-100-01-tp1:8000/timp/brb/#library");
			
		}else {
			
			waitExpectedElement("//span[text()=\"Adicionar Caminho\"]");
			camino1 = driver.findElement(By.xpath("//div[@id=\"graph\"]/*/*/*[1]")).getText();
			System.out.println("Nome Regra: " + camino1);
			
			camino2 = driver.findElement(By.xpath("//div[@id=\"graph\"]/*/*/*[2]")).getText();
			System.out.println("Descripción Regra: " + camino2);

			camino1tq1 = "Código da conta contábil Pertence[ = '11309001' , = '11309002' , ='21401005' , = '21401002' ]";
			camino2tq1  = "Total Movimento (SUM(Valor dodocumento contábil (em moedainterna))) = 0";
			
			
		}
		
		 
		sleep(3000);
		WebElement Configu = driver.findElement(By.xpath("//span[text()=\"Configurações\"]"));
		Configu.click();
		sleep(4000);
		
		String   nomeRegra = "";
		String   descripcionRegra = "";
		String   tipodeRegra = ""; 
		String   componente = "";
		String   estruturaDeDados = "";
		String   característicaEspecial = "";
		String   abas = "";
		
		String     nomeRegratq1 = ""; 
		String   descripcionRegratq1 = ""; 
		String   tipodeRegratq1 = "";
		String   componentetq1 = "";
		String   estruturaDeDadostq1 = "";
		String   característicaEspecialtq1 = "";
		String   abastq1 = "";
		
	
		if (tq1 == true) {

			 System.out.println("-------------------------------------------------"); 
			 nomeRegra = driver.findElement(By.xpath("//div[@class=\"base-input-wrapper\"]//input")).getAttribute("value");
			System.out.println("Nome Regra: " + nomeRegra);
			
			descripcionRegra = driver.findElement(By.xpath("//td[@class=\"description-field\"]//textarea")).getAttribute("value");
			System.out.println("Descripción Regra: " + descripcionRegra);
			
			tipodeRegra = driver.findElement(By.xpath("//td[@class=\"ruletype-field\"]//input")).getAttribute("value");
			System.out.println("Tipo de Regra: " + tipodeRegra);
			
			componente = driver.findElement(By.xpath("//td[@class=\"component-field\"]//input")).getAttribute("value");
			System.out.println("Componente: " + componente);
			
			estruturaDeDados = driver.findElement(By.xpath("//td[@class=\"datastructure-field\"]//input")).getAttribute("value");
			System.out.println("Estrutura De Dados: " + estruturaDeDados);
			
			característicaEspecial = driver.findElement(By.xpath("//td[@class=\"special-field\"]//input")).getAttribute("value");
			System.out.println("Característica Especial: " + característicaEspecial);
			
			abas = driver.findElement(By.xpath("//td[@class=\"tab-field\"]//input")).getAttribute("value");
			System.out.println("Abas: " + abas);
			
			nomeRegratq1 = "Regra Registro E112 - Oficial";
			descripcionRegratq1 = "Regra Registro E112 - Oficial";
			tipodeRegratq1 = "Negócio";
			componentetq1 = "TAA";
			estruturaDeDadostq1 = "Definição de Campos por Tab";
			característicaEspecialtq1 = "Campos";
			abastq1 = "Registro E112";
			
			 sucesso.add( camino2tq1 .contains(camino2));
			 sucesso.add( camino1tq1 .contains(camino1 ));
			 sucesso.add( nomeRegratq1 .contains(nomeRegra ));
			 sucesso.add( descripcionRegratq1 .contains(descripcionRegra ));
			 sucesso.add( tipodeRegratq1 .contains(tipodeRegra ));
			 sucesso.add( componentetq1 .contains(componente ));
			 sucesso.add( estruturaDeDadostq1 .contains(estruturaDeDados ));
			 sucesso.add( característicaEspecialtq1 .contains(característicaEspecial ));
			 sucesso.add( abastq1 .contains(abas));
			
		}else if (tp1==true ) {
			driver.navigate().to("http://as1-100-01-tp1:8000/timp/brb/#library");
			
		}else {
		
			 System.out.println("-------------------------------------------------"); 
			 nomeRegra = driver.findElement(By.xpath("//div[@class=\"base-input-wrapper\"]//input")).getAttribute("value");
			System.out.println("Nome Regra: " + nomeRegra);
			
			descripcionRegra = driver.findElement(By.xpath("//td[@class=\"description-field\"]//textarea")).getAttribute("value");
			System.out.println("Descripción Regra: " + descripcionRegra);
			
			tipodeRegra = driver.findElement(By.xpath("//td[@class=\"ruletype-field\"]//input")).getAttribute("value");
			System.out.println("Tipo de Regra: " + tipodeRegra);
			
			componente = driver.findElement(By.xpath("//td[@class=\"component-field\"]//input")).getAttribute("value");
			System.out.println("Componente: " + componente);
			
			estruturaDeDados = driver.findElement(By.xpath("//td[@class=\"datastructure-field\"]//input")).getAttribute("value");
			System.out.println("Estrutura De Dados: " + estruturaDeDados);
			
			
			nomeRegratq1 = "Análise Mov Contábil - FSM";
			descripcionRegratq1 = "  ";
			tipodeRegratq1 = "Negócio";
			componentetq1 = "BRB";
			estruturaDeDadostq1 = "Lançamento Contábil";
			
			 sucesso.add( nomeRegratq1 .contains(nomeRegra ));
			 sucesso.add( descripcionRegratq1 .contains(descripcionRegra ));
			 sucesso.add( camino2tq1 .contains(camino2));
			 sucesso.add( camino1tq1 .contains(camino1 ));
			 sucesso.add( tipodeRegratq1 .contains(tipodeRegra ));
			 sucesso.add( componentetq1 .contains(componente ));
			 sucesso.add( estruturaDeDadostq1 .contains(estruturaDeDados ));
			
		}
			
			 
		
		 System.out.println( sucesso);
		 
		 for (int i = 0; i < sucesso.size(); i++) {
				assertTrue(sucesso.get(i), visualizar);

			}
			
			sleep(2000);
		
	}
		
		
		

}