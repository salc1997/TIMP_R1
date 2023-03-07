package com.sap.timp.pageObjectModel.ADM.Configuracao.Licencas;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class LicencasTodasFuncPO extends TestBaseMassiel{

	@FindBy(xpath = "//div[@class=\"baseTabs-bar boxes\"]/div/div[2]")
	public WebElement Configuração;
	
	@FindBy(xpath = "//span[text()=\"Licenças\"]")
	public WebElement Licenças;
	
	@FindBy(xpath = "//div[@class=\"detail-content\"]/div/div[1]/div[2]")
	public WebElement numero;
	
	@FindBy(xpath = "//div[@class=\"detail-content\"]/div/div[2]/div[2]")
	public WebElement data;
	
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
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement cerrar;
	public LicencasTodasFuncPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean>  detalles() {
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
		
		String id = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]/div[2]/div")).getText();
		String numeroUsuario = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]/div[3]/div")).getText();
		String dataVencimiento = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]/div[4]/div")).getText();
		
		System.out.println(id);
		System.out.println(numeroUsuario);
		System.out.println(dataVencimiento);
		
		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhe\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String numeroDetalle = numero.getText();
		String dataDetalle = data.getText();
		
		System.out.println(numeroDetalle);
		System.out.println(dataDetalle);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(numeroUsuario.equals(numeroDetalle));
		sucesso.add(dataVencimiento.equals(dataDetalle));
		System.out.println(sucesso);
		
		cerrar.click();
		sleep(1000);
		
		return sucesso;
	}
	
	public ArrayList<Boolean>  visualizar() {
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
