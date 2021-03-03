package com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaCodigoReceitas;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaCodigoReceitas.TabelaDeCodigosDeReceitasExcluirEmMassaPO;

public class TabelaDeCodigosDeReceitasExcluirEmMassa extends TestBaseEliel {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TabelaDeCodigosDeReceitasExcluirEmMassaPO tabelaDeCodigosDeReceitasExcluirEmMassaPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationE();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		tabelaDeCodigosDeReceitasExcluirEmMassaPO = new TabelaDeCodigosDeReceitasExcluirEmMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		boolean sucesso = tabelaDeCodigosDeReceitasExcluirEmMassaPO.criar();
		assertTrue(sucesso, Criar);
		sleep(1000);
		boolean sucesso2 = tabelaDeCodigosDeReceitasExcluirEmMassaPO.excluir();
		assertTrue(sucesso2, Eliminado);

	}
}
