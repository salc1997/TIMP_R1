package com.timp.test.MDR.ControleDeCreditoTributario.UtilizacaoDosCreditosNaApuracao;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.ControleDeCreditoTributario.UtilizacaoDosCreditosNaApuracao.UtilizacaoDosCreditosNaApuracaoExcluirEmMassaPO;

public class UtilizacaoDosCreditosNaApuracaoExcluirEmMassa extends TestBaseEliel{
	

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	UtilizacaoDosCreditosNaApuracaoExcluirEmMassaPO utilizacaoDosCreditosNaApuracaoExcluirEmMassaPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationE();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		utilizacaoDosCreditosNaApuracaoExcluirEmMassaPO = new UtilizacaoDosCreditosNaApuracaoExcluirEmMassaPO();
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

		boolean sucesso = utilizacaoDosCreditosNaApuracaoExcluirEmMassaPO.criar();
		assertTrue(sucesso, Criar);
		sleep(1000);
		boolean sucesso2 = utilizacaoDosCreditosNaApuracaoExcluirEmMassaPO.excluir();
		assertTrue(sucesso2, Eliminado);

	}
 
}
