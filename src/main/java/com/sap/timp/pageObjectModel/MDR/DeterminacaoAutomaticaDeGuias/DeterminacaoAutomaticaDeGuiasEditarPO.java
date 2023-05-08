package com.sap.timp.pageObjectModel.MDR.DeterminacaoAutomaticaDeGuias;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseKenssy;

public class DeterminacaoAutomaticaDeGuiasEditarPO extends TestBaseKenssy{
	
	
	@FindBy(xpath = "//span[text()=\"Determinação Automática de Guias\"]")
	public WebElement determincaoautomaticadeguias;
	
	
	@FindBy(xpath = "//span[text()=\"Nova Determinação Automática de Guias\"]")
	public WebElement novodeterminacaoautomaticadeguias;
	
	@FindBy(xpath = "//div[@class=\"field\" and @id=\"company\"]/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcaoEmpresa;
	
	@FindBy(xpath = "//button[@id=\"adjustmentCode-btn-open-dialog\"]")
	public WebElement aCodigoAjuste;
	
	@FindBy(xpath = "//div[@id=\"content-list\"]//child::div[contains(@class,\"tbody\")]/div[@class=\"tr\" and @data-id=\"824\"]//span")
	public WebElement item;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	@FindBy(xpath = "//div[@id=\"componentOutput\"]//child::div[contains(@class,\"icon-downmenu\")]")
	public WebElement componente;
	
	@FindBy(xpath = "//li[@id=\"option-1\"]")
	public WebElement opcaoComponente;
	
	@FindBy(xpath = "//textarea[@placeholder=\"Preencher Descrição\"]")
	public WebElement descricao;
	
	@FindBy(xpath = "//div[@id=\"componentConfiguration\"]//child::div[contains(@class,\"icon-downmenu\")]")
	public WebElement codigoConfiguração;
	
	@FindBy(xpath = "//div[@id=\"componentConfiguration\"]//child::input")
	public WebElement codigoConfiguraçãoInput;
	
	@FindBy(xpath = "//div[@id=\"idLayout\"]//child::div[contains(@class,\"icon-downmenu\")]")
	public WebElement layoutGuia;
	
	@FindBy(xpath = "//div[@id=\"idLayout\"]//child::input")
	public WebElement layoutGuiaInput;
	
	@FindBy(xpath = "//div[@id=\"outputCodePR\"]//child::div[contains(@class,\"icon-downmenu\")]")
	public WebElement codigoOutputPR;
	

	@FindBy(xpath = "//div[@id=\"idLayoutConfiguration\"]//child::div[contains(@class,\"icon-downmenu\")]")
	public WebElement configuraçãodoLayout;
	
	@FindBy(xpath = "//div[@id=\"option-1\"]")
	public WebElement opcao;
	
	@FindBy(xpath = "//li[@id=\"option-1\"]")
	public WebElement opcaoli;
	
	@FindBy(xpath = "//li[@id=\"option-30\"]")
	public WebElement opcaoLayout;

	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Agrupador de CFOP\"]")
	public WebElement agrupadorcfop;
	
	@FindBy(xpath = "//div[@id=\"validityFrom\"]/div/div[1]/input")
	public WebElement dataincial;
	
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	
	@FindBy(xpath = "//div[@id=\"validityFrom\"]//input")
	public WebElement datavigencia;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	
	public DeterminacaoAutomaticaDeGuiasEditarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean Editar() {
		sleep(2000);
		determincaoautomaticadeguias.click();
		sleep(2000);
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	
		
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("DeterminacaoAutomaticaGuias");
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(15000);
		
		
		actionsMoveToElementElement(datavigencia);
		String dataInicioVigenciaValorNuevo = fechaAyer();
		System.out.println("Data a ser inserida: " +dataInicioVigenciaValorNuevo);
	
		datavigencia.clear(); // Limpio la fecha actual que tiene guardada
		datavigencia.sendKeys(dataInicioVigenciaValorNuevo); // Le envio la nueva fecha a editar	
		System.out.println(dataInicioVigenciaValorNuevo); // Imprimo la fecha que se va editar el nuevo valor
		
		sleep(3000);
		gravar.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(1000);
		nao.click();
		
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay dark\"]");
		sleep(16000);	
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
	     menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
	     açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(15000);
		
		
		// Obtengo el valor actualizado ya recargada la página
		actionsMoveToElementElement(datavigencia);
		String dataInicioVigenciaEditada = datavigencia.getAttribute("value");
		System.out.println("Data Nova: " +dataInicioVigenciaEditada);
		sleep(2000);
		
		boolean sucesso = false;
		sucesso = dataInicioVigenciaEditada.equals(dataInicioVigenciaValorNuevo); // Se compara si la fecha editada que se muestra en visualizar es igual a la fecha de ayer que fue la fecha que se establecio en editar
		
		
		System.out.println(sucesso);
		return sucesso;
		
	}		
	
	
	
	

}
