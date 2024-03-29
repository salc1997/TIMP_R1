package com.timp.test.MDR.ControleDeCreditoTributario.UtilizacaoDosCreditosNaApuracao;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.ControleDeCreditoTributario.UtilizacaoDosCreditosNaApuracao.UtilizacaoDosCreditosNaApuracaoExcluirEmMassaPO;

public class UtilizacaoDosCreditosNaApuracaoExcluirEmMassa extends TestBase{
	

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	UtilizacaoDosCreditosNaApuracaoExcluirEmMassaPO utilizacaoDosCreditosNaApuracaoExcluirEmMassaPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		utilizacaoDosCreditosNaApuracaoExcluirEmMassaPO = new UtilizacaoDosCreditosNaApuracaoExcluirEmMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void criar() {
		
		loginTC.login();

		acessarMDRPO.acessarMDR();

		boolean sucesso = utilizacaoDosCreditosNaApuracaoExcluirEmMassaPO.criar();
		assertTrue(sucesso, Criar);
		sleep(1000);


	}
	
	@Test(dependsOnMethods = "criar")
	public void excluir() {


		boolean sucesso2 = utilizacaoDosCreditosNaApuracaoExcluirEmMassaPO.excluir();
		assertTrue(sucesso2, Eliminado);

	}
 
}
