package com.sap.timp.pageObjectModel.MDR.DeterminacaoAutomaticaDeGuias;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;



public class DeterminacaoAutomaticaDeGuiasVisualizarPO extends TestBaseSteven{
	@FindBy(xpath = "//span[text()=\"Determinação Automática de Guias\"]")
	public WebElement determincaoautomaticadeguias;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	// xpath visualizar 
	
		@FindBy(xpath = "//span[@id=\"company\"]")
		public WebElement empresaV;
		
		@FindBy(xpath = "//span[@id=\"uf\"]")
		public WebElement ufV;
		
		@FindBy(xpath = "//span[@id=\"adjustmentCode\"]")
		public WebElement codigoAjusteV;
		
		@FindBy(xpath = "//span[@id=\"bookLine\"]")
		public WebElement linhaLivroV;
		
		@FindBy(xpath = "//span[@id=\"tax\"]")
		public WebElement tributoV;
		
		@FindBy(xpath = "//span[@id=\"taxType\"]")
		public WebElement tipoImpostoV;
		
		@FindBy(xpath = "//span[@id=\"taxTypeDetail\"]")
		public WebElement detalheTipoImpostoV;
		
		@FindBy(xpath = "//span[@id=\"component\"]")
		public WebElement componenteV;
		
		@FindBy(xpath = "//span[@id=\"configurationCode\"]")
		public WebElement codigoConfiguracionV;
		
		@FindBy(xpath = "//span[@id=\"description\"]")
		public WebElement descripcionV;
		
		@FindBy(xpath = "//span[@id=\"idLayout\"]")
		public WebElement layoutGuiaV;
		
		@FindBy(xpath = "//span[@id=\"idLayoutConfiguration\"]")
		public WebElement configuracionLayoutV;
		
		@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
		public WebElement biblioteca;
		
		// xpath Editar
		
		@FindBy(xpath = "//div[@id=\"company\"]//div[@class=\"componentName\"]")
		public WebElement empresa;
		
		@FindBy(xpath = "//div[@id=\"uf\"]//div[@class=\"componentName\"]")
		public WebElement uf;
		
		@FindBy(xpath = "//div[@id=\"adjustmentCode\"]//input")
		public WebElement codigoAjuste;
		
		@FindBy(xpath = "//div[@id=\"description\"]//textarea")
		public WebElement descripcion;
		
		@FindBy(xpath = "//div[@id=\"bookLine\"]//input")
		public WebElement linhaLivro;
		
		@FindBy(xpath = "//div[@id=\"tax\"]//input")
		public WebElement tributo;
		
		@FindBy(xpath = "//div[@id=\"taxType\"]//input")
		public WebElement tipoImposto;
		
		@FindBy(xpath = "//div[@id=\"taxTypeDetail\"]//input")
		public WebElement detalheTipoImposto;
		
		@FindBy(xpath = "//div[@id=\"componentOutput\"]//input")
		public WebElement componente;
		
		@FindBy(xpath = "//div[@id=\"componentConfiguration\"]//input")
		public WebElement codigoConfiguracion;
		
		
		@FindBy(xpath = "//div[@id=\"idLayout\"]//input")
		public WebElement layoutGuia;
		
		@FindBy(xpath = "//div[@id=\"idLayoutConfiguration\"]//input")
		public WebElement configuracionLayout;
	
	public DeterminacaoAutomaticaDeGuiasVisualizarPO() {

		PageFactory.initElements(driver, this);
	}
	

	
	public  ArrayList<Boolean> Visualizar() {
		
		sleep(2000);
		determincaoautomaticadeguias.click();
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("DeterminacaoAutomaticaGuias");
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]//span[text()=\"Visualizar\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(24000);
		
		String empresav = empresaV.getText();
		String ufv = ufV.getText();
		String descripcionv = descripcionV.getText();
		String tributov = tributoV.getText();
		String tipoImpostov = tipoImpostoV.getText();
		String detalheTipoImpostov = detalheTipoImpostoV.getText();
		String codigoAjustev = codigoAjusteV.getText();
		String componentev = componenteV.getText();
		String codigoConfiguracionv = codigoConfiguracionV.getText();
		String linhaLivrov = linhaLivroV.getText();
		String layoutGuiav = layoutGuiaV.getText();
		String configuracionLayoutv = configuracionLayoutV.getText();
		
		System.out.println("Visualizar");

		System.out.println(empresav);
		System.out.println(ufv);
		System.out.println(descripcionv);
		System.out.println(tributov);
		System.out.println(tipoImpostov);
		System.out.println(detalheTipoImpostov);
		System.out.println(codigoAjustev);
		System.out.println(componentev);
		System.out.println(codigoConfiguracionv);
		System.out.println(linhaLivrov);
		System.out.println(layoutGuiav);
		System.out.println(configuracionLayoutv);
		
		biblioteca.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]//span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(25000);
		
		String empresaE = empresa.getAttribute("textContent");
		String ufE = uf.getAttribute("textContent");
		String descripcionE = descripcion.getAttribute("value");
		String tributoE = tributo.getAttribute("value");
		String tipoImpostoE = tipoImposto.getAttribute("value");
		String detalheTipoImpostoE = detalheTipoImposto.getAttribute("value");
		String codigoAjusteE = codigoAjuste.getAttribute("value");
		String componenteE = componente.getAttribute("value");
		String codigoConfiguracionE = codigoConfiguracion.getAttribute("value");
		String linhaLivroE = linhaLivro.getAttribute("value");
		String layoutGuiaE = layoutGuia.getAttribute("value");
		String configuracionLayoutE = configuracionLayout.getAttribute("value");

		
		System.out.println("Visualizar");

		System.out.println(empresaE);
		System.out.println(ufE);
		System.out.println(descripcionE);
		System.out.println(tributoE);
		System.out.println(tipoImpostoE);
		System.out.println(detalheTipoImpostoE);
		System.out.println(codigoAjusteE);
		System.out.println(componenteE);
		System.out.println(codigoConfiguracionE);
		System.out.println(linhaLivroE);
		System.out.println(layoutGuiaE);
		System.out.println(configuracionLayoutE);
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(empresav.contains(empresaE));
		sucesso.add(ufv.contains(ufE));
		sucesso.add(descripcionv.contains(descripcionE));
		sucesso.add(tributov.contains(tributoE));
		sucesso.add(tipoImpostov.contains(tipoImpostoE));
		sucesso.add(detalheTipoImpostov.contains(detalheTipoImpostoE));
		sucesso.add(codigoAjustev.contains(codigoAjusteE));
		sucesso.add(componentev.contains(componenteE));
		sucesso.add(codigoConfiguracionv.contains(codigoConfiguracionE));
		sucesso.add(linhaLivrov.contains(linhaLivroE));
		sucesso.add(layoutGuiav.contains(layoutGuiaE));
		sucesso.add(configuracionLayoutv.contains(configuracionLayoutE));
		
		System.out.println( sucesso);
		
		 return sucesso;
		
	}
		
		
}
