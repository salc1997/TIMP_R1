package com.timp.test.BCB;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BCB.AcessarBCBPO;
import com.sap.timp.pageObjectModel.BCB.ParametrosGeraisHierarquiaCriarComC�piaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class ParametrosGeraisHierarquiaCriarComC�pia extends TestBaseCristhian{
	
	LoginTC loginTC;
	AcessarBCBPO acessarBCBPO;
	ParametrosGeraisHierarquiaCriarComC�piaPO parametrosGeraisHierarquiaCriarComC�piaPO;


	@BeforeClass
	public void beforeClass() {
		driver = initializationC();
		loginTC = new LoginTC();
		acessarBCBPO = new AcessarBCBPO();
		parametrosGeraisHierarquiaCriarComC�piaPO = new ParametrosGeraisHierarquiaCriarComC�piaPO();


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
		
		ArrayList<Boolean> sucesso = parametrosGeraisHierarquiaCriarComC�piaPO.editar();
		System.out.println("veamos"+sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
			
		}
		
		boolean sucesso1 = parametrosGeraisHierarquiaCriarComC�piaPO.excluir();

		assertTrue(sucesso1, Eliminado);
		
		boolean sucesso2 = parametrosGeraisHierarquiaCriarComC�piaPO.excluirLixeira();

		assertTrue(sucesso2, Eliminado);
	}
	

	


}
