package com.sap.timp.pageObjectModel.ATR.Estruturas.MapeamentoDeParametrosDeEntrada;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBase;

public class MapeamentoDeParametrosDeEntradaTodasFuncPO extends TestBase {
	
	@FindBy(xpath = "//span[text()=\"Mapeamento de Parâmetros de Entrada\"]")
	public WebElement mapeamento;
	
	
	@FindBy(xpath = "//div[contains(@class,\"icon-left\")][2]")

	public WebElement primerapagina;

	
	@FindBy(xpath = "//span[text()=\"Novo Mapeamento\"]")
	public WebElement novo;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencha o nome do grupo\"]")
	public WebElement nomedogrupo;
	
	@FindBy(xpath = "//div[@class=\"input structureMap\"]/div/div[2]")
	public WebElement estruturadedados;
	
	@FindBy(xpath = "//div[@class=\"input tributeMap\"]/div/div/div[2]")
	public WebElement tributo;
	@FindBy(xpath = "//div[@id=\"05\"]")
	public WebElement opcaoTributo;
	
	@FindBy(xpath = "//li[@id=\"1\"]")
	public WebElement opcaoestrutura;
	
	@FindBy(xpath = "//li[@id][text()=\"Alíquota ICMS\"]")
	public WebElement opcaodirecaomovimento;
	
	@FindBy(xpath = "//li[@id][text()=\"Alíquota COFINS\"]")
	public WebElement opcaodirecaomovimento1;
	
	@FindBy(xpath = "//div[@id=\"rows\"]/div/div[3]/div/div[2]")
	public WebElement direcaomovimento;
	
	@FindBy(xpath = "//div[@id=\"rows\"]/div/div[3]/div//input")
	public WebElement direcaomovimento1;
	
	@FindBy(xpath = "//textarea[@placeholder=\"Preencher Comentários\"]")
	public WebElement comentario;
	
	

	@FindBy(xpath = "//button[text()=\"Gravar\"]")
	public WebElement gravar;
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement Gravar;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Estrutura de dados \"]")
	public WebElement estruturavi;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Campo \"]")
	public WebElement direcaomovimentovi;

	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Estrutura de dados \"]")
	public WebElement estruturaE;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Campo \"]")
	public WebElement direcaomovimentoE;
	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")
	public WebElement id;

	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//button/span[text()=\"Limpar Filtros\"]")
	public WebElement limpar;
	
	@FindBy(xpath = "//button/span[contains(@class,\"icon-persign\")]")
	public WebElement excluirMassa;
	
	@FindBy(xpath = "//li[@id=\"10\"]")
	public WebElement opcaoestrutura1;
	
	@FindBy(xpath = "//button[text()=\"Cancelar\"]")
	public WebElement cancelar;
	
	public MapeamentoDeParametrosDeEntradaTodasFuncPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		mapeamento.click();
	
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(primerapagina);
		sleep(2000);
		primerapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		

		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[3]/div")).getText();

		
		System.out.println("Ultimo registro: " + id);
		
		novo.click();
		sleep(2000);
	
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	
		
		estruturadedados.click();
		sleep(2000);
		opcaoestrutura.click();
		sleep(5000);
	
		tributo.click();
		sleep(2000);
		
		opcaoTributo.click();
		sleep(2000);
		
		closeSelectTypeCheckbox(tributo);
		
		direcaomovimento.click();
		sleep(2000);
		opcaodirecaomovimento.click();
		sleep(2000);
		gravar.click();

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(8000);
		
		
		
		mapeamento.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(primerapagina);
		sleep(2000);
		primerapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();	

		String idultimo = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[3]/div")).getText();

		
		idInserir("MapeamentoDeParametrosDeEntradaCriar",idultimo);

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
	public boolean Editar() {
		
		
		primerapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("MapeamentoDeParametrosDeEntradaCriar");
		
		System.out.println("Ultimo registro: " + idRegistro);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);

		menu.click();
		sleep(1000);
		editar.click();
		sleep(6000);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(8000);
		
		direcaomovimento.click();
		sleep(2000);
		opcaodirecaomovimento1.click();
		sleep(2000);
		
		String enviar = direcaomovimento1.getAttribute("value");
		System.out.println(enviar);
		
		gravar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(13000);
		
		
		mapeamento.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(primerapagina);
		sleep(2000);
		primerapagina.click();
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
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		boolean sucesso = false;
		
		String novadirecaomovimento = direcaomovimento1.getAttribute("value");
		System.out.println(novadirecaomovimento);
		sucesso = novadirecaomovimento.equals(enviar);
		
		
		System.out.println(sucesso);
		cancelar.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		return sucesso;
	}
	public ArrayList<Boolean> visualizar() {
		
	
		sleep(2000);
		waitExpectElement(primerapagina);
		sleep(2000);
		primerapagina.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("MapeamentoDeParametrosDeEntradaCriar");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement ver = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Ver\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		
		ver.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String estruturavisualizar = estruturavi.getAttribute("value");
		String direcaomovimentovisualizar = direcaomovimentovi.getAttribute("value");
		
		
		System.out.println(estruturavisualizar);
		System.out.println(direcaomovimentovisualizar);
	
		aceitar.click();
		sleep(2000);
		waitExpectElement(primerapagina);
		sleep(2000);
		primerapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro1 = idObter("MapeamentoDeParametrosDeEntradaCriar");
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(1000);
		
		editar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	    sleep(5000);
	    
	  
	    String estruturaeditar = estruturaE.getAttribute("value");
		String direcaomovimentoeditar = direcaomovimentoE.getAttribute("value");
		
		
		System.out.println(estruturaeditar);
		System.out.println(direcaomovimentoeditar);
	
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(estruturaeditar.contains(estruturavisualizar));
		sucesso.add(direcaomovimentoeditar.contains(direcaomovimentovisualizar));
		
		System.out.println(sucesso);
		
		cancelar.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		return sucesso;	
	}
	
	public boolean filtro() {
		
		sleep(2000);
		primerapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		

		String idRegistro = id.getText();
		System.out.println(idRegistro + " Id Registro");
		pesquisar.sendKeys(idRegistro);
		pesquisar.sendKeys(Keys.ENTER);
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String idBusqueda = id.getText();
		System.out.println(idBusqueda + " Id Busqueda");
		
		boolean sucesso = idRegistro.equals(idBusqueda);
		
		limpar.click();
		sleep(3000);
		System.out.println(sucesso);

		return sucesso;

	}
	
	public boolean excluir() {
	
		primerapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		// pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("MapeamentoDeParametrosDeEntradaCriar");

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
		
		mapeamento.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(primerapagina);
		sleep(2000);
		primerapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		boolean sucesso = false;

		int exclusão = driver.findElements(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[3]/div")).size();

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
	
	public boolean criarMassa() {
		

		primerapagina.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]")).size();
		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")).getText();
		sleep(2000);
		System.out.println(id);
		
		novo.click();
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//Primeiro Registro
		
		estruturadedados.click();
		sleep(2000);
		opcaoestrutura.click();
		sleep(2000);
		
		tributo.click();
		sleep(2000);
		
		opcaoTributo.click();
		sleep(4000);
		
		closeSelectTypeCheckbox(tributo);
		
		direcaomovimento.click();
		sleep(2000);
		opcaodirecaomovimento.click();
		sleep(2000);
		
		
		gravar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		novo.click();
		sleep(2000);
	
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		//Segundo Registro
		
		estruturadedados.click();
		sleep(2000);
		opcaoestrutura1.click();
		sleep(2000);
		
		tributo.click();
		sleep(2000);
		
		opcaoTributo.click();
		sleep(2000);
		
		closeSelectTypeCheckbox(tributo);

		gravar.click();
		sleep(2000);
	
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		mapeamento.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(primerapagina);
		sleep(2000);
		
		primerapagina.click();
		
		sleep(3000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]")).size();
		
		String idRegistro1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")).getText();
		
		rows = rows+1;
		
		String idRegistro2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][2]/div[3]/div")).getText();
		
		
		
	
		sleep(2000);
		System.out.println(id);
		System.out.println(idRegistro1);
		System.out.println(idRegistro2);
		
		double idD = convertToDouble(id);
		double idRegistroD1 = convertToDouble(idRegistro1);
		double idRegistroD2 = convertToDouble(idRegistro2);

		boolean sucesso = false;
		
		if (idRegistroD1 > idD && idRegistroD2 > idD) {
			sucesso = true;
		}else {
			sucesso = false;
		}
		System.out.println(sucesso);
		
		
		return sucesso;
		
		
	}	
	
	
	public boolean excluirMassa() {
		
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]")).size();
		
		String idRegistro1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")).getText();

		
		WebElement check1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[2]/label/span"));
		check1.click();
		sleep(1000);
		rows = rows+1;
		
		String idRegistro2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][2]/div[3]/div")).getText();
		
		WebElement check2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][2]/div[2]/label/span"));
		check2.click();
		
		sleep(1000);
		
		excluirMassa.click();
		sleep(1000);
		waitExpectElement(aceitar);
		sleep(1000);
		aceitar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		mapeamento.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(primerapagina);
		sleep(2000);
		primerapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		int id1 = convertToInt(id);
		int id2 = convertToInt(idRegistro1);
		int id3 = convertToInt(idRegistro2);
		
		System.out.println(" Id Ultimo Registro: "+ id1);
		System.out.println("Id Excluir Registro 1: " + id2);
		System.out.println("Id Excluir Registro 2: " + id3);
		
		boolean sucesso = false;
		
		if (id1 != id2 && id1!=id3) {
			sucesso = true;
		}else {
			sucesso=false;
		}
		
		System.out.println(sucesso);
		
		return sucesso;
	}


}
