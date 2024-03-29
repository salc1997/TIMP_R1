package com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela17;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBase;

public class Descri��oDeNatDeLes�oDetallePO extends TestBase{
	@FindBy(xpath = "//span[text()=\"Tabelas de Apoio e-Social\"]")
	public WebElement tabelaApoio;
	
	@FindBy(xpath = "//span[text()=\"Tabela 17 - Descri��o de Nat. de Les�o\"]")
	public WebElement tabela17;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement close;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath ="//div[@class=\"detail-data\"]/div[2]/div/div")
	public WebElement codigoD;
	
	@FindBy(xpath ="//div[@class=\"detail-data\"]/div[3]/div/div")
	public WebElement descricaoD;
	
	@FindBy(xpath ="//div[@class=\"detail-data\"]/div[4]/div/div")
	public WebElement validadeD;
	
	@FindBy(xpath = "//div[@class=\"right-panel visible\"]/div/div[2]/div[2]/div[6]/div[2]/div[1]/span")
	public WebElement historicoFecha1;
	
	@FindBy(xpath = "//div[@class=\"right-panel visible\"]/div/div[2]/div[2]/div[6]/div[2]/div[2]/span")
	public WebElement historicoFecha2;
	
	@FindBy(xpath ="//td[@id=\"code\"]/span")
	public WebElement codigoV;
	
	@FindBy(xpath ="//td[@id=\"description\"]/span")
	public WebElement descricaoV;
	
	@FindBy(xpath ="//td[@id=\"effectiveDateFrom\"]/span")
	public WebElement validadeV;
	
	public Descri��oDeNatDeLes�oDetallePO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> Detalle() {
		sleep(2000);
		tabelaApoio.click();
		sleep(2000);
		tabela17.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String idRegistro = idObter("Descri��oDeNatDeLes�o");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement Detalhes = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhes\"]"));
		
		actionsMoveToElement(menu);
		sleep(4000);

		menu.click();
		sleep(1000);
		Detalhes.click();
		sleep(3000);
		
		String codigoD1 = codigoD.getText();
		String descricaoD1 = descricaoD.getText();
		String validadeD1 = validadeD.getText();
		String historicoFecha11 = historicoFecha1.getText();
		String historicoFecha22 = historicoFecha2.getText();

		
		System.out.println(codigoD1);
		System.out.println(descricaoD1);
		System.out.println(validadeD1);
		System.out.println(historicoFecha22);
		System.out.println(historicoFecha11);
		
		close.click();
		sleep(2000);
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		actionsMoveToElement(menu1);
		sleep(4000);

		menu1.click();
		sleep(1000);
		visualizar.click();
		sleep(3000);
		
		waitExpectedElement(codigoV);
		sleep(2000);
		
		System.out.println("----------Visualizar-------");
		String codigoV1 = codigoV.getText();
		String descricaoV1 = descricaoV.getText();
		String validadeV1 = validadeV.getText();
		
		System.out.println(codigoV1);
		System.out.println(descricaoV1);
		System.out.println(validadeV1);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
	
		
		sucesso.add(validarFecha(historicoFecha11));
		sucesso.add(validarFecha(historicoFecha22));
		sucesso.add(codigoV1.contains(codigoD1));
		sucesso.add(descricaoV1.contains(descricaoD1));
		sucesso.add(validadeV1.contains(validadeD1));
		
		System.out.println(sucesso);
		return sucesso;
	}
}
