package com.timp.test.MDR.AtividadesFiscais.AssociacaoAtividadeFiscal;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.AtividadesFiscais.AssociacaoAtividadeFiscal.AssociaçãoExcluirPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela15.AgenteCausadorDeSGDPExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class AssociaçãoExcluir extends TestBase {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	AssociaçãoExcluirPO associaçãoExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		associaçãoExcluirPO = new AssociaçãoExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void excluir() {

		loginTC.login();

		acessarMDRPO.acessarMDR();

		boolean sucesso = associaçãoExcluirPO.excluir();

		assertTrue(sucesso, Editar);
		sleep(2000);

	}

}
