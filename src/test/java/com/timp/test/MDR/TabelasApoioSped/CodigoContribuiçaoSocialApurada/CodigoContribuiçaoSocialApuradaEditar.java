package com.timp.test.MDR.TabelasApoioSped.CodigoContribui�aoSocialApurada;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.Classifica�aoDeContribuintesDoIPI.Classifica�aoDeContribuintesDoIPICriarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.CodigoContribui�aoSocialApurada.CodigoContribuicaoSocialApuradaCriarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.CodigoContribui�aoSocialApurada.CodigoContribui�aoSocialApuradaEditarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.CodigoContribui�aoSocialApurada.CodigoContribui�aoSocialApuradaExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;


public class CodigoContribui�aoSocialApuradaEditar extends TestBaseSteven{

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CodigoContribui�aoSocialApuradaEditarPO codigoContribui�aoSocialApuradaEditarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		codigoContribui�aoSocialApuradaEditarPO = new CodigoContribui�aoSocialApuradaEditarPO();
	}
	/*
	 * @AfterClass public void afterClass(){ driver.close(); }
	 */

	@Test(priority = 0)
	public void login() {
		loginTC.login();

	}

	@Test(priority = 1)
	public void acessarMDR() {

		acessarMDRPO.acessarMDR();

	}

	@Test(priority = 2)
	public void editar() {

		boolean sucesso = codigoContribui�aoSocialApuradaEditarPO.editar();
		
		assertTrue(sucesso, Editar);
	}	
	
}
