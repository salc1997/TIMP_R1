package com.timp.test.MDR.DeterminacaoDeRelevanciaDeTarefa.CadastroDeC�digoDeRegras;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.DeterminacaoDeRelevanciaDeTarefa.CadastroDeC�digoDeRegras.CadastroDeC�digoDeRegrasCriarPO;
import com.sap.timp.pageObjectModel.MDR.DeterminacaoDeRelevanciaDeTarefa.DeterminacaoDeRelevanciaPorRegra.DeterminacaoDeRelevanciaPorRegraCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class CadastroDeC�digoDeRegrasCriar extends TestBase {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CadastroDeC�digoDeRegrasCriarPO cadastroDeC�digoDeRegrasCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		cadastroDeC�digoDeRegrasCriarPO = new CadastroDeC�digoDeRegrasCriarPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}



	@Test()
	public void criar() {
		
		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = cadastroDeC�digoDeRegrasCriarPO.criar();
		assertTrue(sucesso, semAcesso);

	}

}
