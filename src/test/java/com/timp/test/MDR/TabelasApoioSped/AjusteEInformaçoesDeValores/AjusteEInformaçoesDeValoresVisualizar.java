package com.timp.test.MDR.TabelasApoioSped.AjusteEInformaçoesDeValores;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.AjusteEInformaçoesDeValores.AjusteEInformaçoesDeValoresVisualizarPO;
import com.sap.timp.pageObjectModel.MDR.ValorAdicionado.InclusaoDeCamposMar.InclusaoDeCamposMarVisualizarPO;

public class AjusteEInformaçoesDeValoresVisualizar extends TestBaseEliel {
 
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	AjusteEInformaçoesDeValoresVisualizarPO ajusteEInformaçoesDeValoresVisualizarPO;
	@BeforeClass
	public void beforeClass() {

		driver = initializationE();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		ajusteEInformaçoesDeValoresVisualizarPO= new AjusteEInformaçoesDeValoresVisualizarPO();
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
	public void Visualizar() {

		ArrayList<Boolean> sucesso = ajusteEInformaçoesDeValoresVisualizarPO.visualizar();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		}
	}	
	
	
}
