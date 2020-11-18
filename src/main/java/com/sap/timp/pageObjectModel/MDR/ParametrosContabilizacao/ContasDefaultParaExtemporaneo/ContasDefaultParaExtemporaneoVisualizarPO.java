package com.sap.timp.pageObjectModel.MDR.ParametrosContabilizacao.ContasDefaultParaExtemporaneo;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseEliel;

public class ContasDefaultParaExtemporaneoVisualizarPO extends TestBaseEliel {
	
	

	@FindBy(xpath = "//span[text()=\"Parâmetros de Contabilização\"]")
	public WebElement parametrosdecontabilizacao;
	
	
	@FindBy(xpath = "//span[text()=\"Contas Default para Extemporâneo\"]")
	public WebElement contasdefaultparaextemporaneo;
	
	@FindBy(xpath = "//span[text()=\"Nova Contas Default para Extemporâneo\"]")
	public WebElement novacontadefaultparaextemporaneo;
	
	
	
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Descrição Padrão\"]")
	public WebElement descricao;
	
	
	//@FindBy(xpath = "//div[@class=\"detail-data\"]/div[6]/div/div")
	//public WebElement tipodeajuste;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Tributo\"]")
	public WebElement tributo;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Tipo de Tributo\"]")
	public WebElement tipodeimposto;
	
	//@FindBy(xpath = "//div[@class=\"detail-data\"]/div[9]/div/div")
	// WebElement detalhetributo;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[12]/div/div")
	public WebElement detalhedalinhadolivro;
	
	@FindBy(xpath = "//div[@id=\"multipleControlerId-1000\"]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcaoempresa;
	
	@FindBy(xpath = "//div[@id=\"multipleControlerId-1000_0001\"]")
	public WebElement filial;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcaofilial;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione um Código de Ajuste \"]")
	public WebElement codigodeajuste;
	
	@FindBy(xpath = "//li[@id][2]")
	public WebElement opcaocodigodeajuste;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a data de início de vigência\"]")
	public WebElement datavigencia;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	@FindBy(xpath = "//span[@id=\"company\"]")
	public WebElement empresavi;
	
	@FindBy(xpath = "//span[@id=\"description\"]")
	public WebElement descricaovi;
	
	@FindBy(xpath = "//span[@id=\"branch\"]")
	public WebElement filialvi;
	
	@FindBy(xpath = "//span[@id=\"adjustmentType\"]")
	public WebElement tipodeajustevi;
	
	
	@FindBy(xpath = "//span[@id=\"adjustmentCode\"]")
	public WebElement codigodeajustevi;
	
	@FindBy(xpath = "//span[@id=\"tax\"]")
	public WebElement tributovi;
	
	@FindBy(xpath = "//span[@id=\"taxType\"]")
	public WebElement tipodeimpostovi;
	
	@FindBy(xpath = "//span[@id=\"taxTypeDetail\"]")
	public WebElement detalhetributovi;
	
	@FindBy(xpath = "//span[@id=\"bookLineDetail\"]")
	public WebElement detalhedalinhadolivrovi;
	
	public ContasDefaultParaExtemporaneoVisualizarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> visualizar() {
		sleep(2000);
		parametrosdecontabilizacao.click();
		sleep(2000);
		contasdefaultparaextemporaneo.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter1();
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		
		visualizar.click();
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String empresavisualizar = empresavi.getText();
		String filialvisualizar = filialvi.getText();
		String codigodeajustevisualizar = codigodeajustevi.getText();
		String descricaovisualizar= descricaovi.getText();
		String tributovisualizar = tributovi.getText();
		String tipodeimpostovisualizar = tipodeimpostovi.getText();
		String detalhedalinhadolivrovisualizar = detalhedalinhadolivrovi.getText();
		
		System.out.println(empresavisualizar);
		System.out.println(filialvisualizar);
		System.out.println(codigodeajustevisualizar);
		System.out.println(descricaovisualizar);
		System.out.println(tributovisualizar);
		System.out.println(tipodeimpostovisualizar);
		System.out.println(detalhedalinhadolivrovisualizar);
		
		biblioteca.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro1 = idObter1();
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(1000);
		
		editar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String empresaeditar = empresa.getText();
		String filialeditar = filial.getText();
		String codigodeajusteeditar = codigodeajuste.getAttribute("value");
		String descricaoeditar = descricao.getAttribute("value");
		String tributoeditar = tributo.getAttribute("value");
		String tipodeimpostoeditar = tipodeimposto.getAttribute("value");
		String detalhedalinhadolivroeditar = detalhedalinhadolivro.getAttribute("value");
		
		System.out.println(empresaeditar);
		System.out.println(filialeditar);
		System.out.println(codigodeajusteeditar);
		System.out.println(descricaoeditar);
		System.out.println(tributoeditar);
		System.out.println(tipodeimpostoeditar);
		System.out.println(detalhedalinhadolivroeditar);
	
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(empresavisualizar.equals(empresaeditar));
		sucesso.add(filialvisualizar.equals(filialeditar));
		sucesso.add(codigodeajustevisualizar.equals(codigodeajusteeditar));
		sucesso.add(tributovisualizar.equals(tributoeditar));
		sucesso.add(descricaovisualizar.equals(descricaoeditar));
		sucesso.add(tipodeimpostovisualizar.equals(tipodeimpostoeditar));
		sucesso.add(detalhedalinhadolivrovisualizar.equals(detalhedalinhadolivroeditar));
		
		//String sucesso = driver.findElement(By.xpath("//div[@class=\"baseTabs-view-wrapper\"]")).getAttribute("class");
		System.out.println(sucesso);	
		return sucesso;	
	
		
	}
	
	
	
	
	

}
