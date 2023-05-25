package com.sap.timp.pageObjectModel.BRB;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sap.timp.base.TestBaseSteven;

public class TodasFuncPO extends TestBaseSteven{
	
	
	
	@FindBy(xpath = "//*[@id=\"right\"]/div/div[1]/div/div/ul/li[1]/button")
	public WebElement novo;
	@FindBy(xpath = "//*[@id=\"create-name\"]/div/div/input")
	public WebElement nome;
	@FindBy(xpath = "//*[@id=\"select\"]/div[1]/input")
	public WebElement tipo;
	@FindBy(xpath = "//*[@id=\"option-3\"]")
	public WebElement tipoO;
	@FindBy(xpath = "//*[@id=\"create-tribute\"]/div/div[1]/div[1]/div[2]/input")
	public WebElement tributo;
	@FindBy(xpath = "//*[@id=\"00\"]/div[2]")
	public WebElement tributoO;
	@FindBy(xpath = "//*[@id=\"create-structure\"]/div/div[1]/input")
	public WebElement grupo;
	@FindBy(xpath = "//*[@id=\"create-sub-structure\"]/div/div[1]/input")
	public WebElement estrutura;
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[2]")
	public WebElement gravar;
	
	@FindBy(xpath = "//*[@id=\"editor-toolbar\"]/div/div/ul/li[1]/button")
	public WebElement gravarP;
	@FindBy(xpath = "//*[@id=\"accordion\"]/ul/li")
	public WebElement mostrado;
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//*[@id=\"right\"]/div/div[4]/div/div[1]/div/div[3]/div[1]/div[1]/div")
	public WebElement menu;
	@FindBy(xpath = "//*[@id=\"right\"]/div/div[4]/div/div[1]/div/div[3]/div[1]/div[1]/div/div[2]/ul/li[3]")
	public WebElement editar;
	@FindBy(xpath = "//*[@id=\"report-search\"]/div/div/input")
	public WebElement buscarCampo;
	@FindBy(xpath = "//div[@data-id=\"28\"]")
	public WebElement empresa;
	@FindBy(xpath = "//div[@data-id=\"193\"]")
	public WebElement ufFilial;
	@FindBy(xpath = "//div[@data-id=\"30\"]")
	public WebElement filial;
	@FindBy(xpath = "//div[@data-id=\"21\"]")
	public WebElement docFiscal;
	@FindBy(xpath = "//div[@data-id=\"31\"]")
	public WebElement docnum;
	
	@FindBy(xpath = "//div[@data-id=\"8\"]")
	public WebElement categoria;
	@FindBy(xpath = "//div[@data-id=\"79\"]")
	public WebElement valor;
	@FindBy(xpath = "//div[@data-id=\"129\"]")
	public WebElement codMaterial;
	@FindBy(xpath = "//div[@data-id=\"115\"]")
	public WebElement cfop;
	@FindBy(xpath = "//div[@data-id=\"117\"]")
	public WebElement cts;
	@FindBy(xpath = "//div[@data-id=\"5\"]")
	public WebElement bc;
	@FindBy(xpath = "//div[@data-id=\"171\"]")
	public WebElement aliquota;
	@FindBy(xpath = "//div[@data-id=\"66\"]")
	public WebElement valorICMS;
	@FindBy(xpath = "//*[@id=\"editor-toolbar\"]/div/div/ul/li[1]/button")
	public WebElement gravarE;
	
	@FindBy(xpath = "//*[@id=\"draggable-28\"]")
	public WebElement empresaC;
	@FindBy(xpath = "//*[@id=\"draggable-193\"]")
	public WebElement UfFilialC;
	@FindBy(xpath = "//*[@id=\"draggable-30\"]")
	public WebElement filialC;
	@FindBy(xpath = "//*[@id=\"draggable-21\"]")
	public WebElement dataC;
	@FindBy(xpath = "//*[@id=\"draggable-31\"]")
	public WebElement docnumC;
	@FindBy(xpath = "//*[@id=\"draggable-8\"]")
	public WebElement categoriaC;
	@FindBy(xpath = "//*[@id=\"draggable-79\"]")
	public WebElement valorC;
	@FindBy(xpath = "//*[@id=\"draggable-129\"]")
	public WebElement codMaterialC;
	@FindBy(xpath = "//*[@id=\"draggable-115\"]")
	public WebElement cfopC;
	@FindBy(xpath = "//*[@id=\"draggable-117\"]")
	public WebElement cstC;
	@FindBy(xpath = "//*[@id=\"draggable-5\"]")
	public WebElement bcC;
	@FindBy(xpath = "//*[@id=\"draggable-171\"]")
	public WebElement aliquotaC;
	@FindBy(xpath = "//*[@id=\"draggable-66\"]")
	public WebElement valorICMSC;

	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//*[@id=\"searchbox\"]/div/div/input")
	public WebElement pesquisar;
	@FindBy(xpath = "//*[@id=\"searchbox\"]/div/div/span[1]")
	public WebElement ferramenta;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-output\"]")
	public WebElement cadastro;
	
	//publico privado
	
	@FindBy(xpath = "//*[@id=\"editor-toolbar\"]/div/div/ul/li[3]/button")
	public WebElement compartirB;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[2]")
	public WebElement aceptar;
	
	@FindBy(xpath = "//*[@id=\"right\"]/div/div[5]/div/div[1]/div/div[3]/div[1]/div[4]/span")
	public WebElement publico;
	
	//Excluir
	
	@FindBy(xpath = "//*[@id=\"draggable-117\"]")
	public WebElement excluir;
	
	@FindBy(xpath = "//*[@id=\"report-search\"]/div/div/input")
	public WebElement coluna;
	
	@FindBy(xpath = "//li[@id = \"draggable-117\"]/div/div/div[@id=\"chead\"]")
	public WebElement menuC;
	@FindBy(xpath = "//*[@id=\"basePopover-wrapper\"]/div/div/div/ul/li[5]")
	public WebElement opcionC;
	
	@FindBy(xpath = "//div[@data-id=\"117\"]")
	public WebElement cst;
	
	//EDITAR
	@FindBy(xpath = "//*[@id=\"right\"]/div/div[5]/div/div[1]/div/div[3]/div[1]/div[1]/div/div[2]/ul/li[3]")
	public WebElement opcao;
	
	@FindBy(xpath = "//*[@id=\"draggable-28\"]")				
	public WebElement mover;
	
	public TodasFuncPO() {

		PageFactory.initElements(driver, this);
	}
	
	
	
	public boolean criar() {
		
		String url = driver.getCurrentUrl();
		
		boolean td1 = false;
		boolean tc2 = false;
		boolean tp1 = false;
		boolean tq1 = false;
		boolean tq2 = false;
		
		if (url.contains("tc2")) {
			tc2 = true;
		}else if (url.contains("tp1")) {
			tp1 = true;
		}else if (url.contains("tq1")) {
			tq1 = true;
		}else if (url.contains("tq2")) {
			tq2 = true;
		}else {
			td1 = true;
		}
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		cadastro.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		novo.click();
		
		attributeToBeXpath("//*[@id=\"create-structure\"]/div", "class", "base-autocomplete required");
		sleep(3000);
		nome.sendKeys("Prueba Automatizada");
		
		tipo.click();
		
		tipoO.click();
		sleep(1000);
		
		tributo.click();
		
		tributoO.click();
		sleep(1000);
		tributo.sendKeys(Keys.ESCAPE);
	
		sleep(1000);
		
		
		if (tc2 == true) {
			grupo.sendKeys("Notas Fiscais - v2.0");
			grupo.sendKeys(Keys.ENTER);
		}else if (tp1 == true) {
			grupo.sendKeys("NF Nova");
			grupo.sendKeys(Keys.ENTER);
		}else if (tq1==true) {
			grupo.sendKeys("Nota Fiscal - Nova");
			grupo.sendKeys(Keys.ENTER);
		}else if (tq2==true) {
			grupo.sendKeys("Nota Fiscal - Nova");
			grupo.sendKeys(Keys.ENTER);
		}else {
			grupo.sendKeys("Nota Fiscal Teste Automatizado");
			grupo.sendKeys(Keys.ENTER);
		}
	
		sleep(1000);
		estrutura.sendKeys("Nota Fiscal (Itens com Impostos) + Empresa/Filial");
		estrutura.sendKeys(Keys.ENTER);

		sleep(1000);
		
		gravar.click();
		waitExpectElement(mostrado);

		sleep(5000);
		
		biblioteca.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		pesquisar.sendKeys("Prueba Automatizada");
		ferramenta.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(7000);
		
		String texto = driver.findElement(By.xpath("//*[@id=\"right\"]/div/div[5]/div/div[1]/div/div[3]/div[1]/div[7]")).getText();
		System.out.println(texto);

		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[6]//div[@class=\"cell-wrapper\"]")).getText();
		
		idInserir("IdBRB",id);
		System.out.println(id);
		
		boolean sucesso = texto.contains("Prueba Automatizada");
		
		return sucesso;
		
		
	}
	
	public ArrayList<Boolean> colunas() {
		

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		String idRegistro = idObter("IdBRB");
		
		System.out.println("Ultimo registro creado: " + idRegistro);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		
		menu.click();
		sleep(1000);
		editar.click();
		
		sleep(3000);
		waitExpectXpath("//*[@id=\"accordion\"]/ul/li/div/div");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	
		buscarCampo.sendKeys("Empresa");
		Actions actions = new Actions(driver);
		actions.moveToElement(empresa);
		sleep(15000);
		actions.doubleClick(empresa).perform();
		
		buscarCampo.clear();
		buscarCampo.sendKeys("UF da Filial");
		actions.moveToElement(ufFilial);
		sleep(3000);
		actions.doubleClick(ufFilial).perform();
		
		buscarCampo.clear();
		buscarCampo.sendKeys("Filial");
		actions.moveToElement(filial);
		sleep(3000);
		actions.doubleClick(filial).perform();
		
		buscarCampo.clear();
		buscarCampo.sendKeys("Data lançamento doc. fiscal");
		actions.moveToElement(docFiscal);
		sleep(3000);
		actions.doubleClick(docFiscal).perform();
		
		buscarCampo.clear();
		buscarCampo.sendKeys("Docnum");
		actions.moveToElement(docnum);
		sleep(3000);
		actions.doubleClick(docnum).perform();
		
		buscarCampo.clear();
		buscarCampo.sendKeys("Categoria nota fiscal");
		actions.moveToElement(categoria);
		sleep(3000);
		actions.doubleClick(categoria).perform();
		
		buscarCampo.clear();
		buscarCampo.sendKeys("Valor");
		actions.moveToElement(valor);
		sleep(3000);
		actions.doubleClick(valor).perform();
		
		buscarCampo.clear();
		buscarCampo.sendKeys("Cód. material");
		actions.moveToElement(codMaterial);
		sleep(3000);
		actions.doubleClick(codMaterial).perform();
		
		buscarCampo.clear();
		buscarCampo.sendKeys("CFOP");
		actions.moveToElement(cfop);
		sleep(3000);
		actions.doubleClick(cfop).perform();
		
		buscarCampo.clear();
		buscarCampo.sendKeys("ICMS");
		actions.moveToElement(cts);
		sleep(3000);
		actions.doubleClick(cts).perform();
		
		buscarCampo.clear();
		buscarCampo.sendKeys("BC ICMS");
		actions.moveToElement(bc);
		sleep(3000);
		actions.doubleClick(bc).perform();
		
	
		buscarCampo.clear();
		buscarCampo.sendKeys("Valor ICMS");
		actions.moveToElement(valorICMS);
		sleep(3000);
		actions.doubleClick(valorICMS).perform();
		
		buscarCampo.clear();
		buscarCampo.sendKeys("Alíquota ICMS");
		actions.moveToElement(aliquota);
		sleep(3000);
		actions.doubleClick(aliquota).perform();
		
		sleep(2000);
		
		gravarE.click();
		sleep(2000);
		waitExpectElement(nao);
		sleep(1000);
		nao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		driver.navigate().refresh();
		
		sleep(3000);
		waitExpectXpath("//*[@id=\"accordion\"]/ul/li/div/div");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sucesso.add(empresaC.isDisplayed());
		sucesso.add(UfFilialC.isDisplayed());
		sucesso.add(filialC.isDisplayed());
		sucesso.add(dataC.isDisplayed());
		sucesso.add(docnumC.isDisplayed());
		sucesso.add(categoriaC.isDisplayed());
		sucesso.add(valorC.isDisplayed());
		sucesso.add(codMaterialC.isDisplayed());
		sucesso.add(cfopC.isDisplayed());
		sucesso.add(cstC.isDisplayed());
		sucesso.add(bcC.isDisplayed());
		sucesso.add(aliquotaC.isDisplayed());
		sucesso.add(valorICMSC.isDisplayed());
		
		biblioteca.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		return sucesso;
		
		
		
	}
	public boolean publicoEditor() {
		
		String idRegistro = idObter("IdBRB");
		
		System.out.println("Ultimo registro creado: " + idRegistro);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		
		menu.click();
		sleep(1000);
		editar.click();

		waitExpectXpath("//*[@id=\"accordion\"]/ul/li");
		
		compartirB.click();
		
		aceptar.click();
		
		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		sleep(6000);
		
		gravarP.click();
		sleep(2000);
		waitExpectElement(nao);
		sleep(1000);
		nao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(5000);
		
		sleep(2000);
		
		biblioteca.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		actionsMoveToElementElement(publico);

		String publicoT = publico.getAttribute("aria-label");
		System.out.println(publicoT);
		
		boolean sucesso = publicoT.contains("Relatório Público");
		System.out.println(sucesso);
		sleep(4000);

		return sucesso;

	}
	public boolean privadoEditor() {
		
		String idRegistro = idObter("IdBRB");

		System.out.println("Ultimo registro creado: " + idRegistro);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		
		menu.click();
		sleep(1000);
		editar.click();

		
		waitExpectXpath("//*[@id=\"accordion\"]/ul/li");
		
		compartirB.click();
		sleep(3000);
		aceptar.click();
		
		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		sleep(5000);
		
		gravarP.click();
		sleep(2000);
		waitExpectElement(nao);
		sleep(1000);
		nao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(5000);
		
		waitExpectXpath(("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]"));
		sleep(2000);

		biblioteca.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		actionsMoveToElementElement(publico);

		String privadoT = publico.getAttribute("aria-label");
		System.out.println(privadoT);
		boolean sucesso = privadoT.contains("Relatório Privado");
		System.out.println(sucesso);
		sleep(4000);
		
		return sucesso;
		
	}		
	
	public boolean publicoBiblioteca() {

		publico.click();
		sleep(2000);
		aceptar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		//waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		//sleep(menuT);
		sleep(3000);
		actionsMoveToElementElement(publico);
		String publicoT = publico.getAttribute("aria-label");
		System.out.println(publicoT);
		
		boolean sucesso = publicoT.contains("Relatório Público");
		
		return sucesso;

	}		
	
	public boolean privadoBiblioteca() {
		publico.click();
		sleep(3000);
		aceptar.click();
		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		actionsMoveToElementElement(publico);
		
		
		String privadoT = publico.getAttribute("aria-label");
		System.out.println(privadoT);
		
		boolean sucesso = privadoT.contains("Relatório Privado");

		return sucesso;

	}
	
	public ArrayList<Boolean> DragNDrop() {
		
		String idRegistro = idObter("IdBRB");

		System.out.println("Ultimo registro creado: " + idRegistro);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(1000);
		editar.click();
		
		waitExpectXpath("//*[@id=\"accordion\"]/ul/li");
		sleep(3000);
		System.out.println("paso 1");	
		Actions actions = new Actions(driver);
		
		waitExpectXpath("//*[@id=\"accordion\"]/ul/li/div/div");
		
		actions.moveToElement(excluir).perform();		
		waitExpectXpath("//*[@id=\"accordion\"]/ul/li/div/div");
		
		actions.moveToElement(excluir).perform();		

		moveToElement(excluir, driver.findElement(By.xpath("//span[text()=\"Remover\"]")));
		sleep(2000);
		
		gravarP.click();
		
		sleep(2000);
		waitExpectElement(nao);
		sleep(1000);
		nao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		driver.navigate().refresh();

		waitExpectXpath("//*[@id=\"accordion\"]/ul/li/div/div");
		sleep(3000);
		List<WebElement> removido = driver.findElements(By.xpath("//*[@id=\"draggable-117\"]"));
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		if(removido.size()==0){
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
	

		sleep(1000);
		System.out.println("paso 2");	
		coluna.sendKeys("CST ICMS");

		sleep(4000);

		sleep(4000);
		
		actions.moveToElement(cst);
		sleep(3000);
		actions.doubleClick(cst).perform();
		sleep(3000);
	
		gravarP.click();
		
		sleep(2000);
		waitExpectElement(nao);
		sleep(1000);
		nao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		driver.navigate().refresh();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectXpath("//*[@id=\"accordion\"]/ul/li/div/div");
		sleep(2000);
		
		System.out.println("paso3");
		List<WebElement> agregado = driver.findElements(By.xpath("//*[@id=\"draggable-117\"]"));
		
		if (agregado.size()>0) {
			sucesso.add(true);
		}
		
		sleep(2000);

		System.out.println(sucesso);
		return sucesso;
		
		
		
		
	}
	public ArrayList<Boolean> ExcluirColuna() {		

		
		Actions actions = new Actions(driver);
		
		
		actions.moveToElement(excluir).perform();
		
		sleep(1000);
	
		menuC.click();
		sleep(1000);
		
		opcionC.click();
		sleep(1000);
		gravarP.click();
		sleep(2000);
		waitExpectElement(nao);
		sleep(1000);
		nao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectXpath("//*[@id=\"accordion\"]/ul/li/div/div");
		
		driver.navigate().refresh();
		
		
		waitExpectXpath("//*[@id=\"accordion\"]/ul/li/div/div");
		
		List<WebElement> removido = driver.findElements(By.xpath("//*[@id=\"draggable-117\"]"));
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		if(removido.size()==0){
			sucesso.add(true);
		}
	
		sleep(1000);

		coluna.sendKeys("CST ICMS");
		
		actions.doubleClick(cst).perform();
		sleep(5000);
	
		gravarP.click();
		sleep(2000);
		waitExpectElement(nao);
		sleep(1000);
		nao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		driver.navigate().refresh();
		
		waitExpectXpath("//*[@id=\"accordion\"]/ul/li/div/div");
		sleep(1000);
		List<WebElement> agregado = driver.findElements(By.xpath("//*[@id=\"draggable-117\"]"));
		
		if (agregado.size()>0) {
			sucesso.add(true);
		}
		
		sleep(2000);

		biblioteca.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		return sucesso;

	}
	public boolean editar() {
		
	
		String idRegistro = idObter("IdBRB");
		
		System.out.println("Ultimo registro creado: " + idRegistro);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		
		menu.click();
		sleep(1000);
		editar.click();
		
		sleep(3000);
		waitExpectXpath("//*[@id=\"accordion\"]/ul/li/div/div");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		Actions actions = new Actions(driver);
		waitExpectXpath("//*[@id=\"accordion\"]/ul/li/div/div");
		sleep(2000);

		Point hacia = driver.findElement(By.xpath("//*[@id=\"draggable-193\"]")).getLocation();
		Point desde = driver.findElement(By.xpath("//*[@id=\"draggable-28\"]")).getLocation();

		int x = desde.x;
		int y = hacia.x;
		sleep(1000);
		
		actions.dragAndDropBy(mover,hacia.x, 0).perform();
		
		gravarP.click();
		sleep(2000);
		waitExpectElement(nao);
		sleep(1000);
		nao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		driver.navigate().refresh();
		
		waitExpectXpath("//*[@id=\"accordion\"]/ul/li/div/div");
		sleep(2000);
		
		boolean movido = false;
		
		Point actual = driver.findElement(By.xpath("//*[@id=\"draggable-28\"]")).getLocation();
		System.out.println(actual);
		
		if(	x != actual.x) {
			movido = true;
		}
		
		sleep(2000);
		actions.dragAndDropBy(mover, -y, 0).perform();
		gravarP.click();
		sleep(2000);
		waitExpectElement(nao);
		sleep(1000);
		nao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		return movido;
		
	}

}
