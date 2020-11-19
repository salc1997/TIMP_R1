package com.sap.timp.pageObjectModel.MDR.ParametrosContabilizacao.ContasDefaultParaExtemporaneo;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseEliel;

public class ContasDefaultParaExtemporaneoDetalhesPO extends TestBaseEliel {
	
	
	@FindBy(xpath = "//span[text()=\"Parâmetros de Contabilização\"]")
	public WebElement parametrosdecontabilizacao;
	
	
	@FindBy(xpath = "//span[text()=\"Contas Default para Extemporâneo\"]")
	public WebElement contasdefaultparaextemporaneo;
	
	@FindBy(xpath = "//span[text()=\"Nova Contas Default para Extemporâneo\"]")
	public WebElement novacontadefaultparaextemporaneo;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[2]/div/div")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[5]/div/div")
	public WebElement descricao;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[3]/div/div")
	public WebElement filial;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[6]/div/div")
	public WebElement tipodeajuste;
	
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[4]/div/div")
	public WebElement codigodeajuste;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[7]/div/div")
	public WebElement tributo;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[8]/div/div")
	public WebElement tipodeimposto;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[9]/div/div")
	public WebElement detalhetributo;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[12]/div/div")
	public WebElement detalhedalinhadolivro;
	
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
	
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;
	
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
	
	public ContasDefaultParaExtemporaneoDetalhesPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> detalhes() {
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
		WebElement detalhes = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhe\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		detalhes.click();
		sleep(2000);
		
		
		String empresadetalhes = empresa.getText();
		String filialdetalhes = filial.getText();
		String codigodeajustedetalhes = codigodeajuste.getText();
		String descricaodetalhes = descricao.getText();
		String tipodeajustedetalhes = tipodeajuste.getText();
		String tributodetalhes = tributo.getText();
		String tipodeimpostodetalhes = tipodeimposto.getText();
		String detalhetributodetalhes = detalhetributo.getText();
		String detalhedalinhadolivrodetalhes = detalhedalinhadolivro.getText();
		
		System.out.println(empresadetalhes);
		System.out.println(filialdetalhes);
		System.out.println(codigodeajustedetalhes);
		System.out.println(descricaodetalhes);
		System.out.println(tipodeajustedetalhes);
		System.out.println(tributodetalhes);
		System.out.println(tipodeimpostodetalhes);
		System.out.println(detalhetributodetalhes);
		System.out.println(detalhedalinhadolivrodetalhes);
		
		fechar.click();
		
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//pega o ultimo id que foi gerado no criar
		String idRegistro1 = idObter1();
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(1000);
		
		visualizar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		String empresavisualizar = empresavi.getText();
		String filialvisualizar = filialvi.getText();
		String codigodeajustevisualizar = codigodeajustevi.getText();
		String descricaovisualizar= descricaovi.getText();
		String tipodeajustevisualizar = tipodeajustevi.getText();
		String tributovisualizar = tributovi.getText();
		String tipodeimpostovisualizar = tipodeimpostovi.getText();
		String detalhetributovisualizar = detalhetributovi.getText();
		String detalhedalinhadolivrovisualizar = detalhedalinhadolivrovi.getText();
		
		System.out.println(empresavisualizar);
		System.out.println(filialvisualizar);
		System.out.println(codigodeajustevisualizar);
		System.out.println(descricaovisualizar);
		System.out.println(tipodeajustevisualizar);
		System.out.println(tributovisualizar);
		System.out.println(tipodeimpostovisualizar);
		System.out.println(detalhetributovisualizar);
		System.out.println(detalhedalinhadolivrovisualizar);
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(empresavisualizar.equals(empresadetalhes));
		sucesso.add(filialvisualizar.equals(filialdetalhes));
		sucesso.add(codigodeajustevisualizar.equals(codigodeajustedetalhes));
		sucesso.add(tributovisualizar.equals(tributodetalhes));
		sucesso.add(descricaovisualizar.equals(descricaodetalhes));
		sucesso.add(tipodeajustevisualizar.equals(tipodeajustedetalhes));
		sucesso.add(tipodeimpostovisualizar.equals(tipodeimpostodetalhes));
		sucesso.add(detalhetributovisualizar.equals(detalhetributodetalhes));
		sucesso.add(detalhedalinhadolivrovisualizar.equals(detalhedalinhadolivrodetalhes));
		//System.out.println(sucesso);
		
		//String sucesso = driver.findElement(By.xpath("//table[@class=\"edit\"]")).getAttribute("class");
		System.out.println(sucesso);	
		return sucesso;	
		
	}

}
