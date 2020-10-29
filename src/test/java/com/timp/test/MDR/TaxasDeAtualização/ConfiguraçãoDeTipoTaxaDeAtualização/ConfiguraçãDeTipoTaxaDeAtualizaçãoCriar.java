package com.timp.test.MDR.TaxasDeAtualiza��o.Configura��oDeTipoTaxaDeAtualiza��o;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TaxasDeAtualiza��o.Configura��oDeTipoTaxaDeAtualiza��o.Configura��DeTipoTaxaDeAtualiza��oCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class Configura��DeTipoTaxaDeAtualiza��oCriar extends TestBaseFernando{
	LoginTC loginTC;
	AcessarMDRPO acesarMDRPO;
	Configura��DeTipoTaxaDeAtualiza��oCriarPO configura��DeTipoTaxaDeAtualiza��oCriarPO;

	public Configura��DeTipoTaxaDeAtualiza��oCriar() {
		super();
	}

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acesarMDRPO = new AcessarMDRPO();
		configura��DeTipoTaxaDeAtualiza��oCriarPO = new Configura��DeTipoTaxaDeAtualiza��oCriarPO();
	}

	@AfterClass
	public void afterClass() {
	}

	@Test(priority = 0)
	public void ingresar() {
		loginTC.login();
	}

	@Test(priority = 2)
	public void mdrEntrar() {
		acesarMDRPO.acessarMDR();
	}

	@Test(priority = 3)
	public void criar() {
		boolean sucesso = configura��DeTipoTaxaDeAtualiza��oCriarPO.criar();
		assertTrue(sucesso, Criar);
	}
}
