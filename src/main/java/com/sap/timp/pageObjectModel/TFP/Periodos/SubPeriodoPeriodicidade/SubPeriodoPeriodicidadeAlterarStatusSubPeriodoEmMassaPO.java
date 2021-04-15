package com.sap.timp.pageObjectModel.TFP.Periodos.SubPeriodoPeriodicidade;

import java.util.ArrayList;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class SubPeriodoPeriodicidadeAlterarStatusSubPeriodoEmMassaPO extends TestBaseKenssy{

	@FindBy(xpath = "//li[@identifier=\"accordion-item-openedSubperiods\"]")
	public WebElement subPeriodoPeriodicidad;
	
	@FindBy(xpath = "//button/span[text()=\"Filtros Avançados\"]")
	public WebElement filtros;
	
	@FindBy(xpath = "//body")
	public WebElement clickAfuera;
	
	//DATOS A FILTRAR
	//EMPRESA
		@FindBy(xpath = "//div[@id=\"company\"]/div/div/div[2]")
		public WebElement empresa;
		
		@FindBy(xpath = "//div[contains(@class,\"list-option\")]/div[@id=\"3000\"]/div/label/span")
		public WebElement opcEmpresaTQ1;
		@FindBy(xpath = "//div[contains(@class,\"list-option\")]/div[@id=\"6000\"]/div/label/span")
		public WebElement opcEmpresaTC2;
		@FindBy(xpath = "//div[contains(@class,\"list-option\")]/div[@id=\"3000\"]/div/label/span")
		public WebElement opcEmpresaTP1;
		
	//AÑO
		@FindBy(xpath = "//div[@id=\"year-f\"]/div/div/div[2]")
		public WebElement anio;
		@FindBy(xpath = "//div[contains(@class,\"list-option\")]/div[@id=\"2012\"]/div/label/span")
		public WebElement opcAnio;	
			
	public SubPeriodoPeriodicidadeAlterarStatusSubPeriodoEmMassaPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> alterarSubPeriodoEmMassa() {
		String url = driver.getCurrentUrl();
		
		boolean tc2 = false;
		boolean td1 = false;
		boolean tp1 = false;
		boolean tq1 = false;
		
		if (url.contains("tc2")) {
			tc2 = true;
		}else if (url.contains("tp1")) {
			tp1 = true;
		}else if (url.contains("tq1")) {
			tq1 = true;
		}else {
			td1 = true;
		}
		
		sleep(2000);
		subPeriodoPeriodicidad.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		filtros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		return null;
		
		
		
		
	}
}
