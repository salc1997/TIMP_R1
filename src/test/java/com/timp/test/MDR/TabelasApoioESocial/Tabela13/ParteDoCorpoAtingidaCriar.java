package com.timp.test.MDR.TabelasApoioESocial.Tabela13;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela13.ParteDoCorpoAtingidaCriarPO;


import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class ParteDoCorpoAtingidaCriar extends TestBase{

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	ParteDoCorpoAtingidaCriarPO parteDoCorpoAtingidaCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		parteDoCorpoAtingidaCriarPO = new ParteDoCorpoAtingidaCriarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {

		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = parteDoCorpoAtingidaCriarPO.criar();

		assertTrue(sucesso, Criar);

	}

}
