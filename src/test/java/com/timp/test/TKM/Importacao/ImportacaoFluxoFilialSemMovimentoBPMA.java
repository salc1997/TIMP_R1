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

public class ImportacaoFluxoFilialSemMovimentoBPMA extends TestBase {
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
		
		bibliotecaPEPO.fillOutTxtNome("Test TA BPMA Sem Movimiento");
		sleep(2000);
		
		bibliotecaPEPO.fillOutTxtdescripcion("Ciclo TA ");
		sleep(2000);
		
		bibliotecaPEPO.clickbtnGravar();
		sleep(4000);
		
		String idultimo = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[2]/div")).getText();
		System.out.println(id);
		System.out.println("Id Creado: "+ idultimo);
		idInserir("expBPMASemMovi",idultimo);
		 
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
		sleep(6000);
		String idultimo = idObter("expBPMASemMovi");
		
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idultimo+"\"]/div[1]/div"));
		WebElement agrupar = driver.findElement(By.xpath("//div[@data-id=\""+idultimo+"\"]/div[1]/div/div[2]//span[text()=\"Gerenciar Conte�do para Agrupar\"]"));
		
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
		
		gerenciarConteudoParaAgruparPO.clickbtnOpcComponenteBPMA();
		sleep(3000);
		
		gerenciarConteudoParaAgruparPO.clickbtnModelo();
		sleep(2000);
		
		gerenciarConteudoParaAgruparPO.clickbtnOpcModeloBPMA();
		sleep(3000);
		
		
		
		gerenciarConteudoParaAgruparPO.clickbtnGravar();
		sleep(2000);
	
		String idBPMA = "";
		if (tq1 == true) {

			idBPMA="2009";
		}else {
			idBPMA="585";
		}
		sleep(2000);
		
		gerenciarConteudoParaAgruparPO.fillOutTxtBusqueda(idBPMA);
		sleep(2000);
		
		gerenciarConteudoParaAgruparPO.clickbtnBusqueda();
		sleep(2000);
		
		WebElement busqueda = driver.findElement(By.xpath("//div[@data-id=\""+idBPMA+"\"]//span"));
		
		busqueda.click();
		sleep(1000);
		
		
		gerenciarConteudoParaAgruparPO.clickbtnGravar();
		sleep(5000);
		
		 String componente = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[3]/div")).getText();
		 System.out.println("Componente Agregado: " + componente);
		 
		 String modelo = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[4]/div")).getText();
		 System.out.println("Modelo Agregado: " + modelo);
		 
		 ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		 
		 sucesso.add(componente.contains("BPMA"));
		 sucesso.add(modelo.contains("Processes"));
		 
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
		
		String idultimo = idObter("expBPMASemMovi");
		
		String fechaExportaci�n = driver.findElement(By.xpath("//div[@data-id=\""+idultimo+"\"]/div[6]//div")).getText();
		System.out.println("Fecha Exportaci�n sin realizar el proceso: " + fechaExportaci�n);
		
		 ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(fechaExportaci�n.equals(""));
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idultimo+"\"]/div[1]/div"));
		WebElement exportar = driver.findElement(By.xpath("//div[@data-id=\""+idultimo+"\"]/div[1]/div/div[2]//span[text()=\"Iniciar Exporta��o em Background\"]"));
		
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
		  
		  while (status.equals("Exporta��o") ) {
		 
			 driver.navigate().refresh();
			 sleep(10000);
			 invisibilityOfElementOverlay();
			 sleep(15000);
			  
			 bibliotecaPEPO.clickbtnPacoteExportado();
			 sleep(2000);
			
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
		
		String fechaExportaci�n2 = driver.findElement(By.xpath("//div[@data-id=\""+idultimo+"\"]/div[6]//div")).getText();
		System.out.println("Fecha Exportaci�n: " + fechaExportaci�n2);
		
		sucesso.add(fechaExportaci�n2.equals(fecha));
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
		String filePath = "C:\\Users\\user_ta\\Downloads\\Test TA BPMA Sem Movimiento.bdl";
		fileInput.sendKeys(filePath);
		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		bibliotecaPO.clickbtnSubir();
		sleep(100000);
		System.out.println("SUBIOO");
		sleep(900000);
		
		String idultimo = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[2]/div")).getText();
		System.out.println(id);
		System.out.println("Id Creado: "+ idultimo);
		idInserir("regraBpmaSemMovimiento",idultimo);
		 
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
		sleep(4000);
		
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
		
		String idultimo = idObter("regraBpmaSemMovimiento");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idultimo+"\"]/div[1]/div"));	
		actionsMoveToElement(menu);
		sleep(2000);

		menu.click();
		sleep(1000);
		
		String id = "";
		if (tq1 == true) {

			id="585";
			
		}else {
			
			id="2009";
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
		 

		 idInserir("bpmaDestino",idDestino);
		
		 ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		 
		 sucesso.add(componente.contains("BPMA"));
		 sucesso.add(modelo.contains("Processes"));
		 sucesso.add(idOrigem.equals(id));

	
		 for (int i = 0; i < sucesso.size(); i++) {
				assertTrue(sucesso.get(i), visualizar);

			}
 

	}

	@Test(priority = 6)
	public void VerificarBPMAImportado() {
	
	
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
	
   sleep(8000);
	
 
	
	if (tq1 == true) {


		driver.navigate().to("http://as1-100-01-tq1:8000/timp/bpma/#library");

	}else if (tp1==true ) {
		driver.navigate().to("http://as1-100-01-tp1:8000/timp/bpma/#library");
		
	}else {
		driver.navigate().to("http://as1-100-01-tc2:8000/timp/bpma/#library");
	}
	
	sleep(4000);
	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	sleep(6000);
	
	String idultimo = idObter("regraBpmaSemMovimiento");
	String idDestinoBRE = idObter("bpmaDestino");
	
	WebElement negocio = driver.findElement(By.xpath("//span[text()=\"Processos de Negocio\"]"));
	
	negocio.click();
	sleep(4000);
	
	WebElement ultinaPagina = driver.findElement(By.xpath("//div[contains(@class,\"icon-right\")][2]"));
	
	ultinaPagina.click();
	sleep(4000);
	
	System.out.println("Id Destino: "+ idDestinoBRE);
	
	WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idDestinoBRE+"\"]/div[1]/div"));
	WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idDestinoBRE+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
	actionsMoveToElement(menu);
	sleep(2000);
	
	menu.click();
	sleep(1000);
	
	editar.click();
	sleep(12000);
	
	String   nomeRegra = "";
	String   descripcionRegra = "";
	String   a�oes = "";
	
	String  nomeRegratq1 = "";
	String  descripcionRegratq1 = "";
	String  a�oestq1 = "";
	
	if (tq1 == true) {

		waitExpectedElement("//span[text()=\"Adicionar Caminho\"]");
		 nomeRegra = driver.findElement(By.xpath("//div[@id=\"graph\"]/*/*/*[1]")).getText();
		System.out.println("Nome Regra: " + nomeRegra);
		
		descripcionRegra = driver.findElement(By.xpath("//div[@id=\"graph\"]/*/*/*[2]")).getText();
		System.out.println("Descripci�n Regra: " + descripcionRegra);
		 
		 a�oes = driver.findElement(By.xpath("//div[@id=\"graph\"]/*/*/*[4]")).getText();
		System.out.println("A�oes: " +  a�oes);
		

		 nomeRegratq1 = "Status daCorre��o PT='Corrigido'";
		 descripcionRegratq1 = "Nome doCampo ='VL_ICMSST'";
		 a�oestq1 = "ContabilizarCorre��o";
	
		
		
	}else if (tp1==true ) {
		driver.navigate().to("http://as1-100-01-tp1:8000/timp/brb/#library");
		
	}else {
		
		waitExpectedElement("//span[text()=\"Adicionar Caminho\"]");
		 nomeRegra = driver.findElement(By.xpath("//div[@id=\"graph\"]/*/*/*[1]")).getText();
		System.out.println("Nome Regra: " + nomeRegra);
		
		descripcionRegra = driver.findElement(By.xpath("//div[@id=\"graph\"]/*/*/*[2]")).getText();
		System.out.println("Descripci�n Regra: " + descripcionRegra);
		 
		 a�oes = driver.findElement(By.xpath("//div[@id=\"graph\"]/*/*/*[3]")).getText();
		System.out.println("A�oes: " +  a�oes);
		
		
		
		 nomeRegratq1 = " Docnum = data tablaexterna - DOCNUM";
		 descripcionRegratq1 = "Item-docnum = datatabla externa -ITEM";
		 a�oestq1 = "CORRIGIR DATA VE";
		
	}

	
	
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		 
	 sucesso.add( nomeRegratq1.contains(nomeRegra));
	 sucesso.add( descripcionRegratq1.contains(descripcionRegra));
	 sucesso.add( a�oestq1.contains(a�oes));
	 
	 for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizar);

		}
		
		sleep(2000);
	
}
		
		
		

}