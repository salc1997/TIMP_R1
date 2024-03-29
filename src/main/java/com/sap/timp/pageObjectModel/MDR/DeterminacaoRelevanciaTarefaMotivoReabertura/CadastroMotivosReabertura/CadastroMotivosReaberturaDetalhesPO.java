package com.sap.timp.pageObjectModel.MDR.DeterminacaoRelevanciaTarefaMotivoReabertura.CadastroMotivosReabertura;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBase;

public class CadastroMotivosReaberturaDetalhesPO extends TestBase {

	@FindBy(xpath = "//span[text()=\"Determina��o de Relev�ncia de Tarefa por Motivo de Reabertura\"]")
	public WebElement determinacaoRelevancia;

	@FindBy(xpath = "//span[text()=\"Cadastro de Motivos de Reabertura\"]")
	public WebElement motivoReabertura;

	@FindBy(xpath = "//span[text()=\"C�digos de Ajustes\"]")
	public WebElement codigo;

	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;

	@FindBy(xpath = "//textarea[contains(@placeholder,\"Descri��o Padr�o\")]")
	public WebElement campo;

	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;

	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;

	@FindBy(xpath = "/html/body/div[3]")
	public WebElement cuerpo;

	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;

	@FindBy(xpath = "//div[@id=\"detail-description\"][1]/div[2]/div")
	public WebElement motivoD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][2]/div[2]/div")
	public WebElement descricaoD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][3]/div[2]/div")
	public WebElement impactoD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][4]/div[2]/div")
	public WebElement dataVigenciaD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][6]/div[2]/div")
	public WebElement ativoD;

	
	@FindBy(xpath = "//span[@id=\"motiveCode\"]")
	public WebElement motivoV;
	@FindBy(xpath = "//span[@id=\"description\"]")
	public WebElement descricaoV;
	@FindBy(xpath = "//span[@id=\"reopeningImpact\"]")
	public WebElement impactoV;
	@FindBy(xpath = "//span[@id=\"validFrom\"]")
	public WebElement dataVigenciaV;
	@FindBy(xpath = "//span[@id=\"active\"]")
	public WebElement ativoV;

	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;

	public CadastroMotivosReaberturaDetalhesPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> detalhes() {

		sleep(2000);
		determinacaoRelevancia.click();
		sleep(2000);
		motivoReabertura.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String idRegistro = idObter("CadastroMotivosReabertura");

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		WebElement a�ao = driver.findElement(
				By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhes\"]"));

		sleep(2000);
		menu.click();
		sleep(1000);

		a�ao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String motivoD1 = motivoD.getText();
		String descricaoD1 = descricaoD.getText();
		String impactoD1 = impactoD.getText();
		String dataVigenciaD1 = dataVigenciaD.getText();
		String ativoD1 = ativoD.getText();

		System.out.println(motivoD1);
		System.out.println(descricaoD1);
		System.out.println(impactoD1);
		System.out.println(dataVigenciaD1);
		System.out.println(ativoD1);

		sleep(2000);
		fechar.click();

		menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		a�ao = driver.findElement(
				By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));

		menu.click();
		sleep(1000);
		a�ao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String motivoV1 = motivoV.getText();
		String descricaoV1 = descricaoV.getText();
		String impactoV1 = impactoV.getText();
		String dataVigenciaV1 = dataVigenciaV.getText();
		String ativoV1 = ativoV.getText();

		System.out.println(motivoV1);
		System.out.println(descricaoV1);
		System.out.println(impactoV1);
		System.out.println(dataVigenciaV1);
		System.out.println(ativoV1);

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		sucesso.add(motivoV1.contains(motivoD1));
		sucesso.add(descricaoV1.contains(descricaoD1));
		sucesso.add(impactoV1.contains(impactoD1));
		sucesso.add(dataVigenciaV1.contains(dataVigenciaD1));
		sucesso.add(ativoV1.contains(ativoD1));

		System.out.println(sucesso);

		return sucesso;

	}

}
