package com.timp.test.MDR.SCANC.SCANCDistribuidoras;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.LivrosFiscais.LivrosFiscais.LivrosFiscaisCriarPO;
import com.sap.timp.pageObjectModel.MDR.LivrosFiscais.ParametrosParaLivroICMSST.ParametrosParaLivroICMSSTCriarPO;
import com.sap.timp.pageObjectModel.MDR.SCANC.MovimentoSCANC.MovimentoSCANCExcluirPO;
import com.sap.timp.pageObjectModel.MDR.SCANC.ProdutosSCANC.ProdutosSCANCCriarPO;
import com.sap.timp.pageObjectModel.MDR.SCANC.ProdutosSCANC.ProdutosSCANCExcluirPO;
import com.sap.timp.pageObjectModel.MDR.SCANC.SCANCDistribuidoras.SCANCDistribuidoraExcluirPO;

public class SCANCDistribuidorasExcluir extends TestBaseSteven {
 
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	SCANCDistribuidoraExcluirPO sCANCDistribuidoraExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		sCANCDistribuidoraExcluirPO = new SCANCDistribuidoraExcluirPO();
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

		
		boolean sucesso = sCANCDistribuidoraExcluirPO.excluir();
		
		assertTrue(sucesso, Eliminado);
		
	}			
			
	
	
	
	
}