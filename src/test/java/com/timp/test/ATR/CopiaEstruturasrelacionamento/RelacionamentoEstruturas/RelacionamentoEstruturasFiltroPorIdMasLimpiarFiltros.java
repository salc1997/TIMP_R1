package com.timp.test.ATR.CopiaEstruturasrelacionamento.RelacionamentoEstruturas;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ATR.AcessarATRPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.RelacionamentoEstruturas.RelacionamentoEstruturasFiltroPorIdMasLimpiarFiltrosPO;

public class RelacionamentoEstruturasFiltroPorIdMasLimpiarFiltros extends TestBaseFernando{
	LoginTC loginTC;
	AcessarATRPO acessarATRPO ;
	RelacionamentoEstruturasFiltroPorIdMasLimpiarFiltrosPO relacionamentoEstruturasFiltroPorIdMasLimpiarFiltrosPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acessarATRPO = new AcessarATRPO();
		relacionamentoEstruturasFiltroPorIdMasLimpiarFiltrosPO = new RelacionamentoEstruturasFiltroPorIdMasLimpiarFiltrosPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test(priority = 1)
	public void login() {
		loginTC.login();

	}

	@Test(priority = 2)
	public void ATREntrar() {
		acessarATRPO.acessarATR();
	}

	@Test(priority = 3)
	public void filtrarPorIdMasLimpiarFiltros() {
		boolean sucesso = relacionamentoEstruturasFiltroPorIdMasLimpiarFiltrosPO.filtrarPorIdMasLimpiarFiltros();
		assertTrue(sucesso, Filtros);
	}
}