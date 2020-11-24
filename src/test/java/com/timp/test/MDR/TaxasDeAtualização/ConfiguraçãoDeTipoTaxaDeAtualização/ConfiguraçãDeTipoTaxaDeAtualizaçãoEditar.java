package com.timp.test.MDR.TaxasDeAtualiza��o.Configura��oDeTipoTaxaDeAtualiza��o;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TaxasDeAtualiza��o.Configura��oDeTipoTaxaDeAtualiza��o.Configura��DeTipoTaxaDeAtualiza��oEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class Configura��DeTipoTaxaDeAtualiza��oEditar extends TestBaseFernando{
	LoginTC loginTC;
	AcessarMDRPO acesarMDRPO;
	Configura��DeTipoTaxaDeAtualiza��oEditarPO configura��DeTipoTaxaDeAtualiza��oEditarPO;

	public Configura��DeTipoTaxaDeAtualiza��oEditar() {
		super();
	}

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acesarMDRPO = new AcessarMDRPO();
		configura��DeTipoTaxaDeAtualiza��oEditarPO = new Configura��DeTipoTaxaDeAtualiza��oEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
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
	public void editar() {
		boolean sucesso = configura��DeTipoTaxaDeAtualiza��oEditarPO.editar();
		assertTrue(sucesso, Editar);
	}
}
