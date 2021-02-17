package com.timp.test.MDR.TabelasApoioSped.AjusteEInforma�oesDeValores;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.AjusteEInforma�oesDeValores.AjusteEInforma�oesDeValoresVisualizarPO;
import com.sap.timp.pageObjectModel.MDR.ValorAdicionado.InclusaoDeCamposMar.InclusaoDeCamposMarVisualizarPO;

public class AjusteEInforma�oesDeValoresVisualizar extends TestBaseEliel {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	AjusteEInforma�oesDeValoresVisualizarPO ajusteEInforma�oesDeValoresVisualizarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationE();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		ajusteEInforma�oesDeValoresVisualizarPO = new AjusteEInforma�oesDeValoresVisualizarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}



	@Test(priority = 1)
	public void Visualizar() {
		
		loginTC.login();
		
		acessarMDRPO.acessarMDR();

		ArrayList<Boolean> sucesso = ajusteEInforma�oesDeValoresVisualizarPO.visualizar();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualiza�ar);
		}
	}

}
