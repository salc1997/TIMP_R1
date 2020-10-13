package com.timp.test.BRB;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRB.AcessarBrbPO;
import com.sap.timp.pageObjectModel.BRB.CriarCopiaPO;

public class CriarCopia extends TestBaseSteven {
 
	LoginTC loginTC;
	AcessarBrbPO acessarBrbPO;
	CriarCopiaPO criarCopiaPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBrbPO = new AcessarBrbPO();
		criarCopiaPO = new CriarCopiaPO();

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test(priority = 0)
	public void login() {

		loginTC.login();

	}

	@Test(priority = 1)
	public void brbEntrar() {
		acessarBrbPO.acessar();

	}

	@Test(priority = 2)
	public void criarCopia() {

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		sucesso = criarCopiaPO.copiar();

		System.out.println(sucesso);

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), copiaNaoCriada);
		}

		criarCopiaPO.eliminarCopia();

	}

}
