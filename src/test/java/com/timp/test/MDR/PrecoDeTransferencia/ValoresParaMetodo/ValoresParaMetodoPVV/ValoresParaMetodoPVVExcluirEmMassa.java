package com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPVV;

import org.testng.annotations.Test;


import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPVV.ValoresParaMetodoPVVExcluirEmMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ValoresParaMetodoPVVExcluirEmMassa extends TestBase{
	LoginTC loginTC;
	AcessarMDRPO accesarMDR;
	ValoresParaMetodoPVVExcluirEmMassaPO valoresParaMetodoPVVExcluirEmMassaPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		accesarMDR = new AcessarMDRPO();
		valoresParaMetodoPVVExcluirEmMassaPO = new ValoresParaMetodoPVVExcluirEmMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {
		loginTC.login();
		accesarMDR.acessarMDR();

		boolean sucesso = valoresParaMetodoPVVExcluirEmMassaPO.criar();
		assertTrue(sucesso, Criar);
	}
	
	@Test(dependsOnMethods = "criar")
	public void excluirEmMassa() {
		sleep(1000);
		boolean sucesso2 = valoresParaMetodoPVVExcluirEmMassaPO.valoresParaMetodoPVVExcluirEmMassa();
		assertTrue(sucesso2, Eliminado);
	}
}
