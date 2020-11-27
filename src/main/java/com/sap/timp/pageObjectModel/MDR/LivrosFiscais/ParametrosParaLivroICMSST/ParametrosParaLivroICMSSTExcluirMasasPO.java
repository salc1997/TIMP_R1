package com.sap.timp.pageObjectModel.MDR.LivrosFiscais.ParametrosParaLivroICMSST;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class ParametrosParaLivroICMSSTExcluirMasasPO extends TestBaseMassiel {
	@FindBy(xpath = "//span[text()=\"Livros Fiscais\"]")
	public WebElement livrosfiscais;

	@FindBy(xpath = "//span[text()=\"Parâmetros para Livro ICMS ST\"]")
	public WebElement parametrosparalivroicmsst;

	@FindBy(xpath = "//span[text()=\"Novos Parâmetros para Livro ICMS ST\"]")
	public WebElement novoparametros;



	@FindBy(xpath = "//input[@placeholder=\"Selecione a data de início de vigência\"]")
	public WebElement dataincial;


	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;



	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;

	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;

	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;

	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;

	@FindBy(xpath = "//div[@class=\"field-element bookType_0_0\"]/div/div/div/div[2]")
	public WebElement tipodolivro;

	@FindBy(xpath = "//div[@class=\"list-item\" and @id=\"option-1\"]/div")
	public WebElement opcaotipodolivro;

	@FindBy(xpath = "//div[@class=\"field-element companyId_0_0\"]/div/div/div/div[2]")
	public WebElement empresa;

	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcaoempresa;

	@FindBy(xpath = "//div[@class=\"list-option\"][2]/div/div/label/span")
	public WebElement opcaoempresa2;
	
	@FindBy(xpath = "//div[@class=\"field-element stateId_0_1\"]/div/div/div/div[2]")
	public WebElement ufdafilial;

	@FindBy(xpath = "//div[@class=\"list-option\"]/div/div/label/span")
	public WebElement opcaoufdafilial;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcaoufdafilial2;

	@FindBy(xpath = "//div[@class=\"field-element branchId_0_1\"]/div/div/div/div[2]")
	public WebElement filial;

	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcaodafilial;

	@FindBy(xpath = "//div[@class=\"field-element taxCode_0_2\"]/div/div/div/div[2]")
	public WebElement tributo;

	@FindBy(xpath = "//div[@class=\"list-item\" and @id=\"option-2\"]/div")
	public WebElement opcaotributo;

	@FindBy(xpath = "//div[@class=\"field-element branchStructureHash_0_2\"]/div/div/div/div[2]")
	public WebElement informacaomdr;

	@FindBy(xpath = "//div[@class=\"list-item\" and @id=\"option-1\"]/div")
	public WebElement opcaoinformacaomdr;

	@FindBy(xpath = "//div[@class=\"field-element branchStateSt_0_3\"]/div/div/div/div[2]")
	public WebElement camposmdrufst;

	@FindBy(xpath = "//div[@class=\"list-item\" and @id=\"option-1\"]/div")
	public WebElement opcaocamposmdrufst;

	@FindBy(xpath = "//div[@class=\"field-element branchState_0_3\"]/div/div/div/div[2]")
	public WebElement camposmdrfilial;

	@FindBy(xpath = "//div[@class=\"list-item\" and @id=\"option-1\"]/div")
	public WebElement opcaocamposmdrfilial;

	@FindBy(xpath = "//div[@class=\"field-element companyStructure_0_4\"]/div/div/div/div[2]")
	public WebElement camposmdrempresa;

	@FindBy(xpath = "//div[@class=\"list-item\" and @id=\"option-1\"]/div")
	public WebElement opcaocamposmdrempresa;

	@FindBy(xpath = "//div[@class=\"field-element filialStructure_0_4\"]/div/div/div/div[2]")
	public WebElement camposfilial;

	@FindBy(xpath = "//div[@class=\"list-item\" and @id=\"option-1\"]/div")
	public WebElement opcaocamposfilial;

	@FindBy(xpath = "//div[@class=\"field-element stRegistrationStructureHash_0_5\"]/div/div/div/div[2]")
	public WebElement informacaomdrinscricao;

	@FindBy(xpath = "//div[@class=\"list-item\" and @id=\"option-1\"]/div")
	public WebElement opcaoinformacaomdrinscricao;


	@FindBy(xpath = "//div[@class=\"field-element stRegistrationFields_0_5\"]/div/div/div/div[2]")
	public WebElement camposinformacaomdrinscricao;

	@FindBy(xpath = "//div[@class=\"list-item\" and @id=\"option-1\"]/div")
	public WebElement opcaoinformacaomdrincricao;

	@FindBy(xpath = "//div[@class=\"field-element movementOriginStructureHash_0_6\"]/div/div/div/div[2]")
	public WebElement informacaoorigemdomovimento;

	@FindBy(xpath = "//div[@class=\"list-item\" and @id=\"option-1\"]/div")
	public WebElement opcaoinformacaoorigemdomovimento;

	@FindBy(xpath = "//div[@class=\"field-element movementOriginState_0_6\"]/div/div/div/div[2]")
	public WebElement camposinformacaoorigem;

	@FindBy(xpath = "//div[@class=\"list-item\" and @id=\"option-1\"]/div")
	public WebElement opcaocamposinformacaoorigem;

	@FindBy(xpath = "//div[@class=\"field-element movementOriginBranch_0_7\"]/div/div/div/div[2]")
	public WebElement movimentoufdeparceiro;

	@FindBy(xpath = "//div[@class=\"list-item\" and @id=\"option-1\"]/div")
	public WebElement opcaomovimentoufdeparceiro;

	@FindBy(xpath = "//div[@class=\"field-element movementOriginTax_0_7\"]/div/div/div/div[2]")
	public WebElement movimentotributo;

	@FindBy(xpath = "//div[@class=\"list-item\" and @id=\"option-1\"]/div")
	public WebElement opcaomovimenttributo;

	@FindBy(xpath = "//div[@class=\"field-element adjustmentsStructureHash_0_8\"]/div/div/div/div[2]")
	public WebElement informacaodeajustes;

	@FindBy(xpath = "//div[@class=\"list-item\" and @id=\"option-1\"]/div")
	public WebElement opcaoinformacaodeajustes;

	@FindBy(xpath = "//div[@class=\"field-element adjustmentsFields_0_8\"]/div/div/div/div[2]")
	public WebElement camposinformacaodeajustes;

	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcaocamposinformacaodeajustes;

	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement ultimaPagina;

	//BOTON EXCLUIR EN MASA
	@FindBy(xpath = "//button/span[contains(@class,\"icon-persign\")]")
	public WebElement excluirMassa;

	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement aceitar;
	
	public ParametrosParaLivroICMSSTExcluirMasasPO() {

		PageFactory.initElements(driver, this);
	}

	public boolean criar() {
		sleep(2000);
		livrosfiscais.click();
		sleep(2000);

		parametrosparalivroicmsst.click();

		sleep(2000);

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");

		sleep(2000);

		//conta o numero de linhas
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();

		System.out.println(id);

		sleep(2000);
		//---------------------PRIMER DATO
		//criaçao
		novoparametros.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		tipodolivro.click();

		sleep(2000);

		opcaotipodolivro.click();

		sleep(2000);


		empresa.click();
		sleep(2000);

		opcaoempresa.click();
		sleep(2000);

		//empresa.sendKeys(Keys.ESCAPE);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE).build().perform();
		action.sendKeys(Keys.ESCAPE).build().perform();
		sleep(2000);

		ufdafilial.click();

		sleep(2000);

		opcaoufdafilial.click();

		sleep(2000);

		//ufdafilial.sendKeys(Keys.ESCAPE);
		action.sendKeys(Keys.ESCAPE).build().perform();
		action.sendKeys(Keys.ESCAPE).build().perform();
		sleep(2000);

		filial.click();

		sleep(2000);

		opcaodafilial.click();

		sleep(2000);

		//filial.sendKeys(Keys.ESCAPE);
		action.sendKeys(Keys.ESCAPE).build().perform();
		action.sendKeys(Keys.ESCAPE).build().perform();
		sleep(2000);

		tributo.click();

		sleep(2000);

		opcaotributo.click();

		sleep(2000);

		informacaomdr.click();

		sleep(2000);

		opcaoinformacaomdr.click();

		sleep(2000);
		attributeToBeXpath("//div[@class=\"field-element branchStateSt_0_3\"]/div", "class", "input-element-wrapper");
		sleep(2000);

		camposmdrufst.click();
		sleep(2000);

		opcaocamposmdrufst.click();

		sleep(2000);

		camposmdrfilial.click();

		sleep(2000);

		opcaocamposmdrfilial.click();

		sleep(2000);

		camposmdrempresa.click();

		sleep(2000);

		opcaocamposmdrempresa.click();

		sleep(2000);

		camposfilial.click();

		sleep(2000);

		opcaocamposfilial.click();

		sleep(2000);

		informacaomdrinscricao.click();

		sleep(2000);

		opcaoinformacaomdrinscricao.click();

		sleep(2000);
		attributeToBeXpath("//div[@class=\"field-element stRegistrationFields_0_5\"]/div","class", "input-element-wrapper");
		sleep(2000);
		camposinformacaomdrinscricao.click();

		sleep(2000);

		opcaoinformacaomdrincricao.click();

		sleep(2000);


		informacaoorigemdomovimento.click();

		sleep(2000);

		opcaoinformacaoorigemdomovimento.click();

		sleep(2000);

		attributeToBeXpath("//div[@class=\"field-element movementOriginState_0_6\"]/div","class", "input-element-wrapper");
		sleep(2000);
		camposinformacaoorigem.click();

		sleep(2000);

		opcaocamposinformacaoorigem.click();

		sleep(2000);

		movimentoufdeparceiro.click();

		sleep(2000);

		opcaomovimentoufdeparceiro.click();

		sleep(2000);

		movimentotributo.click();

		sleep(2000);

		opcaomovimenttributo.click();

		sleep(2000);

		informacaodeajustes.click();

		sleep(2000);

		opcaoinformacaodeajustes.click();

		sleep(2000);

		attributeToBeXpath("//div[@class=\"field-element adjustmentsFields_0_8\"]/div","class", "input-element-wrapper");
		sleep(2000);

		camposinformacaodeajustes.click();

		sleep(2000);

		opcaocamposinformacaodeajustes.click();

		sleep(2000);

		//camposinformacaodeajustes.sendKeys(Keys.ESCAPE);
		action.sendKeys(Keys.ESCAPE).build().perform();
		action.sendKeys(Keys.ESCAPE).build().perform();
		sleep(2000);

		String data=fechaActual();
		dataincial.sendKeys(data);

		sleep(2000);
		gravar.click();
		sleep(2000);
		sim.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		biblioteca.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//---------------------SEGUNDO DATO

		//criaçao
		novoparametros.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		tipodolivro.click();

		sleep(2000);

		opcaotipodolivro.click();

		sleep(2000);


		empresa.click();
		sleep(2000);

		opcaoempresa2.click();
		sleep(2000);

		//empresa.sendKeys(Keys.ESCAPE);
		Actions action1 = new Actions(driver);
		action1.sendKeys(Keys.ESCAPE).build().perform();
		action1.sendKeys(Keys.ESCAPE).build().perform();
		sleep(2000);

		ufdafilial.click();

		sleep(2000);

		opcaoufdafilial2.click();

		sleep(2000);

		//ufdafilial.sendKeys(Keys.ESCAPE);
		action.sendKeys(Keys.ESCAPE).build().perform();
		action.sendKeys(Keys.ESCAPE).build().perform();
		sleep(2000);

		filial.click();

		sleep(2000);

		opcaodafilial.click();

		sleep(2000);

		//filial.sendKeys(Keys.ESCAPE);
		action.sendKeys(Keys.ESCAPE).build().perform();
		action.sendKeys(Keys.ESCAPE).build().perform();
		sleep(2000);

		tributo.click();

		sleep(2000);

		opcaotributo.click();

		sleep(2000);

		informacaomdr.click();

		sleep(2000);

		opcaoinformacaomdr.click();

		sleep(2000);
		attributeToBeXpath("//div[@class=\"field-element branchStateSt_0_3\"]/div", "class", "input-element-wrapper");
		sleep(2000);

		camposmdrufst.click();
		sleep(2000);

		opcaocamposmdrufst.click();

		sleep(2000);

		camposmdrfilial.click();

		sleep(2000);

		opcaocamposmdrfilial.click();

		sleep(2000);

		camposmdrempresa.click();

		sleep(2000);

		opcaocamposmdrempresa.click();

		sleep(2000);

		camposfilial.click();

		sleep(2000);

		opcaocamposfilial.click();

		sleep(2000);

		informacaomdrinscricao.click();

		sleep(2000);

		opcaoinformacaomdrinscricao.click();

		sleep(2000);
		attributeToBeXpath("//div[@class=\"field-element stRegistrationFields_0_5\"]/div","class", "input-element-wrapper");
		sleep(2000);
		camposinformacaomdrinscricao.click();

		sleep(2000);

		opcaoinformacaomdrincricao.click();

		sleep(2000);


		informacaoorigemdomovimento.click();

		sleep(2000);

		opcaoinformacaoorigemdomovimento.click();

		sleep(2000);

		attributeToBeXpath("//div[@class=\"field-element movementOriginState_0_6\"]/div","class", "input-element-wrapper");
		sleep(2000);
		camposinformacaoorigem.click();

		sleep(2000);

		opcaocamposinformacaoorigem.click();

		sleep(2000);

		movimentoufdeparceiro.click();

		sleep(2000);

		opcaomovimentoufdeparceiro.click();

		sleep(2000);

		movimentotributo.click();

		sleep(2000);

		opcaomovimenttributo.click();

		sleep(2000);

		informacaodeajustes.click();

		sleep(2000);

		opcaoinformacaodeajustes.click();

		sleep(2000);

		attributeToBeXpath("//div[@class=\"field-element adjustmentsFields_0_8\"]/div","class", "input-element-wrapper");
		sleep(2000);

		camposinformacaodeajustes.click();

		sleep(2000);

		opcaocamposinformacaodeajustes.click();

		sleep(2000);

		//camposinformacaodeajustes.sendKeys(Keys.ESCAPE);
		action.sendKeys(Keys.ESCAPE).build().perform();
		action.sendKeys(Keys.ESCAPE).build().perform();
		sleep(2000);

		String data1=fechaActual();
		dataincial.sendKeys(data);

		sleep(2000);
		gravar.click();
		sleep(2000);
		sim.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		biblioteca.click();

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();


		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);


		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String idRegistro1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();

		rows = rows-1;
		String idRegistro2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();

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
	
	public boolean ParametrosParaLivroICMSSTExcluirMasas() {
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String idRegistro1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
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
		
		sleep(2000);
		
		driver.navigate().refresh();
		waitExpectElement(ultimaPagina);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		ultimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id = "0";
		
		if(rows > 0) {
			id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
			System.out.println(id);
		}
			
		int id1 = convertToInt(id);
		int id2 = convertToInt(idRegistro1);
		int id3 = convertToInt(idRegistro2);
		
		System.out.println("Id Ultimo Registro: "+ id1);
		System.out.println("Id Excluir Registro 1: " + id2);
		System.out.println("Id Excluir Registro 2: " + id3);
		
		boolean sucesso = false;
		
		if (id1 != id2 && id1!=id3) {
			sucesso = true;
		}else {
			sucesso=false;
		}
	
		return sucesso;
	}

}

