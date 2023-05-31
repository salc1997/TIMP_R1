package com.timp.test.MDR.SCANC.OPPropiasRessarcimentos;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.SCANC.OPPropiasRessarcimentos.OPPropiasRessarcimentosExcluirMassaPO;

public class OPPropriosRessarcimentosExcluirMassa extends TestBase {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	OPPropiasRessarcimentosExcluirMassaPO oPPropiasRessarcimentosExcluirMassaPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		oPPropiasRessarcimentosExcluirMassaPO = new OPPropiasRessarcimentosExcluirMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void Criar() {

		loginTC.login();

		acessarMDRPO.acessarMDR();

		boolean sucesso = oPPropiasRessarcimentosExcluirMassaPO.Criar();

		assertTrue(sucesso, Criar);

	}
	
	@Test(dependsOnMethods = "Criar")
	public void Excluir() {

		boolean sucesso2 = oPPropiasRessarcimentosExcluirMassaPO.ExcluirMasa();
		assertTrue(sucesso2, Eliminado);
	}

}
