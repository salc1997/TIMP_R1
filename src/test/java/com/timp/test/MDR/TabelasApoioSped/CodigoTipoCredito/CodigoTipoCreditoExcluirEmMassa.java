package com.timp.test.MDR.TabelasApoioSped.CodigoTipoCredito;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.CodigoTipoCredito.CodigoTipoCreditoExcluirEmMassaPO;

public class CodigoTipoCreditoExcluirEmMassa extends TestBase {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CodigoTipoCreditoExcluirEmMassaPO codigoTipoCreditoExcluirEmMassaPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		codigoTipoCreditoExcluirEmMassaPO = new CodigoTipoCreditoExcluirEmMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {

		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = codigoTipoCreditoExcluirEmMassaPO.criar();
		assertTrue(sucesso, Criar);
		sleep(1000);
		boolean sucesso2 = codigoTipoCreditoExcluirEmMassaPO.excluir();
		assertTrue(sucesso2, Eliminado);

	}

}
