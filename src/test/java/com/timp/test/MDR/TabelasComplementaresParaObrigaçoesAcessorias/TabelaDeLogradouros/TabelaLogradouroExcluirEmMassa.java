package com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeLogradouros;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaLogradouros.TabelaLogradourosExcluirEmMassaPO;

public class TabelaLogradouroExcluirEmMassa extends TestBaseEliel{
	
	LoginTC loginTC;
	AcessarMDRPO accesarMDR;
	TabelaLogradourosExcluirEmMassaPO tabelaLogradourosExcluirEmMassaPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationE();
		loginTC = new LoginTC();
		accesarMDR = new AcessarMDRPO();
		tabelaLogradourosExcluirEmMassaPO = new TabelaLogradourosExcluirEmMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {
		loginTC.login();
		accesarMDR.acessarMDR();

		boolean sucesso = tabelaLogradourosExcluirEmMassaPO.criar();
		assertTrue(sucesso, Criar);
		sleep(1000);

		boolean sucesso2 = tabelaLogradourosExcluirEmMassaPO.excluir();
		assertTrue(sucesso2, Eliminado);
	}
	
 
}
