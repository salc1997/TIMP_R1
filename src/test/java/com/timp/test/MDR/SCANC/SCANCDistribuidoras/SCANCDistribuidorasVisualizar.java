package com.timp.test.MDR.SCANC.SCANCDistribuidoras;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.LivrosFiscais.LivrosFiscais.LivrosFiscaisCriarPO;
import com.sap.timp.pageObjectModel.MDR.LivrosFiscais.LivrosFiscais.LivrosFiscaisDetalhesPO;
import com.sap.timp.pageObjectModel.MDR.LivrosFiscais.ParametrosParaLivroICMSST.ParametrosParaLivroICMSSTCriarPO;
import com.sap.timp.pageObjectModel.MDR.SCANC.ProdutosSCANC.ProdutosSCANCDetalhesPO;
import com.sap.timp.pageObjectModel.MDR.SCANC.SCANCDistribuidoras.SCANCDistribuidoraDetalhesPO;
import com.sap.timp.pageObjectModel.MDR.SCANC.SCANCDistribuidoras.SCANCDistribuidoraVisualizarPO;

public class SCANCDistribuidorasVisualizar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	SCANCDistribuidoraVisualizarPO sCANCDistribuidoraVisualizarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		sCANCDistribuidoraVisualizarPO = new SCANCDistribuidoraVisualizarPO();
	}
 
	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test(priority = 0)
	public void login() {
		loginTC.login();

	}

	@Test(priority = 1)
	public void acessarMDR() {

		acessarMDRPO.acessarMDR();

	}

	@Test(priority = 2)
	public void visualizar() {

		ArrayList<Boolean> sucesso = sCANCDistribuidoraVisualizarPO.visualizar();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Detalhes);
		}
	}

}
