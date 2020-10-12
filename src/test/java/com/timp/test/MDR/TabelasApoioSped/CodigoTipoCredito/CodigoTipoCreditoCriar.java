package com.timp.test.MDR.TabelasApoioSped.CodigoTipoCredito;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.base.TestBaseKathy;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela26.MotivosCesBeneficiosCriarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.CodigoTipoCredito.CodigoTipoCreditoCriarPO;

public class CodigoTipoCreditoCriar extends TestBaseEliel {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CodigoTipoCreditoCriarPO codigoTipoCreditoCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationE();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		codigoTipoCreditoCriarPO = new CodigoTipoCreditoCriarPO();
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

		// codigoTipoCreditoCriarPO.criar();
		boolean sucesso = codigoTipoCreditoCriarPO.criar();
		assertTrue(sucesso, semAcesso);

	}
}
