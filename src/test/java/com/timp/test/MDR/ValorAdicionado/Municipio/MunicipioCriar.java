package com.timp.test.MDR.ValorAdicionado.Municipio;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObriga�oesAcessorias.AgrupadorDeCFOP.AgrupadorDeCFOPCriarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaOutrosDebitos.TabelasOutrosDebitosCriarPO;
import com.sap.timp.pageObjectModel.MDR.ValorAdicionado.Municipio.MunicipioCriarPO;

public class MunicipioCriar extends TestBase {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	MunicipioCriarPO municipioCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		municipioCriarPO = new MunicipioCriarPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}
	

	@Test()
	public void criar() {

		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = municipioCriarPO.criar();
		assertTrue(sucesso, Criar);

	}

}
