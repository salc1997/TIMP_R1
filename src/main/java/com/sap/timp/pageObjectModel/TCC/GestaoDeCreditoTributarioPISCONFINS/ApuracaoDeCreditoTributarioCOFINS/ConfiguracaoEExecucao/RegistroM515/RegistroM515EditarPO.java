package com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioPISCONFINS.ApuracaoDeCreditoTributarioCOFINS.ConfiguracaoEExecucao.RegistroM515;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.base.TestBaseSteven;


public class RegistroM515EditarPO extends TestBaseMassiel{
	@FindBy(xpath = "//span[text()=\"Gestão de Crédito Tributário PIS/COFINS\"]")
	public WebElement gestaoCredito;
	
	@FindBy(xpath = "//span[text()=\"Apuração de Crédito Tributário COFINS\"]")
	public WebElement apuracaocreditocofins;

	@FindBy(xpath = "//div[@class=\"left\"]/div/div[2]/ul/li[6]/ul/li[4]/ul/li[1]/div/span[2]")
	public WebElement configuracaoEExecucao;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-registerM515\"]")
	public WebElement registrom515;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//div[@id=\"dtOperAj\"]/div/div[1]/input")
	public WebElement fecha;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;

	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	public RegistroM515EditarPO() {

		PageFactory.initElements(driver, this);
	}

	public  ArrayList<Boolean> Editar() {
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		gestaoCredito.click();
		sleep(2000);
		apuracaocreditocofins.click();
		sleep(2000);
		configuracaoEExecucao.click();
		sleep(2000);
		registrom515.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("id-GCTPISCOFINS-ACTCOFINSConfiguracaoEExecucacoRegistroM515");
		System.out.println("ID Registro: " + idRegistro);

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		WebElement editar = driver.findElement(
				By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		
		editar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String valor = fecha.getAttribute("value");
		
		String enviar =fechaManana();
		
		

		boolean sucesso1 = false;
		boolean sucesso2 = false;
		
		
		System.out.println(valor);
		
		System.out.println(enviar);
		
		
		sucesso1 = validarFecha(valor);
		
		System.out.println(sucesso1);
		
		fecha.clear();
		sleep(1000);
		fecha.sendKeys(enviar);
		sleep(2000);
		
		gravar.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(3000);
		
		driver.navigate().refresh();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(8000);
		
		
		String nuevoValor = fecha.getAttribute("value");
		
		System.out.println("Valor após edição: " +nuevoValor);
		
		sucesso2 = validarFecha(nuevoValor);
		
		System.out.println(sucesso2);
		
		boolean sucesso3 = nuevoValor.equals(enviar);
		System.out.println("Valor editado com sucesso: "+sucesso3);
		
		 ArrayList<Boolean>  sucesso = new ArrayList<Boolean>(); 
	        sucesso.add(sucesso1);
	        sucesso.add(sucesso2);
	        sucesso.add(sucesso3);
	      return sucesso;
	}
}
