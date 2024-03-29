package com.timp.test.MDR.TabelasApoioESocial.Tabela19;

import org.testng.annotations.Test;


import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.DeterminacaoRelevanciaTarefaMotivoReabertura.CadastroMotivosReabertura.CadastroMotivosReaberturaExcluirPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela19.MotivosdeDesligamentoExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class MotivosdeDesligamentoExcluir extends TestBase {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	MotivosdeDesligamentoExcluirPO motivosDesligamentoExluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		motivosDesligamentoExluirPO = new MotivosdeDesligamentoExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void excluirMotivosDesligamento() {

		loginTC.login();

		acessarMDRPO.acessarMDR();

		boolean sucesso = motivosDesligamentoExluirPO.excluirMotivosDesligamento();
		assertTrue(sucesso, Eliminado);
	}
}
