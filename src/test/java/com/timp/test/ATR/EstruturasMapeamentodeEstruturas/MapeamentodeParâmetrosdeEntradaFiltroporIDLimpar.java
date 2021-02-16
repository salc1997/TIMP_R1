package com.timp.test.ATR.EstruturasMapeamentodeEstruturas;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ATR.AcessarATRPO;
import com.sap.timp.pageObjectModel.ATR.EstruturasMapeamentodeEstruturas.MapeamentodeParâmetrosdeEntradaFiltroporIDLimparPO;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Siscoserv.RegistroRF.RegistroRFFiltroPorIDPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class MapeamentodeParâmetrosdeEntradaFiltroporIDLimpar extends TestBaseCristhian {
	LoginTC loginTC;
	AcessarATRPO acessarATRPO;
	MapeamentodeParâmetrosdeEntradaFiltroporIDLimparPO mapeamentodeParâmetrosdeEntradaFiltroporIDLimparPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationC();
		loginTC = new LoginTC();
		acessarATRPO = new AcessarATRPO();
		mapeamentodeParâmetrosdeEntradaFiltroporIDLimparPO = new MapeamentodeParâmetrosdeEntradaFiltroporIDLimparPO();

	}

	@AfterClass
	public void afterClass() {
		// driver.close();
	}

	@Test(priority = 0)
	public void login() {
		loginTC.login();

	}

	@Test(priority = 1)
	public void acessarATRPO() {

		boolean sucesso = acessarATRPO.acessarATR();

	}

	@Test(priority = 2)
	public void filtro() {

		boolean sucesso = mapeamentodeParâmetrosdeEntradaFiltroporIDLimparPO.filtro();
		assertTrue(sucesso, Filtros);

	}

}
