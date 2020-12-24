package com.sap.timp.pageObjectModel.BRE.RegrasDeAuditoriaN3.ParametrosGerais;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseEliel;

public class RegrasDeAuditoriaN3DetalhesPO extends TestBaseEliel{
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-a_rules\"]/div/span[text()=\"Regras de Auditoria N3\"]")
	public WebElement regraAuditoriaN3;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[3]/div/div[1]/span[2]")
	public WebElement campo1;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[3]/div/div[2]/span[2]")
	public WebElement campo2;
	
	@FindBy(xpath = "//div[@class=\"icon icon-font-Sign-and-Symbols icon-persign\"]")
	public WebElement fechar;
	
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[1]/*/*[1]")
	public WebElement campo1vi;
	
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[1]/*/*[2]")
	public WebElement campo2vi;
	
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[1]/*/*[3]")
	public WebElement campo3vi;
	
	@FindBy(xpath = "//div[@id=\"main-title\"]")
	public WebElement nomevi;
	
	@FindBy(xpath = "//div[@class=\"detail-label\"]")
	public WebElement nomede;
	
	public RegrasDeAuditoriaN3DetalhesPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> detalhes() {
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		regraAuditoriaN3.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		//String	id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		//System.out.println("Ultimo registro: " + id);
		String idRegistro = idObter2();
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement detalhe = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhe\"]"));
		
	
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		detalhe.click();
		sleep(2000);	
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//detalhes
		String nomedetalhes = nomede.getText();
		String campo1detalhes = campo1.getText();
		String campo2detalhes = campo2.getText();
		campo1detalhes=campo1detalhes.replace(" ", "");
		campo2detalhes=campo2detalhes.replace(" ", "");
		System.out.println(nomedetalhes);
		System.out.println(campo1detalhes);
		System.out.println( campo2detalhes);
		
	
		
		
		fechar.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(ultimapagina);
		sleep(2000);
		
		ultimapagina.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//pega o ultimo id que foi gerado no criar

		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualização\"]"));
		
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(1000);
		
		visualizar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//visualizar
		
		String nomevisualizar = nomevi.getText();
		String primeirocampo1 = campo1vi.getText();
		String segundocampo1 = campo2vi.getText();
		String terceirocampo1 = campo3vi.getText();
		String primeirosegundocampo1 = primeirocampo1.concat(segundocampo1);
		String campo1visualizar = primeirosegundocampo1.concat(terceirocampo1);
		campo1visualizar = campo1visualizar.replace(" ", "");
		
		
		System.out.println(nomevisualizar);
		System.out.println(campo1visualizar);
		//System.out.println(segundoterceirocampo1);
		
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(nomevisualizar.contains(nomedetalhes));
		//sucesso.add(campo1detalhes.contains(primeirocampo1));
		sucesso.add(campo1visualizar.contains(campo1detalhes));
		sucesso.add(campo1visualizar.contains(campo2detalhes));
		
		
		System.out.println(sucesso);
	
		return sucesso;
	}

}
