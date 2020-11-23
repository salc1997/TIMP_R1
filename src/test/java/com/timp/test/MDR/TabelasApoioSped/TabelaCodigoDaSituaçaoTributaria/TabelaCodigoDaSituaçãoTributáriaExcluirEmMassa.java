package com.timp.test.MDR.TabelasApoioSped.TabelaCodigoDaSitua�aoTributaria;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.TabelaCodigoDaSitua�aoTributaria.TabelaCodigoDaSitua��oTribut�riaExcluirEmMassaPO;

public class TabelaCodigoDaSitua��oTribut�riaExcluirEmMassa extends TestBaseEliel{
  
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TabelaCodigoDaSitua��oTribut�riaExcluirEmMassaPO tabelaCodigoDaSitua��oTribut�riaExcluirEmMassaPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationE();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		tabelaCodigoDaSitua��oTribut�riaExcluirEmMassaPO = new TabelaCodigoDaSitua��oTribut�riaExcluirEmMassaPO();
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

		boolean sucesso = tabelaCodigoDaSitua��oTribut�riaExcluirEmMassaPO.criar();
		assertTrue(sucesso, Criar);
		sleep(1000);
		boolean sucesso2 = tabelaCodigoDaSitua��oTribut�riaExcluirEmMassaPO.excluir();
		assertTrue(sucesso2, Eliminado);

	}
	
	
}
