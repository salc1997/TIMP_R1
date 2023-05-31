package com.timp.test.MDR.ValorAdicionado.Municipio;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.ValorAdicionado.Municipio.MunicipioExcluirEmMassaPO;

public class MunicipioExcluirEmMassa extends TestBase {

	LoginTC loginTC;
	AcessarMDRPO accesarMDR;
	MunicipioExcluirEmMassaPO municipioExcluirEmMassaPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		accesarMDR = new AcessarMDRPO();
		municipioExcluirEmMassaPO = new MunicipioExcluirEmMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void Criar() {

		loginTC.login();
		accesarMDR.acessarMDR();

		boolean sucesso = municipioExcluirEmMassaPO.criar();
		assertTrue(sucesso, Criar);
		sleep(1000);

	}

	@Test(dependsOnMethods = "Criar")
	public void ExcluirEmMassa() {

		boolean sucesso2 = municipioExcluirEmMassaPO.excluir();
		assertTrue(sucesso2, Eliminado);
	}

}
