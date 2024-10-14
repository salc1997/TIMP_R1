package com.sap.timp.pageObjectModel.MDR.DeterminacaoAutomaticaDeGuias;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBase;



public class DeterminacaoAutomaticaDeGuiasDetalhesPO extends TestBase{
	@FindBy(xpath = "//span[text()=\"Determinação Automática de Guias\"]")
	public WebElement determincaoautomaticadeguias;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][1]/div[2]//div")
	public WebElement id;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][2]/div[2]//div")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][3]/div[2]//div")
	public WebElement uf;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][5]/div[2]//div")
	public WebElement descripcion;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][6]/div[2]//div")
	public WebElement tributo;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][7]/div[2]//div")
	public WebElement tipoImposto;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][8]/div[2]//div")
	public WebElement detalheTipoImposto;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][10]/div[2]//div")
	public WebElement codigoAjuste;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][13]/div[2]//div")
	public WebElement componente;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][14]/div[2]//div")
	public WebElement codigoConfiguracion;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][16]/div[2]//div")
	public WebElement linhaLivro;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][17]/div[2]//div")
	public WebElement layoutGuia;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][18]/div[2]//div")
	public WebElement configuracionLayout;
	
	@FindBy(xpath = "//div[@id=\"detail-history\"]/div[2]/div[1]/span")
	public WebElement fechaCreacion;
	
	@FindBy(xpath = "//div[@id=\"detail-history\"]/div[2]/div[2]/span")
	public WebElement fechaModificacion;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;
	
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
	
	public DeterminacaoAutomaticaDeGuiasDetalhesPO() {

		PageFactory.initElements(driver, this);
	}
	

	
	public  ArrayList<Boolean> Detalhe() {
		
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
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]//span[text()=\"Detalhes\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(15000);
		
		String idD = id.getText();
		String empresaD = empresa.getText();
		String ufD = uf.getText();
		String descripcionD = descripcion.getText();
		String tributoD = tributo.getText();
		String tipoImpostoD = tipoImposto.getText();
		String detalheTipoImpostoD = detalheTipoImposto.getText();
		String codigoAjusteD = codigoAjuste.getText();
		String componenteD = componente.getText();
		String codigoConfiguracionD = codigoConfiguracion.getText();
		String linhaLivroD = linhaLivro.getText();
		String layoutGuiaD = layoutGuia.getText();
		String configuracionLayoutD = configuracionLayout.getText();
		String fechaCreacionD = fechaCreacion.getText();
		String fechaModificacionD  = fechaModificacion.getText();
		
		System.out.println(idD);
		System.out.println(empresaD);
		System.out.println(ufD);
		System.out.println(descripcionD);
		System.out.println(tributoD);
		System.out.println(tipoImpostoD);
		System.out.println(detalheTipoImpostoD);
		System.out.println(codigoAjusteD);
		System.out.println(componenteD);
		System.out.println(codigoConfiguracionD);
		System.out.println(linhaLivroD);
		System.out.println(layoutGuiaD);
		System.out.println(configuracionLayoutD);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(validarFecha(fechaCreacionD));
		sucesso.add(validarFecha(fechaModificacionD));
		
		System.out.println( sucesso);
		
		sleep(2000);
		fechar.click();
		
		actionsMoveToElement(menu);

		açao = driver.findElement(
				By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));

		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(45000);
		
		String empresa = empresaV.getText();
		String uf = ufV.getText();
		String descripcion = descripcionV.getText();
		String tributo = tributoV.getText();
		String tipoImposto = tipoImpostoV.getText();
		String detalheTipoImposto = detalheTipoImpostoV.getText();
		String codigoAjuste = codigoAjusteV.getText();
		String componente = componenteV.getText();
		String codigoConfiguracion = codigoConfiguracionV.getText();
		String linhaLivro = linhaLivroV.getText();
		String layoutGuia = layoutGuiaV.getText();
		String configuracionLayout = configuracionLayoutV.getText();
		
		System.out.println("Visualizar");

		System.out.println(empresa);
		System.out.println(uf);
		System.out.println(descripcion);
		System.out.println(tributo);
		System.out.println(tipoImposto);
		System.out.println(detalheTipoImposto);
		System.out.println(codigoAjuste);
		System.out.println(componente);
		System.out.println(codigoConfiguracion);
		System.out.println(linhaLivro);
		System.out.println(layoutGuia);
		System.out.println(configuracionLayout);
	
		sucesso.add(empresaD.contains(empresa));
		sucesso.add(ufD.contains(uf));
		sucesso.add(descripcionD.contains(descripcion));
		sucesso.add(tributoD.contains(tributo));
		sucesso.add(tipoImpostoD.contains(tipoImposto));
		sucesso.add(detalheTipoImpostoD.contains(detalheTipoImposto));
		sucesso.add(codigoAjusteD.contains(codigoAjuste));
		sucesso.add(componenteD.contains(componente));
		sucesso.add(codigoConfiguracionD.contains(codigoConfiguracion));
		sucesso.add(linhaLivroD.contains(linhaLivro));
		sucesso.add(layoutGuiaD.contains(layoutGuia));
		sucesso.add(configuracionLayoutD.contains(configuracionLayout));
		
		System.out.println( sucesso);
		
		  return sucesso;
		
	}
}
