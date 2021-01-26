package com.timp.test.BCB;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BCB.AcessarBCBPO;
import com.sap.timp.pageObjectModel.BCB.ParametrosGeraisHierarquiaCriarComCópiaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class ParametrosGeraisHierarquiaCriarComCópia extends TestBaseCristhian{
	
	LoginTC loginTC;
	AcessarBCBPO acessarBCBPO;
	ParametrosGeraisHierarquiaCriarComCópiaPO parametrosGeraisHierarquiaCriarComCópiaPO;


	@BeforeClass
	public void beforeClass() {
		driver = initializationC();
		loginTC = new LoginTC();
		acessarBCBPO = new AcessarBCBPO();
		parametrosGeraisHierarquiaCriarComCópiaPO = new ParametrosGeraisHierarquiaCriarComCópiaPO();


	}

	@AfterClass
	public void afterClass() {
		// driver.close();
	}

	@Test(priority = 0)
	public void login() {

		loginTC.login();

	}

	@Test(priority = 1)
	public void brbEntrar() {
		boolean sucesso = acessarBCBPO.acessar();
		System.out.println(sucesso);
		assertTrue(sucesso,Acessar);

	}

	@Test(priority = 2)
	public void criarConfiguracaoHierarquia() {
		
		ArrayList<Boolean> sucesso = parametrosGeraisHierarquiaCriarComCópiaPO.editar();
		System.out.println("veamos"+sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
			
		}
		
		boolean sucesso1 = parametrosGeraisHierarquiaCriarComCópiaPO.excluir();

		assertTrue(sucesso1, Eliminado);
		
		boolean sucesso2 = parametrosGeraisHierarquiaCriarComCópiaPO.excluirLixeira();

		assertTrue(sucesso2, Eliminado);
	}
	

	


}
