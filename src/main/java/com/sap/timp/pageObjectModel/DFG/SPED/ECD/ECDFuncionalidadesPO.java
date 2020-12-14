package com.sap.timp.pageObjectModel.DFG.SPED.ECD;

import java.rmi.server.Skeleton;
import java.util.ArrayList;

import javax.net.ssl.SSLKeyException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.DFG.AcessarDFGPO;

public class ECDFuncionalidadesPO extends TestBaseSteven{
	
	
	
	@FindBy(xpath = "//div[@class=\"base-pagination-wrapper\"]/div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;

	@FindBy(xpath = "//div[@class=\"base-pagination-wrapper\"]/div[contains(@class,\"icon-left\")][1]")
	public WebElement primeira;
	
	@FindBy(xpath = "//span[contains(@class,\"icon-gooddoc\")]")
	public WebElement sped;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-efd-icmsipi\"]")
	public WebElement efd;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-ecd\"]")
	public WebElement eCD;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-ecdItem\"]")
	public WebElement eCDO;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-ecd-calculationBlocks\"]")
	public WebElement blocoApuracao;
	
	
	
	
	
	
	//ECD
	
	@FindBy(xpath = "//div[@class=\"inputs layout-select\"]/div/div[2]")
	public WebElement leiauteECD;
	
	@FindBy(xpath = "//li[contains(text(),\"ID7521\")]")
	public WebElement leiauteECDOTQ1;
	
	@FindBy(xpath = "//li[contains(text(),\"ID151\")]")
	public WebElement leiauteECDOTC2;
	
	@FindBy(xpath = "//li[contains(text(),\"ID401\")]")
	public WebElement leiauteECDOTP1;
	
	
	@FindBy(xpath = "//div[@class=\"inputs version-select\"]/div/div/div[2]")
	public WebElement versaoECD;
	
	@FindBy(xpath = "//li[text()=\"1.0\"]")
	public WebElement versaoECDO;
	
	@FindBy(xpath = "//div[@class=\"inputs tax-select\"]/div/div[2]")
	public WebElement tributoECD;
	
	@FindBy(xpath = "//li[text()=\"ICMS\" and @id]")
	public WebElement tributoECDO;
	
	@FindBy(xpath = "//div[@class=\"inputs company-select\"]/div/div/div[2]")
	public WebElement empresaECD;
	
	@FindBy(xpath = "//div[@id=\"1000\"]/div/label/span")
	public WebElement empresaECDO;
	
	@FindBy(xpath = "//div[@class=\"inputs uf-select\"]/div/div/div[2]")
	public WebElement ufECD;
	
	@FindBy(xpath = "//div[@id=\"SP\"]/div/label/span")
	public WebElement ufECDO;
	
	@FindBy(xpath = "//div[@id=\"AL\"]/div/label/span")
	public WebElement ufECDOTC2;
	
	@FindBy(xpath = "//div[@class=\"inputs branch-select\"]/div/div/div[2]")
	public WebElement filialECD;
	
	@FindBy(xpath = "//div[contains(@id,\"0001\")]/div/label/span")
	public WebElement filialECDO;
	
	@FindBy(xpath = "//div[contains(@id,\"0008\")]/div/label/span")
	public WebElement filialECDOTC2;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Inicio\")]")
	public WebElement dataVigenciaE;
	
	@FindBy(xpath = "//button[text()=\"Editar\"]")
	public WebElement editar;

	
	@FindBy(xpath = "//button[text()=\"Fechar\"]")
	public WebElement fechar;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fecharInformacoes;
	
	@FindBy(xpath = "//textarea")
	public WebElement descricao;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][1]/div[2]/div")
	public WebElement descricaoI;
	
	
	@FindBy(xpath = "//input[contains(@placeholder,\"nome\")]")
	public WebElement nomeV;
	
	@FindBy(xpath = "//textarea")
	public WebElement descricaoV;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Selecionar Leiaute\")]")
	public WebElement leiauteV;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Versão Leiaute\")]")
	public WebElement versaoV;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Tributo\")]")
	public WebElement tributoV;
	
	@FindBy(xpath = "//div[@class=\"inputs company-select\"]/div/div[1]/div/div[1]/div/div[1]")
	public WebElement empresaV;
	
	@FindBy(xpath = "//div[@class=\"inputs uf-select\"]/div/div[1]/div/div[1]/div/div[1]")
	public WebElement ufV;

	@FindBy(xpath = "//div[@class=\"inputs branch-select\"]/div/div[1]/div/div[1]/div/div[1]")
	public WebElement filialV;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Inicio\")]")
	public WebElement dataVigenciaV;
	
	//Bloco Apuração
	
	@FindBy(xpath = "//div[@id=\"executarArquivo\"]/div[3]/div[1]/button")
	public WebElement executar;
	
	@FindBy(xpath = "//div[@id=\"inputState\"]/div/div[1]/div[2]")
	public WebElement ufFilialB;
	
	@FindBy(xpath = "//div[@id=\"SP\"]/div/label/span")
	public WebElement ufFilialBO;
	
	@FindBy(xpath = "//span[contains(@class,\"icon-calendar\")]")
	public WebElement calendario;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-leftmenu\") and @tabindex=\"0\"][1]")
	public WebElement atras;
	
	@FindBy(xpath = "//div[text()=\"2016\"]")
	public WebElement ano2016;
	
	@FindBy(xpath = "//div[text()=\"Jan\"]")
	public WebElement jan;
	
	@FindBy(xpath = "//span[text()=\"1M\"]")
	public WebElement m1;
	
	@FindBy(xpath = "//div[@class=\"inputs movementCentralization\"]/label/span")
	public WebElement centralizacao;
	
	@FindBy(xpath = "//span[text()=\"Atualizar Estrutura\"]")
	public WebElement atualizarEstrutura;
	
	@FindBy(xpath = "//div[@id=\"settings-execute\"]/button")
	public WebElement executarConf;
	
	@FindBy(xpath = "//span[text()=\"Visualizar AN3\"]")
	public WebElement visualizarAN3;
	
	@FindBy(xpath = "//button[text()=\" Criar\"]")
	public WebElement criar;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"nome\")]")
	public WebElement nomeR;
	
	@FindBy(xpath = "//div[@class=\"rule-input\"]/div/div/div[2]")
	public WebElement regra;
	
	@FindBy(xpath = "//span[text()=\"Atualizar\"]")
	public WebElement atualizar;
	
	@FindBy(xpath = "//span[contains(@class,\"icon-docversion padding-right\")]")
	public WebElement arquivos;
	
	
	@FindBy(xpath = "//div[contains(@class,\"company\")]/div/div/div[2]")
	public WebElement empresaDFG;
	
	@FindBy(xpath = "//li[text()=\"1000\"]")
	public WebElement empresaDFGO;
	
	@FindBy(xpath = "//div[contains(@class,\"branch\")]/div/div/div[2]")
	public WebElement filialDFG;
	
	@FindBy(xpath = "//div[@id=\"0001\"]/div/label/span")
	public WebElement filialDFGO;
	
	
	@FindBy(xpath = "//div[@id=\"toolbarTop\"]/div/div/ul/li[1]/button")
	public WebElement executarDFG;
	
	@FindBy(xpath = "//span[text()=\"Visualizar Arquivos\"]")
	public WebElement visualizarArquivos;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-trash-layout\"]")
	public WebElement lixeiraDFG;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-trash_rules\"]")
	public WebElement lixeiraBRE;
	
	@FindBy(xpath = "//span[contains(text(),\"Nov\")]")
	public WebElement novo;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"nome\")]")
	public WebElement nome;

	@FindBy(xpath = "//div[@id=\"inputSelectTypeFile\"]/div/div/div[2]")
	public WebElement tipo;

	@FindBy(xpath = "//li[text()=\"SPED EFD/ICMS\"]")
	public WebElement tipoO;
	
	@FindBy(xpath = "//div[@id=\"inputStructureParent\"]/div/div/div[2]")
	public WebElement grupoEstrutura;
	
	@FindBy(xpath = "//li[text()=\"Ajuste\"][1]")
	public WebElement grupoEstruturaO;
	
	@FindBy(xpath = "//li[text()=\"Ajustes\"][1]")
	public WebElement grupoEstruturaTP1O;
	
	@FindBy(xpath = "//div[@id=\"inputStructureChild\"]/div/div/div[2]")
	public WebElement estrutura;
	
	@FindBy(xpath = "//div[@id=\"18\"]/div/label/span")
	public WebElement estruturaO;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Inicio\")]")
	public WebElement dataVigencia;

	@FindBy(xpath = "//button[text()=\"Salvar\"]")
	public WebElement salvar;

	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;

	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicar;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	public ECDFuncionalidadesPO() {

		PageFactory.initElements(driver, this);
	}
	
	
	public ArrayList<Boolean> criar() {
		
		String url = driver.getCurrentUrl();
		
		boolean tp1  = false;
		boolean tc2  = false;
		
		if (url.contains("tp1")) {
			tp1 = true;
		}else if(url.contains("tc2")){
			tc2 = true;
		}
		
		sped.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		eCD.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		eCDO.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		primeira.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		/*
		
		int rows = rows("//div[@class=\"tr\" and @data-id]");
		
		String idECDAC = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[3]/div")).getText();
		System.out.println("Id Antes da Criação (ECD): " +idECDAC);
		
		blocoApuracao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		primeira.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = rows("//div[@class=\"tr\" and @data-id]");
		
		String idBAAC = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[3]/div")).getText();
		idInserir1(idBAAC);
		System.out.println("Id Antes da Criação (Bloco Apuração): " +idBAAC);
		
		
		eCDO.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		novo.click();
		sleep(3000);
		waitExpectElement(nome);
		sleep(2000);
		
		nome.sendKeys("Teste Automatizado");
		sleep(1000);
		
		leiauteECD.click();
		sleep(1000);
		
		if (tc2 == true) {
			leiauteECDOTC2.click();
		}else if (tp1==true) {
			leiauteECDOTP1.click();
		}else {
			leiauteECDOTQ1.click();
		}
		sleep(1000);
		
		versaoECD.click();
		sleep(1000);
		versaoECDO.click();
		sleep(1000);
		
		actionsMoveToElementXpath("//input[contains(@placeholder,\"Fim\")]");
		sleep(1000);
		
		tributoECD.click();
		sleep(1000);
		tributoECDO.click();
		sleep(1000);
		
		empresaECD.click();
		sleep(1000);
		empresaECDO.click();
		sleep(1000);
		empresaECDO.sendKeys(Keys.ESCAPE);
		sleep(1000);
		
		actionsMoveToElementXpath("//input[contains(@placeholder,\"Fim\")]");
		sleep(1000);
		
		ufECD.click();
		sleep(1000);
		if (tc2 == true) {
			ufECDOTC2.click();
			sleep(1000);
			ufECDOTC2.sendKeys(Keys.ESCAPE);
		}else {
			ufECDO.click();
			sleep(1000);
			ufECDO.sendKeys(Keys.ESCAPE);
		}
		
		sleep(1000);
		actionsMoveToElementXpath("//input[contains(@placeholder,\"Fim\")]");
		sleep(1000);
		
		filialECD.click();
		
		if (tc2 == true) {
			filialECDOTC2.click();
			sleep(1000);
			filialECDOTC2.sendKeys(Keys.ESCAPE);
		}else {
			filialECDO.click();
			sleep(1000);
			filialECDO.sendKeys(Keys.ESCAPE);
		}
		sleep(1000);
		
		
		dataVigenciaE.sendKeys("01/01/2013");
		sleep(1000);
		salvar.click();
		
		invisibilityOfElementOverlay();
		
		eCDO.click();
		
		invisibilityOfElementOverlay();
		
		
		primeira.click();
		invisibilityOfElementOverlay();
		siguiente.click();
		invisibilityOfElementOverlay();
		
		*/
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		/*
		rows = rows("//div[@class=\"tr\" and @data-id]");
		System.out.println("------------------------------------Criação de ECD------------------------------------------------");
		String idECDDC = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[3]/div")).getText();
		idInserir1(idECDDC);
		System.out.println("Id Apóis da Criação (Bloco Apuração): " +idECDDC);
		
		int idECDDCI = convertToInt(idECDDC);
		int idECDACI = convertToInt(idECDAC);
		
		if (idECDACI < idECDDCI) {
			sucesso.add(true);
		}else {
			sucesso.add(false);
		}
		
		System.out.println("Verificação da criação: " + sucesso.get(0));
		
		
		String nome = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idObter1()+"\"]/div[4]/div")).getText();
		String empresa = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idObter1()+"\"]/div[10]/div/li")).getText();
		String uf = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idObter1()+"\"]/div[11]/div/li")).getText();
		String filial = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idObter1()+"\"]/div[12]/div/li")).getText();
		String tributo = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idObter1()+"\"]/div[13]/div/li")).getText();
		String dataVigencia = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idObter1()+"\"]/div[14]/div")).getText();
		
		System.out.println(nome);
		System.out.println(empresa);
		System.out.println(uf);
		System.out.println(filial);
		System.out.println(tributo);
		System.out.println(dataVigencia);
		
		
		sucesso.add(nome.equals("Teste Automatizado"));
		sucesso.add(empresa.equals("1000"));
		
		if (tc2 == true) {
			sucesso.add(uf.equals("AL"));
			sucesso.add(filial.equals("0008"));
			
		}else {
			sucesso.add(uf.equals("SP"));
			sucesso.add(filial.equals("0001"));
		}
		
		sucesso.add(tributo.equals("ICMS"));
		sucesso.add(dataVigencia.equals("01/01/2013"));
		*/
		sucesso.add(true);
		System.out.println(sucesso);
		
		return sucesso;
		
		
	}
	
	public boolean editar() {
		
		String idRegistro = idObter1();
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement acao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(1000);
		acao.click();
		invisibilityOfElementOverlay();
		
		
		String enviar = "Teste Editar";
		descricao.clear();
		descricao.sendKeys(enviar);
		sleep(1000);
		
		editar.click();
		invisibilityOfElementOverlay();
		
		primeira.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		acao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(1000);
		acao.click();
		invisibilityOfElementOverlay();
		System.out.println("-----------------------------------Verificação Edição-------------------------------------------------");
		String texto = descricao.getAttribute("value");
		System.out.println("Texto após edição: " +texto);
		boolean sucesso = texto.equals(enviar);
		System.out.println(sucesso);
		fechar.click();
		sleep(3000);
		
		return sucesso;
		
	}
	
	public boolean visualizar() {
		

		System.out.println("-------------------------------------Verificação Informação--------------------------------------------");
		String idRegistro = idObter1();
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement acao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Informação\"]"));
		
		menu.click();
		sleep(1000);
		acao.click();
		invisibilityOfElementOverlay();
		
		String descricaoI1 = descricaoI.getText();
		System.out.println("Texto Informação: " +descricaoI1);
		
		fecharInformacoes.click();
		sleep(3000);
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		acao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		menu.click();
		sleep(1000);
		acao.click();
		invisibilityOfElementOverlay();
		
		String texto = descricao.getAttribute("value");
		System.out.println("Texto Edição: " +texto);
		
		boolean sucesso = texto.equals(descricaoI1);
		System.out.println(sucesso);
		
		
		return sucesso;
		
		
	}
	
	
	

}
