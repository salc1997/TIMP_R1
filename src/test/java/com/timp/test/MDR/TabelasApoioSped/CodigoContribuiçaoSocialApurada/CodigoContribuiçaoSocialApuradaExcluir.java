package com.timp.test.MDR.TabelasApoioSped.CodigoContribuiçaoSocialApurada;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.ClassificaçaoDeContribuintesDoIPI.ClassificaçaoDeContribuintesDoIPICriarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.CodigoContribuiçaoSocialApurada.CodigoContribuicaoSocialApuradaCriarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.CodigoContribuiçaoSocialApurada.CodigoContribuiçaoSocialApuradaExcluirPO;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

public class CodigoContribuiçaoSocialApuradaExcluir extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CodigoContribuiçaoSocialApuradaExcluirPO codigoContribuiçaoSocialApuradaExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		codigoContribuiçaoSocialApuradaExcluirPO = new CodigoContribuiçaoSocialApuradaExcluirPO();
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
	public void excluir() {

		codigoContribuiçaoSocialApuradaExcluirPO.eliminar();

	}

}
