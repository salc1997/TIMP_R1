package com.timp.test.MDR.Centralizacao.EstornoCredito;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.base.TestBaseKathy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Centralizacao.EstornoCredito.*;

public class EstornoCreditoCriar extends TestBaseEliel {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;

	EstornoCreditoCriarPO estornoCreditoCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationE();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		estornoCreditoCriarPO = new EstornoCreditoCriarPO();

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
	public void acessarMDR() {

		acessarMDRPO.acessarMDR();

	}

	@Test(priority = 2)
	public void criar() {

		boolean sucesso = estornoCreditoCriarPO.CriarEstornoCredito();

		// teste pra conferir se o resultado mostrado é igual
		assertTrue(sucesso, Criar);

		// Teste pra conferir se conseguiu acesssar o sistema
		assertTrue(estornoCreditoCriarPO.mostrar.isDisplayed(), semAcesso);

	}

}
