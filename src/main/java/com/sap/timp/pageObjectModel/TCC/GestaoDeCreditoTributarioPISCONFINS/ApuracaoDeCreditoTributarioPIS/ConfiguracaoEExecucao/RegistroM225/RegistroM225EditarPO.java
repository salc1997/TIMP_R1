package com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioPISCONFINS.ApuracaoDeCreditoTributarioPIS.ConfiguracaoEExecucao.RegistroM225;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class RegistroM225EditarPO extends TestBaseFernando{
	@FindBy(xpath = "//span[text()=\"Gestão de Crédito Tributário PIS/COFINS\"]")
	public WebElement gestaoCredito;
	
	@FindBy(xpath = "//span[text()=\"Apuração de Crédito Tributário PIS\"]")
	public WebElement apuracaocreditopis;
	

	@FindBy(xpath = "//div[@class=\"left\"]/div/div[2]/ul/li[6]/ul/li[3]/ul/li[1]/div/span[2]")
	public WebElement configuracaoEExecucao;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-registerM225\"]")
	public WebElement registrom225;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//div[@id=\"dtOperAj\"]/div/div/input")
	public WebElement dataDaOperacao;
	
	public RegistroM225EditarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean editar() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		gestaoCredito.click();
		sleep(2000);
		
		apuracaocreditopis.click();
		sleep(2000);
		
		configuracaoEExecucao.click();
		sleep(2000);
		
		registrom225.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("ApuraçãodeCréditoTributárioPISRegistroM225");
		System.out.println("ID Registro: " + idRegistro);
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		driver.navigate().refresh();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String valorDataOperacao = dataDaOperacao.getAttribute("value").trim();
		System.out.println("");
		System.out.println("Data da operação: " + valorDataOperacao);
		
		Date fechaDate = new Date(valorDataOperacao);
		String formatoFechaValido = new SimpleDateFormat("MM/dd/yyyy").format(fechaDate).toString();
		System.out.println("");
		System.out.println("Data Operacao formato correcto: " + formatoFechaValido);
		
		boolean sucesso = false;
		
		if(valorDataOperacao.equals(formatoFechaValido)){
			System.out.println("Formato de fecha correcto...");
			sucesso = true;
		}else {
			System.out.println("El formato de la fecha no es correcto, debe ser dd/mm/yyyy");
		}
		
		return sucesso;
	}
}
