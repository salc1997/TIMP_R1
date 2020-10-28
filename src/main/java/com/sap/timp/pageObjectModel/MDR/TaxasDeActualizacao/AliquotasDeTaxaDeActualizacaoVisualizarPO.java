package com.sap.timp.pageObjectModel.MDR.TaxasDeActualizacao;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseCristhian;

public class AliquotasDeTaxaDeActualizacaoVisualizarPO  extends TestBaseCristhian{
	
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//span[text()=\"Taxas de Atualização\"]")
	public WebElement taxasActualizacao;
	
	@FindBy(xpath = "//span[text()=\"Alíquotas de Taxa de Atualização\"]")
	public WebElement aliquotas;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//*[@id=\"value\"]")
	public WebElement valor;
	
	@FindBy(xpath = "//*[@id=\"accumulatedFactor\"]")
	public WebElement fAcumolado;
	
	@FindBy(xpath = "//*[@id=\"rate\"]")
	public WebElement taxa;
	
	@FindBy(xpath = "//*[@id=\"form-builder\"]/div/div[2]/table/tr[1]/td[2]/div/div/div[2]/div/div[1]/div[2]/input")
	public WebElement valorE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Prencher o Fator Acumulado\")]")
	public WebElement fAcumuladoE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Prencher a Taxa\")]")
	public WebElement taxaE;
	
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	
	public AliquotasDeTaxaDeActualizacaoVisualizarPO() {

		PageFactory.initElements(driver, this);
	}
	
	
	public ArrayList<Boolean> visualizar() {
		
		sleep(2000);
		taxasActualizacao.click();
		sleep(2000);
		aliquotas.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter3();

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		sleep(2000);
		menu.click();
		sleep(1000);
		
		açao.click();
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		String codigoV1 = valor.getText();
		String descricaoV1 = fAcumolado.getText();
		String dataVigenciaV1 = taxa.getText();
		
		System.out.println("Valor: "+codigoV1);
		System.out.println("Factor A: "+descricaoV1);
		System.out.println("Taxa: "+dataVigenciaV1);
		
		biblioteca.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(2000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String codigoE1 = valorE.getAttribute("value");
		String descricaoE1 = fAcumuladoE.getAttribute("value");
		String dataVigenciaE1 = taxaE.getAttribute("value");

		
		
		System.out.println("Valor Editar: "+codigoE1);
		System.out.println("Factor Acumulado Editar: "+descricaoE1);
		System.out.println("Taxa Editar: "+dataVigenciaE1);

		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(codigoV1.contains(codigoE1));
		sucesso.add(descricaoV1.contains(descricaoE1));
		sucesso.add(dataVigenciaV1.contains(dataVigenciaE1));

		
		
		
		System.out.println(sucesso);
		
		return sucesso;
		
	}

}
