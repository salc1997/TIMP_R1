package com.timp.test.BRB;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRB.AcessarBrbPO;
import com.sap.timp.pageObjectModel.BRB.PaginacaoPO;

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

public class Paginacao extends TestBase {

	LoginTC loginTC;
	AcessarBrbPO acessarBrbPO;
	PaginacaoPO paginacionOP;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarBrbPO = new AcessarBrbPO();
		paginacionOP = new PaginacaoPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}



	@Test()
	public void paginacion() {
		
		loginTC.login();
		
		acessarBrbPO.acessar();


		String paginaS = paginacionOP.paginacionPS();
		assertEquals(paginaS, "2", paginaSeguiente);

		String paginaA = paginacionOP.paginacionPA();
		assertEquals(paginaA, "1", paginaAnterior);

		String paginaF = paginacionOP.paginacionPF();
		assertEquals(paginaF, paginacionOP.totalPAges.getAttribute("value"), paginaFinal);

		String paginaI = paginacionOP.paginacionPI();
		assertEquals(paginaI, "1", paginaInicial);

		String paginaB = paginacionOP.numero();
		assertEquals(paginaB, "1", paginaInserida);

	}

}
