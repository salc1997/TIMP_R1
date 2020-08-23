package com.sap.timp.pageObjectModel.MDR.ContratoIOF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseEliel;

public class ContratoIOFEditarPO extends TestBaseEliel{
	
	
	@FindBy(xpath = "//span[text()=\"Contrato IOF \"]")
	public WebElement contratoiof;
		
	@FindBy(xpath = "//span[text()=\"Novo Contrato IOF \"]")
	public WebElement novocontratoiof;
	

	@FindBy(xpath = "//div[@id=\"company\"]/div/div/div[2]")
	public WebElement empresa;
	
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaoempresa;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Contrato No.\"]")
	public WebElement preenchercontrato;
	
	@FindBy(xpath ="//div[@id=\"revenueCode\"]/div/div/div[2]")
	public WebElement codigoreceita;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaocodigoreceita;
	
	@FindBy(xpath = "//div[@id=\"personType\"]/div/div/div[2]")
	public WebElement tipopessoa;
	
	@FindBy(xpath ="//li[@id][1]")
	public WebElement opcaotipopessoa;
	
	@FindBy(xpath ="//input[@placeholder=\"Preencher CPF\"]")
	public WebElement cpf;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Variação\"]")
	public WebElement variacao;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Razão Social\"]")
	public WebElement razaosocial;
	
	@FindBy(xpath = "//div[@id=\"periodicity\"]/div/div/div[2]")
	public WebElement periocidade;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaoperiocidade;
	
	@FindBy(xpath = "//div[@id=\"coin\"]/div/div[2]")
	public WebElement moeda;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaomoeda;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Valor do Contrato\"]")
	public WebElement valorcontrato;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Validade De\"]")
	public WebElement validadede;
	
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div/div[2]")
	public WebElement filial;
	
	@FindBy(xpath ="//*[@id=\"0001\"]/div[1]/label/span")
	public WebElement opcaofilial;
	
	@FindBy(xpath = "//div[@id=\"tax\"]/div/div/div[2]")
	public WebElement tributo;
	
	@FindBy(xpath ="//div[@id=\"00\"]/div/label/span")
	public WebElement opcaotributo;
	
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

	
	public ContratoIOFEditarPO() {
		PageFactory.initElements(driver, this);
	}

	public void editar() {
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		contratoiof.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//Pega o ultimo id
		siguiente.click();
		//setafinal.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter4();
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		actionsMoveToElementElement(menu);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		menu.click();
		sleep(1000);
		editar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		attributeToBeXpath("//div[@id=\"contractValue\"]/div/div", "class", "base-input  required type1 success");
		waitExpectElement(valorcontrato);
		sleep(2000);
		
		//valorcontrato.clear();
		
		///valorcontrato.sendKeys("100000");
		razaosocial.clear();
		razaosocial.sendKeys("LTDA");
		
		gravar.click();
		sleep(2000);
		butaosim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		attributeToBeXpath("//div[@id=\"contractValue\"]/div/div", "class", "base-input  required type1 success");
		
		//recarrega a pagina
		driver.navigate().refresh();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	}
	
}
