package com.timp.test.MDR.SCANC.ProdutosSCANC;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.LivrosFiscais.LivrosFiscais.LivrosFiscaisCriarPO;
import com.sap.timp.pageObjectModel.MDR.LivrosFiscais.ParametrosParaLivroICMSST.ParametrosParaLivroICMSSTCriarPO;
import com.sap.timp.pageObjectModel.MDR.SCANC.ProdutosSCANC.ProdutosSCANCCriarPO;

public class ProductosSCANCCriar extends TestBase {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	ProdutosSCANCCriarPO produtosSCANCCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		produtosSCANCCriarPO = new ProdutosSCANCCriarPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	@Test()
	public void criar() {

		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = produtosSCANCCriarPO.criar();

		assertTrue(sucesso, Criar);

	}

}
