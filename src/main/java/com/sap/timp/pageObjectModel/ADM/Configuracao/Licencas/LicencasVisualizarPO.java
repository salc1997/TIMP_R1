package com.sap.timp.pageObjectModel.ADM.Configuracao.Licencas;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.sap.timp.base.TestBase;

public class LicencasVisualizarPO extends TestBase{
	@FindBy(xpath = "//div[@class=\"baseTabs-bar boxes\"]/div/div[2]")
	public WebElement Configuração;
	
	@FindBy(xpath = "//span[text()=\"Licenças\"]")
	public WebElement Licenças;
	
	@FindBy(xpath = "//table/tr[1]//child::input")
	public WebElement licencia;
	
	@FindBy(xpath = "//table/tr[2]//child::input")
	public WebElement numeroUsuarios;
	
	@FindBy(xpath = "//table/tr[3]//child::input")
	public WebElement dataVencimiento;
	
	@FindBy(xpath = "//table/tr[5]//child::input")
	public WebElement tipoCliente;
	
	@FindBy(xpath = "//button[text()=\"Fechar\"]")
	public WebElement fechar;
	
	public LicencasVisualizarPO () {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean>  visualizar() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		Configuração.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		Licenças.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String txtLicencia = licencia.getAttribute("value");
		String txtNumeroUsuarios = numeroUsuarios.getAttribute("value");
		String txtTipoCliente = tipoCliente.getAttribute("value");
		String txtDataVencimiento = dataVencimiento.getAttribute("value");
		
		System.out.println(txtLicencia);
		System.out.println(txtNumeroUsuarios);
		System.out.println(txtTipoCliente);
		System.out.println(txtDataVencimiento);
		
		fechar.click();
		sleep(2000);
		
		 menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]/div[1]/div"));
	     açao = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String txtLicenciaE = licencia.getAttribute("value");
		String txtNumeroUsuariosE = numeroUsuarios.getAttribute("value");
		String txtTipoClienteE = tipoCliente.getAttribute("value");
		String txtDataVencimientoE = dataVencimiento.getAttribute("value");
		
		System.out.println(txtLicenciaE);
		System.out.println(txtNumeroUsuariosE);
		System.out.println(txtTipoClienteE);
		System.out.println(txtDataVencimientoE);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(txtLicencia.equals(txtLicenciaE));
		sucesso.add(txtNumeroUsuarios.equals(txtNumeroUsuariosE));
		sucesso.add(txtTipoCliente.equals(txtTipoClienteE));
		sucesso.add(txtDataVencimiento.equals(txtDataVencimientoE));
		System.out.println(sucesso);
		return sucesso;
	}
}
