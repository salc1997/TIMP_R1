package com.timp.test.MDR.AtividadesFiscais.AssociacaoAtividadeFiscal;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.AtividadesFiscais.AssociacaoAtividadeFiscal.Associa��oExcluirPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela15.AgenteCausadorDeSGDPExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class Associa��oExcluir extends TestBaseCristhian{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	Associa��oExcluirPO associa��oExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationC();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		associa��oExcluirPO = new Associa��oExcluirPO();
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
	public void excluirr() {

		boolean sucesso = associa��oExcluirPO.excluir();

		assertTrue(sucesso, Editar);

	}


}
