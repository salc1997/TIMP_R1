package com.sap.timp.pageObjectModel.TBD.ArmazenagemDeArquivos.AprovacaoDeDocumentos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBase;

public class AprovacaoDeDocumentosEditarPO extends TestBase {
	
	@FindBy(xpath = "//span[text()=\"Armazenagem de Arquivos\"]")
	public WebElement armazenagemdearquivos;
	
	
	@FindBy(xpath = "//span[text()=\"Aprova��o de Documentos\"]")
	public WebElement aprovacaodocumentos;
	
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	

	@FindBy(xpath = "//button[text()=\"Gravar\"]")
	public WebElement gravar;
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement Gravar;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//textarea[@placeholder=\"Preencher Coment�rios\"]")
	public WebElement comentario;
	
	
	@FindBy(xpath = "//button[text()=\"N�o\"]")
	public WebElement nao;
	
	
	public AprovacaoDeDocumentosEditarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean editar() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		armazenagemdearquivos.click();
		
		sleep(2000);
		
		aprovacaodocumentos.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("AprovacaoDeDocumentosCriar");
		
		System.out.println("Ultimo registro: " + idRegistro);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElement(menu);
		sleep(2000);

		menu.click();
		sleep(1000);
		editar.click();
		sleep(2000);
		
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
		attributeToBe("//div[@id=\"docType\"]/div", "class", "base-autocomplete required");
		
		String enviar = "Teste automatizado";
		comentario.clear();
		sleep(2000);
		comentario.sendKeys(enviar);
		sleep(1000);
		
		Gravar.click();
		sleep(2000);
		waitExpectedElement(sim);
		sleep(2000);
		sim.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		biblioteca.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
	

		int botaoNao = rows("//button[text()=\"N�o\"]");
		
		if (botaoNao > 0) {
			nao.click();
		}
		
		armazenagemdearquivos.click();
		sleep(2000);
		aprovacaodocumentos.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectedElement(ultimapagina);
		sleep(2000);
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		 menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		 editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElement(menu);
		sleep(2000);

		menu.click();
		sleep(1000);
		editar.click();
		sleep(2000);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		attributeToBe("//div[@id=\"docType\"]/div", "class", "base-autocomplete required");
		String comentario1 = comentario.getAttribute("value");
		System.out.println(comentario1);

		boolean sucesso = comentario1.equals(enviar);
		System.out.println(sucesso);
		
		return sucesso;
	}


}
