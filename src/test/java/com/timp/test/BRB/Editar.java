package com.timp.test.BRB;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRD.AcessarBrbPO;
import com.sap.timp.pageObjectModel.BRD.AtivarCorrecaoPO;
import com.sap.timp.pageObjectModel.BRD.EditarPO;

public class Editar extends TestBase{
	
	LoginTC loginTC;
	AcessarBrbPO acessarBrbPO;
	EditarPO editarPO;



    @BeforeClass
    public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBrbPO = new AcessarBrbPO();
		editarPO = new EditarPO();
	

		
    }
    
    @AfterClass
	public void afterClass(){
		driver.close();
	}
    
    @Test(priority = 0)
	public void login() {

		loginTC.login();

	}
	
	
	@Test(priority= 1)
	public void brbEntrar() {
		acessarBrbPO.acessar();
			
	}
	

	@Test(priority = 2 )
	public void editar() {
		
		boolean sucesso = false;
		sucesso = editarPO.editar();
		
		assertTrue(sucesso, editado);
		
	

		
		

		
	}
	

	
	
	
	
	
	
	
	
}
