package com.timp.test.MDR.SCANC.OPPropiasRessarcimentos;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.LivrosFiscais.LivrosFiscais.LivrosFiscaisCriarPO;
import com.sap.timp.pageObjectModel.MDR.LivrosFiscais.ParametrosParaLivroICMSST.ParametrosParaLivroICMSSTCriarPO;
import com.sap.timp.pageObjectModel.MDR.SCANC.MovimentoSCANC.MovimentoSCANCCriarPO;
import com.sap.timp.pageObjectModel.MDR.SCANC.OPPropiasRessarcimentos.OPPropiasRessarcimentosCriarPO;
import com.sap.timp.pageObjectModel.MDR.SCANC.ProdutosSCANC.ProdutosSCANCCriarPO;

public class OPPropriosRessarcimentosCriar extends TestBaseSteven {
 
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	OPPropiasRessarcimentosCriarPO oPPropiasRessarcimentosCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		oPPropiasRessarcimentosCriarPO = new OPPropiasRessarcimentosCriarPO();
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
	public void criar() {

		
		boolean sucesso = oPPropiasRessarcimentosCriarPO.criar();
		
		assertTrue(sucesso, Criar);
		
	}			
			
	
	
	
	
}