package com.timp.test.MDR.TabelasApoioSped.Observa�oesdoDocumentoFiscal;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.Classifica�aoDeContribuintesDoIPI.Classifica�aoDeContribuintesDoIPICriarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.CodigoContribui�aoSocialApurada.CodigoContribuicaoSocialApuradaCriarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.CodigoContribui�aoSocialApurada.CodigoContribui�aoSocialApuradaDetalhesPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.CodigoContribui�aoSocialApurada.CodigoContribui�aoSocialApuradaEditarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.CodigoContribui�aoSocialApurada.CodigoContribui�aoSocialApuradaExcluirPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.Observa�oesdoDocumentoFiscal.Observa�oesdoDocumentoFiscalDetalhesPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;


public class Observa�oesdoDocumentoFiscalDetalhes extends TestBaseSteven{

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	Observa�oesdoDocumentoFiscalDetalhesPO observa�oesdoDocumentoFiscalDetalhesPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		observa�oesdoDocumentoFiscalDetalhesPO = new Observa�oesdoDocumentoFiscalDetalhesPO();
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
	public void detalhes() {

		observa�oesdoDocumentoFiscalDetalhesPO.detalhes();
	}	
	
}
