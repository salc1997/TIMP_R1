package com.sap.timp.pageObjectModel.TAA.AtribuiçõesdeRegras.RegraDeCampos;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBase;

public class RegraDeCamposTodasAsFuncPO extends TestBase{
	@FindBy(xpath = "//span[text()=\"Atribuições de Regras\"]")
	public WebElement abaAtribucoesDeRegras;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-00\"]")
	public WebElement icms;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-rulesLvl2_00\"]")
	public WebElement regrasDeCampos;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//span[text()=\"Nova Atribuição Regra\"]")
	public WebElement btnNovo;
	
	@FindBy(xpath = "//div[@id=\"rule-type\"]/div/div/div[2]")
	public WebElement cboTipoDeRegra;
	
	@FindBy(xpath = "//li[@class=\"list-item\" and @tabindex=\"0\" and @id and text()=\"Regra de Campos\"]")
	public WebElement opcionTipoDeRegra;
	
	@FindBy(xpath = "//div[@id=\"rule-tax\"]/div/div/div[2]")
	public WebElement cboTributo;
	
	@FindBy(xpath = "//li[@class=\"list-item\" and @tabindex=\"0\" and @id and text()=\"ICMS\"]")
	public WebElement opcionTributo;
	
	@FindBy(xpath = "//div[@id=\"rule-company\"]/div/div/div[2]")
	public WebElement cboEmpresa;
	
	@FindBy(xpath = "//div[@class=\"list-item-text\" and text()=\"1000\"]")
	public WebElement opcionEmpresa;
	
	@FindBy(xpath = "//div[@id=\"rule-state\"]/div/div/div[2]")
	public WebElement cboUf;
	
	@FindBy(xpath = "//div[@class=\"list-item-text\" and text()=\"SP\"]")
	public WebElement opcionUf;
	
	@FindBy(xpath = "//div[@id=\"rule-branch\"]/div/div/div[2]")
	public WebElement cboFilial;
	
	@FindBy(xpath = "//div[@class=\"list-item-text\" and text()=\"1000 - 0001\"]")
	public WebElement opcionFilial;
	
	@FindBy(xpath = "//div[@id=\"rule-type-1\"]/div/div/div[2]")
	public WebElement cboRegraDeAbas;
	
	@FindBy(xpath = "//div[@id=\"rule-rule\"]/div/div[2]")
	public WebElement cboRegras;
	
	@FindBy(xpath = "//li[contains(@class, \"list-item\") and @id and @tabindex=\"0\"][1]")
	public WebElement opcionCombo;
	
	@FindBy(xpath = "//div[@id=\"rule-valid-from\"]/div/div/input")
	public WebElement inputValidadeDe;
	
	@FindBy(xpath = "//button[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//button[text()=\"Fechar\"]")
	public WebElement btnFechar;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement btnFecharD;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement btnAceitar;
	
	@FindBy(xpath = "//button[text()=\"Cancelar\"]")
	public WebElement cancelar;
	
	public RegraDeCamposTodasAsFuncPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		invisibilityOfElementOverlay();
		abaAtribucoesDeRegras.click();
		invisibilityOfElementOverlay();
		
		icms.click();
		sleep(2000);
		
		regrasDeCampos.click();
		invisibilityOfElementOverlay();
		
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
		invisibilityOfElementOverlay();
		
		waitExpectedElement(cboTipoDeRegra);
		cboTipoDeRegra.click();
		sleep(1000);
		opcionTipoDeRegra.click();
		sleep(1000);
		
		cboTributo.click();
		sleep(1000);
		opcionTributo.click();
		sleep(1000);
		
		cboEmpresa.click();
		sleep(1000);
		opcionEmpresa.click();
		closeSelectTypeCheckbox(cboEmpresa);
		sleep(1000);
		
		String URL = driver.getCurrentUrl();
		
		attributeToBe("//div[@id=\"rule-state\"]/div", "class", "base-MultipleSelect3 required");
		cboUf.click();
		sleep(1000);
		
		if(URL.contains("tc2")) {
			opcionUf = driver.findElement(By.xpath("//div[@class=\"list-item-text\" and text()=\"AL\"]"));
		}
		
		sleep(2000);
		opcionUf.click();
		closeSelectTypeCheckbox(cboUf);
		sleep(1000);
		
		actionsMoveToElement(inputValidadeDe);
		attributeToBe("//div[@id=\"rule-branch\"]/div", "class", "base-MultipleSelect3 required");
		cboFilial.click();
		sleep(1000);
		
		if(URL.contains("tc2")) {
			opcionFilial = driver.findElement(By.xpath("//div[@class=\"list-item-text\" and text()=\"1000 - 0805\"]"));
		}
		
		sleep(2000);		
		opcionFilial.click();
		closeSelectTypeCheckbox(cboFilial);
		sleep(1000);
		
		waitExpectedElement(cboRegraDeAbas);
		cboRegraDeAbas.click();
		sleep(1000);
		opcionCombo.click();
		sleep(1000);
		
		cboRegras.click();
		sleep(1000);
		opcionCombo.click();
		sleep(1000);
		
		inputValidadeDe.sendKeys(fechaActual());
		sleep(1000);
		
		btnGravar.click();
		invisibilityOfElementOverlay();
		sleep(4000);

		btnUltimaPagina.click();
		invisibilityOfElementOverlay();
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		
		String idRegistro = "0"; // Ultimo ID despues de crear
		
		if(rows > 0) {
			idRegistro = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
			System.out.println("ID Ultimo Registro Creado: " + idRegistro);
		}
		
		boolean sucesso = false;
		
		int id1 = convertToInt(id);
		int id2 = convertToInt(idRegistro);
		
		if(id2 > id1) { 
			System.out.println("Registro creado...");
			sucesso = true;
			idInserir("RegraDeCampos",idRegistro);
		}else {
			System.out.println("No se pudo crear el registro...");
		}
		
		return sucesso;
	}
	public boolean editar() {
		
		
		btnUltimaPagina.click();
		invisibilityOfElementOverlay();
		

		String idRegistro = idObter("RegraDeCampos");
		System.out.println("ID Registro: " + idRegistro);
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectedElement(inputValidadeDe);
		attributoNotToBeEmpty(inputValidadeDe, "value");
		String inputValidadeValorOriginal = inputValidadeDe.getAttribute("value");
		System.out.println("Validade de original: " + inputValidadeValorOriginal);
		
		String valorNuevo = fechaManana();
		System.out.println("Valor nuevo a enviar: " + valorNuevo);
		
		inputValidadeDe.clear();
		inputValidadeDe.sendKeys(valorNuevo);
		sleep(1000);
		
		btnGravar.click();
		sleep(3000);
		invisibilityOfElementOverlay();
		sleep(2000);
		
		btnUltimaPagina.click();
		invisibilityOfElementOverlay();

		System.out.println("ID Registro: " + idRegistro);
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectedElement(inputValidadeDe);
		attributoNotToBeEmpty(inputValidadeDe, "value");
		String inputValidadeValorEditado = inputValidadeDe.getAttribute("value");
		System.out.println("Validade de editado: " + inputValidadeValorEditado);
		
		boolean sucesso = false;
		
		if(inputValidadeValorEditado.equals(valorNuevo)) {
			System.out.println("Registro editado...");
			sucesso = true;
		}else {
			System.out.println("No se pudo editar el registro...");
		}
		
		return sucesso;
	}
	public ArrayList<Boolean> Detalhes() {
		
		cancelar.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		
		btnUltimaPagina.click();
		invisibilityOfElementOverlay();
		
		String idRegistro = idObter("RegraDeCampos");
		System.out.println("ID Registro: " + idRegistro);
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhes\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		
		// Datos de Detalles
		String empresaString = driver.findElement(By.xpath("//div[@id=\"detail-description\"][2]//div[2]")).getText();
		String ufString = driver.findElement(By.xpath("//div[@id=\"detail-description\"][3]//div[2]")).getText();
		String filialD = driver.findElement(By.xpath("//div[@id=\"detail-description\"][4]//div[2]")).getText();
		String reglaD = driver.findElement(By.xpath("//div[@id=\"detail-description\"][1]//div[2]")).getText();
		
		
		System.out.println("Datos de Detalle");
		System.out.println("Empresa: " + empresaString);
		System.out.println("UF: " + ufString);
		System.out.println("Filial: " + filialD);
		System.out.println("Regra: " + reglaD);
		
		sleep(1000);
		
		
		btnFecharD.click();
		sleep(2000);
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Ver\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(5000);
		
		String URL = driver.getCurrentUrl();
		
		// Datoss de Ver
		waitExpectedElement("//div[@id=\"rule-type\"]/div/div/div/input");
		attributoNotToBeEmpty("//div[@id=\"rule-type\"]/div/div/div/input", "value");
		String empresaString1 = driver.findElement(By.xpath("//div[@id=\"rule-company\"]//div[1]")).getText().trim();
		String ufString1 = driver.findElement(By.xpath("//div[@id=\"rule-state\"]//div[1]")).getText().trim();
		String filialString = driver.findElement(By.xpath("//div[@id=\"rule-branch\"]//div[1]")).getText().trim();
		String regraString = driver.findElement(By.xpath("//div[@id=\"rule-rule\"]//input")).getAttribute("value").trim();
		

		System.out.println("");
		System.out.println("Datos de Editar");
		System.out.println("Empresa: " + empresaString1);
		System.out.println("UF: " + ufString1);
		System.out.println("Filial: " + filialString);
		System.out.println("Regra: " + regraString );
		
		sleep(3000);
		btnFechar.click();
		sleep(2000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(empresaString1.equals(empresaString));
		sucesso.add(ufString1.equals(ufString));
		sucesso.add(filialD.equals(filialString));
		sucesso.add(reglaD.equals(regraString));
		
		System.out.println("");
		System.out.println(sucesso);
		
		return sucesso;
	}
	public ArrayList<Boolean> ver() {
		
		
		btnUltimaPagina.click();
		invisibilityOfElementOverlay();
		
		String idRegistro = idObter("RegraDeCampos");
		System.out.println("ID Registro: " + idRegistro);
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Ver\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(5000);
		
		String URL = driver.getCurrentUrl();
		
		// Datoss de Ver
		waitExpectedElement("//div[@id=\"rule-type\"]//input");
		attributoNotToBeEmpty("//div[@id=\"rule-type\"]//input", "value");
		String tipoDeRegraString = driver.findElement(By.xpath("//div[@id=\"rule-type\"]//input")).getAttribute("value").trim();
		String tributoString = driver.findElement(By.xpath("//div[@id=\"rule-tax\"]//input")).getAttribute("value").trim();
		String empresaString = driver.findElement(By.xpath("//div[@id=\"rule-company\"]//div[1]")).getText().trim();
		String ufString = driver.findElement(By.xpath("//div[@id=\"rule-state\"]//div[1]")).getText().trim();
		String filialString = driver.findElement(By.xpath("//div[@id=\"rule-branch\"]//div[1]")).getText().trim();
		String regraDeAbasString = driver.findElement(By.xpath("//div[@id=\"rule-type-1-container\"]//input")).getAttribute("value").trim();
		String regraString = "";
		
		if(URL.contains("tp1")) {
			regraString = driver.findElement(By.xpath("//div[@id=\"rule-rule\"]/div/div/div/input")).getAttribute("value").trim();
		}else {
			regraString = driver.findElement(By.xpath("//div[@id=\"rule-rule\"]/div/div/input")).getAttribute("value").trim();
		}
		
		
		System.out.println("Datos de ver");
		System.out.println("Tipo de Regra: " + tipoDeRegraString);
		System.out.println("Tributo: " + tributoString);
		System.out.println("Empresa: " + empresaString);
		System.out.println("UF: " + ufString);
		System.out.println("Filial: " + filialString);
		System.out.println("Regra de Abas: " + regraDeAbasString);
		System.out.println("Regra: " + regraString);
		
		sleep(1000);
		btnFechar.click();
		sleep(2000);
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(9000);
		
		// Datoss de Editar
		waitExpectedElement("//div[@id=\"rule-type\"]//input");
		attributoNotToBeEmpty("//div[@id=\"rule-type\"]//input", "value");
		String tipoDeRegraString1 = driver.findElement(By.xpath("//div[@id=\"rule-type\"]//input")).getAttribute("value").trim();
		String tributoString1 = driver.findElement(By.xpath("//div[@id=\"rule-tax\"]//input")).getAttribute("value").trim();
		String empresaString1 = driver.findElement(By.xpath("//div[@id=\"rule-company\"]//div[1]")).getText().trim();
		String ufString1 = driver.findElement(By.xpath("//div[@id=\"rule-state\"]//div[1]")).getText().trim();
		String filialString1 = driver.findElement(By.xpath("//div[@id=\"rule-branch\"]//div[1]")).getText().trim();
		String regraDeAbasString1 = driver.findElement(By.xpath("//div[@id=\"rule-type-1-container\"]//input")).getAttribute("value").trim();
		String regraString1 = "";
		
		if(URL.contains("tp1")) {
			regraString1 = driver.findElement(By.xpath("//div[@id=\"rule-rule\"]//input")).getAttribute("value").trim();
		}else {
			regraString1 = driver.findElement(By.xpath("//div[@id=\"rule-rule\"]//input")).getAttribute("value").trim();
		}
		
		System.out.println("");
		System.out.println("Datos de Editar");
		System.out.println("Tipo de Regra: " + tipoDeRegraString1);
		System.out.println("Tributo: " + tributoString1);
		System.out.println("Empresa: " + empresaString1);
		System.out.println("UF: " + ufString1);
		System.out.println("Filial: " + filialString1);
		System.out.println("Regra de Abas: " + regraDeAbasString1);
		System.out.println("Regra: " + regraString1);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(tipoDeRegraString1.equals(tipoDeRegraString));
		sucesso.add(tributoString1.equals(tributoString));
		sucesso.add(empresaString1.equals(empresaString));
		sucesso.add(ufString1.equals(ufString));
		sucesso.add(filialString1.equals(filialString));
		sucesso.add(regraDeAbasString1.equals(regraDeAbasString));
		sucesso.add(regraString1.equals(regraString));
		
		System.out.println("");
		System.out.println(sucesso);
		
		return sucesso;
	}
	
	public boolean excluir() {
		
		cancelar.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		
		btnUltimaPagina.click();
		invisibilityOfElementOverlay();
		
		String idRegistro = idObter("RegraDeCampos");
		System.out.println("ID Registro: " + idRegistro);
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectedElement(btnAceitar);
		btnAceitar.click();
		invisibilityOfElementOverlay();
		sleep(2000);
		
		btnUltimaPagina.click();
		invisibilityOfElementOverlay();
		sleep(1000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		
		String idUltimoRegistro = "0"; // Ultimo ID despues de excluir
		
		if(rows > 0) {
			idUltimoRegistro = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
			System.out.println("ID Ultimo Registro despues de excluir: " + idUltimoRegistro);
		}
		
		boolean sucesso = false;
		
		int id1 = convertToInt(idRegistro);
		int id2 = convertToInt(idUltimoRegistro);
		
		if(id2 != id1) {
			System.out.println("Registro excluido...");
			sucesso = true;
		}else {
			System.out.println("No se pudo excluir el registro...");
		}
		
		return sucesso;
	}
}
