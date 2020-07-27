package com.sap.timp.pageObjectModel.MDR.SequenciaAcesso;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseEliel;

public class SequenciaEditarPO extends TestBaseEliel{
	
	
	@FindBy(xpath = "//li/div/span[text()=\"Sequência de Acesso\"]")
	public WebElement sequencia;
		
		
	@FindBy(xpath = "//*[@id=\"list\"]/div/div[1]/div/div[2]/div/div[3]/div/span[1]")
	public WebElement idC;
	
	@FindBy(xpath = "//div[@class=\"tr first\" and @data-id][1]/div[3]/div")
	public WebElement idR;
	

	@FindBy(xpath = "//*[@id=\"list\"]/div/div[2]/div/div[7]")
	public WebElement setafinal;
	
	@FindBy(xpath = "//div[@class=\"tr first\" and @data-id][1]/div[2]/label/span")
	public WebElement opcao;
	
	@FindBy(xpath = "//div[@class=\"tr first\" and @data-id][1]/div[1]/div")
	public WebElement engrenagem;
	
	@FindBy(xpath ="//*[@id=\"list\"]/div/div[1]/div/div[3]/div[3]/div[1]/div/div[2]/ul/li[2]/span[2]")
	public WebElement editar;
	
	@FindBy(xpath = "//div[@id=\"name\"]/div/div/input")
	public WebElement nome;
	
	@FindBy(xpath = "//*[@id=\"description\"]/div/div/input")
	public WebElement descricao;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement butaosim;
	
	
	public SequenciaEditarPO() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void editar() {
		
		
		//Actions action = new Actions(driver);

		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sequencia.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		//Pega o ultimo id
		setafinal.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		idC.click();
		dobleClickElement(idC);
		sleep(2000);
		
		String id = idR.getText();
		sleep(2000);
		//System.out.println(id);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			
		opcao.click();
		
		engrenagem.click();
		
		editar.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		attributeToBeXpath("//div[@id=\"description\"]/div/div", "class", "base-input  required type1");
		//salva a descriçao do campo antes de apagar
		sleep(1000);
		String texto = descricao.getAttribute("value");
		//System.out.println(texto);
		sleep(1000);
		//limpa o campo
		descricao.clear();
		sleep(1000);
		//inseri novo texto no campo descriçao
		descricao.sendKeys("detalhamento");
		//grava
		sleep(1000);
		gravar.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		butaosim.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		//recarrega a pagina
		driver.navigate().refresh();
		//invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		attributeToBeXpath("//div[@id=\"description\"]/div/div", "class", "base-input  required type1");
		//verifica se o valor inserido consta no relatório
		String texto1 = descricao.getAttribute("value");
		boolean text= texto1.contains(texto1);
		System.out.println(text);
		sleep(1000);
		//volta com o campo modificado
		descricao.clear();
		descricao.sendKeys(texto);
		gravar.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		butaosim.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	}
	


}
