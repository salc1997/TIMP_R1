package com.sap.timp.pageObjectModel.BRE.RegrasAuditoriaN1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseCristhian;

public class RegrasdeAuditoriaN1LixeiraemMassaExcluiremMassaPO extends TestBaseCristhian{
	
	
	
	@FindBy(xpath = "//span[text()=\"Regras\"]")
	public WebElement Regras;
	
	@FindBy(xpath = "//span[text()=\"Regras de Auditoria N1\"]")
	public WebElement AN1;
	
	@FindBy(xpath = "//span[contains(text(),\"Nova Regra\")]")
	public WebElement novo;
	
	@FindBy(xpath = "//td[@colspan=\"6\" and @class=\"title-field\"]/div[1]/div/input")
	public WebElement nome;
	
	@FindBy(xpath = "//input[@placeholder=\" selecionar o tipo da Regra\"]")
	public WebElement tipoDeRegra;
	
	@FindBy(xpath = "//input[@placeholder=\" selecionar o grupo de Estruturas de Dados\"]")
	public WebElement grupo;
	
	@FindBy(xpath = "//input[@placeholder=\" selecionar a Estrutura de Dados\"]")
	public WebElement estructura;
	
	@FindBy(xpath = "//li[@id=\"option-2\"]")
	public WebElement opcTipoDeRegra;
	
	@FindBy(xpath = "//li[text()=\"Ajuste\"][1]")
	public WebElement opcGrupo;
	
	@FindBy(xpath = "//li[text()=\"Ajustes Fiscais\"]")
	public WebElement opcEstructura;
	
	@FindBy(xpath = "//input[@placeholder=\" selecionar o Tributo\"]")
	public WebElement tipoTributo;
	
	@FindBy(xpath = "//*[@id=\"00\"]/div[1]/label/span")
	public WebElement opcionTipoTributo;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[2]/div/table/tbody/tr[31]/td[2]/div/div[1]/input")
	public WebElement validade;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicar;
	
	@FindBy(xpath = "//span[text()=\"Justificativa\"]")
	public WebElement justi;
	
	
	
	
	
	@FindBy(xpath = "//button[text()=\"Cancelar\"]")
	public WebElement cancelar;
	
	@FindBy(xpath = "//span[text()=\"Lixeira\"]")
	public WebElement lexeiraBiblioteca;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement Não;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//div[@class=\"tr\" and @data-id]/div[4]/div")
	public WebElement motivo;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	@FindBy(xpath = "//*[@id=\"justification\"]/div/textarea")
	public WebElement agg;
	/*
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	*/
	
	
	public RegrasdeAuditoriaN1LixeiraemMassaExcluiremMassaPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		Regras.click();
		sleep(2000);
		AN1.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		System.out.println("prueba 1");

		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		sleep(2000);
		System.out.println(id);
		//---------------------CREACION----------------------
		//-----------PRIMERO----------------
		System.out.println("prueba 2");
		novo.click();
		sleep(6000);
		
		cancelar.click();
		sleep(3000);
		
		novo.click();
		sleep(6000);
		
		nome.sendKeys("PRUEBA QA 001");
		sleep(2000);
		
		System.out.println("prueba 3");
		tipoDeRegra.click();
		sleep(3000);
		opcTipoDeRegra.click();
		sleep(3000);
		System.out.println("prueba 4");
		tipoTributo.click();
		sleep(3000);
		opcionTipoTributo.click();
		sleep(1000);
		opcionTipoTributo.sendKeys(Keys.ESCAPE);
		sleep(3000);
		
		grupo.click();
		sleep(3000);
		opcGrupo.click();
		sleep(3000);
		
		estructura.click();
		sleep(3000);
		opcEstructura.click();
		sleep(3000);
		
		String data = fechaActual();
		validade.sendKeys("01/01/2013");
		sleep(1000);
		
		sleep(2000);
		aplicar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		justi.click();
//		sleep(3000);
//		agg.sendKeys("Teste Criação");
//		sleep(2000);
		
		aceitar.click();

		sleep(2000);
		
		biblioteca.click();
	
		sleep(2000);
		waitExpectElement(AN1);
		sleep(4000);
		AN1.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		
		//-----------SEGUNDO----------------
		novo.click();
		sleep(6000);
		
		nome.sendKeys("PRUEBA QA 002");
		sleep(2000);
		
		
		tipoDeRegra.click();
		sleep(3000);
		opcTipoDeRegra.click();
		sleep(3000);
		
		tipoTributo.click();
		sleep(3000);
		opcionTipoTributo.click();
		sleep(1000);
		opcionTipoTributo.sendKeys(Keys.ESCAPE);
		sleep(3000);
		
		grupo.click();
		sleep(3000);
		opcGrupo.click();
		sleep(3000);
		
		estructura.click();
		sleep(3000);
		opcEstructura.click();
		sleep(3000);
		
		String data1 = fechaActual();
		validade.sendKeys("01/01/2013");
		sleep(1000);
		
		sleep(2000);
		aplicar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		justi.click();
//		sleep(3000);
//		agg.sendKeys("Teste Criação");
//		sleep(2000);
		
		aceitar.click();

		sleep(2000);
		
		biblioteca.click();

		sleep(2000);
		waitExpectElement(AN1);
		sleep(4000);
		AN1.click();
		
		//---------------------------eliminacion-------------------------------------------
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		Integer fila1 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		Integer fila2 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		fila2 = fila2 - 1; 
		
		WebElement selecccionuno = driver.findElement(By.xpath("//div[@data-id]["+fila1+"]/div[2]/label/span"));
		selecccionuno.click();
		WebElement selecccionDos = driver.findElement(By.xpath("//div[@data-id]["+fila2+"]/div[2]/label/span"));
		selecccionDos.click();
		
		WebElement excluirmassa = driver.findElement(By.xpath("//span[@class=\"button-icon icon-font-Finance-and-Office icon-trash\"]"));
		excluirmassa.click();
		
		sleep(2000);
		waitExpectElement(Não);
		sleep(2000);
		
		Não.click();
		sleep(5000);
		
		WebElement excluirmassaa = driver.findElement(By.xpath("//span[@class=\"button-icon icon-font-Finance-and-Office icon-trash\"]"));
		excluirmassaa.click();
		
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		
		sim.click();
		
		//--------------------------- eliminacion definitiva ---------------------------------
		
		sleep(2000);
		lexeiraBiblioteca.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		Integer fila1D = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		Integer fila2D = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		fila2 = fila2D - 1; 
		
		WebElement selecccionunoD = driver.findElement(By.xpath("//div[@data-id]["+fila1D+"]/div[2]/label/span"));
		selecccionuno.click();
		WebElement selecccionDosD = driver.findElement(By.xpath("//div[@data-id]["+fila2D+"]/div[2]/label/span"));
		selecccionDos.click();
		
		WebElement excluirmassaD = driver.findElement(By.xpath("//span[@class=\"button-icon icon-font-Finance-and-Office icon-trash\"]"));
		excluirmassa.click();
		
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		
		sim.click();
		
		
		
		
		
		String idB = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		idInserir3(idB);
		sleep(2000);
		System.out.println("ID: "+id);
		System.out.println("IDB: "+idB);
		
		double idD = convertToDouble(id);
		double idBD = convertToDouble(idB);
		//compara pra ver se o novo id criado é realmente o ultimo
		boolean sucesso = false;
		
		if (idBD > idD) {
			sucesso = true;
		}else {
			sucesso = false;
		}
		
		
		return sucesso;
		
	}

}
