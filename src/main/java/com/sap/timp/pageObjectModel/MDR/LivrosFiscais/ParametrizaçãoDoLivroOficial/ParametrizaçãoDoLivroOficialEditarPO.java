package com.sap.timp.pageObjectModel.MDR.LivrosFiscais.ParametrizaçãoDoLivroOficial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class ParametrizaçãoDoLivroOficialEditarPO extends TestBaseMassiel{

	@FindBy(xpath = "//span[text()=\"Livros Fiscais\"]")
	public WebElement libros;
	
	//submenu
	@FindBy(xpath = "//span[text()=\"Parametrização do livro oficial\"]")
	public WebElement oficial;


	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement ultimaPagina;
	
	@FindBy(xpath = "//div[@id=\"bookType\"]/div/div/div[2]")
	public WebElement tipoDoLibro;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id][2]")
	public WebElement opcionCombo;
	
	
	@FindBy(xpath = "//div[@id=\"bookType\"]/div/div/div/input")
	public WebElement opc1;

	@FindBy(xpath = "//div[@id=\"bookType\"]/div/div/div/input")
	public WebElement opc2;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement Gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement Sim;
	
	@FindBy(xpath = "//body")
	public WebElement body;
	
	public ParametrizaçãoDoLivroOficialEditarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean Editar() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		libros.click();
	    invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		oficial.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String idRegistro =idObter4();
		
		sleep(2000);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(2000);
		editar.click();
		sleep(2000);
		sleep(2000);
		attributoNotToBeEmptyElement(opc1, "value");
	  	sleep(2000);
	  	
	  	String valor = opc1.getAttribute("value");
		System.out.println(valor);
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		tipoDoLibro.click();
		sleep(2000);
		opcionCombo.click();
		sleep(2000);
		
		
		Gravar.click();
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		
		sleep(2000);
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(2000);
		editar1.click();
		sleep(2000);
		sleep(2000);
		attributoNotToBeEmptyElement(opc2, "value");
	  	sleep(2000);
		
	  	String enviar = opc2.getAttribute("value");
		System.out.println(enviar);
		
	  	String nuevoTexto = opc1.getAttribute("value");
		System.out.println(valor);
		System.out.println(nuevoTexto);
		boolean sucesso = nuevoTexto.equals(enviar);
		System.out.println(sucesso);
		
		return sucesso;

	}
}
