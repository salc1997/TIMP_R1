package com.sap.timp.pageObjectModel.MDR.ContratoIOF;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ContratoIOFVisualizarPO extends TestBaseSteven{
	

	@FindBy(xpath = "//span[text()=\"Contrato IOF \"]")
	public WebElement contratoiof;
		
	
	
	//@FindBy(xpath = "//*[@id=\"list\"]/div/div[1]/div/div[2]/div/div[3]/div/span[1]")
	@FindBy(xpath = "//span[text()=\"Id\"]")
	public WebElement idC;
	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")
	public WebElement idR;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//button[@id=\"home-icon\"]")
	public WebElement mostrar;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//div[@class=\"overlay dark\"]/div/div[3]/button[2]")
	//@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[2]")
	public WebElement butaosim;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//span[text()=\"Adicionar\"]")
	public WebElement adicionar;
	
	@FindBy(xpath = "//div[@class=\"tr first\" and @data-id][1]/div[2]/label/span")
	public WebElement opcao;
	
	@FindBy(xpath = "//div[@class=\"tr first\" and @data-id][1]/div[1]/div")
	public WebElement engrenagem;
	
	@FindBy(xpath = "//span[@id=\"contractNumber\"]")
	public WebElement contratovi;
	
	@FindBy(xpath = "//span[@id=\"revenueCode\"]")
	public WebElement codigoreceitavi;
	
	@FindBy(xpath = "//span[@id=\"personType\"]")
	public WebElement tipopessoavi;
	
	@FindBy(xpath = "//span[@id=\"cpf\"]")
	public WebElement cpfvi;
	
	@FindBy(xpath = "//span[@id=\"variation\"]")
	public WebElement variacaovi;
	
	@FindBy(xpath = "//span[@id=\"socialReason\"]")
	public WebElement razaosocialvi;
	
	@FindBy(xpath = "//span[@id=\"periodicity\"]")
	public WebElement periodicidadevi;
	
	@FindBy(xpath = "//span[@id=\"coin\"]")
	public WebElement moedavi;
	
	@FindBy(xpath = "//span[@id=\"contractValue\"]")
	public WebElement valordecontratovi;
	
	@FindBy(xpath = "//span[@id=\"validityOf\"]")
	public WebElement datavi;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Contrato No.\"]")
	public WebElement contratoed;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Código da Receita\"]")
	public WebElement codigoreceitaed;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Tipo de Pessoa\"]")
	public WebElement tipopessoaed;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher CPF\"]")
	public WebElement cpfed;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Variação\"]")
	public WebElement variacaoed;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Razão Social\"]")
	public WebElement razaosocialed;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Periodicidade\"]")
	public WebElement periodicidadeed;
	
	@FindBy(xpath = "//span[@id=\"coin\"]")
	public WebElement moedaed;
	
	@FindBy(xpath = "//span[@id=\"contractValue\"]")
	public WebElement valordecontratoed;
	
	@FindBy(xpath = "//span[@id=\"validityOf\"]")
	public WebElement dataed;
	
//	@FindBy(xpath ="//*[@id=\"table\"]/div/div[1]/div/div[3]/div[3]/div[1]/div/div[2]/ul/li[2]/span[2]")
//	public WebElement visualizar;
	
	
	public ContratoIOFVisualizarPO() {
		PageFactory.initElements(driver, this);
	}	
	
	
	public ArrayList<Boolean> visualizar() {
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		contratoiof.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		String idRegistro = idObter("ContratoIOF");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		actionsMoveToElementElement(menu);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		menu.click();
		sleep(1000);
		visualizar.click();
		sleep(3000);

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//visualizar
		/*
		String empresavisualizar = empresavi.getText();
		String pagamentovisualizar = pagamentovi.getText();
		String codigocontabilizacaovisualizar = codigocontabilizacaovi.getText();
		String descricaovisualizar = descricaopadraovi.getText();
		String tributovisualizar = tributovi.getText();
		String tipotributovisualizar= tipotributovi.getText();
		String datavisualizar = datavi.getText();
				
		System.out.println(empresavisualizar);
		System.out.println(pagamentovisualizar);
		System.out.println(codigocontabilizacaovisualizar);
		System.out.println(descricaovisualizar);
		System.out.println(tributovisualizar);
		System.out.println(tipotributovisualizar);
		System.out.println(datavisualizar);
	*/
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		biblioteca.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro1 = idObter("ContratoIOF");
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(1000);
		
		editar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		//editar
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		attributeToBeXpath("//div[@id=\"tax-type\"]/div", "class", "base-autocomplete required");
		sleep(2000);
		/*
		String empresaeditar = empresaed.getText();
		String pagamentoeditar = pagamentoed.getAttribute("value");
		String codigocontabilizacaoeditar = codigocontabilizacaoed.getAttribute("value");
		String descricaoeditar = descricaopadraoed.getAttribute("value");
		String tributoeditar = tributoed.getAttribute("value");
		String tipotributoeditar= tipotributoed.getAttribute("value");
		String dataeditar = dataed.getAttribute("value");
				
		System.out.println(empresaeditar);
		System.out.println(pagamentoeditar);
		System.out.println(codigocontabilizacaoeditar);
		System.out.println(descricaoeditar);
		System.out.println(tributoeditar);
		System.out.println(tipotributoeditar);
		System.out.println(dataeditar);
	
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(empresaeditar.equals(empresavisualizar));
		sucesso.add(pagamentoeditar.equals(pagamentovisualizar));
		sucesso.add(codigocontabilizacaoeditar.equals(codigocontabilizacaovisualizar));
		sucesso.add(descricaoeditar.equals(descricaovisualizar));
		sucesso.add(tributoeditar.equals(tributovisualizar));
		sucesso.add(tipotributoeditar.contains(tipotributovisualizar));
		sucesso.add(datavisualizar.equals(dataeditar));
		*/
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		//String sucesso = driver.findElement(By.xpath("//table[@class=\"edit\"]")).getAttribute("class");
		//System.out.println(sucesso);	
		return sucesso;
	}
}
