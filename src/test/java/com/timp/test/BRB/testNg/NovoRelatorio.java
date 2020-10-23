package com.timp.test.BRB.testNg;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseParalelo2;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRB.AcessarBrbPO;
import com.sap.timp.pageObjectModel.BRB.prueba.NovoRelatorioPO;
 
public class NovoRelatorio extends TestBaseSteven {

	LoginTC loginTc;
	AcessarBrbPO accesarBrbPO;
	NovoRelatorioPO novoRelatorioPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTc = new LoginTC();
		accesarBrbPO = new AcessarBrbPO();
		novoRelatorioPO = new NovoRelatorioPO();
	}

	/*
	 * @AfterClass public void afterClass() { quit(); }
	 */
	@Test(priority = 0)
	public void login() {

		loginTc.login();

	}

	@Test(priority = 1)
	public void brbEntrar() {
		accesarBrbPO.acessar();

	}

	@Test(priority = 2)
	public void novoRelatorio() {

		boolean sucesso = false;
		sucesso = novoRelatorioPO.criar();

		assertTrue(sucesso, novoRelatorio);
		sleep(4000);

		String texto = driver
				.findElement(By.xpath("//*[@id=\"right\"]/div/div[4]/div/div[1]/div/div[3]/div[1]/div[7]/div"))
				.getText();
		assertTrue(texto.contains("Prueba Automatizada"), "The names don't match");

	}

	@Test(priority = 3)
	public void colunas() {

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso = novoRelatorioPO.colunas();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), "The Colunms weren't added");
		}

	}

}
