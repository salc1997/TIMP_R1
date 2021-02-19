package com.timp.test.ATR.EstruturasMapeamentodeEstruturas;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ATR.AcessarATRPO;
import com.sap.timp.pageObjectModel.ATR.EstruturasMapeamentodeEstruturas.MapeamentodePar�metrosdeEntradaFiltroporIDLimparPO;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Siscoserv.RegistroRF.RegistroRFFiltroPorIDPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class MapeamentodePar�metrosdeEntradaFiltroporIDLimpar extends TestBaseCristhian {
	LoginTC loginTC;
	AcessarATRPO acessarATRPO;
	MapeamentodePar�metrosdeEntradaFiltroporIDLimparPO mapeamentodePar�metrosdeEntradaFiltroporIDLimparPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationC();
		loginTC = new LoginTC();
		acessarATRPO = new AcessarATRPO();
		mapeamentodePar�metrosdeEntradaFiltroporIDLimparPO = new MapeamentodePar�metrosdeEntradaFiltroporIDLimparPO();

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

		boolean sucesso = mapeamentodePar�metrosdeEntradaFiltroporIDLimparPO.filtro();
		assertTrue(sucesso, Filtros);

	}

}
