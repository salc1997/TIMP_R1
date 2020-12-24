package com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPVEX;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPVEX.ValoresParaMetodoPVEXExcluirMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ValoresParaMetodoPVEXExcluirMassa extends TestBaseFernando{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	ValoresParaMetodoPVEXExcluirMassaPO valoresParaMetodoPVEXExcluirMassaPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		valoresParaMetodoPVEXExcluirMassaPO = new ValoresParaMetodoPVEXExcluirMassaPO();
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
		boolean sucesso = valoresParaMetodoPVEXExcluirMassaPO.criar();
		assertTrue(sucesso, Criar);
	}
	
	@Test(priority = 3)
	public void excluirMassa() {
		boolean sucesso = valoresParaMetodoPVEXExcluirMassaPO.exluirMassa();
		assertTrue(sucesso, Eliminado);
	}
}
