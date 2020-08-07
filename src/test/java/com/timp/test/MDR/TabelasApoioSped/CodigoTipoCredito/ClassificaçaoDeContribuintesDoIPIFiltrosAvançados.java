package com.timp.test.MDR.TabelasApoioSped.CodigoTipoCredito;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.CodigoTipoCredito.Classifica�aoDeContribuintesDoIPIFiltrosAvan�adosPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.CodigoTipoCredito.CodigoTipoCreditoFiltrosAvan�adosPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class Classifica�aoDeContribuintesDoIPIFiltrosAvan�ados extends TestBaseEliel{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	Classifica�aoDeContribuintesDoIPIFiltrosAvan�adosPO classifica�aoDeContribuintesDoIPIFiltrosAvan�adosPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationE();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		classifica�aoDeContribuintesDoIPIFiltrosAvan�adosPO= new Classifica�aoDeContribuintesDoIPIFiltrosAvan�adosPO();
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
	public void filtros() {

		//classifica�aoDeContribuintesDoIPIFiltrosAvan�adosPO.filtros();
		
		ArrayList<Boolean> sucesso = classifica�aoDeContribuintesDoIPIFiltrosAvan�adosPO.filtros();
		//sleep(2000);
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), "The results in the filter aren't equal");
		}
		
		
	}

}
