package com.timp.test.MDR.TabelasApoioESocial.Tabela20;

import org.testng.annotations.Test;


import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.DeterminacaoRelevanciaTarefaMotivoReabertura.CadastroMotivosReabertura.CadastroMotivosReaberturaExcluirPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela19.MotivosdeDesligamentoExcluirPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela20.TiposDeLogradouroExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class TiposDeLogradouroExcluir extends TestBase {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TiposDeLogradouroExcluirPO tiposDeLogradouroExluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		tiposDeLogradouroExluirPO = new TiposDeLogradouroExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()

	  public void excluir() {
		

		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = tiposDeLogradouroExluirPO.excluir();
		assertTrue(sucesso, Eliminado);
	}
}
