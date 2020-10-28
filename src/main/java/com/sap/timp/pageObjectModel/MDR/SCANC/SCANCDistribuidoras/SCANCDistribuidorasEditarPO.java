package com.sap.timp.pageObjectModel.MDR.SCANC.SCANCDistribuidoras;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class SCANCDistribuidorasEditarPO extends TestBaseMassiel{
	
	@FindBy(xpath = "//span[text()=\"SCANC\"]")
	public WebElement scanc;
	
	@FindBy(xpath = "//span[text()=\"SCANC Distribuidoras\"]")
	public WebElement scancDistribuidoras;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement ultimaPagina;
	
	@FindBy(xpath = "//div[@class=\"action-button\"]")
	public WebElement botonMenu;
	
	@FindBy(xpath = "//div[@class=\"popover active\"]/ul/li/span[text()=\"Editar\"]")
	public WebElement botonEditar;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Validade De\")]")
	public WebElement dataVigencia;
	
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement Gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement Sim;
	
	
	public SCANCDistribuidorasEditarPO() {

		PageFactory.initElements(driver, this);
		
	}

        public void  Editar() {

		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		scanc.click();
	    invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		scancDistribuidoras.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro =idObter3();
		System.out.println(idRegistro);
		
        sleep(2000);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(2000);
		editar.click();
		sleep(2000);
	    
		attributeToBeXpath("//div[@id=\"filial\"]/div", "class", "base-MultipleSelect3 required");
		sleep(2000);
		
	  	String dataInicioVigenciaValorNuevo = fechaActual();
	  	dataVigencia.clear(); // Limpio la fecha actual que tiene guardada
	  	dataVigencia.sendKeys(dataInicioVigenciaValorNuevo); // Le envio la nueva fecha a editar	
		System.out.println(dataInicioVigenciaValorNuevo); // Imprimo la fecha que se va editar el nuevo valor
		
		sleep(2000);
		Gravar.click();
		sleep(2000);
		Sim.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay dark\"]");
		sleep(1000);




	  


		
     }

}