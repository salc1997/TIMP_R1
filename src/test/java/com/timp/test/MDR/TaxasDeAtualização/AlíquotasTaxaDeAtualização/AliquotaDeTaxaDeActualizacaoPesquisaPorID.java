package com.timp.test.MDR.TaxasDeAtualização.AlíquotasTaxaDeAtualização;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TaxasDeActualizacao.AliquotasDeTaxaDeActualizacaoPesquisaPorIDPO;

public class AliquotaDeTaxaDeActualizacaoPesquisaPorID extends TestBase {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	AliquotasDeTaxaDeActualizacaoPesquisaPorIDPO aliquotasDeTaxaDeActualizacaoPesquisaPorIDPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		aliquotasDeTaxaDeActualizacaoPesquisaPorIDPO = new AliquotasDeTaxaDeActualizacaoPesquisaPorIDPO();

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void filtro() {

		loginTC.login();

		acessarMDRPO.acessarMDR();

		boolean sucesso = aliquotasDeTaxaDeActualizacaoPesquisaPorIDPO.filtro();
		assertTrue(sucesso, Filtros);

	}

}
