package com.timp.test.MDR.EventosESocial.S1270ContrataçãDeTrabalhadoresAvulsosNãoPortuários;

import org.testng.annotations.Test;


import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.EventosESocial.S1270ContrataçãDeTrabalhadoresAvulsosNãoPortuários.ContrataçãoDeTrabalhadoresAvulsosNãoPortuáriosCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ContrataçãoDeTrabalhadoresAvulsosNãoPortuáriosCriar extends TestBase{
	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	ContrataçãoDeTrabalhadoresAvulsosNãoPortuáriosCriarPO contrataçãoDeTrabalhadoresAvulsosNãoPortuáriosCriarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		accesarMDRPO = new AcessarMDRPO();
		contrataçãoDeTrabalhadoresAvulsosNãoPortuáriosCriarPO = new ContrataçãoDeTrabalhadoresAvulsosNãoPortuáriosCriarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void criar() {
		loginTC.login();
		accesarMDRPO.acessarMDR();
		boolean sucesso = contrataçãoDeTrabalhadoresAvulsosNãoPortuáriosCriarPO.criar();
		assertTrue(sucesso, Criar);
	}
}
