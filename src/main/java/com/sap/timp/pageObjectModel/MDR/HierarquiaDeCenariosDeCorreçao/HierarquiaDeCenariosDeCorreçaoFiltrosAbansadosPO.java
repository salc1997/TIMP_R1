package com.sap.timp.pageObjectModel.MDR.HierarquiaDeCenariosDeCorreçao;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

import net.bytebuddy.asm.Advice.Enter;

public class HierarquiaDeCenariosDeCorreçaoFiltrosAbansadosPO extends TestBaseMassiel{
	
	@FindBy(xpath = "//span[text()=\"Hierarquias de Cenários de Correção\"]")
	public WebElement hierarquias;
	
	@FindBy(xpath = "//span[text()=\"Filtros Avançados\"]")
	public WebElement filtro;
	
	@FindBy(xpath = "//div[@id=\"tax\"]/div/div/div/div[2]")
	public WebElement tributo;
	
	@FindBy(xpath = "//div[contains(@class,\"list-item\") and string()][1]")
	public WebElement tributo1;
	
	@FindBy(xpath = "//div[@id=\"created-by\"]/div/div/div[1]")
	public WebElement usuario;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div[2]")
	public WebElement usuarioCreado;
	
	@FindBy(xpath = "//span[text()=\"Limpar Filtros\"]")
	public WebElement limpiar;
	
	
	@FindBy(xpath = "//div[@id=\"creation-date\"]/div/div/input")
	public WebElement fecha;
	
	@FindBy(xpath = "//div[@id=\"modified-by\"\"]/div/div/div[1]")
	public WebElement usuariomodificado;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div[@class]/label/span")
	public WebElement usuarioModificadoId;
	
	@FindBy(xpath = "//div[@id=\"modification-date\"]/div/div/input")
	public WebElement fechamodificado;
	
	@FindBy(xpath = "//input[@placeholder=\"Filtrar por Usuário de Criação\"]")
	public WebElement clickfuera;
	

	
	//tome el primero de la lista y que tiene
	

	
	
	public HierarquiaDeCenariosDeCorreçaoFiltrosAbansadosPO() {
		PageFactory.initElements(driver, this);
	}
	
	
	public ArrayList<Boolean>  FiltroA(){

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		hierarquias.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		filtro.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);


		tributo.click();
		sleep(1000);
		String empresaText = tributo1.getText();
		tributo1.click();
		sleep(1000);

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {

			String textFiltroEmpresa = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
							+ rows + "]/div[6]/div"))
					.getText();
			System.out.println(textFiltroEmpresa + " empresa Filtro");
			sucesso.add(empresaText.equals(textFiltroEmpresa));

			f = f + 1;
		}
		System.out.println(sucesso);

		return sucesso;
	}		

	public ArrayList<Boolean>  FiltroB(){

		sleep(2000);
		limpiar.click();
		sleep(2000);

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);


		usuario.click();
		sleep(1000);
		usuarioCreado.click();
		sleep(1000);
		String empresaText = usuarioCreado.getText();
		System.out.println("-----"+empresaText);
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		usuario.sendKeys(Keys.ENTER);
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {

			String textFiltroEmpresa = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
							+ rows + "]/div[9]/div"))
					.getText();
			System.out.println(textFiltroEmpresa + " empresa Filtro");
			sucesso.add(empresaText.equals(textFiltroEmpresa));

			f = f + 1;
		}
		System.out.println(sucesso);

		return sucesso;
	}		

}
