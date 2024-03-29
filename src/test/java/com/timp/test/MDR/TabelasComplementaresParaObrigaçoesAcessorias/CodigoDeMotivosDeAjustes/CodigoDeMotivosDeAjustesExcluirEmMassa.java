package com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.CodigoDeMotivosDeAjustes;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.CodigoDeMotivosDeAjustes.CodigoDeMotivosDeAjustesExcluirEmMassaPO;

public class CodigoDeMotivosDeAjustesExcluirEmMassa extends TestBase {
 
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CodigoDeMotivosDeAjustesExcluirEmMassaPO codigoDeMotivosDeAjustesExcluirEmMassaPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		codigoDeMotivosDeAjustesExcluirEmMassaPO = new CodigoDeMotivosDeAjustesExcluirEmMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		boolean sucesso = codigoDeMotivosDeAjustesExcluirEmMassaPO.criar();
		assertTrue(sucesso, Criar);
		sleep(1000);
		boolean sucesso2 = codigoDeMotivosDeAjustesExcluirEmMassaPO.excluir();
		assertTrue(sucesso2, Eliminado);

	}

}
