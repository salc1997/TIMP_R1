package com.timp.test.MDR.TabelasApoioSped.Classifica�aoDeContribuintesDoIPI;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.Classifica�aoDeContribuintesDoIPI.Classifica�aoDeContribuintesDoIPIExcluirMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class Classifica�aoDeContribuintesDoIPIExcluirMassa extends TestBaseFernando{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	Classifica�aoDeContribuintesDoIPIExcluirMassaPO classifica�aoDeContribuintesDoIPIExcluirMassaPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		classifica�aoDeContribuintesDoIPIExcluirMassaPO = new Classifica�aoDeContribuintesDoIPIExcluirMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

<<<<<<< HEAD
=======

>>>>>>> branch 'Cristhian' of https://github.com/salc1997/TIMP_R1.git
	@Test()
	public void criar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		boolean sucesso = classifica�aoDeContribuintesDoIPIExcluirMassaPO.criar();
		assertTrue(sucesso, Criar);
	}
	
	@Test(dependsOnMethods = "criar")
<<<<<<< HEAD
	public void excluirMassa() {
		boolean sucesso = classifica�aoDeContribuintesDoIPIExcluirMassaPO.exluirMassa();
		assertTrue(sucesso, Eliminado);
=======
	public void excluir() {
		loginTC.login();
		acessarMDRPO.acessarMDR();

		
		boolean sucesso2 = classifica�aoDeContribuintesDoIPIExcluirMassaPO.exluirMassa();
		assertTrue(sucesso2, Eliminado);
>>>>>>> branch 'Cristhian' of https://github.com/salc1997/TIMP_R1.git
	}

}
