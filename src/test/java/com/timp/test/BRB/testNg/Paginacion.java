package com.timp.test.BRB.testNg;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseParalelo2;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRB.AcessarBrbPO;
import com.sap.timp.pageObjectModel.BRB.prueba.PaginacionPO;

import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
 
public class Paginacion extends TestBaseSteven {

	LoginTC loginTC;
	AcessarBrbPO acessarBrbPO;
	PaginacionPO paginacionPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarBrbPO = new AcessarBrbPO();
		paginacionPO = new PaginacionPO();
	}

	
	//@AfterClass public void afterClass() { driver.close(); }

	
	@Test(groups = {"brb"})
	public void paginacion() {
		
		loginTC.login();
		acessarBrbPO.acessar();

		String paginaS = paginacionPO.paginacionPS();
		assertEquals(paginaS, "2", paginaSeguiente);

		String paginaA = paginacionPO.paginacionPA();
		assertEquals(paginaA, "1", paginaAnterior);

		String paginaF = paginacionPO.paginacionPF();
		assertEquals(paginaF, paginacionPO.totalPAges.getAttribute("value"), paginaFinal);

		String paginaI = paginacionPO.paginacionPI();
		assertEquals(paginaI, "1", paginaInicial);

		String paginaB = paginacionPO.numero();
		assertEquals(paginaB, "1", paginaInserida);

	}

}
