package com.timp.test.MDR.Centralizacao.EstornoCredito;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Centralizacao.EstornoCredito.*;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class EstornoCreditoEditar extends TestBaseEliel {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;

	EstornoCreditoEditarPO estornoCreditoEditarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationE();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		estornoCreditoEditarPO = new EstornoCreditoEditarPO();

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
	public void editar() {

		// boolean sucesso=estornoCreditoEditarPO.Ed;
		estornoCreditoEditarPO.Editar();
		// teste pra conferir se o resultado mostrado é igual
		// assertTrue(sucesso, Criar);

		// Teste pra conferir se conseguiu acesssar o sistema
		// assertTrue(estornoCreditoEditarPO.mostrar.isDisplayed(), semAcesso);

	}

}
