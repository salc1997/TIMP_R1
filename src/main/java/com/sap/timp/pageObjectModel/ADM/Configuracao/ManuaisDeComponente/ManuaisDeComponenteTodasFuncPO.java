
package com.sap.timp.pageObjectModel.ADM.Configuracao.ManuaisDeComponente;

import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ManuaisDeComponenteTodasFuncPO extends TestBaseSteven {
	
	@FindBy(xpath = "//div[@class=\"baseTabs-bar boxes\"]/div/div[2]")
	public WebElement Configuração;
	
	@FindBy(xpath = "//span[text()=\"Manuais de Componente\"]")
	public WebElement ManuaisDeComponente;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//span[text()=\"Novo Manual de Componente\"]")
	public WebElement btnNovo;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Componente\"]")
	public WebElement componente;
	
	@FindBy(xpath = "//*[@id=\"option-1\"]")
	public WebElement componenteOpc;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione Idioma\"]")
	public WebElement idioma;
	
	@FindBy(xpath = "//*[@id=\"option-1\"]")
	public WebElement idiomaOpc;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione Data de Início de Vigência\"]")
	public WebElement fecha;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnSim;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca; 
	

	@FindBy(xpath = "//div[@class=\"detail-content\"]/div/div[1]/div[2]")
	public WebElement idV;
	
	@FindBy(xpath = "//div[@class=\"detail-content\"]/div/div[2]/div[2]")
	public WebElement componenteV;
	
	@FindBy(xpath = "//div[@class=\"detail-content\"]/div/div[3]/div[2]")
	public WebElement idiomaV;
	
	@FindBy(xpath = "//div[@class=\"detail-content\"]/div/div[4]/div[2]")
	public WebElement inicioVigenciaV;
	
	@FindBy(xpath = "//div[@class=\"detail-content\"]/div/div[6]/div[2]/div[1]")
	public WebElement usuarioCriadoV;
	
	@FindBy(xpath = "//div[@class=\"detail-content\"]/div/div[6]/div[2]/div[1]/span")
	public WebElement dataCriadoV;
	
	@FindBy(xpath = "//div[@class=\"detail-content\"]/div/div[6]/div[2]/div[2]")
	public WebElement usuarioModificadoV;

	@FindBy(xpath = "//div[@class=\"detail-content\"]/div/div[6]/div[2]/div[2]/span")
	public WebElement dataModificadoV;
	
	@FindBy(xpath = "//div[@class=\"form-info\"]/table/tbody/tr[1]/td[1]/span")
	public WebElement componenteV1;
	
	@FindBy(xpath = "//div[@class=\"form-info\"]/table/tbody/tr[1]/td[2]/span")
	public WebElement idiomaV1;
	
	@FindBy(xpath = "//div[@class=\"form-info\"]/table/tbody/tr[3]/td[1]/span")
	public WebElement inicioVigenciaV1;
	
	@FindBy(xpath = "//*[@id=\"reset-filters-btn\"]/span[2]")
	public WebElement limparFiltros;
	
	@FindBy(xpath = "//*[@id=\"advanced-filters-btn\"]/span[2]")
	public WebElement filtrar;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Filtrar por Usuário de Criação\"]")
	public WebElement usuarioCreador;
	
	@FindBy(xpath = "//input[@placeholder=\"Filtrar por Usuário de Modificação\"]")
	public WebElement usuarioModificador;
	
	@FindBy(xpath = "//li[text()=\"TESTEAUTOMATIZADO TESTEAUTOMATIZADO\"]")
	public WebElement opcUsuarios;
	
	//filtros
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement btnAceitar;
	
	public ManuaisDeComponenteTodasFuncPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000); 

		Configuração.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ManuaisDeComponente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		invisibilityOfElementOverlay();
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		
		String id = "0"; // Ultimo ID antes de crear un registro
		
		if(rows > 0) {
			id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
			System.out.println("ID Ultimo Registro: " + id);
		}
		btnNovo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		componente.click();
		sleep(2000);
		componenteOpc.click();
		sleep(2000);
		
		idioma.click();
		sleep(2000);
		componenteOpc.click();
		sleep(2000);
		

		//File filePath = new File("C:\\Users\\AGILE SOLUTIONS\\Desktop\\automatizacion.txt");
		File filePath = new File("C:\\Users\\user_ta\\Desktop\\automatizacion.txt"); 
		String pathString = filePath.getAbsolutePath();
		
		driver.findElement(By.className("file-uploader")).sendKeys(pathString);
		sleep(11000);

		
		String valorAEnviar = fechaActual();
		
		fecha.sendKeys(valorAEnviar);
		sleep(6000);
	
		btnGravar.click();
		sleep(2000);
		
		btnSim.click();
		sleep(2000);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnBiblioteca.click();
		sleep(2000);
//		btnSim.click();
//		sleep(2000);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		
		
		boolean sucesso = false;

		// Se obtiene el primer registro de la tabla
		String idPrimerRegistro = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText(); 
		System.out.println("");
		System.out.println("ID Ultimo nuevo registro: " + idPrimerRegistro);
		
		int id1 = convertToInt(id);
		int id2 = convertToInt(idPrimerRegistro);
		
		//compara pra ver se o novo id criado é realmente o ultimo		  
		if (id2 > id1) { 
			sucesso = true; 
			idInserir("ManuaisDeComponente",idPrimerRegistro);
			System.out.println("Registro creado...");
		}
		
		return sucesso;
	}
	public boolean editar() {
		
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000); 

		Configuração.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ManuaisDeComponente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		invisibilityOfElementOverlay();
		
		String idRegistro = idObter("ManuaisDeComponente");
		System.out.println("ID Registro: " + idRegistro);
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String valorOriginal = fecha.getAttribute("value");
		System.out.println("");
		System.out.println("fecha original: " + valorOriginal);
		
		String valorAEnviar = fechaManana();
		System.out.println("");
		System.out.println("Inicio de Vigencia valor a enviar: " + valorAEnviar);
		
		fecha.clear();
		sleep(4000);
		fecha.sendKeys(valorAEnviar);
		sleep(4000);
		
		btnGravar.click();
		sleep(2000);
		
		btnSim.click();
		sleep(2000);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		driver.navigate().refresh();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
		attributoNotToBeEmptyElement(fecha, "value");
		String valorEditado = fecha.getAttribute("value");
		System.out.println("");
		System.out.println("Inicio de Vigencia valor editado: " + valorEditado);
		
		boolean sucesso = false;
		
		if(valorEditado.equals(valorAEnviar)) {
			System.out.println("Registro editado correctamente...");
			sucesso = true;
		}else {
			System.out.println("No se pudo editar el registro...");
		}
		
		btnBiblioteca.click();
		sleep(2000);
		
		return sucesso;

	}
	
	public ArrayList<Boolean> Detalle() {
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		Configuração.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ManuaisDeComponente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		String id = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]/div[3]/div")).getText();
		String componente = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]/div[4]/div")).getText();
		String idioma = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]/div[5]/div")).getText();
		String inicioVigencia = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]/div[6]/div")).getText();
		String usuarioCriado = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]/div[8]/div")).getText();
		String dataCriado = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]/div[9]/div")).getText();
		String usuarioModificado = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]/div[10]/div")).getText();
		String dataModificado = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]/div[11]/div")).getText();
		
		System.out.println(id);
		System.out.println(componente);
		System.out.println(idioma);
		System.out.println(inicioVigencia);
		System.out.println(usuarioCriado);
		System.out.println(dataCriado);
		System.out.println(usuarioModificado);
		System.out.println(dataModificado);
		
		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhe\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idVisualizar = idV.getText();
		String componenteVisualizar = componenteV.getText();
		String idiomaVisualizar = idiomaV.getText();
		String inicioVigenciaVisualizar = inicioVigenciaV.getText();
		String usuarioCriadoVisualizar = usuarioCriadoV.getText();
		String dataCriadoVisualizar = dataCriadoV.getText();
		String usuarioModificadoisualizar = usuarioModificadoV.getText();
		String dataModificadoVisualizar = dataModificadoV.getText();
		
		System.out.println(componenteVisualizar);
		System.out.println(idiomaVisualizar);
		System.out.println(inicioVigenciaVisualizar);
		System.out.println(usuarioCriadoVisualizar);
		System.out.println(dataCriadoVisualizar);
		System.out.println(usuarioModificadoisualizar);
		System.out.println(dataModificadoVisualizar);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(idVisualizar.equals(id));
		sucesso.add(componenteVisualizar.equals(componente));
		sucesso.add(inicioVigenciaVisualizar.equals(inicioVigencia));
		sucesso.add(idiomaVisualizar.equals(idioma));
		sucesso.add(usuarioCriadoVisualizar.contains(usuarioCriado));
		sucesso.add(dataCriadoVisualizar.equals(dataCriado));
		sucesso.add(usuarioModificadoisualizar.contains(usuarioModificado));
		sucesso.add(dataModificadoVisualizar.contains(dataModificado));
		
		System.out.println(sucesso);
		return sucesso;
	}
	
	public ArrayList<Boolean> visualizar() {
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		Configuração.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ManuaisDeComponente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String id = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]/div[3]/div")).getText();
		String componente = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]/div[4]/div")).getText();
		String idioma = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]/div[5]/div")).getText();
		String inicioVigencia = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]/div[6]/div")).getText();
	
		System.out.println(id);
		System.out.println(componente);
		System.out.println(idioma);
		System.out.println(inicioVigencia);
		
		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
		String componenteVisualizar = componenteV1.getText();
		String idiomaVisualizar = idiomaV1.getText();
		String inicioVigenciaVisualizar = inicioVigenciaV1.getText();
		
		System.out.println(componenteVisualizar);
		System.out.println(idiomaVisualizar);
		System.out.println(inicioVigenciaVisualizar);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(componenteVisualizar.equals(componente));
		sucesso.add(idiomaVisualizar.equals(idioma));
		sucesso.add(inicioVigenciaVisualizar.equals(inicioVigencia));
		
		System.out.println(sucesso);
		
		btnBiblioteca.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
		return sucesso;

	}
	
	public ArrayList<Boolean> detalhes() {
		
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
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		Configuração.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ManuaisDeComponente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		filtrar.click();
		sleep(7000);
		
		//componente
		
		componente.click();
		sleep(2000);
		componenteOpc.click();
		sleep(2000);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int j=1;
		ArrayList<String> data = new ArrayList<String>();
		int rows1 = driver.findElements(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]")).size();

		for (int i = 0; i < rows1; i++) {

			String tributo ="";
			tributo = driver.findElement(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]["+j+"]//div[4]")).getText();
			
			if (data.size()==0) {
				
				if (tributo.isEmpty()==false) {
					
					data.add(tributo);
				}
			}
			
			j = j+1;
		}

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		int rows = driver.findElements(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]")).size();
		String datos = "";
		
		j=1;
		for (int i = 0; i < rows; i++) {
			datos = driver.findElement(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")][1]/div[4]")).getText();
			sucesso.add(data.get(0).equals(datos));
		}
		
		System.out.println(datos);
		System.out.println(sucesso);
		//IDIOMA
		limparFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		idioma.click();
		sleep(2000);
		idiomaOpc.click();
		sleep(2000);
		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
		j=1;
		rows1 = driver.findElements(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]")).size();
		for (int i = 0; i < rows1; i++) {

			String tributo ="";
			tributo = driver.findElement(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]["+j+"]//div[5]")).getText();
			
			if (data.size()==0) {
				
				if (tributo.isEmpty()==false) {
					
					data.add(tributo);
				}
			}
			
			j = j+1;
		}

		
		rows = driver.findElements(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]")).size();
		j=1;
		for (int i = 0; i < rows; i++) {
			datos = driver.findElement(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")][1]/div[5]")).getText();
			sucesso.add(data.get(0).equals(datos));
		}
		System.out.println(datos);
		System.out.println(sucesso);
		//usuario creador
		limparFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		usuarioCreador.click();
		sleep(2000);
		opcUsuarios.click();
		sleep(2000);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		j=1;
		rows1 = driver.findElements(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]")).size();
		for (int i = 0; i < rows1; i++) {

			String tributo ="";
			tributo = driver.findElement(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]["+j+"]//div[8]")).getText();
			
			if (data.size()==0) {
				
				if (tributo.isEmpty()==false) {
					
					data.add(tributo);
				}
			}
			
			j = j+1;
		}

		
		rows = driver.findElements(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]")).size();
		j=1;
		for (int i = 0; i < rows; i++) {
			datos = driver.findElement(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")][1]/div[8]")).getText();
			sucesso.add(data.get(0).equals(datos));
		}
		System.out.println(datos);
		System.out.println(sucesso);
		//usuario modificador
		limparFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		usuarioModificador.click();
		sleep(2000);
		opcUsuarios.click();
		sleep(2000);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		j=1;
		rows1 = driver.findElements(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]")).size();
		for (int i = 0; i < rows1; i++) {

			String tributo ="";
			tributo = driver.findElement(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]["+j+"]//div[10]")).getText();
			
			if (data.size()==0) {
				
				if (tributo.isEmpty()==false) {
					
					data.add(tributo);
				}
			}
			
			j = j+1;
		}

		
		rows = driver.findElements(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]")).size();
		j=1;
		for (int i = 0; i < rows; i++) {
			datos = driver.findElement(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")][1]/div[10]")).getText();
			sucesso.add(data.get(0).equals(datos));
		}
		
		System.out.println(datos);
		System.out.println(sucesso);
		
		
		return sucesso;
		
	
	}
	
	public boolean exluir() {
		
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000); 

		Configuração.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ManuaisDeComponente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		invisibilityOfElementOverlay();
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		
		String id = "0"; // Ultimo ID antes de crear un registro
		
		if(rows > 0) {
			id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
			System.out.println("ID Ultimo Registro: " + id);
		}
		
		String idRegistro = idObter("ManuaisDeComponente");
		System.out.println("ID Registro: " + idRegistro);
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnAceitar.click();
		sleep(2000);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		driver.navigate().refresh();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000); 

		Configuração.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ManuaisDeComponente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		
		
		boolean sucesso = false;
		  
		if(rows == 0) {
			return sucesso = true; 
		}
		
		// Se obtiene el primer registro de la tabla
		String idPrimerRegistro = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText(); 
		System.out.println("");
		System.out.println("ID Ultimo nuevo registro: " + idPrimerRegistro);
		
		int id1 = convertToInt(id);
		int id2 = convertToInt(idPrimerRegistro);
		
		//compara pra ver se o novo id criado é realmente o ultimo		  
		if (id2 < id1) { 
			sucesso = true; 
			System.out.println("Registro Eliminado...");
		}
		
		return sucesso;

	}


}

