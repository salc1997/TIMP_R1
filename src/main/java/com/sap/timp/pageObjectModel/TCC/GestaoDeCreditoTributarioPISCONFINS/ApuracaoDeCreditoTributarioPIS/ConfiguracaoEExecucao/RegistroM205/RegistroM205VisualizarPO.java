package com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioPISCONFINS.ApuracaoDeCreditoTributarioPIS.ConfiguracaoEExecucao.RegistroM205;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBase;

public class RegistroM205VisualizarPO extends TestBase {

	@FindBy(xpath = "//span[text()=\"Gest�o de Cr�dito Tribut�rio PIS/COFINS\"]")
	public WebElement gestaoCredito;

	@FindBy(xpath = "//span[text()=\"Apura��o de Cr�dito Tribut�rio PIS\"]")
	public WebElement apuracaocreditopis;

	@FindBy(xpath = "//div[@class=\"left\"]/div/div[2]/ul/li[6]/ul/li[3]/ul/li[1]/div/span[2]")
	public WebElement configuracaoEExecucao;

	@FindBy(xpath = "//li[@identifier=\"accordion-item-registerM205\"]")
	public WebElement registrom205;
	

	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement ultimaPagina;

	@FindBy(xpath = "//button[text()=\"Salvar\"]")
	public WebElement salvar;

	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement Gravar;

	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;

	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;

	@FindBy(xpath = "//input[@placeholder=\"Selecionar Empresa\"]")
	public WebElement empresa;

	@FindBy(xpath = "//div[@id=\"multipleControlerId-SP\"]")
	public WebElement uf;

	@FindBy(xpath = "//div[@id=\"multipleControlerId-1000_SP_0001\"]")
	public WebElement filial;

	@FindBy(xpath = "//input[@placeholder=\"Selecionar Tributo\"]")
	public WebElement tributo;

	@FindBy(xpath = "//div[@id=\"reg\"]/div/div/input")
	public WebElement registro;

	@FindBy(xpath = "//input[@placeholder=\"Selecionar N�mero do campo\"]")
	public WebElement numerocampo;

	@FindBy(xpath = "//input[@placeholder=\"Selecionar C�digo da Receita \"]")
	public WebElement codigoreceita;

	@FindBy(xpath = "//input[@placeholder=\"Selecionar Valor do D�bito \"]")
	public WebElement valordebito;

	@FindBy(xpath = "//input[@placeholder=\"Selecionar Valor de Outras Dedu��es \"]")
	public WebElement valordeoutras;

	@FindBy(xpath = "//input[@placeholder=\"Selecionar Valor da Contribui��o Social Extempor�nea a Pagar \"]")
	public WebElement valorextemporaneo;

	@FindBy(xpath = "//input[@placeholder=\"Selecionar Valor da Multa \"]")
	public WebElement valormulta;

	@FindBy(xpath = "//input[@placeholder=\"Selecionar Valor dos Juros \"]")
	public WebElement valorjuros;

	@FindBy(xpath = "//button[text()=\"N�o\"]")
	public WebElement nao;

	@FindBy(xpath = "//div[@id=\"componentToSearchId-1000_SP_0014\"]")
	public WebElement filialtc2;

	public RegistroM205VisualizarPO() {
		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> visualizar() {
		String url = driver.getCurrentUrl();

		boolean tc2 = false;
		boolean tp1 = false;
		boolean tq1 = false;
		if (url.contains("tc2")) {
			tc2 = true;
		} else if (url.contains("tp1")) {
			tp1 = true;
		} else {
			tq1 = true;
		}
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		gestaoCredito.click();
		sleep(2000);

		apuracaocreditopis.click();
		sleep(2000);
		configuracaoEExecucao.click();
		sleep(2000);
		registrom205.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ultimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String idRegistro = idObter("Apura��odeCr�ditoTribut�rioPISRegistroM205");
		System.out.println("ID Registro: " + idRegistro);

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(
				By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"visualizar\"]"));
		actionsMoveToElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		visualizar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		if (tc2 == true) {

			waitExpectedElement(uf);
			sleep(2000);
			waitExpectedElement(filialtc2);
			sleep(2000);
			String empresavisualizar = empresa.getAttribute("value");
			String ufvisualizar = uf.getText();
			String filialvisualizar = filialtc2.getText();
			String tributovisualizar = tributo.getAttribute("value");
			String registrovisualizar = registro.getAttribute("value");
			String numerocampovisualizar = numerocampo.getAttribute("value");
			String codigoreceitavisualizar = codigoreceita.getAttribute("value");
			String valordebitovisualizar = valordebito.getAttribute("value");

			System.out.println(empresavisualizar);
			System.out.println(ufvisualizar);
			System.out.println(filialvisualizar);
			System.out.println(tributovisualizar);
			System.out.println(registrovisualizar);
			System.out.println(numerocampovisualizar);
			System.out.println(codigoreceitavisualizar);
			System.out.println(valordebitovisualizar);

			biblioteca.click();

			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			waitExpectedElement(nao);
			nao.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			waitExpectedElement(ultimaPagina);
			sleep(2000);

			ultimaPagina.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

			WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
			WebElement editar = driver.findElement(
					By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
			actionsMoveToElement(menu1);
			sleep(2000);
			menu1.click();
			sleep(1000);
			editar.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

			waitExpectedElement(uf);
			sleep(2000);
			waitExpectedElement(filialtc2);
			sleep(2000);

			String empresaeditar = empresa.getAttribute("value");
			String ufeditar = uf.getText();
			String filialeditar = filialtc2.getText();
			String tributoeditar = tributo.getAttribute("value");
			String registroeditar = registro.getAttribute("value");
			String numerocampoeditar = numerocampo.getAttribute("value");
			String codigoreceitaeditar = codigoreceita.getAttribute("value");
			String valordebitoeditarr = valordebito.getAttribute("value");

			System.out.println(empresaeditar);
			System.out.println(ufeditar);
			System.out.println(filialeditar);
			System.out.println(tributoeditar);
			System.out.println(registroeditar);
			System.out.println(numerocampoeditar);
			System.out.println(codigoreceitaeditar);
			System.out.println(valordebitoeditarr);

			ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

			sucesso.add(empresaeditar.contains(empresavisualizar));
			sucesso.add(ufeditar.contains(ufvisualizar));
			sucesso.add(filialeditar.contains(filialvisualizar));
			sucesso.add(tributoeditar.contains(tributovisualizar));
			sucesso.add(registroeditar.contains(registrovisualizar));
			sucesso.add(numerocampoeditar.contains(numerocampovisualizar));
			sucesso.add(codigoreceitaeditar.contains(codigoreceitavisualizar));
			sucesso.add(valordebitoeditarr.contains(valordebitovisualizar));

			System.out.println(sucesso);
			return sucesso;

		} else {

			waitExpectedElement(uf);
			sleep(2000);
			waitExpectedElement(filial);
			sleep(2000);
			String empresavisualizar = empresa.getAttribute("value");
			String ufvisualizar = uf.getText();
			String filialvisualizar = filial.getText();
			String tributovisualizar = tributo.getAttribute("value");
			String registrovisualizar = registro.getAttribute("value");
			String numerocampovisualizar = numerocampo.getAttribute("value");
			String codigoreceitavisualizar = codigoreceita.getAttribute("value");
			String valordebitovisualizar = valordebito.getAttribute("value");

			System.out.println(empresavisualizar);
			System.out.println(ufvisualizar);
			System.out.println(filialvisualizar);
			System.out.println(tributovisualizar);
			System.out.println(registrovisualizar);
			System.out.println(numerocampovisualizar);
			System.out.println(codigoreceitavisualizar);
			System.out.println(valordebitovisualizar);
			biblioteca.click();

			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			waitExpectedElement(nao);
			nao.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			waitExpectedElement(ultimaPagina);
			sleep(2000);

			ultimaPagina.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

			WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
			WebElement editar = driver.findElement(
					By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
			actionsMoveToElement(menu1);
			sleep(2000);
			menu1.click();
			sleep(1000);
			editar.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

			waitExpectedElement(uf);
			sleep(2000);
			waitExpectedElement(filial);
			sleep(2000);

			String empresaeditar = empresa.getAttribute("value");
			String ufeditar = uf.getText();
			String filialeditar = filial.getText();
			String tributoeditar = tributo.getAttribute("value");
			String registroeditar = registro.getAttribute("value");
			String numerocampoeditar = numerocampo.getAttribute("value");
			String codigoreceitaeditar = codigoreceita.getAttribute("value");
			String valordebitoeditarr = valordebito.getAttribute("value");

			System.out.println(empresaeditar);
			System.out.println(ufeditar);
			System.out.println(filialeditar);
			System.out.println(tributoeditar);
			System.out.println(registroeditar);
			System.out.println(numerocampoeditar);
			System.out.println(codigoreceitaeditar);
			System.out.println(valordebitoeditarr);

			ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

			sucesso.add(empresaeditar.contains(empresavisualizar));
			sucesso.add(ufeditar.contains(ufvisualizar));
			sucesso.add(filialeditar.contains(filialvisualizar));
			sucesso.add(tributoeditar.contains(tributovisualizar));
			sucesso.add(registroeditar.contains(registrovisualizar));
			sucesso.add(numerocampoeditar.contains(numerocampovisualizar));
			sucesso.add(codigoreceitaeditar.contains(codigoreceitavisualizar));
			sucesso.add(valordebitoeditarr.contains(valordebitovisualizar));

			System.out.println(sucesso);
			return sucesso;
		}

	}

}
